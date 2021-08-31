## Tech stack & Open-source libraries
  - Kotlin DSL
  - Navigation component - navigation graph for navigating and replacing screens/fragments
  - DataBinding - allows to more easily write code that interacts in a two-way with views and replaces ```findViewById```.
  - ViewModel - UI related data holder, lifecycle aware.
  - LiveData - Build data objects that notify views when the underlying database changes.
  - Dagger-Hilt for dependency injection. Object creation and scoping is handled by Hilt.
  - Kotlin Coroutines + Flow - for managing background threads with simplified code and reducing needs for callbacks
  - Retrofit2 & OkHttp3 - to make REST requests to the web service integrated.
 
## Architecture:
  - Clean Architecture (Data - Domain - Presentation)
  - MVVM Architecture 
  - Repository pattern
  - Applying SOLID principles, each class has a single job with separation of concerns by making classes independent of each other and communicating with interfaces.

## Features
+ Analyze food ingredients in a free text

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
