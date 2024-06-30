package la.burden.holyteams.commands.Teams;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.bukkit.annotation.CommandPermission;

public class TeamCommand {
        // Team Add Command
        @Command({"team invite", "team add", "f invite", "f add"})
        @CommandPermission("holyteams.team.invite")
        public void teamInvite(Player sender, Player target) {

        }



}
