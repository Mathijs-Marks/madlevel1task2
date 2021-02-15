package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityTruthTableBinding

class TruthTableActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTruthTableBinding
    private var answerCount: Int = 0
    private var requiredCorrectAnswers: Int = 4

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTruthTableBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout resource file.


        binding.btnSubmit.setOnClickListener {
            checkAnswer()
            answerCount = 0 // Set the answer count back to 0 to allow the program to keep checking
        }
    }

    private fun checkAnswer() {
        if (binding.etRight1.text.toString() == "T") {
            answerCount++
        }

        if (binding.etRight2.text.toString() == "F") {
            answerCount++
        }

        if (binding.etRight3.text.toString() == "F") {
            answerCount++
        }

        if (binding.etRight4.text.toString() == "F") {
            answerCount++
        }

        val message = if (answerCount == requiredCorrectAnswers) {
            "All answers are correct!"
        } else {
            "Not all answers are correct. Try again! Correct answers: $answerCount"
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}