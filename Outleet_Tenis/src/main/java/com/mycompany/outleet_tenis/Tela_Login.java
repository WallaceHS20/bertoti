/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.outleet_tenis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Honorato
 */
public class Tela_Login extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    public Tela_Login() {
        usuario = new ArrayList();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BTNACESSO = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        campo_usu = new java.awt.TextField();
        campo_senha = new javax.swing.JPasswordField();
        BTNCADASTRAR = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BEM VINDO AO OUTLEET");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        BTNACESSO.setBackground(new java.awt.Color(0, 153, 0));
        BTNACESSO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNACESSO.setForeground(new java.awt.Color(255, 255, 255));
        BTNACESSO.setText("ACESSAR");
        BTNACESSO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNACESSOActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("USUARIO");

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("SENHA");

        campo_usu.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        campo_senha.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        BTNCADASTRAR.setBackground(new java.awt.Color(0, 0, 153));
        BTNCADASTRAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNCADASTRAR.setForeground(new java.awt.Color(255, 255, 255));
        BTNCADASTRAR.setText("CADASTRAR");
        BTNCADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCADASTRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(BTNACESSO, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTNCADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campo_usu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campo_senha, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_usu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNACESSO, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNACESSOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNACESSOActionPerformed
        // TODO add your handling code here:
        
        //DIFERENCIADOR PARA VALIDAÇÃO DE LOGIN
        boolean encontrado = true;
        
        //VALIDAÇÃO DE CAMPOS
        if(campo_usu.getText().equals("") || campo_senha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Alerta de campo vazio !", "Outleet Informa !", JOptionPane.ERROR_MESSAGE);
        }else{
        
        // LISTA PARA ARMAZENAMENTO DE DADOS    
        List<String> login = new ArrayList();
        String usuario = campo_usu.getText() + ";" + campo_senha.getText();
        
        //LEITURA DO ARQUIVO USUARIO
         File arquivoCSV = new File("C:\\Users\\Honorato\\Desktop\\faculdade\\Bertoti---Engenharia-de-Software\\Outleet_Tenis\\src\\main\\java\\com\\mycompany\\outleet_tenis\\usuario.csv");
        
        try{                     
            //variavel para receber as linhas por linhas 
            String linhasDoArquivo = new String();           
            Scanner leitor = new Scanner(arquivoCSV);
            
            //Correr todas as linhas do arquivo
            while (leitor.hasNext()){
                
                linhasDoArquivo = leitor.nextLine();
                login.add(linhasDoArquivo);
            }
            
            for(String s: login ){
                
                if (usuario.equals(s)){
                    encontrado = true;
                    
                }else{
                    encontrado = false;
                }
            }
            
            if (encontrado == true){
                // USUARIO ENCONTRADO
                JOptionPane.showMessageDialog(null, "Bem Vindo !", "Outleet Informa !", JOptionPane.INFORMATION_MESSAGE);
                    new Tela_Principal().setVisible(true);
                    this.dispose();
                    
            }else{
                //USUARIO NÃO ENCONTRADO
                System.out.println(encontrado);
                JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos !", "Outleet Informa !", JOptionPane.ERROR_MESSAGE);
            }
            
                            //USUARIO NÃO ENCONTRADO

        }catch(FileNotFoundException e){  
            JOptionPane.showMessageDialog(null, "ERRO !", "Outleet Informa !", JOptionPane.ERROR_MESSAGE);
        }
        }       
    }//GEN-LAST:event_BTNACESSOActionPerformed

    private void BTNCADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCADASTRARActionPerformed
        // TODO add your handling code here:
        
        //VALIDAÇÃO DE CAMPOS
        if(campo_usu.getText().equals("") || campo_senha.getText().equals("")){
             
            JOptionPane.showMessageDialog(null, "Alerta de campo vazio !", "Outleet Informa !", JOptionPane.ERROR_MESSAGE);
        
        }else{
        
        //valor para validar cadastro
        boolean validado = true;
        
        List<String> login = new ArrayList();
        String usuario = campo_usu.getText() + ";" + campo_senha.getText();
        
         File arquivoCSV = new File("C:\\Users\\Honorato\\Desktop\\faculdade\\Bertoti---Engenharia-de-Software\\Outleet_Tenis\\src\\main\\java\\com\\mycompany\\outleet_tenis\\usuario.csv");
        
        try{          
            
            
            //variavel para receber as linhas por linhas 
            String linhasDoArquivo = new String();           
            Scanner leitor = new Scanner(arquivoCSV);
            
            //Correr todas as linhas do arquivo
            while (leitor.hasNext()){
                
                linhasDoArquivo = leitor.nextLine();
                login.add(linhasDoArquivo);
            }
                  
            for(String s : login ){
                //VERIFICA SE O USUARIO JÁ EXISTE
                
                if (usuario.equals(s)){
                    JOptionPane.showMessageDialog(null, "USUARIO EXISTENTE !", "Outleet Informa !", JOptionPane.ERROR_MESSAGE);
                    validado = false;
                }
            }
            
            if (validado == true){
                
                //usuario é incrementado na lista
                login.add(usuario);
                PrintWriter pw = new PrintWriter(new File("C:\\Users\\Honorato\\Desktop\\faculdade\\Bertoti---Engenharia-de-Software\\Outleet_Tenis\\src\\main\\java\\com\\mycompany\\outleet_tenis\\usuario.csv"));
                
                StringBuilder sb=new StringBuilder();
                
                for (String lin : login){
                    sb.append(lin);
                    sb.append("\r\n");
            }
                
                //execução para escrever o arquivo
                 pw.write(sb.toString());
                 pw.close(); 
                 JOptionPane.showMessageDialog(null, "Usuario Cadastrado !", "Outleet Informa !", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }catch(FileNotFoundException e){  
            JOptionPane.showMessageDialog(null, "ERRO !", "Outleet Informa !", JOptionPane.ERROR_MESSAGE);
        }
        }

        
    }//GEN-LAST:event_BTNCADASTRARActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login().setVisible(true);
            }
        });
    }
    
    private ArrayList<Usuario> usuario;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNACESSO;
    private javax.swing.JButton BTNCADASTRAR;
    private javax.swing.JPasswordField campo_senha;
    private java.awt.TextField campo_usu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
