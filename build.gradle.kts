plugins {
    kotlin("multiplatform") version "2.2.20"
    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.20"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    // JVM target for terminal application
    jvm {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    
    // iOS targets
    val iosX64 = iosX64()
    val iosArm64 = iosArm64()
    val iosSimulatorArm64 = iosSimulatorArm64()

    configure(listOf(iosX64, iosArm64, iosSimulatorArm64)) {
        binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
        }
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
        jvmMain.dependencies {
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.7.3")
        }
    }
}

tasks.register<JavaExec>("runApp") {
    group = "application"
    description = "Запускает терминальное приложение"
    mainClass.set("MainKt")
    classpath = kotlin.jvm().compilations.getByName("main").output.allOutputs + kotlin.jvm().compilations.getByName("main").runtimeDependencyFiles
    standardInput = System.`in`
}

