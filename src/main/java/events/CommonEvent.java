package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class CommonEvent extends ListenerAdapter {
    private final String stata;
    private final String prof;
    private final double[] coif;
    private final String answer;

    public CommonEvent(String stata, String prof, double[] coif, String answer) {
        this.stata = stata;
        this.prof = prof;
        this.coif = coif;
        this.answer = answer;
    }

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String[] words = event.getMessage().getContentDisplay().split(" ");
         if ( words[1].equalsIgnoreCase( stata ) && (prof.equals("*") || words[0].equalsIgnoreCase(prof))){
            String mastery = words[2];
            Object[] values = new Object[coif.length];
            for (int i = 0; i < coif.length ; i++ ){
                values[i] = Double.parseDouble(mastery) * coif[i];
            }
            String message = String.format(answer, values);
            event.getChannel().sendMessage(message).queue();
        }
    }

}
