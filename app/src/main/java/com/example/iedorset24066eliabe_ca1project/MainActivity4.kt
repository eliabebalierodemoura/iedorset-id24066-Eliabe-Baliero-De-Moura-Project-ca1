package com.example.iedorset24066eliabe_ca1project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main3.home_button
import kotlinx.android.synthetic.main.activity_main3.nextHobies
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)


        // this button will connect back to the mainActivity3

            backSkills.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }

        // this home button will connect to the mainActivity1

        home_button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)


        }
        // this button will connect to the mainActivity6

        nextAchieves.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)


        }

    }
}