<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <EditText
    android:id="@+id/editText"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="0"
    android:textAlignment="textEnd"
    android:layout_gravity="end"
    android:layout_marginBottom="8dp"/>

    <GridLayout
    android:id="@+id/gridLayout"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:columnCount="4"
    android:rowCount="6">

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_columnSpan="2"
    android:text="C"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="/"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="7"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="8"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="9"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="*"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="4"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="5"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="6"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="-"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="1"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="2"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="3"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="+"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_rowSpan="2"
    android:text="0"/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:text="."/>

    <Button
    android:layout_width="0dp"
    android:layout_height="wrap_content"
    android:layout_rowSpan="2"
    android:text="="/>

    </GridLayout>
</LinearLayout>
