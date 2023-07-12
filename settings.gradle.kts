pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false

    }
}
rootProject.name = "mainKtProject"
include("m1l1-quickstart")
