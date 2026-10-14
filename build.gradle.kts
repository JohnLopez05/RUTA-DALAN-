// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    // Put on the classpath only; the app module applies it when google-services.json exists.
    alias(libs.plugins.google.services) apply false
}
