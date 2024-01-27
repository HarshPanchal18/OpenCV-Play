pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Play-OpenCV"
include(":app")
include(":openCVlib")
project(":openCVlib").projectDir = File("C:\\Users\\HARSH\\OpenCV-android-sdk\\sdk")
