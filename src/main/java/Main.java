import DiscordBot.BotCommands;
import DiscordBot.BotUtils;
import sx.blah.discord.api.IDiscordClient;

public class Main {
    public static void main(String[] args) {
//        String token = "NDMzNTU3NTU2MDYxNzk4NDEw.Dc-b6w.5i1JxTe0norKoq-8BUtvnPWsHQA";
        if(args.length != 1){
            System.out.println("Please enter only your token as argument!");
            return;
        }

        IDiscordClient client = BotUtils.buildDiscordClient(args[0]);

        client.getDispatcher().registerListener(new BotCommands());

        client.login();


    }
}
