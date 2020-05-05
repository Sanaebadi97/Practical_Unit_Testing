import de.mannodermaus.gradle.plugins.junit5.junitPlatform
import jdk.nashorn.internal.objects.NativeRegExp.test

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
        testInstrumentationRunnerArgument(
            "runnerBuilder",
            "de.mannodermaus.junit5.AndroidJUnit5Builder"
        )
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
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
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
    testRuntimeOnly(TestLibraries.junit4Engine)

    // AndroidX test
    androidTestImplementation(TestLibraries.testCore)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.testRule)


    //  LOCAL UNIT TESTS (use JUnit5) JUnit Jupiter
    testImplementation(TestLibraries.junitJupiterApi)
    testImplementation(TestLibraries.junitJupiterParams)
    testRuntimeOnly(TestLibraries.junitJupiterEngine)
    testImplementation(TestLibraries.kotlinTestJunit)


    //  MOCKITO
    testImplementation(TestLibraries.mockito)
}