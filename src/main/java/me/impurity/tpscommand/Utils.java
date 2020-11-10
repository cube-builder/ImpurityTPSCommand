package me.impurity.tpscommand;
import org.bukkit.Bukkit;

public class Utils {
    private static String format(double tps) {
        return (tps > 18.0D ? "§a" : (tps > 16.0D ? "§e" : "§c")) + (tps > 20.0D ? "" : "") + String.format("%.2f", Math.min((double) Math.round(tps * 100.0D) / 100.0D, 20.0D));
    }
    public static String getTps() {
        return format(Bukkit.getServer().getTPS()[0]);
    }
}
