package com.example.lessonrecycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  Name.setText(intent.extras?.get("name").toString())

    }

    fun registration(view: View) {

        if(Name.text.toString().equals("") && Phone.text.toString().equals("") && Adress.text.toString().equals("")){
            Toast.makeText(this, "Вы не заполнили поля", Toast.LENGTH_SHORT).show()
        }
        else{
            intent = Intent(this,ScrollingActivity::class.java)
            startActivity(intent)
        }

    }
}
