package de.weinschenk.lea.modules.minecraft;

import de.weinschenk.lea.api.BotContext;
import de.weinschenk.lea.api.CommandRequest;
import de.weinschenk.lea.api.LeaModule;

public class MinecraftModule implements LeaModule {

    @Override
    public String id() {
        return "minecraft";
    }

    @Override
    public void onCommand(CommandRequest req, BotContext ctx) {
        switch (req.command()) {
            case "start" -> ctx.writeTestFile("MC start");
            case "stop" -> ctx.writeTestFile("MC stop");
            default -> ctx.reply(req, "Unknown command: " + req.command());
        }
    }
}
