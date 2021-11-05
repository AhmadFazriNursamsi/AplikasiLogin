package com.epizy.fazrinursamsi.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
         lateinit var user : EditText
         lateinit var user2 : EditText
         lateinit var pass : EditText
         lateinit var pass2 : EditText
         lateinit var btn :Button
         lateinit var log :TextView

        user = findViewById<EditText>(R.id.username)
        pass = findViewById<EditText>(R.id.password)
        pass2 = findViewById<EditText>(R.id.password2)
        user2 = findViewById<EditText>(R.id.username2)


        val usernamevalue = user.text
        val passwordvalue = pass.text
        val passwordvalue2 = pass2.text
        val usernamevalue2 = user2.text


        val intent = Intent(this,MainActivity::class.java)
        log =findViewById<TextView>(R.id.log)
        log.setOnClickListener{
            startActivity(intent)
        }

        btn = findViewById<Button>(R.id.btnRegis)
        btn.setOnClickListener{
             if (usernamevalue.toString()=="Fazri" && passwordvalue.toString()=="1805")
        {
            startActivity(intent)
            Toast.makeText(this,"Akun Berhasil DiSimpan", Toast.LENGTH_SHORT).show()
        }
             ///isi login else
             else if (usernamevalue2.toString()==""){
                 Toast.makeText(this,"Silahkan Isi Fullname Terlebih Dahulu!", Toast.LENGTH_SHORT).show()
             }
           else if (usernamevalue.toString()==""){
                Toast.makeText(this,"Silahkan Isi Username Terlebih Dahulu!", Toast.LENGTH_SHORT).show()
            }
            else if(passwordvalue.toString()== "" && passwordvalue2.toString()== ""){
                Toast.makeText(this,"Silahkan Isi Password Terlebih Dahulu", Toast.LENGTH_SHORT).show()
            }
            else if (passwordvalue.toString()==passwordvalue2.toString())
            {
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Password tidak sama, tolong cek kembali ", Toast.LENGTH_SHORT).show()
            }
        }

        }

    }
