package com.epizy.fazrinursamsi.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnToSecondAct = findViewById<Button>(R.id.buttonkeluar)
        val intent = Intent(this,MainActivity::class.java)
        btnToSecondAct.setOnClickListener{
            startActivity(intent)
    }


}
}