# Travel Log App

Welcome to the Travel Log App repository! This is an experimental project built to learn Kotlin Multiplatform Mobile (KMM) and showcase its capabilities. The Travel Log App is a local-only application, meaning it does not communicate with a server and operates solely with a local database. It utilizes several libraries and technologies to achieve its functionality:

- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html): Kotlin Multiplatform Mobile allows you to share code across Android and iOS platforms, making development more efficient.
- [Koin](https://insert-koin.io/): Koin is used for dependency injection in this project, enabling easy management of dependencies.
- [Moko MVVM](https://github.com/icerockdev/moko-mvvm): Moko MVVM is used to implement the ViewModel architecture, ensuring separation of concerns and maintainability.
- [Jetpack Compose](https://developer.android.com/jetpack/compose): Jetpack Compose is used for building the user interface, creating a modern and declarative UI experience.
- [SQLDelight](https://cashapp.github.io/sqldelight/): SQLDelight is used for working with the local database, offering type-safe SQL queries.

## Features

- Create, read, update, and delete travel logs.
- Store travel log entries in a local database.
- View your travel logs in a user-friendly interface built with Jetpack Compose.
- Dependency injection with Koin for better code organization and testing.

## Project Structure

The project is structured as follows:

- `androidApp`: Contains the Android-specific code for the Travel Log app.
- `iosApp`: Contains the iOS-specific code for the Travel Log app.
- `shared`: Contains the shared Kotlin code that can be used across both Android and iOS platforms.
- `data`: Contains database and repository-related code.
- `presentation`: Contains the Jetpack Compose UI and ViewModel code.
- `di`: Contains Koin dependency injection modules.
