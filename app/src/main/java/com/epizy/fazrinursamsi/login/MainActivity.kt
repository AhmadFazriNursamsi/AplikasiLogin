package com.epizy.fazrinursamsi.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var user :EditText
    private lateinit var pass :EditText
    private lateinit var btn :Button
    private lateinit var regii: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        user = findViewById<EditText>(R.id.username)
        pass = findViewById<EditText>(R.id.password)
        regii = findViewById<EditText>(R.id.rere)

        val usernamevalue = user.text
        val passwordvalue = pass.text

        val intent = Intent(this,login::class.java)
        val intent2 = Intent(this,Register::class.java)

        btn = findViewById(R.id.btnLogin)
        regii.setOnClickListener{
            startActivity(intent2)
        }

        btn.setOnClickListener{
            if (usernamevalue.toString()=="Fazri" && passwordvalue.toString()=="1805")
            {
               startActivity(intent)
            }else if(usernamevalue.toString()== "" && passwordvalue.toString()== ""){
                Toast.makeText(this,"Masih ada input yang kosong, silahkan dilengkapi",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Password Anda Salah ",Toast.LENGTH_SHORT).show()
            }
        }


    }

}