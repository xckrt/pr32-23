import org.gradle.internal.impldep.bsh.commands.dir

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.myapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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
}

dependencies {
    implementation("com.squareup.picasso:picasso:2.5.2")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.0.0")
    implementation ("com.google.code.gson:gson:2.8.5")
    implementation ("com.squareup.retrofit2:converter-gson:2.4.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.5.0")
    implementation ("com.squareup.retrofit2:retrofit:2.5.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.0.0-alpha2")
    implementation ("androidx.recyclerview:recyclerview:1.0.0")
    implementation (libs.androidx.core.ktx)
            implementation (libs.androidx.appcompat)
            implementation (libs.material)
            implementation (libs.androidx.activity)
            implementation (libs.androidx.constraintlayout)
            testImplementation (libs.junit)
            androidTestImplementation (libs.androidx.junit)
            androidTestImplementation (libs.androidx.espresso.core)
}