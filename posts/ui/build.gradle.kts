plugins {
    id(Plugins.COMMON)
}

android {
    namespace = "com.mobilebreakero.ui"
    buildFeatures{
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation(project(Modules.Posts.DOMAIN))
}