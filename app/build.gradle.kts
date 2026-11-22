plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.aiforex.pro"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.aiforex.pro"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
