plugins {
    kotlin("jvm") version "1.8.20"
}

group = "com.hoang"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

object Version {
    const val COROUTINE = "1.9.0"
}

dependencies {
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.COROUTINE}")

    testImplementation(kotlin("test"))
}

tasks.withType<Test> {
    useJUnitPlatform()
}
