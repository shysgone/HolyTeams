package la.burden.holyteams;

import la.burden.holyteams.command.HolyTeamsCommand;
import la.burden.holyteams.command.TeamCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class HolyTeams extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("HolyTeams is enabled");
        registerCommands();
    }

    private void registerCommands() {
        getCommand("holyteams").setExecutor(new HolyTeamsCommand());
        getCommand("team").setExecutor(new TeamCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("HolyTeams is disabled");
    }
}
