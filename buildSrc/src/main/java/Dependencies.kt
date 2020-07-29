object Versions {
    val min_sdk = 21
    val target_sdk = 29
    val compile_sdk = 29

    val kotlin = "1.3.72"
    val androidx_test = "1.2.0"
    val androidx_test_ext = "1.1.1"
    val android_gradle_plugin = "3.6.3"
    val buildToolsVersion = "29.0.0"
    val junit = "4.13"
    val coroutines = "1.3.5-native-mt"
    val serialization = "0.20.0"
    val cocoapodsext = "0.9"
    val robolectric = "4.3.1"
}

object Deps {
    val app_compat_x = "androidx.appcompat:appcompat:1.1.0"
    val material_x = "com.google.android.material:material:1.1.0"
    val core_ktx = "androidx.core:core-ktx:1.2.0"
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    val junit = "junit:junit:${Versions.junit}"
    val cocoapodsext = "co.touchlab:kotlinnativecocoapods:${Versions.cocoapodsext}"
    val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"

    object AndroidXTest {
        val core = "androidx.test:core:${Versions.androidx_test}"
        val junit = "androidx.test.ext:junit:${Versions.androidx_test_ext}"
        val runner = "androidx.test:runner:${Versions.androidx_test}"
        val rules = "androidx.test:rules:${Versions.androidx_test}"
    }
}
