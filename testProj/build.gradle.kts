plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
// https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:3.141.59")

    implementation("com.codeborne:selenide:5.20.0")

    implementation("org.slf4j:slf4j-api:1.7.32")



}

tasks.test {
    useJUnitPlatform()
}