package com.rafael.paitercafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {


    private lateinit var btnMainREgister : Button
    private lateinit var btnLogin :Button
    private  lateinit var btnSobre : Button

    private val auth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMainREgister.findViewById<Button>(R.id.mainbtnCadastro)
        btnLogin.findViewById<Button>(R.id.btnLogin)
        btnSobre.findViewById<Button>(R.id.btnsobre)

        btnLogin.setOnClickListener {
            val intent = Intent(this, ActiveLogin::class.java)
            startActivity(intent)
        }




        btnMainREgister.setOnClickListener {
        val intent = Intent(this, ActiveCadastro::class.java)
        startActivity(intent)
        }

        btnSobre.setOnClickListener {
            val intent = Intent(this, ActiveSobre::class.java)
            startActivity(intent)
        }

   }


}