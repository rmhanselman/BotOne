package events;

import net.dv8tion.jda.core.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class Introduction  extends ListenerAdapter {

    public void onIntroduction(CategoryCreateEvent e){
        e.getGuild().getDefaultChannel().sendMessage("WELCOME TO DoS YOU TURD.").queue();
    }
}
