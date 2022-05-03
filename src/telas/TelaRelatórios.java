/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class TelaRelatórios extends javax.swing.JFrame {
        DefaultTableModel defTable;
        
    public TelaRelatórios() {
        initComponents();
        defTable = (DefaultTableModel) tblProdutos.getModel();
        txtNome.setVisible(false);
        lblNome.setVisible(false);
        txtCategoria.setVisible(false);
        lblCategoria.setVisible(false);
        btnBuscar.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipoRelatorio = new javax.swing.JLabel();
        cmbTipoRelatorio = new javax.swing.JComboBox<>();
        lblCategoria = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();

        setTitle("Relatório");
        getContentPane().setLayout(null);

        lblTipoRelatorio.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        lblTipoRelatorio.setText("Tipos de Relatório");
        getContentPane().add(lblTipoRelatorio);
        lblTipoRelatorio.setBounds(40, 40, 110, 30);

        cmbTipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     ", "Geral", "Por Categoria", "Por Nome" }));
        cmbTipoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoRelatorio);
        cmbTipoRelatorio.setBounds(150, 40, 140, 30);

        lblCategoria.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        lblCategoria.setText("        Categoria");
        getContentPane().add(lblCategoria);
        lblCategoria.setBounds(290, 40, 110, 30);

        lblNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 13)); // NOI18N
        lblNome.setText("Nome do Produto");
        getContentPane().add(lblNome);
        lblNome.setBounds(290, 40, 110, 30);

        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCategoria);
        txtCategoria.setBounds(400, 40, 140, 30);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(550, 40, 120, 30);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Categoria", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tblProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 620, 340);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(400, 40, 140, 30);

        setSize(new java.awt.Dimension(691, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTipoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoRelatorioActionPerformed
        
        String tipoRelatorioPermissoes;
        tipoRelatorioPermissoes = cmbTipoRelatorio.getSelectedItem().toString();
        if (tipoRelatorioPermissoes.equalsIgnoreCase("     ")){
            
            txtNome.setVisible(false);
            lblNome.setVisible(false);
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);
            btnBuscar.setVisible(false);
            defTable.setRowCount(0);
        }else if (tipoRelatorioPermissoes.equalsIgnoreCase("Geral")) {
            txtNome.setVisible(false);
            lblNome.setVisible(false);
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);
            btnBuscar.setVisible(true);
            defTable.setRowCount(0);
        } else if (tipoRelatorioPermissoes.equalsIgnoreCase("Por categoria")){
            txtNome.setVisible(false);
            lblNome.setVisible(false);
            txtCategoria.setVisible(true);
            lblCategoria.setVisible(true);
            btnBuscar.setVisible(true);
            defTable.setRowCount(0);
        } else if (tipoRelatorioPermissoes.equalsIgnoreCase("Por Nome")){
            txtNome.setVisible(true);
            lblNome.setVisible(true);
            txtCategoria.setVisible(false);
            lblCategoria.setVisible(false);
            btnBuscar.setVisible(true);
            defTable.setRowCount(0);
        } 
    }//GEN-LAST:event_cmbTipoRelatorioActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "Familia1");
            String tipoRelatorio;
            tipoRelatorio = cmbTipoRelatorio.getSelectedItem().toString();
            if (tipoRelatorio.equalsIgnoreCase("Geral")) {
                st = conexao.prepareStatement("SELECT * FROM cadastarproduto");
                resultado = st.executeQuery();
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("codigo"), resultado.getString("nome"), resultado.getString("marca"), resultado.getString("preco")};
                    defTable.addRow(linha);
                }
            } else if (tipoRelatorio.equalsIgnoreCase("Por Categoria")) {
                st = conexao.prepareStatement("SELECT * FROM cadastarproduto WHERE marca LIKE ?");
                st.setString(1, "%" + txtCategoria.getText() + "%");
                resultado = st.executeQuery();
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("codigo"), resultado.getString("nome"), resultado.getString("marca"), resultado.getString("preco")};
                    defTable.addRow(linha);
                    txtNome.setText("");
                    txtCategoria.setText("");
                }
            } else if (tipoRelatorio.equalsIgnoreCase("Por nome")) {
                st = conexao.prepareStatement("SELECT * FROM cadastarproduto WHERE nome LIKE ?");
                 st.setString(1, "%" + txtNome.getText() + "%");
                resultado = st.executeQuery();
                defTable.setRowCount(0);
                while (resultado.next()) {
                    Object[] linha = {resultado.getString("codigo"), resultado.getString("nome"), resultado.getString("marca"), resultado.getString("preco")};
                    defTable.addRow(linha);
                    txtNome.setText("");
                    txtCategoria.setText("");
                }
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnBuscar, "Erro" + ex.getMessage() + "\n Entre em contato com o programador");
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(btnBuscar, "Este código de produto ja foi cadastrado");
            } else {
                JOptionPane.showMessageDialog(btnBuscar, "Erro Numero" + ex.getErrorCode() + "Mostre esse numero de erro para o Programdor");
            }

        }
            
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatórios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cmbTipoRelatorio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipoRelatorio;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
