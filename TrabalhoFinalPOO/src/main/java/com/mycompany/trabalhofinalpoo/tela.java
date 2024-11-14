/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhofinalpoo;
import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;/**
 *
 * @author pedro
 */
public class tela extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    public tela() {
        initComponents();
        System.out.println(javax.swing.UIManager.getDefaults().getFont("Label.font"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        Texto = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        sobre = new javax.swing.JMenu();
        participantes = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(Texto);

        jMenu1.setText("Arquivo");

        jMenuItem1.setText("Salvar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Importar");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu7.setText("Editar");

        jCheckBoxMenuItem1.setText("Negrito");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setText("Itálico");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setText("Alinhar Texto");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu7);

        sobre.setText("Sobre");

        participantes.setText("Participantes");
        participantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participantesActionPerformed(evt);
            }
        });
        sobre.add(participantes);

        jMenuBar1.add(sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        salvarTextoEmArquivo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void participantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participantesActionPerformed
        Tela2 telaparticipantes = new Tela2();
        telaparticipantes.setVisible(true);
    }//GEN-LAST:event_participantesActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
    // Verifique se o texto está selecionado
    if (Texto.getSelectionStart() != Texto.getSelectionEnd()) {
        // Obtenha o StyledDocument
        StyledDocument doc = (StyledDocument) Texto.getDocument();
        
        // Se o checkbox estiver marcado, aplique o negrito
        if (jCheckBoxMenuItem1.isSelected()) {
            // Defina o estilo de negrito para o texto selecionado
            SimpleAttributeSet bold = new SimpleAttributeSet();
            StyleConstants.setBold(bold, true);
            doc.setCharacterAttributes(Texto.getSelectionStart(), Texto.getSelectionEnd() - Texto.getSelectionStart(), bold, false);
        } else {
            // Se o checkbox não estiver marcado, remova o negrito
            SimpleAttributeSet plain = new SimpleAttributeSet();
            StyleConstants.setBold(plain, false);
            doc.setCharacterAttributes(Texto.getSelectionStart(), Texto.getSelectionEnd() - Texto.getSelectionStart(), plain, false);
        }
    }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
    Font currentFont = Texto.getFont();
    int fontSize = currentFont.getSize(); 

    // Verifique o estado da caixa de seleção para itálico
    if (jCheckBoxMenuItem2.isSelected()) {
        // Se estiver marcada, aplique itálico
        if (jCheckBoxMenuItem1.isSelected()) {
            // Se também estiver em negrito, aplique ambos (negrito e itálico)
            Texto.setFont(new Font("Sans Serif", Font.BOLD | Font.ITALIC, fontSize));
        } else {
            // Se não estiver em negrito, apenas aplique itálico
            Texto.setFont(new Font("Sans Serif", Font.ITALIC, fontSize));
        }
    } else {
        // Se não estiver marcada, remova o itálico
        if (jCheckBoxMenuItem1.isSelected()) {
            // Se ainda estiver em negrito, apenas mantenha o negrito
            Texto.setFont(new Font("Sans Serif", Font.BOLD, fontSize));
        } else {
            // Se não estiver em negrito, defina a fonte normal
            Texto.setFont(new Font("Sans Serif", Font.PLAIN, fontSize));
        }
    }
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void salvarTextoEmArquivo() {
    // Supondo que "Texto" seja um JTextPane
    String texto = Texto.getText(); // Obtém o texto do JTextPane

    // Caminho do arquivo onde o texto será salvo
    File arquivo = new File("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\testetextos\\texto.txt"); // Altere para o caminho desejado

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
        // Escreve o conteúdo no arquivo
        writer.write(texto);

        // Exibe uma mensagem de sucesso
        System.out.println("Texto salvo com sucesso!");
    } catch (IOException e) {
        // Se ocorrer algum erro durante a escrita do arquivo
        e.printStackTrace();
    }
}
    
    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
    // Verifique se o componente de texto é um JTextPane ou similar
    if (Texto instanceof JTextPane) {
        JTextPane textPane = (JTextPane) Texto;  // Supondo que 'Texto' seja um JTextPane
        StyledDocument doc = textPane.getStyledDocument();  // Obtenha o StyledDocument

        SimpleAttributeSet attributes = new SimpleAttributeSet();

        // Se o checkbox estiver marcado, alinha ao centro
        if (jCheckBoxMenuItem3.isSelected()) {
            StyleConstants.setAlignment(attributes, StyleConstants.ALIGN_CENTER);
        } else {
            // Se o checkbox não estiver marcado, reseta o alinhamento (deixa o padrão)
            StyleConstants.setAlignment(attributes, StyleConstants.ALIGN_LEFT);  // Ou outro alinhamento padrão
        }

        // Aplica o alinhamento de parágrafo no documento
        doc.setParagraphAttributes(textPane.getCaretPosition(), 0, attributes, false);
    }
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Texto;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem participantes;
    private javax.swing.JMenu sobre;
    // End of variables declaration//GEN-END:variables
}
