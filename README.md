[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=14)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)

# Update
Below example in created using `ConstraintLayout` since percent support library is deprecated from API level 26.0.0.

# Integration and Example
This sample uses `ConstraintLayout` to build xml UI. Helps to avoid the overhead of Nested layouts and thereby improving performance.

Really awesome!!!

![size_1_1](https://user-images.githubusercontent.com/10304040/37208672-3542600c-23c8-11e8-92a1-32784c9e0348.png)
![size_1_2](https://user-images.githubusercontent.com/10304040/37208806-b48731c6-23c8-11e8-9f61-d41084ef6a28.png)
![size_1_3](https://user-images.githubusercontent.com/10304040/37208813-ba672eca-23c8-11e8-96fc-655980f68d8d.png)
![background](https://user-images.githubusercontent.com/10304040/45996611-67a33780-c0ba-11e8-8205-eba7d06a794c.png)

Steps:

1. Add below into build.gradle

    ` compile 'com.android.support.constraint:constraint-layout:1.1.0-beta3'`
  
2. Add `layout_constraintHeight_percent` and `layout_constraintWidth_percent` to specify the percentage range.

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


## Licence
      Copyright (C) 2020 Nitesh Tiwari.
  
      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at
 
              http://www.apache.org/licenses/LICENSE-2.0
 
      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
