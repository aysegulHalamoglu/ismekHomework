package com.halamoglu.ismekhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Question
        val question = findViewById<TextView>(R.id.rv_textView)
        question.text = "What is your favorite anime?"
        // Answer List
        var answerList = ArrayList<String>()
        answerList.add("One Piece")
        answerList.add("Death Note")
        answerList.add("Attack on Titan")
        answerList.add("My Hero Academia")
        answerList.add("Hunter X Hunter")
        answerList.add("Bleach")
        answerList.add("Jujutsu Kaisen")
        answerList.add("Gintama")
        answerList.add("Steins;Gate")
        answerList.add("Tokyo Ghoul")
        answerList.add("Fullmetal Alchemist")
        answerList.add("One Punch Man")
        answerList.add("Demon Slayer: Kimetsu no Yaiba")
        answerList.add("Naruto")
    }
}