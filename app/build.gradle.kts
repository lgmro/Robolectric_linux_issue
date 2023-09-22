plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

android {
    namespace = "com.lgmro.testroboletriclinux"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.lgmro.testroboletriclinux"
        minSdk = 24
        targetSdk = 33
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

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation("androidx.core:core:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    testImplementation("androidx.test:core-ktx:1.5.0")
    testImplementation("androidx.test.ext:junit:1.1.5")
    testImplementation("junit:junit:4.13.2")
    testImplementation("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation ("org.robolectric:robolectric:4.10.3")

    androidTestImplementation("androidx.test.espresso:espresso-core:2.5.1")
}