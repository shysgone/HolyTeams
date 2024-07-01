package la.burden.holyteams.commands.World.Home;

import org.bukkit.entity.Player;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.bukkit.annotation.CommandPermission;

public class HomeCommand {
    @Command({"home"})
    @CommandPermission("holyteams.home")
    public static void Home(Player player) {
        // Home Command
        try {
            // Teleport player to home

            // Get the player's home location and teleport them there

            player.sendMessage("Teleported to home!");
        } catch (Exception e) {
            // Handle exception
            player.sendMessage("An error occurred while teleporting you to home.");
        }


    }
}
