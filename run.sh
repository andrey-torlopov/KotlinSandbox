#!/bin/bash

echo "Сборка приложения..."
./gradlew jvmJar -q

echo "Запуск приложения..."
java -cp "build/libs/*:$HOME/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/2.2.20/*/kotlin-stdlib-*.jar:$HOME/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlinx/kotlinx-coroutines-core-jvm/1.7.3/*/kotlinx-coroutines-*.jar" MainKt