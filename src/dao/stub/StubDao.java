package dao.stub;


import dao.IDao;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vasovourka
 */
public class StubDao implements IDao {
    private List<Integer> numbers = new ArrayList<>();
    
    public StubDao()
    {
        
    }
    public StubDao(List<Integer> numbers) 
    {
        this.numbers = numbers;
    }
    @Override
    public List<Integer> getNumbers() {
        return numbers;
    }
    
}
