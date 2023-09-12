package com.codecool.stackoverflowtw.service;

import com.codecool.stackoverflowtw.dao.QuestionsDAO;
import com.codecool.stackoverflowtw.controller.dto.NewQuestionDTO;
import com.codecool.stackoverflowtw.controller.dto.QuestionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class QuestionService {

    private QuestionsDAO questionsDAO;

    @Autowired
    public QuestionService(QuestionsDAO questionsDAO) {
        this.questionsDAO = questionsDAO;
    }

    public List<QuestionDTO> getAllQuestions() {
        return questionsDAO.getAllQuestion();
    }

    public QuestionDTO getQuestionById(int id) {
        return questionsDAO.getQuestion(id);
    }

    public boolean deleteQuestionById(int id) {
        return questionsDAO.deleteQuestion(id);
    }

    public int addNewQuestion(NewQuestionDTO question) {
        return questionsDAO.addQuestion(question);

    }
}
