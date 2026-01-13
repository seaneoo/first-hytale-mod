package dev.seano.hytale;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class FirstHytaleMod extends JavaPlugin {

    public FirstHytaleMod(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();
        getEntityStoreRegistry().registerSystem(new BreakBlockEventSystem());
    }
}
