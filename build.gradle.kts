plugins {
    kotlin("jvm") version "1.5.32"
}

group = "io.github.serpro69"

description = "gradle bug reproducer"

dependencies {
    platform("org.jetbrains.kotlin:kotlin-bom")
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

