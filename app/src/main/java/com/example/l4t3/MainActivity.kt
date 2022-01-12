package com.example.l4t3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.field)
        val guess= findViewById<Button>(R.id.guess)

        guess.setOnClickListener {
                if (name.text.toString().isNotEmpty()) {
                    guessAgain()
                    var t = "Guess Again"
                    guess.setText(t)
                }
                else {
                    Toast.makeText(this, "Please, Enter a Name First!", Toast.LENGTH_SHORT).show()
                }
        }
    }
    fun guessAgain(){
        val img=findViewById<ImageView>(R.id.imageView)
        val rand = (0..18).random()
        when (rand) {
            0 -> {
                img.setImageResource(R.drawable.angry)
            }
            1 -> {
                img.setImageResource(R.drawable.annoyed)
            }
            2 -> {
                img.setImageResource(R.drawable.bored)
            }
            3 -> {
                img.setImageResource(R.drawable.cool)
            }
            4 -> {
                img.setImageResource(R.drawable.embarrassed)
            }
            5 -> {
                img.setImageResource(R.drawable.excited)
            }
            6 -> {
                img.setImageResource(R.drawable.frustrated)
            }
            7 -> {
                img.setImageResource(R.drawable.funny)
            }
            8 -> {
                img.setImageResource(R.drawable.goofy)
            }
            9 -> {
                img.setImageResource(R.drawable.happy)
            }
            10 -> {
                img.setImageResource(R.drawable.nervous)
            }
            11 -> {
                img.setImageResource(R.drawable.proud)
            }
            12 -> {
                img.setImageResource(R.drawable.quit)
            }
            13 -> {
                img.setImageResource(R.drawable.sad)
            }
            14 -> {
                img.setImageResource(R.drawable.scared)
            }
            15 -> {
                img.setImageResource(R.drawable.sick)
            }
            16 -> {
                img.setImageResource(R.drawable.surprised)
            }
            17 -> {
                img.setImageResource(R.drawable.tired)
            }
        }
    }
}