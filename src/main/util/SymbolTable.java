/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aleja
 */
public class SymbolTable {
    
    static HashMap<Character, String> st = new HashMap<>();

        public static void createHash(){
            if (st.isEmpty()){
                
                String letras = "letra";
                String numeros = "numero";
                String operadores = "operador";
                String separadores = "separador";
                String caracteresEspeciales = "especial";
                
                //Letras
                st.put('a', letras);
                st.put('b', letras);
                st.put('c', letras);
                st.put('d', letras);
                st.put('e', letras);
                st.put('f', letras);
                st.put('g', letras);
                st.put('h', letras);
                st.put('i', letras);
                st.put('j', letras);
                st.put('k', letras);
                st.put('l', letras);
                st.put('m', letras);
                st.put('n', letras);
                st.put('ñ', letras);
                st.put('o', letras);
                st.put('p', letras);
                st.put('q', letras);
                st.put('r', letras);
                st.put('s', letras);
                st.put('t', letras);
                st.put('u', letras);
                st.put('v', letras);
                st.put('w', letras);
                st.put('x', letras);
                st.put('y', letras);
                st.put('z', letras);
                
                //numeros
                st.put('0', numeros);
                st.put('1', numeros);
                st.put('2', numeros);
                st.put('3', numeros);
                st.put('4', numeros);
                st.put('5', numeros);
                st.put('6', numeros);
                st.put('7', numeros);
                st.put('8', numeros);
                st.put('9', numeros);
                
                //Operadores
                st.put('+', operadores);
                st.put('-', operadores);
                st.put('/', operadores);
                st.put('*', operadores);
                st.put('%', operadores);
                st.put('^', operadores);
                st.put('=', operadores);
                
                //Separadores
                st.put('(', separadores);
                st.put(')', separadores);
                st.put('[', separadores);
                st.put(']', separadores);
                st.put('{', separadores);
                st.put('}', separadores);
                
                //Caracteres espaciales
                st.put('.', caracteresEspeciales);
                st.put(',', caracteresEspeciales);
                st.put(';', caracteresEspeciales);
                st.put(':', caracteresEspeciales);
                st.put('_', caracteresEspeciales);
                st.put('#', caracteresEspeciales);
                st.put('\'', caracteresEspeciales);
                st.put('"', caracteresEspeciales);
                st.put('/', caracteresEspeciales);
                st.put('\\', caracteresEspeciales);
                st.put('$', caracteresEspeciales);
                st.put('&', caracteresEspeciales);
                st.put('|', caracteresEspeciales);
            }
        }
        
        public static HashMap<Character, String> getTable(){
            HashMap<Character, String> table = st;
            return table;
        }
        public static int getTableSize(){
            int size = st.size();
            return size;
        }
}
