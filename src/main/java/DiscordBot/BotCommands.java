package DiscordBot;

import Aligulac.AligulacUtils;
import Aligulac.MatchPrediction.PredictMatch;
import Aligulac.PlayerById.PlayerStats;
import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.util.ArrayList;
import java.util.List;

public class BotCommands {
    static String prefix = "!";


    @EventSubscriber
    public void onMessageRecieved(MessageReceivedEvent event) throws Exception{
        String[] argArray = event.getMessage().getContent().split(" ");
        if(!argArray[0].startsWith(prefix))
            return;

        String command = argArray[0].substring(1);

        switch(command){

            case "player":
                List<PlayerStats> playerStats = new ArrayList<PlayerStats>();
                playerStats.add(AligulacUtils.getPlayerByName(argArray[1]));
                String singleMessage = BotUtils.compileMessage(playerStats, MessageType.ONEPLAYER);
                BotUtils.sendMessage(event.getChannel(), singleMessage);
                break;
            case "players":
                List<PlayerStats> playersStats = new ArrayList<PlayerStats>();
                for(int i = 1; i < argArray.length; i++){
                    playersStats.add(AligulacUtils.getPlayerByName(argArray[i]));
                }
                String multiMessage = BotUtils.compileMessage(playersStats, MessageType.MULTIPLAYERS);
                BotUtils.sendMessage(event.getChannel(), multiMessage);
                break;
            case "h2h":
                if((Integer.parseInt(argArray[3]) % 2) == 0){
                    throw new Exception();
                }
                PredictMatch prediction = AligulacUtils.predictMatch(argArray[1], argArray[2], argArray[3]);
                String message = BotUtils.compileMessage(prediction, argArray[3]);
                BotUtils.sendMessage((event.getChannel()), message);
                break;

        }
    }
}
