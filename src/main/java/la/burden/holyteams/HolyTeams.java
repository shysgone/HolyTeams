package la.burden.holyteams;

import la.burden.holyteams.commands.Teams.TeamCommand;
import org.bukkit.plugin.java.JavaPlugin;
import revxrsal.commands.bukkit.BukkitCommandHandler;

public final class HolyTeams extends JavaPlugin {
    public static HolyTeams instance;


    @Override
    public void onEnable() {
        instance = this;
        BukkitCommandHandler handler = BukkitCommandHandler.create(instance);

        handler.register(
                new TeamCommand()
        );



        getLogger().info("HolyTeams is enabled");



    }

    @Override
    public void onDisable() {
        getLogger().info("HolyTeams is disabled");
    }
}
