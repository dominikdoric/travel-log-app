plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("org.jetbrains.compose")
    id("dev.icerock.mobile.multiplatform-resources")
}

kotlin {
    androidTarget()

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "shared"
            isStatic = true
            export("dev.icerock.moko:resources:0.23.0")
            export("dev.icerock.moko:graphics:0.9.0")
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
                implementation(compose.components.resources)
                implementation("io.insert-koin:koin-core:3.5.0")
                implementation("io.insert-koin:koin-test:3.2.0")
                implementation("cafe.adriel.voyager:voyager-navigator:1.0.0-rc07")
                implementation("cafe.adriel.voyager:voyager-androidx:1.0.0-rc07")
                implementation("cafe.adriel.voyager:voyager-koin:1.0.0-rc07")
                api("dev.icerock.moko:mvvm-core:0.16.1")
                api("dev.icerock.moko:mvvm-compose:0.16.1")
                api("dev.icerock.moko:resources:0.23.0")
            }
        }
        val androidMain by getting {
            dependsOn(commonMain)
            dependencies {
                api("androidx.activity:activity-compose:1.8.0")
                api("androidx.appcompat:appcompat:1.6.1")
                api("androidx.core:core-ktx:1.12.0")
                implementation("io.insert-koin:koin-androidx-compose:3.5.0")
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}

android {
    compileSdk = (findProperty("android.compileSdk") as String).toInt()
    namespace = "com.myapplication.common"

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        minSdk = (findProperty("android.minSdk") as String).toInt()
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin {
        jvmToolchain(11)
    }
}

multiplatformResources {
    multiplatformResourcesPackage = "com.myapplication.common"
    multiplatformResourcesClassName = "SharedRes"
}
