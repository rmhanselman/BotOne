package events;

import java.util.Random;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;

public class Creature extends Entity {
    Random r = new Random();
    public int expGive; // Denotes the amount of exp given upon death
    public String name;


    public Creature(int health, int mana, int def, int atk, int lvl) {
        super(health, mana, def, atk, lvl);
        this.expGive = expGive;
        this.atk = atk;
        this.hp = hp;
    }
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        if (messageSent[0].equalsIgnoreCase("attack")) {
            if (!event.getMember().getUser().isBot()) {
                int atkTrue = atk+r.nextInt(10);
                hp = hp - atkTrue;
                event.getChannel().sendMessage(("Player deals " +atkTrue+" damage!")).queue();
                if (hp <= 0){
                    event.getChannel().sendMessage(("Creature is dead")).queue();
                }
                if(hp > 0) {
                    event.getChannel().sendMessage(("Creature has " + hp + " health left")).queue();
                }
            }
        }
        if (messageSent[0].equalsIgnoreCase("stats")) {
            if (!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage(("Creature Stats: ")).queue();
                event.getChannel().sendMessage(("LEVEL: "+lvl)).queue();
                event.getChannel().sendMessage(("HP: "+hp)).queue();
                event.getChannel().sendMessage(("ATK: "+atk)).queue();
                event.getChannel().sendMessage(("DEF: "+def)).queue();

            }
        }
    }
}
