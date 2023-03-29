package com.innerwave.practice.example;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @PostMapping("/")
    public String home(){
        System.out.println("Question Home 입니다.");
        return "Question Home 입니다.";
    }
//    @PostMapping("/write")
//    public String save(QuestionDTO questionDTO){
//        return questionDTO.getQuestion();
//    }

    @PostMapping("/write")
    public String save(String question){
        System.out.println(question);
        return question;
    }
}
