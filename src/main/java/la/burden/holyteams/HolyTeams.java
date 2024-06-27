package la.burden.holyteams;

import la.burden.holyteams.commands.HolyTeamsCommand;
import la.burden.holyteams.commands.TeamCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class HolyTeams extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("HolyTeams is enabled");
        registerCommands();
        // Plugin startup logic

    }

    private void registerCommands() {
        getCommand("holyteams").setExecutor(new HolyTeamsCommand());
        getCommand("teams").setExecutor(new TeamCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("HolyTeams is disabled");
        // Plugin shutdown logic
    }
}
