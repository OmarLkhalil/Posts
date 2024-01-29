import Versions
import Dependencies
import BuildConfig

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = BuildConfig.APP_ID
    compileSdk = Versions.App.COMPILE_SDK

    defaultConfig {
        minSdk = Versions.App.MIN_SDK
        targetSdk = Versions.App.TARGET_SDK
        testInstrumentationRunner = BuildConfig.TEST_RUNNER
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = Versions.JAVA
        targetCompatibility = Versions.JAVA
    }

    kotlinOptions {
        jvmTarget = Versions.JAVA.toString()
    }
}

dependencies {

    implementation(Dependencies.AndroidX.CORE)
    implementation(Dependencies.AndroidX.APPCOMPAT)
    implementation(Dependencies.AndroidX.ANDROID_LIFECYCLE_VIEWMODEL)
    implementation(Dependencies.AndroidX.ANDROID_LIFECYCLE_LIVEDATA)
    implementation(Dependencies.AndroidX.ANDROID_LIFECYCLE_COMPILER)
    implementation(Dependencies.AndroidX.CONSTRAIN_LAYOUT)
    implementation(Dependencies.Google.MATERIAL)
    implementation(Dependencies.Google.GSON)
    implementation(Dependencies.COROOUTINES)
    implementation(Dependencies.Navigation.NAVIGATION_FRAGMENT)
    implementation(Dependencies.Navigation.NAVIGATION_UI)
    implementation(Dependencies.Network.retrofit)
    implementation(Dependencies.Network.converterGson)
    implementation(Dependencies.Network.okHttp)
    implementation(Dependencies.Hilts.HILT_ANDROID)
    kapt(Dependencies.Hilts.HILT_COMPILER)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}