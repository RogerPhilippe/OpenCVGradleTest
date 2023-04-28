plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = "me.rphilippe"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(files("/usr/share/java/opencv.jar"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {

    mainClass.set("MainKt")

    applicationDefaultJvmArgs += listOf(
        "-Djava.library.path=/usr/lib/jni/"
    )

}