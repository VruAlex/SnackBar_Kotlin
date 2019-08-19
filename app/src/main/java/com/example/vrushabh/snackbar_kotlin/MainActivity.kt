package com.example.vrushabh.snackbar_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Undo Button Click
        class UndoListener : View.OnClickListener {
            override fun onClick(v: View?) {
              Toast.makeText(this@MainActivity, "You Clicked" , Toast.LENGTH_LONG).show()
            }
        }


        //SnackBar popUp
        Click.setOnClickListener {
            val mySnackbar = Snackbar.make(findViewById(R.id.Code), R.string.email, Snackbar.LENGTH_SHORT)
            mySnackbar.setAction(R.string.undo, UndoListener())
            mySnackbar.show()
        }

    }
}
