package com.example.rwadfive

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.rwadfive.databinding.FragmentQuestionsBinding
import com.example.rwadfive.viewModels.QuestionsViewModel


class QuestionsFragment : Fragment() {
lateinit var binding: FragmentQuestionsBinding
lateinit var questionModel:QuestionsViewModel
lateinit var myAnswer:String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        questionModel = QuestionsViewModel()
        binding = FragmentQuestionsBinding.inflate(inflater, container, false)
        binding.apply {
            questionTitle.text = questionModel.questions[questionModel.currentIndex].title
            radioButton1.text = questionModel.questions[questionModel.currentIndex].choices[0]
            radioButton2.text = questionModel.questions[questionModel.currentIndex].choices[1]
            radioButton3.text = questionModel.questions[questionModel.currentIndex].choices[2]
            radioButton4.text = questionModel.questions[questionModel.currentIndex].choices[3]
            radioGroup.setOnCheckedChangeListener { _, checkedId ->
                when (checkedId) {
                    R.id.radioButton1 -> myAnswer = radioButton1.text.toString()
                    R.id.radioButton2 -> myAnswer = radioButton2.text.toString()
                    R.id.radioButton3 -> myAnswer = radioButton3.text.toString()
                    R.id.radioButton4 -> myAnswer = radioButton4.text.toString()
                }

            }
            nextButton.setOnClickListener(){
                questionModel.nextQuestion(myAnswer)
                questionTitle.text = questionModel.questions[questionModel.currentIndex].title
                radioButton1.text = questionModel.questions[questionModel.currentIndex].choices[0]
                radioButton2.text = questionModel.questions[questionModel.currentIndex].choices[1]
                radioButton3.text = questionModel.questions[questionModel.currentIndex].choices[2]
                radioButton4.text = questionModel.questions[questionModel.currentIndex].choices[3]
                scoreTxtView.text = "Score: ${questionModel.score}"
            }

        }

        return binding.root
    }

}