package com.example.rwadfive.viewModels

import com.example.rwadfive.models.Question
import com.orhanobut.logger.Logger

class QuestionsViewModel {
    var currentIndex = 0
    var score = 0
    val questions: List<Question> = listOf(
        Question(
            title = "What is Android Jetpack?",
            choices = listOf("All of these", "Tools", "Documentation", "Libraries"),
            correctAnswer = "All of these"
        ),
        Question(
            "Base class for Layout?",
            listOf("LinearLayout", "RelativeLayout", "ViewGroup", "View"),
            "ViewGroup"
        ),
        Question(
            "Layout for complex Screens?",
            listOf("ConstraintLayout", "GridLayout", "LinearLayout", "FrameLayout"),
            "ConstraintLayout"
        ),
        Question(
            "Pushing structured data into a Layout?",
            listOf("Data Binding", "Data Pushing", "Set Text", "OnClick"),
            "Data Binding"
        ),
        Question(
            "Inflate layout in fragments?",
            listOf("onCreateView", "onViewCreated", "onCreateLayout", "onInflateLayout"),
            "onCreateView"
        )
    )
    fun  nextQuestion( myAnswer:String){
        if(currentIndex < questions.size-1){

            if(myAnswer == questions[currentIndex].correctAnswer){
                Logger.e("Correct")
                score++
            }
            currentIndex++
        }

    }

}