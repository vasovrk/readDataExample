/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.stub.StubDao;
import controllers.MyController;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vasovourka
 */
public class MyControllerTest {
    
    public MyControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of MyController method, of class MyController.
     */
    @Test
    public void testMyControllerEmptyList() {
        System.out.println("MyController");
        IDao dao = new StubDao();
        MyController instance = new MyController(dao);
       assertEquals(0,instance.getMaxNumber());
    }

    /**
     * Test of getNumbers method, of class MyController.
     */
    @Test
    public void testMyControllerListWithOnlyZero() {
        System.out.println("getNumbers");
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);
        IDao dao = new StubDao(numbers);
        MyController instance = new MyController(dao);
        int expResult = 0;
        int result = instance.getMaxNumber();
        
        assertEquals(expResult, result);
       
    }
    
}
