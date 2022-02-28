package com.example.iedorset24066eliabe_ca1project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        // this button will connect back to the mainActivity

        homeback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)


        }
        // this button will connect back to the mainActivity4

        backhobies.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)


        }

    }

    }

