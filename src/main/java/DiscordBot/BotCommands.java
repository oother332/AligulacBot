package DiscordBot;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class BotCommands {
    static String prefix = "!";


    @EventSubscriber
    public void onMessageRecieved(MessageReceivedEvent event){
        if(event.getMessage().getContent().startsWith(prefix)){
            if(event.getMessage().getContent().equalsIgnoreCase("!test")){
                BotUtils.sendMessage(event.getChannel(), "Test Message");
            }
        }
    }
}
