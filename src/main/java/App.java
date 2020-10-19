import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class App {
    public static void main(String[] args) throws Exception {
        JDA jda = new JDABuilder("NzY2OTU3MDY4NjY5ODEyNzU3")
                .build();

        jda.addEventListener(new CommonEvent("смертоносность", "*", new double[]{0.35} , "Вы получите %s %% шанса крита "  ));
        jda.addEventListener(new CommonEvent("подавление", "*", new double[]{0.061, 0.071} , "Вы получите %s %% урона по контролю и %S %% урона по изнурению "  ));
        jda.addEventListener(new CommonEvent("сноровка", "*", new double[]{0.017, 0.021} , "Вы получите %s %% скорости и %S %% отката умений "  ));
        jda.addEventListener(new CommonEvent("стойкость", "*", new double[]{0.08, 0.08, 0.025, 0,035} , "Вы получите %s %% скорости и %S %% отката умений "  ));
        jda.addEventListener(new CommonEvent("искусность", "*", new double[]{0.043, 0.035, 0.028} , "Вы получите %s %% скорости и %S %% отката умений "  ));
        jda.addEventListener(new CommonEvent("мастерство", "берсерк", new double[]{0.057, 0.179, 0.072, 0.071} , "Вы получите %s %% коэф1  %s %% коэф2 %s  %% коэф3 "  ));
        jda.addEventListener(new CommonEvent("мастерство", "паладин", new double[]{0.09, 0.036, 0.055} , "Вы получите %s %% коэф4  %s %% коэф5 %s  %% коэф6  %s  %% коэф6 "  ));




    }
}
