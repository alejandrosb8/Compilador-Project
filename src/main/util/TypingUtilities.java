/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.util;

/**
 *
 * @author aleja
 */
public class TypingUtilities {
    
    public static String printCuople(char lastLetter){
        String stringToPrint = null;
        
        switch (lastLetter){
            case '"':
            case '\'':
                stringToPrint = Character.toString(lastLetter);
                break;
            case '(':
                stringToPrint = ")";
                break;
            case '{':
                stringToPrint = "}";
                break;
            case '[':
                stringToPrint = "]";
                break;
            default:
                stringToPrint = null;
                break;
        }
        
        return stringToPrint;
    }
    
    public static String finalText(String text, String toPrint, int carretPosition){
        String newString = text.substring(0, carretPosition) + toPrint + text.substring(carretPosition);
        return newString;
    }
}
