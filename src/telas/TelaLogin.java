package telas;
//Guardar na memória a conexão com o banco de Dados
import java.sql.Connection;
//Guardar na memória e executar comando SQL (INSERT, SELECT, UPDATE..)
import java.sql.PreparedStatement;
//Tratar problemas causados pela informação incorreta de dados do BD (nome do BD, senha, porta, usuário, nome da tabela)
import java.sql.SQLException;
//Informar o caminho do BD, nome do BD, usuário e senha
import java.sql.DriverManager;
//Guardar o que retorna do BD em uma consulta (SELECT)
import java.sql.ResultSet;
//Exibir caixas de diálogo (mensagens)
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jblSenha = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        lblNaoCdastro = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso ao Sistema");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Source Code Pro", 1, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario:");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(190, 100, 80, 20);

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(270, 100, 260, 22);

        jblSenha.setFont(new java.awt.Font("Source Code Pro", 1, 16)); // NOI18N
        jblSenha.setForeground(new java.awt.Color(255, 255, 255));
        jblSenha.setText("Senha:");
        getContentPane().add(jblSenha);
        jblSenha.setBounds(190, 170, 80, 20);

        pswSenha.setBackground(new java.awt.Color(255, 255, 255));
        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(pswSenha);
        pswSenha.setBounds(270, 170, 260, 22);

        btnEntrar.setBackground(new java.awt.Color(51, 102, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(270, 230, 80, 20);

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(102, 255, 255));
        btnCadastrar.setText("Cadastre-se");
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(470, 290, 100, 20);

        lblNaoCdastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNaoCdastro.setForeground(new java.awt.Color(255, 255, 255));
        lblNaoCdastro.setText("Não esta cadastrado?....");
        getContentPane().add(lblNaoCdastro);
        lblNaoCdastro.setBounds(290, 290, 170, 20);

        lblFundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\anderson.peruci\\Desktop\\imagenpadaria\\padaria.png")); // NOI18N
        lblFundo.setFocusable(false);
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, -4, 720, 450);

        setSize(new java.awt.Dimension(726, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        try {
            Connection conexao;
            PreparedStatement st;
            ResultSet resultado;
            //conexao com o banco de dados
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancopadaria", "root", "Familia1");
            //busca de dados no banco
            st = conexao.prepareStatement("SELECT * FROM usuario WHERE usuario=? AND senha=?");
            st.setString(1, txtUsuario.getText());
            st.setString(2, pswSenha.getText());
            resultado = st.executeQuery();//Executa o SELECT a cima;
            if (resultado.next()){// verifica se ele encontrou o usuario
                TelaMenu tela;
                tela = new TelaMenu(resultado.getString("usuario"),resultado.getString("cargo"));
                tela.setVisible(true);
                
            }else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha esta incorreto!");
                txtUsuario.requestFocus();
            }
                
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(btnEntrar, "Você não tem o driver na biblioteca");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(btnEntrar, "Algum parâmetro do BD está incorreto - ERR: " + ex);
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        TelaCadastroUsuario t;
        t = new TelaCadastroUsuario();
        t.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            pswSenha.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed
         if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnEntrar.doClick(); 
        }
    }//GEN-LAST:event_pswSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jblSenha;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblNaoCdastro;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
