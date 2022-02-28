package com.example.iedorset24066eliabe_ca1project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this button will connect to the mainActivity1

        Education.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

        // this button will connect to the mainActivity2

        skills.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        // this button will connect to the mainActivity3

        hobies.setOnClickListener {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
      }


        // this button will connect to the mainActivity4

        achivimets.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

        // this is an exit button, which will pop up a dialog box asking to the user
        // if it wold like to finish the activity


        var exitButton: Button = findViewById(R.id.exitButton)
        exitButton.setOnClickListener {
            val alertdialog: AlertDialog = AlertDialog.Builder(this).create()
            alertdialog.setTitle("are you sure you want to exit?")
            alertdialog.setButton(AlertDialog.BUTTON_POSITIVE, "yes") {
                    dialog, which -> finish()
                dialog.dismiss()
            }

            alertdialog.setButton(AlertDialog.BUTTON_NEGATIVE, "no") {
                    dialog, which ->
                dialog.dismiss()

            }
            alertdialog.show()
        }


    }

}








