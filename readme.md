# Recipes App

Recipes are under categories such as salads, desserts, etc. and popular recipes. The recipe description includes ingredients, steps, time. For recipe search, the search bar and light/night mode are adapted to the theme of the device.

## Room Database Usage

This project uses the Room library for Android for local database management. Room is a library that makes local database operations easy and secure. The Room library is part of the Android Jetpack components and can be added to the existing Android project. Room needs to be added to the dependencies in your build.gradle file.

```kotlin
    def room_version = "2.6.1"
    implementation "androidx.room:room-runtime:$room_version"
    kapt "androidx.room:room-compiler:$room_version"
```

## Glide Library Usage

In this project, the Glide library is used for image processing and uploading. Glide is a library that makes it easy to load and process images in Android applications.

```kotlin
implementation 'com.github.bumptech.glide:glide:4.16.0'
```

## Dependencies and Configurations

```kotlin
dependencies {
    implementation 'androidx.core:core-ktx:1.8.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.core:core-ktx:+'
    implementation 'androidx.core:core-ktx:+'
}
```

```kotlin
android {
    compileSdkVersion 34
    defaultConfig {
        minSdkVersion 26
        targetSdkVersion 34
    }
```

```kotlin
plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'kotlin-kapt'
}
```

## Images of the Application

### Light Mode / Dark Mode

<style>
  table {
    border-collapse: collapse;
    width: 100%;
  }
  td {
    padding: 8px;
    border: none;
  }
</style>
<br/>
<table>
  <tr>
    <td align="center"><img src="https://github.com/reyhanturkkal/Recipes_App/blob/master/assets/homePage.jpg" alt="home page" ></td>
    <td align="center"><img src="https://github.com/reyhanturkkal/Recipes_App/blob/master/assets/searchPage.jpg" alt="search page" ></td>
    <td align="center"><img src="https://github.com/reyhanturkkal/Recipes_App/blob/master/assets/searchForPage.jpg" alt="search for page" ></td>
    <td align="center"><img src="https://github.com/reyhanturkkal/Recipes_App/blob/master/assets/categoryPage.jpg" alt="category page" ></td>
  </tr>
  <tr>
    <td align="center"><img src="https://github.com/reyhanturkkal/Recipes_App/blob/master/assets/Ingredients.jpg" alt="ingredients" ></td>
    <td align="center"><img src="https://github.com/reyhanturkkal/Recipes_App/blob/master/assets/Steps.jpg" alt="steps" ></td>
    <td align="center"><img src="https://github.com/reyhanturkkal/Recipes_App/blob/master/assets/extendRecipe.jpg" alt="extend recipe" ></td>
    <td align="center"><img src="https://github.com/reyhanturkkal/Recipes_App/blob/master/assets/extendPhoto.jpg" alt="extend photo" ></td>
  </tr>
</table>
