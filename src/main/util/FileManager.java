/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Larry Finol
 */
public class FileManager {

    // Abrir un Archivo
    public String OpenFile(JFrame home) {
        try {
            JFileChooser file = new JFileChooser(".");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archiovs TXT", "txt");
            file.setFileFilter(filtro);
            file.showOpenDialog(home);
            File open = file.getSelectedFile();

            String text = "", aux;
            if (open != null) {
                FileReader fr = new FileReader(open);
                BufferedReader br = new BufferedReader(fr);
                aux = br.readLine();
                while (aux != null) {
                    text += aux;
                    aux = br.readLine();
                    if(aux != null) {
                        text += "\n";
                    }
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
            JFileChooser file = new JFileChooser(".");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archiovs TXT", "txt");
            file.setFileFilter(filtro);
            file.showSaveDialog(home);
            File save = file.getSelectedFile();

            if (save != null) {
                String name = save.getName();
                if (name.length() > 4 && name.substring(name.length() - 4, name.length()).equals(".txt")) {
                    FileWriter fw = new FileWriter(save);
                    fw.write(code);
                    fw.close();
                } else {
                    FileWriter fw = new FileWriter(save + ".txt");
                    fw.write(code);
                    fw.close();
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al intentar guardar el archivo.");
        }
    }
}
