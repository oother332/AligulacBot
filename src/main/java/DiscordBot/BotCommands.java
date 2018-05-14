package DiscordBot;

import Aligulac.AligulacUtils;
import Aligulac.PlayerById.PlayerStats;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class BotCommands {
    static String prefix = "!";


    @EventSubscriber
    public void onMessageRecieved(MessageReceivedEvent event) throws Exception{
        if(event.getMessage().getContent().startsWith(prefix)){
            if(event.getMessage().getContent().equalsIgnoreCase("!topten")){
                PlayerStats[] topten = AligulacUtils.getTopTen();
                BotUtils.sendMessage(event.getChannel(), "Top ten is: ");
            }
            if(event.getMessage().getContent().equalsIgnoreCase("!thestc")){
                PlayerStats stats = AligulacUtils.getPlayerByName("thestc");
                String message = BotUtils.compileMessage(stats, MessageType.ONEPLAYER);
                BotUtils.sendMessage(event.getChannel(), message);
            }
        }
    }
}
