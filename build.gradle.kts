plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

group = "jphinspace"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    mingwX64().apply {
        compilations.getByName("main") {
            cinterops {
                val sdl by creating
            }
        }
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
}