package DiscordBot;

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

}
