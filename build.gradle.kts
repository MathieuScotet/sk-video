buildscript {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
        maven {
            url = uri("https://jitpack.io")
        }
    }

    dependencies {
        classpath("com.github.skot-framework.skot:plugin:${Versions.framework}")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.5.30")
    }
}

allprojects {

    group = Versions.group
    version = "${Versions.library}_${Versions.framework}"

    repositories {
        google()
        mavenLocal()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }
    }

    apply(plugin = "maven-publish")
    apply(plugin = "org.jetbrains.dokka")

}
