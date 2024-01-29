import org.gradle.api.JavaVersion

object Versions {

    object App {
        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"
        const val MIN_SDK = 24
        const val TARGET_SDK = 34
        const val COMPILE_SDK = 34
    }

    object Google {
        const val MATERIAL = "1.7.0"
        const val GSON = "2.9.0"
    }

    object AndroidX {
        const val CORE = "1.12.0"
        const val APPCOMPAT = "1.6.1"
        const val LIFECYCLE = "2.5.1"
        const val CONSTRAIN_LAYOUT = "2.1.4"
    }

    object Test {
        const val JUNIT = "4.13.2"
        const val JUNIT_INTEGRATION = "1.1.2"
        const val ESPRESSO = "3.3.0"
    }


    object Network {
        const val RETROFIT = "2.9.0"
        const val OKHTTP = "4.9.1"

    }

    object Hilt{
        const val HILT = "2.44"
    }

    object Coroutines {
        const val Coroutines = "1.3.9"
    }

    object Navigation {
        const val NAVIGATION = "2.5.3"
    }

    object Design {
        const val GLIDE = "4.12.0"

    }

    const val GRADLE = "7.2.0"
    const val KOTLIN = "1.8.0"

    val JAVA = JavaVersion.VERSION_11
}
