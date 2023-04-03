package com.innerwave.practice.example;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService service;
    @PostMapping("/")
    public String home(){
        System.out.println("Question Home 입니다.");
        return "Question Home 입니다.";
    }
    @PostMapping("/write")
    public String save(@RequestBody QuestionDTO questionDTO){
        service.save(questionDTO);
        return "message:save ok";
    }

    @PostMapping("/findAll")
    public List<QuestionDTO> findAll(){
        System.out.println("findAll 진입");
        return service.findAll();
    }

    @GetMapping("/findOne/{questionID}")
    public Optional<QuestionDTO> findOne(@PathVariable long questionID){
        return service.findOne(questionID);
    }

    @DeleteMapping("/delete/{questionID}")
    public String asd(@PathVariable long questionID){
        service.delete(questionID);
        return "message:delete OK";
    }


    @PostMapping("/edit")
    public String update(@RequestBody QuestionDTO questionDTO){
        service.save(questionDTO);
        return "message:edit ok";
    }
}
