plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion(ConfigData.compileSdkVersion)
    buildToolsVersion(ConfigData.buildToolsVersion)

    defaultConfig {
        minSdkVersion(ConfigData.minSdkVersion)
        targetSdkVersion(ConfigData.targetSdkVersion)
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

    //Coroutines
    implementation(Deps.coroutines)

    // UI
    implementation(Deps.core)
    implementation(Deps.appCompat)
    implementation(Deps.materialDesign)
    implementation(Deps.recyclerView)
    implementation(Deps.constraintLayout)
    implementation(Deps.fragment)
    implementation(Deps.navigationFragment)
    implementation(Deps.navigationUI)

    // LifeCycle
    implementation(Deps.lifecycleExtensions)
    implementation(Deps.viewModel)
    implementation(Deps.liveData)
    implementation(Deps.lifecycleRuntime)

    // UI TEST
    androidTestImplementation(Deps.androidJunit)
    androidTestImplementation(Deps.espresso)

    // Dagger-Hilt
    implementation(Deps.hilt)
    kapt(Deps.hiltCompiler)

    implementation(project(Modules.domain))
}