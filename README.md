# Ktor Project

## 📌 Overview
This project is a backend application built using [Ktor](https://ktor.io/), a framework for building asynchronous servers and clients in Kotlin.

## 📂 Project Structure
```plaintext
project-root/
│── src/
│   ├── main/
│   │   ├── kotlin/com/geovannycode/
│   │   │   ├── Application.kt
│   │   │   ├── modules/
│   │   │   ├── routes/
│   ├── test/
│── build.gradle.kts
│── settings.gradle.kts
│── README.md
```

## 🚀 Technologies Used
- **Kotlin** (`1.8.10`)
- **Ktor** (`2.2.4`)
- **Logback** (`1.2.11`)

## ⚙️ Configuration
The project dependencies are managed using Gradle with the following versions specified:
```kotlin
val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project
```

## 🔌 Plugins
The following plugins are used:
```kotlin
plugins {
    kotlin("jvm") version "1.8.10"
    id("io.ktor.plugin") version "2.2.4"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10"
}
```

## 📦 Dependencies
```kotlin
dependencies {
    implementation("io.ktor:ktor-server-core-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-content-negotiation-jvm:$ktor_version")
    implementation("io.ktor:ktor-serialization-kotlinx-json-jvm:$ktor_version")
    implementation("io.ktor:ktor-server-netty-jvm:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests-jvm:$ktor_version")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}
```

## ▶️ Running the Application
To run the project, execute:
```sh
./gradlew run
```
This will start the Ktor server with Netty as the application engine.

## 🛠️ Environment Configuration
The application checks for a development environment flag:
```kotlin
val isDevelopment: Boolean = project.ext.has("development")
applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
```

## 🧪 Testing
Run tests using:
```sh
./gradlew test
```
This will execute the unit tests configured in the project.

## 📜 License
This project is open-source and distributed under the MIT License.

