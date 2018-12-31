package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Entity extends ListenerAdapter {
    private int hp;
    private int mp;
    private int atk;
    private int def;
    private int lvl;

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
            System.out.println("Insert name has been killed.");
        } else{
            status = 1;
        }
        return status;
    }
    
    //Getter Class Methods
    public int getHP(){
        return hp;   
    }
    
    public int getMP(){
        return mp;
    }
    
    public int getATK(){
        return atk;   
    }
    
    public int getDEF(){
        return def;
    }
    
    public int getLVL(){
        return lvl;
    }
    
    //Setter Class Methods
    public void setHP(int n){
        hp = n;
    }
    
    public void setMP(int n){
        mp = n;
    }
    
    public void setATK(int n){
        atk = n;
    }
    
    public void setDEF(int n){
        def = n;
    }
    
    public void setLVL(int n){
        lvl = n;   
    }
}
