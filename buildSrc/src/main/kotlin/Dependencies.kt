/**
 * To define plugins
 */
object BuildPlugins {
    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
    val safeArgs by lazy { "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.safeArgsPlugin}" }
    val hiltPlugin by lazy { "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}" }
}

/**
 * To define dependencies
 */
object Deps {
    // Kotlin
    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}" }

    //Coroutines
    val coroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }

    // UI
    val core by lazy { "androidx.core:core-ktx:${Versions.core}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.materialDesign}" }
    val recyclerView by lazy { "androidx.recyclerview:recyclerview:${Versions.recyclerView}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }
    val fragment by lazy { "androidx.fragment:fragment-ktx:${Versions.fragment}" }
    val navigationFragment by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.navigationFragment}" }
    val navigationUI by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.navigationUI}" }

    // LifeCycle
    val lifecycleExtensions by lazy { "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycleExtensions}" }
    val viewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}" }
    val liveData by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}" }

    // Retrofit
    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val converterGson by lazy { "com.squareup.retrofit2:converter-gson:${Versions.converterGson}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}" }

    // Room
    val roomRuntime by lazy { "androidx.room:room-runtime:${Versions.room}" }
    val roomCompiler by lazy { "androidx.room:room-compiler:${Versions.room}" }
    val roomKtx by lazy { "androidx.room:room-ktx:${Versions.room}" }

    // Dagger-Hilt
    val hilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt}" }
    val hiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt}" }

    // Timber for logging
    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber}" }

    // Leak Canary - memory leak detection
    val leakcanary by lazy { "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}" }

    // UNIT TEST
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val mockito by lazy { "org.mockito.kotlin:mockito-kotlin:${Versions.mockito}" }

    // UI TEST
    val androidJunit by lazy { "androidx.test.ext:junit:${Versions.androidJunit}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }

    // Chucker OkHttp Interceptor
    val chucker by lazy { "com.github.chuckerteam.chucker:library:${Versions.chucker}" }
    val chuckerNoOp by lazy { "com.github.chuckerteam.chucker:library-no-op:${Versions.chucker}" }
}

/**
 * To define Modules
 */
object Modules {
    val data by lazy { ":data" }
    val domain by lazy { ":domain" }
    val presentation by lazy { ":presentation" }
}