// SPDX-License-Identifier: MIT OR Apache-2.0
@file:Suppress("SpellCheckingInspection")

plugins {
    kotlin("multiplatform") version Kotlin.version apply false
    id("de.undercouch.download") version Download.version apply false
    id("com.jfrog.bintray") version Bintray.version apply false
    id("org.jetbrains.dokka") version Dokka.version
}

allprojects {
    repositories {
        if (Kotlin.repo.isNotEmpty()) maven { url = uri(Kotlin.repo) }
        mavenCentral()
    }
}

apply {
    from("dokka.gradle")
}
