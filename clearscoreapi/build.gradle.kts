plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlin)
    id(Plugins.kotlinKapt)
    id(Plugins.hilt)
}

android {
    compileSdk = AppConfig.targetSdk
    buildToolsVersion = AppConfig.buildToolsVersion

    defaultConfig {
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk

        vectorDrawables {
            useSupportLibrary = true
        }

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(Dependencies.Kotlin.stdLib)
    implementation(Dependencies.AndroidX.coreKtx)

    implementation(Dependencies.Network.retrofit)
    implementation(Dependencies.Network.retrofitJsonConverter)
    implementation(Dependencies.Network.okhttp)
    implementation(Dependencies.Network.okhttpLoggingInterceptor)

    implementation(Dependencies.Json.moshi)
    implementation(Dependencies.Json.moshiAdapters)

    implementation(Dependencies.AndroidX.hilt)

    add("kapt", Dependencies.Kapt.moshi)
    add("kapt", Dependencies.Kapt.hilt)

    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.Test.androidXjUnit)
    androidTestImplementation(Dependencies.Test.espressoCore)
}