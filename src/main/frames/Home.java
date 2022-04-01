/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.frames;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import main.util.FileManager;
import main.util.LexicalAnalysis;
import main.util.SymbolTable;
import main.util.TypingUtilities;

/**
 *
 * @author aleja
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    String lastLetter = null;

    String styleFont = "Segoe UI";
    int sizeFont = 14;

    public Home() {
        initComponents();
        jTextPane_CleanCode.setLineWrap(true);
        jTextPane_CleanCode.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane_editor = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Spaces = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_tabulators = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_lineJump = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_characters = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane_CleanCode = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane_comments = new javax.swing.JTextPane();
        jSeparator6 = new javax.swing.JSeparator();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem_open = new javax.swing.JMenuItem();
        jMenuItem_save = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_Lexico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador");
        setResizable(false);

        jTabbedPane1.setToolTipText("");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTextPane_editor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextPane_editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextPane_editorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPane_editorKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPane_editor);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Editor", jPanel1);

        jPanel3.setOpaque(false);

        jLabel1.setText("Espacios en Blanco");

        jTextField_Spaces.setEditable(false);
        jTextField_Spaces.setText("0");

        jLabel6.setText("Tabuladores");

        jTextField_tabulators.setEditable(false);
        jTextField_tabulators.setText("0");

        jLabel9.setText("Saltos de Linea");

        jTextField_lineJump.setEditable(false);
        jTextField_lineJump.setText("0");

        jLabel10.setText("Caracteres");

        jTextField_characters.setEditable(false);
        jTextField_characters.setText("0");

        jLabel11.setText("Codigo Limpio");

        jTextPane_CleanCode.setEditable(false);
        jTextPane_CleanCode.setColumns(20);
        jTextPane_CleanCode.setRows(5);
        jScrollPane4.setViewportView(jTextPane_CleanCode);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField_lineJump, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_characters, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_tabulators, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Spaces, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Spaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_tabulators))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_lineJump, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_characters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4))
        );

        jLabel2.setText("Letras ");

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel3.setText("Numeros");

        jLabel4.setText("Operadores");

        jLabel5.setText("Separadores");

        jLabel7.setText("Comentarios");

        jTextPane_comments.setEditable(false);
        jScrollPane3.setViewportView(jTextPane_comments);

        jLabel8.setText("Especiales");

        jLabel12.setText("Errores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 357, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, 357, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, 357, Short.MAX_VALUE)
                    .addComponent(jComboBox5, 0, 357, Short.MAX_VALUE)
                    .addComponent(jComboBox6, 0, 357, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addComponent(jSeparator7)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Analisis Lexico", jPanel2);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem_open.setText("Abrir");
        jMenuItem_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_openActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_open);

        jMenuItem_save.setText("Guardar");
        jMenuItem_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_saveActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_save);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Analisis");

        jMenuItem_Lexico.setText("Lexico");
        jMenuItem_Lexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_LexicoActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_Lexico);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Ver");

        jMenuItem4.setText("Tabla de Simbolos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Opciones");

        jMenu6.setText("Tamaño de Fuente");

        jMenuItem9.setText("10");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size10_ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setText("12");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size12_ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("14");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size14_ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("18");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size18_ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenu5.add(jMenu6);

        jMenu7.setText("Estilo de Fuente");

        jMenuItem13.setText("Arial");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleArial_ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem14.setText("Calibri");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleCalibriActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Segoe UI");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styleSegoeUI_ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenu5.add(jMenu7);
        jMenu5.add(jSeparator2);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Autocierre de Separadores");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Extra");

        jMenuItem5.setText("Desarrolladores");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Version");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_LexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_LexicoActionPerformed
        LexicalAnalysis lexicalAnalysis = new LexicalAnalysis(jTextPane_editor.getText());

        jTextField_Spaces.setText(String.valueOf(lexicalAnalysis.getSpacesCount()));
        jTextField_tabulators.setText(String.valueOf(lexicalAnalysis.getTabulatorsCount()));
        jTextField_lineJump.setText(String.valueOf(lexicalAnalysis.getLineJumpCount()));
        jTextField_characters.setText(String.valueOf(lexicalAnalysis.getCharactersCount()));
        
        jComboBox1.removeAllItems();
        ArrayList letters = lexicalAnalysis.getLetters();
        for (int i = 0; i < letters.size(); i++) {
            jComboBox1.addItem(letters.get(i).toString());
        }

        jComboBox2.removeAllItems();
        ArrayList numbers = lexicalAnalysis.getNumbers();
        for (int i = 0; i < numbers.size(); i++) {
            jComboBox2.addItem(numbers.get(i).toString());
        }

        jComboBox3.removeAllItems();
        ArrayList operators = lexicalAnalysis.getOperators();
        for (int i = 0; i < operators.size(); i++) {
            jComboBox3.addItem(operators.get(i).toString());
        }
        
        jComboBox4.removeAllItems();
        ArrayList dividers = lexicalAnalysis.getDividers();
        for (int i = 0; i < dividers.size(); i++) {
            jComboBox4.addItem(dividers.get(i).toString());
        }

        jComboBox5.removeAllItems();
        ArrayList specials = lexicalAnalysis.getSpecials();
        for (int i = 0; i < specials.size(); i++) {
            jComboBox5.addItem(specials.get(i).toString());
        }

        jComboBox6.removeAllItems();
        ArrayList unknows = lexicalAnalysis.getUnknows();
        for (int i = 0; i < unknows.size(); i++) {
            jComboBox6.addItem(unknows.get(i).toString());
        }
        // para commit
        jTextPane_CleanCode.setText(lexicalAnalysis.getCleanCode());
        jTextPane_comments.setText(lexicalAnalysis.getComments());
    }//GEN-LAST:event_jMenuItem_LexicoActionPerformed

    private void jMenuItem_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_openActionPerformed
        FileManager fileManager = new FileManager();
        String newText = fileManager.OpenFile(this);
        if (!newText.equals("")) {
            jTextPane_editor.setText(newText);
        }
    }//GEN-LAST:event_jMenuItem_openActionPerformed

    private void jMenuItem_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_saveActionPerformed
        FileManager fileManager = new FileManager();
        fileManager.SaveFile(this, jTextPane_editor.getText());
    }//GEN-LAST:event_jMenuItem_saveActionPerformed

    private void jTextPane_editorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane_editorKeyTyped
        lastLetter = TypingUtilities.printCuople(evt.getKeyChar());
    }//GEN-LAST:event_jTextPane_editorKeyTyped

    private void jTextPane_editorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane_editorKeyReleased
        if (lastLetter != null && jCheckBoxMenuItem1.isSelected()) {
            int caretPosition = jTextPane_editor.getCaretPosition();
            jTextPane_editor.setText(TypingUtilities.finalText(jTextPane_editor.getText(), lastLetter, caretPosition));
            lastLetter = null;
            jTextPane_editor.setCaretPosition(caretPosition);
        }
    }//GEN-LAST:event_jTextPane_editorKeyReleased

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed

    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void size10_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size10_ActionPerformed
        sizeFont = 10;
        Font font = new Font(styleFont, Font.PLAIN, sizeFont);
        jTextPane_editor.setFont(font);
    }//GEN-LAST:event_size10_ActionPerformed

    private void size12_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size12_ActionPerformed
        sizeFont = 12;
        Font font = new Font(styleFont, Font.PLAIN, sizeFont);
        jTextPane_editor.setFont(font);
    }//GEN-LAST:event_size12_ActionPerformed

    private void size14_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size14_ActionPerformed
        sizeFont = 14;
        Font font = new Font(styleFont, Font.PLAIN, sizeFont);
        jTextPane_editor.setFont(font);
    }//GEN-LAST:event_size14_ActionPerformed

    private void size18_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size18_ActionPerformed
        sizeFont = 18;
        Font font = new Font(styleFont, Font.PLAIN, sizeFont);
        jTextPane_editor.setFont(font);
    }//GEN-LAST:event_size18_ActionPerformed

    private void styleArial_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleArial_ActionPerformed
        styleFont = "Arial";
        Font font = new Font(styleFont, Font.PLAIN, sizeFont);
        jTextPane_editor.setFont(font);
    }//GEN-LAST:event_styleArial_ActionPerformed

    private void styleCalibriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleCalibriActionPerformed
        styleFont = "Calibri";
        Font font = new Font(styleFont, Font.PLAIN, sizeFont);
        jTextPane_editor.setFont(font);
    }//GEN-LAST:event_styleCalibriActionPerformed

    private void styleSegoeUI_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styleSegoeUI_ActionPerformed
        styleFont = "Segoe UI";
        Font font = new Font(styleFont, Font.PLAIN, sizeFont);
        jTextPane_editor.setFont(font);
    }//GEN-LAST:event_styleSegoeUI_ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jTextPane_editor.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        SymbolTablePreview sTable = new SymbolTablePreview();
        sTable.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JOptionPane.showMessageDialog(this, "Desarrollado por:\nAlejandro Sanchez y Larry Finol");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JOptionPane.showMessageDialog(this, "Compilador v1.0.0");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                SymbolTable.createHash();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItem_Lexico;
    private javax.swing.JMenuItem jMenuItem_open;
    private javax.swing.JMenuItem jMenuItem_save;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField_Spaces;
    private javax.swing.JTextField jTextField_characters;
    private javax.swing.JTextField jTextField_lineJump;
    private javax.swing.JTextField jTextField_tabulators;
    private javax.swing.JTextArea jTextPane_CleanCode;
    private javax.swing.JTextPane jTextPane_comments;
    private javax.swing.JTextPane jTextPane_editor;
    // End of variables declaration//GEN-END:variables
}
