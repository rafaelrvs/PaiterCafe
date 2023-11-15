package com.rafael.paitercafe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {


    private lateinit var btnMainREgister : Button


    private val auth = FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMainREgister.findViewById<Button>(R.id.mainbtnCadastro)

btnMainREgister.setOnClickListener{view->

    val login =  f

    val intent = Intent(this,login::class.java)
    startActivity(intent)

}








    }
}