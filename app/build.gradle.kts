import de.mannodermaus.gradle.plugins.junit5.junitPlatform

plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.androidJunit5)
}

android {
    compileSdkVersion(AndroidSdk.compile)
    defaultConfig {
        applicationId = "info.sanaebadi.practicalunittest"
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }

    testOptions {
        junitPlatform {
            // configurationParameter  ("junit.jupiter.testinstance.lifecycle.default", "per_class")
        }
    }

    compileOptions {
        sourceCompatibility =JavaVersion.VERSION_1_8
        targetCompatibility= JavaVersion.VERSION_1_8
    }

}






dependencies {

    implementation(Libraries.kotlinStdLib)
    implementation(Libraries.appCompat)
    implementation(Libraries.ktxCore)
    implementation(Libraries.constraintLayout)


    androidTestImplementation(TestLibraries.espresso)

    //JUnit4
    testImplementation(TestLibraries.junit4)


    // AndroidX test
    androidTestImplementation(TestLibraries.testCore)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.testRule)


    //  LOCAL UNIT TESTS (use JUnit5) JUnit Jupiter
    testImplementation(TestLibraries.junitJupiterApi)
    testImplementation(TestLibraries.junitJupiterParams)
    testRuntimeOnly(TestLibraries.junitJupiterEngine)


    //  MOCKITO
    testImplementation(TestLibraries.mockito)
}