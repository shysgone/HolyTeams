package la.burden.holyteams.commands.Basic;

import dev.hyperskys.configurator.annotations.GetValue;
import la.burden.holyteams.HolyTeams;
import la.burden.holyteams.util.CC;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.annotation.Cooldown;
import revxrsal.commands.bukkit.annotation.CommandPermission;

import java.util.HashSet;
import java.util.Set;

public class LogoutCommand {

    private static Set<Player> logoutQueue = new HashSet<>();
    public static @GetValue(file = "config.yml", path = "Messages.already_in_logout_queue") String logoutQueueMessage = "&cFailed to load configuration message.";

    private static HolyTeams plugin;


    public LogoutCommand(HolyTeams plugin) {
       this.plugin = plugin;
    }


    @Command({"logout", "leaveserver"})
    @CommandPermission("holyteams.logout")
    @Cooldown(10)
    public static void LooutCMD(Player sender) {
        if (logoutQueue.contains(sender)) {
            sender.sendMessage(CC.translate(logoutQueueMessage)); // TODO: ADD A MESSAGE
            return;
        }

        logoutQueue.add(sender);
        sender.sendMessage(CC.translate("&aYou have been added to the logout queue. You will be logged out in 10 seconds."));
        // TODO: dont use the deprecated method sendTitle and use the new one
        // IDEA: Make it where it does the countdown on the title :^)
        sender.sendTitle(CC.translate("&c&lLogout"), CC.translate("&7You will be logged out in 10 seconds."));

        new BukkitRunnable() {
            @Override
            public void run() {
                if (logoutQueue.contains(sender)) {
                    sender.kickPlayer(CC.translate("&cYou have been logged out."));
                    logoutQueue.remove(sender);
                }
            }
        }.runTaskLater(plugin, 200); // 10 seconds
    }
}

