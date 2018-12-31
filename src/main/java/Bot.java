import events.Creature;
import events.Entity;
import events.Player;
import events.HelloEvent;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Bot {

    public static void main(String args[]) throws Exception{

        JDA jda = new JDABuilder("NTI4Njk2NzcxNDEzNTQwODg2.DwmC5A.qB-WjOQG19ChlCEGExNCS1_704Y").build();

        jda.addEventListener(new HelloEvent());

        jda.addEventListener(new Creature(500,5,5,1,5));
        jda.addEventListener(new Player(1,10,10,10,10));

    }
}
