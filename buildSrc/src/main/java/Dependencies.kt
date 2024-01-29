object Dependencies {

    object AndroidX {
        const val CORE = "androidx.core:core-ktx:${Versions.AndroidX.CORE}"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.AndroidX.APPCOMPAT}"
        const val ANDROID_LIFECYCLE_VIEWMODEL =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.LIFECYCLE}"
        const val ANDROID_LIFECYCLE_LIVEDATA =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.LIFECYCLE}"
        const val ANDROID_LIFECYCLE_COMPILER =
            "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.LIFECYCLE}"
        const val CONSTRAIN_LAYOUT =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.CONSTRAIN_LAYOUT}"
    }

    object Google {
        const val MATERIAL = "com.google.android.material:material:${Versions.Google.MATERIAL}"
        const val GSON = "com.google.code.gson:gson:${Versions.Google.GSON}"
    }

    const val COROOUTINES =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Coroutines.Coroutines}"

    object ClassPath {
        const val BUILD_TOOLS = "com.android.tools.build:gradle:${Versions.GRADLE}"
        const val JETBRAINS_KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.Network.RETROFIT}"
        const val converterGson =
            "com.squareup.retrofit2:converter-gson:${Versions.Network.RETROFIT}"
        const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.Network.OKHTTP}"
    }

    object Hilts {
        const val HILT_ANDROID = "com.google.dagger:hilt-android:${Versions.Hilt.HILT}"
        const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.Hilt.HILT}"
    }
    object Navigation {
        const val NAVIGATION_FRAGMENT =
            "androidx.navigation:navigation-fragment-ktx:${Versions.Navigation.NAVIGATION}"
        const val NAVIGATION_UI =
            "androidx.navigation:navigation-ui-ktx:${Versions.Navigation.NAVIGATION}"
    }

}