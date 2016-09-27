# android-percent-layout-sample
This demo displays how to use android support percent library with the help of different layouts as examples.It replaces our tranditional
way of using `layout_weight` of `LinearLayout` in order to access out screen area for different widgets.

Really awesome!!!

![percent_init](https://cloud.githubusercontent.com/assets/10304040/9567537/97e183f8-4f4c-11e5-8b34-f5f2411e67f5.png)
![percent_50_50](https://cloud.githubusercontent.com/assets/10304040/9567536/97dcc84a-4f4c-11e5-9406-4579e7ed4411.png)
![percent_tile2](https://cloud.githubusercontent.com/assets/10304040/9567539/97f413e2-4f4c-11e5-94a7-4aa59862fbac.png)

Steps:

1. Add below into build.gradle

    `compile 'com.android.support:percent:23.0.0'`
  
2. Add any one of this as parent layout.

    `<android.support.percent.PercentRelativeLayout>`
                    or
    `<android.support.percent.PercentFrameLayout>`

3. Finally use `layout_heightPercent` and `layout_widthPercent` properties. Thats it !!!.

```xml
<android.support.percent.PercentRelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:id="@+id/fifty_huntv"
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:background="#ff7acfff"
        android:text="20% - 50%"
        android:textColor="@android:color/white"
        app:layout_heightPercent="20%"
        app:layout_widthPercent="50%" />
    <TextView
        android:layout_width="0dp"
        android:layout_height="0dp"
        android:layout_toRightOf="@id/fifty_huntv"
        android:background="#ffff5566"
        android:text="80%-50%"
        app:layout_heightPercent="80%"
        app:layout_widthPercent="50%"
        />

</android.support.percent.PercentRelativeLayout>
```

Bingo we are done !!!
