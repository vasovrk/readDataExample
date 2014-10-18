/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.IDao;

/**
 *
 * @author vasovourka
 */
public class MyController {

    private IDao dao;

    public MyController(IDao dao) {
        this.dao = dao;

    }

    public int getMaxNumber() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

}
