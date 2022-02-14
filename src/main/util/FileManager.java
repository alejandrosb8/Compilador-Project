/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Larry Finol
 */
public class FileManager {

    // Abrir un Archivo
    public String OpenFile(JFrame home) {
        try {
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(home);
            File open = file.getSelectedFile();

            String text = "", aux;
            if (open != null) {
                FileReader fr = new FileReader(open);
                BufferedReader br = new BufferedReader(fr);
                while ((aux = br.readLine()) != null) {
                    text += aux;
                }
                fr.close();
                br.close();
            }
            return text;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al intentar abrir el archivo.");
            return "";
        }
    }

    // Guardar un Archivo
    public void SaveFile(JFrame home, String code) {
        try {
            JFileChooser file = new JFileChooser();
            file.showSaveDialog(home);
            File save = file.getSelectedFile();

            if (save != null) {
                FileWriter fw = new FileWriter(save + ".txt");
                fw.write(code);
                fw.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al intentar guardar el archivo.");
        }
    }
}
