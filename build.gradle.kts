plugins { id("java") }

group = "dev.seano"

version = "0.1.0"

val userHome: String? = System.getProperty("user.home")
val releaseJar =
    files(
        userHome +
            "/AppData/Roaming/Hytale/install/release/package/game/latest/Server/HytaleServer.jar"
    )

repositories { mavenCentral() }

dependencies { implementation(releaseJar) }

tasks.processResources { filesMatching("manifest.json") { expand("version" to project.version) } }
