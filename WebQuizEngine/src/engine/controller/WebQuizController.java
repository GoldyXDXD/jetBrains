package engine.controller;

import engine.model.Answer;
import engine.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebQuizController {
    Question question = new Question("The Java Logo", "What is depicted on the Java logo?", new String[]{"Robot","Tea leaf","Cup of coffee","Bug"});

    @GetMapping(path = "/api/quiz")
    public Question getQuestion() {
        return question;
    }

    @PostMapping(path = "/api/quiz")
    public Answer solveQuestion(@RequestParam int answer) {
        if (answer == 2) {
            return Answer.success();
        } else {
            return Answer.wrong();
        }
    }
}
