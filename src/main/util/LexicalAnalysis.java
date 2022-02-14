/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.util;

/**
 *
 * @author Larry Finol
 */
public class LexicalAnalysis {

    private String code;

    public LexicalAnalysis(String code) {
        this.code = code;
    }

    // Contar Espaciados
    public int getSpacesCount() {
        int count = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    // Contar Caracteres
    public int getCharactersCount() {
        int count = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    // Limpiar el Codigo
    public String getCleanCode() {
        String cleanCode = "";

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) != ' ') {
                cleanCode += code.charAt(i);
            }
        }

        return cleanCode;
    }
}
