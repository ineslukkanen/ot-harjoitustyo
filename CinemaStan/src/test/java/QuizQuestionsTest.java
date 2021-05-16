/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import cinemastan.domain.Questions;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author inlukkan
 */

public class QuizQuestionsTest {
    Questions testQuestions;
    List <String> testList;
    
    @Before
    public void setUp() {
    testQuestions = new Questions();
    testList = new ArrayList<>();
    this.testQuestions.addQuestion("Is this working?", "Yes");
    }/*
    @Test
    public void getQuestionReturnsCorrectly(){
    assertEquals("Is this working?", testQuestions.getQuestion(0);
    }
    @Test
    public void addQuestionAddsCorrectly() {
    }

    @Test
    public void askQuestionReturnsCorrectly(){
    assertEquals("Is this working?", testQuestions.askQuestion());    
    }*/
}
