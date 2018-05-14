package DiscordBot;

import Aligulac.PlayerById.PlayerStats;
import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.util.RequestBuffer;

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

    public static String compileMessage(PlayerStats stats, MessageType type){
        StringBuilder message = new StringBuilder();

        switch (type){
            case ONEPLAYER:
                message.append("Here are some stats for your query:\n").append("\nPlayer name: ").append(stats.getRomanized_name()).append("\nRanking: ").append(stats.getCurrent_rating().getRating());
                message.append("\nNationality: ").append(stats.getCountry());
            case TOPTEN:

        }


        return message.toString();
    }

}
