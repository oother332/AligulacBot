package DiscordBot;

import Aligulac.PlayerById.PlayerStats;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.RequestBuffer;

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
                message.append("Here are some stats for your query:\n").append("\nPlayer name: ").append(stats.get(0).getRomanized_name()).append("\nRanking: ").append(stats.get(0).getCurrent_rating().getRating());
                message.append("\nNationality: ").append(stats.get(0).getCountry());
                break;
            case MULTIPLAYERS:
                message.append("DANK MEMES");
                break;
            case TOPTEN:
                message.append("swag");
                break;
        }


        return message.toString();
    }

}
