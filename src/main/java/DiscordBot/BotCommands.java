package DiscordBot;

import Aligulac.AligulacUtils;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class BotCommands {
    static String prefix = "!";


    @EventSubscriber
    public void onMessageRecieved(MessageReceivedEvent event) throws Exception{
        if(event.getMessage().getContent().startsWith(prefix)){
            if(event.getMessage().getContent().equalsIgnoreCase("!topten")){
                AligulacUtils.getTopTen();
                BotUtils.sendMessage(event.getChannel(), "Top ten is: ");
            }
            if(event.getMessage().getContent().equalsIgnoreCase("!thestc")){
                AligulacUtils.getPlayerByName("thestc");
                BotUtils.sendMessage(event.getChannel(), "Top ten is: ");
            }
        }
    }
}
