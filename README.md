## Usage

## build.gradle
```gradle
repositories {
  maven { url 'https://jitpack.io' }
}
```
```gradle
dependencies {
  implementation 'com.github.samet-byte:SamCustomStuffLibrary:1.3'
}
```

## Example
```kotlin
SamTextFormat
  .create("That's All!)
  .bold()
  .cyan()
  .print()
```
$${{\color{Cyan}\Huge{\textsf{  That's\ All!\ \}}}}\$$

