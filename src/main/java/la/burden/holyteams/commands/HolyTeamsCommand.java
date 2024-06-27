package la.burden.holyteams.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HolyTeamsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String list, String[] args) {
        if (sender instanceof Player) {
            sender.sendMessage(ChatColor.AQUA + "HolyTeams command");
        }
        return true;
    }
}
