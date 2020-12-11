package com.securitas.securitasclient

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide();
    }


    fun registration(view: View){
        //создание нового активити (окно регистрации)
        val registration = Intent(this,RegistrationActivity::class.java)
        //старт нового активити
        startActivity(registration)}




}