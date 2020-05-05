const val kotlinVersion = "1.3.71"

object BuildPlugins {

    object Versions {
        const val buildToolsVersion = "3.6.2"
        const val junit5Plugin = "1.4.2.0"
        const val junit5Platform = "1.0.0-M1"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.buildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    const val androidJUnit5Plugin =
        "de.mannodermaus.gradle.plugins:android-junit5:${Versions.junit5Plugin}"
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val androidJunit5 = "de.mannodermaus.android-junit5"
    const val junitPlatformPlugin = "org.junit.platform:junit-platform-gradle-plugin:${Versions.junit5Platform}"
    const val junit5PlatformPlugin = "org.junit.platform.gradle.plugin"


}


object AndroidSdk {
    const val min = 15
    const val compile = 29
    const val target = compile
}

object Libraries {
    private object Versions {
        const val jetpack = "1.0.0-beta01"
        const val constraintLayout = "1.1.2"
        const val ktx = "1.1.0-alpha05"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val espresso = "3.1.0-alpha4"
        const val androidX = "1.1.0"
        const val testRule = "1.2.0"
        const val junitJupiter = "5.6.0"
        const val mockito = "2.19.0"
    }

    const val junit4 = "junit:junit:${Versions.junit4}"
    const val junit4Engine = "org.junit.vintage:junit-vintage-engine:${Versions.junitJupiter}"
    const val testRunner = "androidx.test:runner:${Versions.androidX}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val testCore = "androidx.test.espresso:espresso-core:${Versions.androidX}"
    const val testRule = "androidx.test:rules:${Versions.testRule}"
    const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junitJupiter}"
    const val junitJupiterParams = "org.junit.jupiter:junit-jupiter-params:${Versions.junitJupiter}"
    const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junitJupiter}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val kotlinTestJunit = "org.jetbrains.kotlin:kotlin-test-junit:${kotlinVersion}"

}