package la.burden.holyteams.commands.Factions.Teams;

import org.bukkit.entity.Player;
import revxrsal.commands.annotation.Command;
import revxrsal.commands.bukkit.annotation.CommandPermission;

public class TeamCommand {
        // Team Add Command
        @Command({"team invite", "team add", "f invite", "f add"})
        @CommandPermission("holyteams.team.invite")
        public void teamInvite(Player sender, Player target) {

        }


        // Team Kick Command
        @Command({"team kick", "team remove", "f kick", "f remove"})
        @CommandPermission("holyteams.team.kick")
        public void teamKick(Player sender, Player target, String reason) {


        }



        // Team Promote Command
        @Command({"team promote", "f promote"})
        @CommandPermission("holyteams.team.promote")
        public void teamPromote(Player sender, Player target, String reason) {

        }



        // Team Demote Command
        @Command({"team demote", "f demote"})
        @CommandPermission("holyteams.team.demote")
        public void teamDemote(Player sender, Player target, String reason) {

        }



        // Team Disband Command
        @Command({"team disband", "f disband"})
        @CommandPermission("holyteams.team.disband")
        public void teamDisband(Player sender) {

        }


        // Team Info Command
        @Command({"team info", "f info"})
        @CommandPermission("holyteams.team.info")
        public void teamInfo(Player sender) {

        }



        // Team List Command
        @Command({"team list", "f list"})
        @CommandPermission("holyteams.team.list")
        public void teamList(Player sender) {

        }






}
