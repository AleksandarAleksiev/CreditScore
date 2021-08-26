object Dependencies {
    object Kotlin {
        const val stdLib =
            "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.Kotlin.kotlinVersion}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.AndroidX.coreKtxVersion}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompatVersion}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintLayoutVersion}"
    }

    object MaterialDesign {
        const val material =
            "com.google.android.material:material:${Versions.MaterialDesign.materialVersion}"
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.junitVersion}"
        const val mockito = "org.mockito:mockito-core:${Versions.Test.mockitoVersion}"
        const val androidXjUnit = "androidx.test.ext:junit:${Versions.Test.androidXjUnitVersion}"
        const val espressoCore =
            "androidx.test.espresso:espresso-core:${Versions.Test.espressoCoreVersion}"
    }
}