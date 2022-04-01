/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.util;

import java.util.ArrayList;

/**
 *
 * @author Larry Finol
 */
public class LexicalAnalysis {

    private String code;

    public LexicalAnalysis(String code) {
        this.code = code.toLowerCase();
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

    // Combobox letras
    public ArrayList getLetters() {
        ArrayList letters = new ArrayList();
        String cleanCode = getCleanCode();

        if (SymbolTable.st.isEmpty() == false) {
            for (int i = 0; i < cleanCode.length(); i++) {
                if (SymbolTable.st.containsKey(cleanCode.charAt(i)) && SymbolTable.st.get(cleanCode.charAt(i)) == "letra" && letters.contains(cleanCode.charAt(i)) == false) {
                    letters.add(cleanCode.charAt(i));
                }
            }
        }

        return letters;
    }

    // Combobox numeros
    public ArrayList getNumbers() {
        ArrayList numbers = new ArrayList();
        String cleanCode = getCleanCode();

        if (SymbolTable.st.isEmpty() == false) {
            for (int i = 0; i < cleanCode.length(); i++) {
                if (SymbolTable.st.containsKey(cleanCode.charAt(i)) && SymbolTable.st.get(cleanCode.charAt(i)) == "numero" && numbers.contains(cleanCode.charAt(i)) == false) {
                    numbers.add(cleanCode.charAt(i));
                }
            }
        }

        return numbers;
    }

    // Combobox operadores
    public ArrayList getOperators() {
        ArrayList operators = new ArrayList();
        String cleanCode = getCleanCode();

        if (SymbolTable.st.isEmpty() == false) {
            for (int i = 0; i < cleanCode.length(); i++) {
                if (SymbolTable.st.containsKey(cleanCode.charAt(i)) && SymbolTable.st.get(cleanCode.charAt(i)) == "operador" && operators.contains(cleanCode.charAt(i)) == false) {
                    operators.add(cleanCode.charAt(i));
                }
            }
        }

        return operators;
    }
    
     // Combobox separadores
    public ArrayList getDividers() {
        ArrayList dividers = new ArrayList();
        String cleanCode = getCleanCode();

        if (SymbolTable.st.isEmpty() == false) {
            for (int i = 0; i < cleanCode.length(); i++) {
                if (SymbolTable.st.containsKey(cleanCode.charAt(i)) && SymbolTable.st.get(cleanCode.charAt(i)) == "separador" && dividers.contains(cleanCode.charAt(i)) == false) {
                    dividers.add(cleanCode.charAt(i));
                }
            }
        }

        return dividers;
    }

    // Combobox caracteres especiales
    public ArrayList getSpecials() {
        ArrayList specials = new ArrayList();
        String cleanCode = getCleanCode();

        if (SymbolTable.st.isEmpty() == false) {
            for (int i = 0; i < cleanCode.length(); i++) {
                if (SymbolTable.st.containsKey(cleanCode.charAt(i)) && SymbolTable.st.get(cleanCode.charAt(i)) == "especial" && specials.contains(cleanCode.charAt(i)) == false) {
                    specials.add(cleanCode.charAt(i));
                }
            }
        }

        return specials;
    }

    // Combobox invalidos
    public ArrayList getUnknows() {
        ArrayList unknows = new ArrayList();
        String cleanCode = getCleanCode();

        if (SymbolTable.st.isEmpty() == false) {
            for (int i = 0; i < cleanCode.length(); i++) {
                if (SymbolTable.st.containsKey(cleanCode.charAt(i)) == false && unknows.contains(cleanCode.charAt(i)) == false) {
                    unknows.add(cleanCode.charAt(i));
                }
            }
        }

        return unknows;
    }

    // Obtener comentarios
    public String getComments() {
        String comments = "";

        boolean isComment;
        for (int i = 0; i < (code.length() - 2); i++) {
            isComment = code.substring(i, i + 2).equals("/*");
            
            while (isComment) {
                comments += code.charAt(i);
                if (code.substring(i, i + 2).equals("*/")) {
                    comments += code.charAt(i + 1) + "\n";
                    break;
                }
                i++;
            }
        }

        return comments;
    }

    // Limpiar Comentarios
    private String cleanComments() {
        String comments = "";
        String cleanCode = code;
        
        boolean isComment;
        for (int i = 0; i < (code.length() - 2); i++) {
            isComment = code.substring(i, i + 2).equals("/*");

            while (isComment) {
                comments += code.charAt(i);
                if (code.substring(i, i + 2).equals("*/")) {
                    comments += code.charAt(i + 1);
                    cleanCode = cleanCode.replace(comments, "");
                    comments="";
                    break;
                }
                i++;
            }
        }

        return cleanCode;
    }

    // Limpiar el Codigo
    public String getCleanCode() {
        String cleanCode = "";
        String code_ = cleanComments().replaceAll("\n", "");
        
        for (int i = 0; i < code_.length(); i++) {
            if (code_.charAt(i) != ' ') {
                cleanCode += code_.charAt(i);
            }
        }

        return cleanCode;
    }
}
