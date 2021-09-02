package com.example.ejercicio_pacha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var btnSnack : Button
    lateinit var btnFloat : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val makeText = Toast.makeText(applicationContext, R.string.textCreate, Toast.LENGTH_LONG)
        makeText.show()
        setContentView(R.layout.activity_main)
        setTitle(R.string.titleApp)

        btnSnack = findViewById(R.id.btn_snack)
        btnSnack.setOnClickListener{
            val snackBar = Snackbar.make(it, R.string.textSnack, Snackbar.LENGTH_LONG)
            snackBar.show()
        }

        btnFloat = findViewById(R.id.floatBtn)
        btnFloat.setOnClickListener{
            val toasts = Toast.makeText(applicationContext, R.string.textFloat, Toast.LENGTH_LONG)
            toasts.setGravity(Gravity.CENTER, 0, 0)
            toasts.show()
        }

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onPause() {
        val makeText = Toast.makeText(applicationContext, R.string.textPause, Toast.LENGTH_LONG)
        makeText.show()
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
