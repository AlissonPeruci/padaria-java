/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anderson.peruci
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaCadastroUsuario() {
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

        txtCadUsuario4 = new javax.swing.JTextField();
        lblCadUsuario = new javax.swing.JLabel();
        txtCadTelefone = new javax.swing.JTextField();
        txtCadSenha = new javax.swing.JTextField();
        lblCadSenha = new javax.swing.JLabel();
        lblCadCargo = new javax.swing.JLabel();
        bntCadastrar = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();
        lblCadRptSenha = new javax.swing.JLabel();
        txtCadRptSenha = new javax.swing.JTextField();
        lblCadTelefone = new javax.swing.JLabel();
        lblCadEmail = new javax.swing.JLabel();
        lblCadCpf = new javax.swing.JLabel();
        txtCadUsuario = new javax.swing.JTextField();
        txtCadEmail = new javax.swing.JTextField();
        txtCadCpf = new javax.swing.JTextField();
        lblCadFundo = new javax.swing.JLabel();

        txtCadUsuario4.setBackground(new java.awt.Color(255, 255, 255));
        txtCadUsuario4.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N

        setTitle("Cadastro do Úsuario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        getContentPane().setLayout(null);

        lblCadUsuario.setBackground(new java.awt.Color(153, 153, 153));
        lblCadUsuario.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        lblCadUsuario.setForeground(new java.awt.Color(51, 0, 51));
        lblCadUsuario.setText("Usuario:");
        getContentPane().add(lblCadUsuario);
        lblCadUsuario.setBounds(240, 60, 150, 30);

        txtCadTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtCadTelefone.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        txtCadTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtCadTelefone);
        txtCadTelefone.setBounds(390, 360, 210, 30);

        txtCadSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtCadSenha.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        getContentPane().add(txtCadSenha);
        txtCadSenha.setBounds(390, 110, 210, 30);

        lblCadSenha.setBackground(new java.awt.Color(204, 204, 255));
        lblCadSenha.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        lblCadSenha.setForeground(new java.awt.Color(51, 0, 51));
        lblCadSenha.setText("Senha:");
        getContentPane().add(lblCadSenha);
        lblCadSenha.setBounds(240, 110, 150, 30);

        lblCadCargo.setBackground(new java.awt.Color(204, 204, 255));
        lblCadCargo.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        lblCadCargo.setForeground(new java.awt.Color(51, 0, 51));
        lblCadCargo.setText("Cargo:");
        getContentPane().add(lblCadCargo);
        lblCadCargo.setBounds(240, 210, 150, 30);

        bntCadastrar.setBackground(new java.awt.Color(204, 204, 255));
        bntCadastrar.setFont(new java.awt.Font("Source Code Pro", 1, 16)); // NOI18N
        bntCadastrar.setForeground(new java.awt.Color(51, 51, 255));
        bntCadastrar.setText("Cadastrar");
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(bntCadastrar);
        bntCadastrar.setBounds(390, 410, 210, 30);

        cmbCargo.setBackground(new java.awt.Color(255, 255, 255));
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Caixa", "Balconista" }));
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(390, 210, 210, 30);

        lblCadRptSenha.setBackground(new java.awt.Color(204, 204, 255));
        lblCadRptSenha.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        lblCadRptSenha.setForeground(new java.awt.Color(51, 0, 51));
        lblCadRptSenha.setText("Repita a Senha:");
        getContentPane().add(lblCadRptSenha);
        lblCadRptSenha.setBounds(240, 160, 150, 30);

        txtCadRptSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtCadRptSenha.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        txtCadRptSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadRptSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCadRptSenha);
        txtCadRptSenha.setBounds(390, 160, 210, 30);

        lblCadTelefone.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        lblCadTelefone.setForeground(new java.awt.Color(51, 0, 51));
        lblCadTelefone.setText("Telefone:");
        getContentPane().add(lblCadTelefone);
        lblCadTelefone.setBounds(240, 360, 150, 30);

        lblCadEmail.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        lblCadEmail.setForeground(new java.awt.Color(51, 0, 51));
        lblCadEmail.setText("Email:");
        getContentPane().add(lblCadEmail);
        lblCadEmail.setBounds(240, 260, 150, 30);

        lblCadCpf.setFont(new java.awt.Font("Source Code Pro", 1, 20)); // NOI18N
        lblCadCpf.setForeground(new java.awt.Color(51, 0, 51));
        lblCadCpf.setText("CPF:");
        getContentPane().add(lblCadCpf);
        lblCadCpf.setBounds(240, 310, 150, 30);

        txtCadUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtCadUsuario.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        txtCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtCadUsuario);
        txtCadUsuario.setBounds(390, 60, 210, 30);

        txtCadEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtCadEmail.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        getContentPane().add(txtCadEmail);
        txtCadEmail.setBounds(390, 260, 210, 30);

        txtCadCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCadCpf.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        txtCadCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtCadCpf);
        txtCadCpf.setBounds(390, 310, 210, 30);

        lblCadFundo.setBackground(new java.awt.Color(0, 153, 153));
        lblCadFundo.setForeground(new java.awt.Color(0, 0, 0));
        lblCadFundo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCadFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\anderson.peruci\\Desktop\\imagenpadaria\\imagen.png")); // NOI18N
        lblCadFundo.setAutoscrolls(true);
        lblCadFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(lblCadFundo);
        lblCadFundo.setBounds(0, 0, 880, 530);

        setSize(new java.awt.Dimension(901, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        try {
            Connection conexao;
            PreparedStatement st;
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "Familia1");
            if (txtCadSenha.getText().equals(txtCadRptSenha.getText())) {
                st = conexao.prepareStatement("INSERT INTO usuario VALUES(?, ?, ?, ?, ?, ?)");
                st.setString(1, txtCadUsuario.getText());
                st.setString(2, txtCadSenha.getText());
                st.setString(3, cmbCargo.getSelectedItem().toString());
                st.setString(4, txtCadEmail.getText());
                st.setString(5, txtCadCpf.getText());
                st.setString(6, txtCadTelefone.getText());
                st.executeUpdate();//executa o Insert acima
                JOptionPane.showMessageDialog(bntCadastrar, "o cadastro foi efetuado com sucesso");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "AS senha nao coecidem!");
                txtCadSenha.requestFocus();
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(bntCadastrar, "Você não tem o drive instalado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(bntCadastrar, "Algun parametro do banco de dados esta incorreto");
        }

    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void txtCadRptSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadRptSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadRptSenhaActionPerformed

    private void txtCadTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadTelefoneActionPerformed

    private void txtCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadUsuarioActionPerformed

    private void txtCadCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadCpfActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel lblCadCargo;
    private javax.swing.JLabel lblCadCpf;
    private javax.swing.JLabel lblCadEmail;
    private javax.swing.JLabel lblCadFundo;
    private javax.swing.JLabel lblCadRptSenha;
    private javax.swing.JLabel lblCadSenha;
    private javax.swing.JLabel lblCadTelefone;
    private javax.swing.JLabel lblCadUsuario;
    private javax.swing.JTextField txtCadCpf;
    private javax.swing.JTextField txtCadEmail;
    private javax.swing.JTextField txtCadRptSenha;
    private javax.swing.JTextField txtCadSenha;
    private javax.swing.JTextField txtCadTelefone;
    private javax.swing.JTextField txtCadUsuario;
    private javax.swing.JTextField txtCadUsuario4;
    // End of variables declaration//GEN-END:variables
}
