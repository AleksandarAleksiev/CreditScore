plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlin)
    id(Plugins.kotlinKapt)
    id(Plugins.hilt)
}

android {
    compileSdk = AppConfig.targetSdk
    buildToolsVersion = AppConfig.buildToolsVersion

    defaultConfig {
        applicationId = "com.aaleksiev.creditscore"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        buildConfigField(
            "String",
            "API_ENDPOINT",
            "\"https://android-interview.s3.eu-west-2.amazonaws.com/\""
        )
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

    implementation(project(":core"))
    implementation(project(":clearscoreapi"))

    implementation(Dependencies.Kotlin.stdLib)
    implementation(Dependencies.AndroidX.coreKtx)
    implementation(Dependencies.AndroidX.fragment)
    implementation(Dependencies.MaterialDesign.material)
    implementation(Dependencies.AndroidX.navigationFragment)
    implementation(Dependencies.AndroidX.lifecycleRuntime)
    implementation(Dependencies.AndroidX.lifecycleViewModel)
    implementation(Dependencies.AndroidX.lifecycleLiveData)

    implementation(Dependencies.AndroidX.hilt)

    add("kapt", Dependencies.Kapt.hilt)
    add("kapt", Dependencies.Kapt.lifecycle)

    testImplementation(Dependencies.Test.mockito)
    testImplementation(Dependencies.Test.mockitoInline)
    testImplementation(Dependencies.Test.androidXArchCore)
    testImplementation(Dependencies.Test.androidXjUnit)
    testImplementation(Dependencies.Test.androidXTestCore)
    testImplementation(Dependencies.Test.androidXTestRules)
    testImplementation(Dependencies.Test.androidXTestExtTruth)
    testImplementation(Dependencies.Test.coroutines)
    androidTestImplementation(Dependencies.Test.androidXjUnit)
    androidTestImplementation(Dependencies.Test.espressoCore)
}

kapt {
    correctErrorTypes = true
}