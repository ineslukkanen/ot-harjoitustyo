/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cinemastan.domain.CinemaStanMain;
import cinemastan.domain.CinemaStanProgram;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author inlukkan
 */
public class CinemaStanTest {
    
    public CinemaStanTest() {
    }
    CinemaStanProgram cinemastan = new CinemaStanProgram();
    

    @Before
    public void setUp() {
        
    }

    @Test
    public void quizEasyWorks() {
    cinemastan.quizEasy();
    assertEquals("Here we go! Hope you're ready.", cinemastan.toString());
    }
}
