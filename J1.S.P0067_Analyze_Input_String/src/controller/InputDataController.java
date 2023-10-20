/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Validation;
import model.InputData;
import repository.InputDataRepository;

public class InputDataController {
    Validation valid;
    InputDataRepository repo;
    InputData data;
    
    public InputDataController(){
        valid = new Validation();
        repo = new InputDataRepository();
        data = new InputData();
    }
    
    public void run(){
        System.out.println("===== Analysis String program ====");
        String s = valid.inputString("Input String");
        System.out.println("-----Result Analysis------");
        repo.getNumber(s, data);
        repo.getCharacter(s, data);
    }
}