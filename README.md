# Kotlin Multiplatform Sandbox

Простое приложение на Kotlin Multiplatform для iOS и терминала.

## Структура проекта

- `commonMain` - общий код для всех платформ
- `jvmMain` - код для JVM/терминальной версии
- `iosMain` - код для iOS

## Запуск приложений

### Терминальное приложение
```bash
./gradlew runApp
```

### Сборка iOS фреймворка
```bash
./gradlew linkDebugFrameworkIosSimulatorArm64
```

## Тесты
```bash
./gradlew test
```

## Требования
- JDK 17+
- Kotlin 2.2.20
- Для iOS разработки: Xcode и macOS