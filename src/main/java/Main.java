import DiscordBot.BotUtils;
import sx.blah.discord.api.IDiscordClient;

public class Main {
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("Please enter only your token as argument!");
            return;
        }

        IDiscordClient client = BotUtils.buildDiscordClient(args[0]);

        client.getDispatcher().registerListener(/*add listener here*/);

        client.login();


    }
}
