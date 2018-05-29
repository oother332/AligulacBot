package DiscordBot;

import Aligulac.MatchPrediction.Outcomes;
import Aligulac.MatchPrediction.PredictMatch;
import Aligulac.PlayerById.PlayerStats;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.RequestBuffer;

import java.text.DecimalFormat;
import java.util.List;

public class BotUtils {

    public static IDiscordClient buildDiscordClient(String token) {
        return new ClientBuilder().withToken(token).build();
    }

    public static void sendMessage(IChannel channel, final String message){
        RequestBuffer.request(() -> {
            try{
                channel.sendMessage(message);
            }
            catch (DiscordException e){
                System.err.println("An error has occurred: ");
                e.printStackTrace();
            }
        });
    }

    public static String compileMessage(List<PlayerStats> stats, MessageType type){
        StringBuilder message = new StringBuilder();

        switch (type){
            case ONEPLAYER:
                message.append("Here are some stats for your query:\n\n")
                        .append("\nRomanized name: ").append(stats.get(0).getRomanized_name())
                        .append("\nPlayer name: ").append(stats.get(0).getName())
                        .append("\nRanking: ").append((Double.parseDouble(stats.get(0).getCurrent_rating().getRating())* 1000) + 1000)
                        .append("\nNationality: ").append(stats.get(0).getCountry());
                break;
            case MULTIPLAYERS:
                message.append("Here are some stats for your query:\n\n");
                for(int i = 0; i < stats.size(); i++){
                    message.append("\n\nRomanized name: ").append(stats.get(i).getRomanized_name())
                            .append("\nPlayer name: ").append(stats.get(i).getName())
                            .append("\nRanking: ").append((Double.parseDouble(stats.get(i).getCurrent_rating().getRating())* 1000) + 1000)
                            .append("\nNationality: ").append(stats.get(i).getCountry());
                }
                break;
            default:
                message.append("Sorry, an error occurred!");
        }


        return message.toString();
    }

    public static String compileMessage(PredictMatch prediction, String numGames){
        StringBuilder message = new StringBuilder();
        int i = 1;
        DecimalFormat df = new DecimalFormat("#.##");

        message.append("In a best of " + numGames + " between " + prediction.getPla().getTag() + " and " + prediction.getPlb().getTag());
        message.append(" the results are as follows:\n");

        for(Outcomes outcomes : prediction.getOutcomes()){
            if(i <= 4)
                message.append("\n" + df.format((Double.parseDouble(outcomes.getProb()) * 100)) + "% chance for " + outcomes.getSca() + " - " + outcomes.getScb() + " in favour of " + prediction.getPla().getTag());
            else
                message.append("\n" + df.format((Double.parseDouble(outcomes.getProb()) * 100)) + "% chance for " + outcomes.getScb() + " - " + outcomes.getSca() + " in favour of " + prediction.getPlb().getTag());
            i++;
        }
        return message.toString();
    }

}
