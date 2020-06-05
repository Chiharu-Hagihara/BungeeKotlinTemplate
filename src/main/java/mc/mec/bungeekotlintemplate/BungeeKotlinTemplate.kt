package mc.mec.bungeekotlintemplate

import net.md_5.bungee.api.plugin.Plugin

class BungeeKotlinTemplate : Plugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("HelloWorld!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}