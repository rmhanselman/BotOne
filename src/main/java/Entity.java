package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Entity extends ListenerAdapter {
    public int hp;
    public int mp;
    public int atk;
    public int def;
    public int lvl;

    public Entity(int health, int mana, int attack, int defense, int level){
        this.hp =  health;
        this.mp = mana;
        this.atk = attack;
        this.def = defense;
        this.lvl = level;
    }
    public int status( int status){
        if(hp <= 0){
            status = -1;
        } else{
            status = 1;
        }
        if(status == -1){
            System.out.println("Insert name has been killed.");
        }
        return status;
    }

}
