package la.burden.holyteams.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HolyTeamsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        //if (sender instanceof Player) {
//
        //    sender.sendMessage(ChatColor.AQUA + "HolyTeams command");
//
        //    if(args.length == 1) {
        //        String playerName = args[0];
        //        Player target = Bukkit.getServer().getPlayerExact(playerName);
//
        //        if(target == null) { sender.sendMessage(ChatColor.GREEN + "Player isn't online"); }
        //        else { sender.sendMessage(ChatColor.YELLOW + "You've invited " + target.getDisplayName()); }
        //    }
        //}

        if(sender instanceof Player) {
            switch (args.length) {
                case 0:
                    sender.sendMessage(ChatColor.AQUA + "HolyTeams command");
                    break;
                case 1:
                    String playerName = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playerName);

                    if(target == null) { sender.sendMessage(ChatColor.GREEN + "Player isn't online"); }
                    else { sender.sendMessage(ChatColor.YELLOW + "You've invited " + target.getDisplayName()); }
                    break;
            }
        }

        return true;
    }
}
