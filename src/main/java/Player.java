package events;

import java.util.Random;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Player extends Entity {
    Random r = new Random(); // used to calculate the damage a player inflicts.
    public int money; // denotes the total amount of money a player has
    public int exp; // denotes the amount of exp a player has.

    public Player(int health, int mana, int def, int atk, int lvl) {
        super(health, mana, def, atk, lvl);
        this.money = money;
        this.exp = exp;
        this.atk = atk + r.nextInt(1000); // player's attack will be the base attack + a random integer 1 - 10 inclusive.
    } // lines 10 - 13 create a constructor for the player entity.
}
