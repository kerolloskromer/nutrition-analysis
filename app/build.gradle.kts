plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(ConfigData.compileSdkVersion)
    buildToolsVersion(ConfigData.buildToolsVersion)

    defaultConfig {
        applicationId = "com.kromer.nutritionanalysis"
        minSdkVersion(ConfigData.minSdkVersion)
        targetSdkVersion(ConfigData.targetSdkVersion)
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        buildConfigField("String", "APP_ID", "\"37676d9c\"")
        buildConfigField("String", "APP_KEY", "\"d08bf250cb5f53516b0df74853a2fe90\"")
        buildConfigField("String", "BASE_URL", "\"https://api.edamam.com/api/\"")
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
//        viewBinding = true
    }
}

dependencies {
    // Kotlin
    implementation(Deps.kotlin)

    // UI
    implementation(Deps.appCompat)

    // Retrofit
    implementation(Deps.retrofit)
    implementation(Deps.converterGson)
    implementation(Deps.loggingInterceptor)

    // Dagger-Hilt
    implementation(Deps.hilt)
    kapt(Deps.hiltCompiler)

    // Timber for logging
    implementation(Deps.timber)

    // Leak Canary - memory leak detection
    debugImplementation(Deps.leakcanary)

    // UNIT TEST
    testImplementation(Deps.junit)
    testImplementation(Deps.mockito)

    // Chucker OkHttp Interceptor
    debugImplementation(Deps.chucker)
    releaseImplementation(Deps.chuckerNoOp)

    implementation(project(Modules.data))
    implementation(project(Modules.domain))
    implementation(project(Modules.presentation))
}