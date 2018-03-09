[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)

# Update
Below example in created using `ConstraintLayout` since percent support library is deprecated from API level 26.0.0.

# Integration and Samples
This sample uses `ConstraintLayout` to build xml UI. Helps to avoid the overhead of Nested layouts and thereby improving performance.

Really awesome!!!

![size_1_1](https://user-images.githubusercontent.com/10304040/37208672-3542600c-23c8-11e8-92a1-32784c9e0348.png)
![size_1_2](https://user-images.githubusercontent.com/10304040/37208806-b48731c6-23c8-11e8-9f61-d41084ef6a28.png)
![size_1_3](https://user-images.githubusercontent.com/10304040/37208813-ba672eca-23c8-11e8-96fc-655980f68d8d.png)

Steps:

1. Add below into build.gradle

    ` compile 'com.android.support.constraint:constraint-layout:1.1.0-beta3'`
  
2. We have to use `layout_constraintHeight_percent` and `layout_constraintWidth_percent` to specify the percentage raning from (0 - 1).
  0 = 0% and 1 is 100%

3. Finally add `layout_constraintWidth_default="percent"` and `layout_constraintHeight_default="percent"`. Thats it !!!.

```xml
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <TextView
        android:id="@+id/fifty_thirty"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#ffff8800"
        android:gravity="center"
        android:text="@string/fifty_fifty_text"
        android:textColor="@android:color/white"
        app:layout_constraintHeight_default="percent"
        app:layout_constraintHeight_percent="0.5"
        android:textSize="25sp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintWidth_default="percent"
        app:layout_constraintWidth_percent="0.5" />

    <TextView
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#ffff5566"
        android:gravity="center"
        android:text="@string/fifty_fifty_text"
        android:textColor="@android:color/white"
        android:textSize="25sp"
        app:layout_constraintHeight_default="percent"
        app:layout_constraintHeight_percent="0.5"
        app:layout_constraintLeft_toRightOf="@id/fifty_thirty"
        app:layout_constraintTop_toBottomOf="@id/fifty_thirty"
        app:layout_constraintWidth_default="percent"
        app:layout_constraintWidth_percent="0.5" />
    
</android.support.constraint.ConstraintLayout>
```

Bingo we are done !!!
