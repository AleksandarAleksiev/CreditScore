object Dependencies {
    object Kotlin {
        const val stdLib =
            "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.Kotlin.kotlinVersion}"
        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.Kotlin.coroutinesAndroid}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.AndroidX.coreKtxVersion}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appCompatVersion}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintLayoutVersion}"
        const val hilt = "com.google.dagger:hilt-android:${Versions.AndroidX.hiltVersion}"

        const val fragment = "androidx.fragment:fragment-ktx:${Versions.AndroidX.fragment}"

        const val navigation =
            "androidx.navigation:navigation-runtime-ktx:${Versions.AndroidX.navigation}"
        const val navigationUi =
            "androidx.navigation:navigation-ui-ktx:${Versions.AndroidX.navigation}"
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.AndroidX.navigation}"

        const val lifecycleCompiler =
            "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.lifeCycle}"
        const val lifecycleRuntime =
            "androidx.lifecycle:lifecycle-runtime:${Versions.AndroidX.lifeCycle}"
        const val lifecycleProcess =
            "androidx.lifecycle:lifecycle-process:${Versions.AndroidX.lifeCycle}"
        const val lifecycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.lifeCycle}"
        const val lifecycleLiveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.AndroidX.lifeCycle}"
        const val lifecycleCommon =
            "androidx.lifecycle:lifecycle-common-java8:${Versions.AndroidX.lifeCycle}"
    }

    object MaterialDesign {
        const val material =
            "com.google.android.material:material:${Versions.MaterialDesign.materialVersion}"
    }

    object Kapt {
        const val hilt = "com.google.dagger:hilt-compiler:${Versions.AndroidX.hiltVersion}"
        const val lifecycle = "androidx.lifecycle:lifecycle-compiler:${Versions.AndroidX.lifeCycle}"
        const val moshi = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.Json.moshi}"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.Network.retrofit}"
        const val retrofitJsonConverter =
            "com.squareup.retrofit2:converter-moshi:${Versions.Network.retrofit}"

        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.Network.okhttp}"
        const val okhttpLoggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.Network.okhttp}"
    }

    object Json {
        const val moshi = "com.squareup.moshi:moshi:${Versions.Json.moshi}"
        const val moshiAdapters = "com.squareup.moshi:moshi-adapters:${Versions.Json.moshi}"
    }

    object Test {
        const val jUnit = "junit:junit:${Versions.Test.junit}"
        const val mockito = "org.mockito:mockito-core:${Versions.Test.mockito}"
        const val mockitoKotlin =
            "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.Test.mockitoKotlin}"
        const val mockitoInline = "org.mockito:mockito-inline:${Versions.Test.mockito}"

        const val androidXArchCore =
            "androidx.arch.core:core-testing:${Versions.Test.androidXArchCore}"
        const val androidXTestCore = "androidx.test:core-ktx:${Versions.Test.androidXTest}"
        const val androidXTestRules = "androidx.test:rules:${Versions.Test.androidXTest}"
        const val androidXTestRunner = "androidx.test:runner:${Versions.Test.androidXTest}"
        const val androidXTestExtTruth = "androidx.test.ext:truth:${Versions.Test.androidXTest}"
        const val androidXjUnit = "androidx.test.ext:junit-ktx:${Versions.Test.androidXjUnit}"

        const val espressoCore =
            "androidx.test.espresso:espresso-core:${Versions.Test.espressoCore}"

        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.Test.coroutines}"

        const val fragment = "androidx.fragment:fragment-testing${Versions.AndroidX.fragment}"
    }
}