# kotlin-walletconnect-lib
Library to use WalletConnect with Kotlin or Java (Fixed many issues and improved code overall, works with Gradle 7 and Android Studio Artic fox)
The changes here are also in the Pull Request PR40 in the original repository. The original repository doesn't compile currently and it doesn't seem to really be maintained, so better use this one for now.
Also added the improvement from the DYDX fork (specially to notice are the added signing methods).

## Add this library to your project

Add the @jitpack repository to your gradle file:

```gradle
repositories {
	...
	maven { url 'https://jitpack.io' }
}
```

Add the dependency (replace the version by the latest release):

```gradle
dependencies {
	implementation 'com.github.WalletConnect:kotlin-walletconnect-lib:0.9.9.1'
}
```
