package com.innerwave.practice.example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository repository;

    public QuestionDTO save(QuestionDTO questionDTO){
        return repository.save(questionDTO);
    }

    public List<QuestionDTO> findAll(){
        return repository.findAll();
    }

    public Optional<QuestionDTO> findOne(long questionID){
        return repository.findById(questionID);
    }
}
