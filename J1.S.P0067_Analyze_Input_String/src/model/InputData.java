/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Admin
 */
public class InputData {
    private String string;
    private HashMap<String, List<Integer>> number;
    private HashMap<String, StringBuilder> character;

    public InputData() {
    }

    public InputData(String string, HashMap<String, List<Integer>> number, HashMap<String, StringBuilder> character) {
        this.string = string;
        this.number = number;
        this.character = character;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public HashMap<String, List<Integer>> getNumber() {
        return number;
    }

    public void setNumber(HashMap<String, List<Integer>> number) {
        this.number = number;
    }

    public HashMap<String, StringBuilder> getCharacter() {
        return character;
    }

    public void setCharacter(HashMap<String, StringBuilder> character) {
        this.character = character;
    }
    
    
}
