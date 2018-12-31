package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        if (messageSent[0].equalsIgnoreCase("pls")) {
            if (messageSent[1].equalsIgnoreCase("equipment")) {
                if (!event.getMember().getUser().isBot()) {
                    event.getChannel().sendMessage(("//TO BE DETERMINED//")).queue();
                }
            }
            if (messageSent[1].equalsIgnoreCase("shop")) {
                if (!event.getMember().getUser().isBot()) {
                    event.getChannel().sendMessage(("*You are greeted by a large, burly man wearing a blacksmith's apron.*\n H-Hewo! P-Please t-take a l-look at my w-wares. >_<" +
                            "\nType pls equip to view equipment for sale.\nType pls pots to view consumables.\nType pls costume to view costumes for sale")).queue();
                }
            }
            if(messageSent[1].equalsIgnoreCase("help")){
                if (!event.getMember().getUser().isBot()) {
                    event.getChannel().sendMessage(("DoS Rpg is a text based RPG game.\n You will encounter a variety of creatures from bufo bufos to glocks, so be wary traveler.\n" +
                            "Kill these creatures to gain loids 'the currency of the world' and become stronger. \nShould you die, you will be expelled from the Discord and will have to come back with no loids or levels." +
                            "\n3 Ancient Evils will spawn in this world randomly that you must work together to vanquish.\nMakala the Devourer\nWeeabooski the Lonely\nThe Dark Twins: Formot and Jordie\nSlay monsters, become stronger, and be the king autist of DoS.")).queue();
                }
                }
            }
            if(messageSent[1].equalsIgnoreCase("Introduce")){
                if (!event.getMember().getUser().isBot()) {
                    event.getChannel().sendMessage(("Welcome to the DoS RPG bot. \nType pls help for a brief introduction of the rules. \nType pls shop to display the current items in shop. \n" +
                            "Type pls character to display your level, stats, and loid amount. \nType pls timer to display time remaining until Raid Boss spawn." )).queue();
                }
            }
            }
        }




