plugins {
    id("org.jetbrains.intellij.platform") version "2.10.2"
}

group = "com.takashi"
version = "0.1.0"

repositories {
    mavenCentral()
    intellijPlatform { defaultRepositories() }
}

dependencies {
    intellijPlatform {
        intellijIdea("2025.2.4")
    }
}

intellijPlatform {
    pluginConfiguration {
        ideaVersion { sinceBuild = "252.25557" }
        changeNotes = "Initial version"
    }
}
