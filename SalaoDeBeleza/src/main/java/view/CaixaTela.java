package view;

import controller.CaixaController;
import dao.CaixaDAO;
import dao.Conexao;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Caixa;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class CaixaTela extends javax.swing.JInternalFrame {

    private final CaixaController controller;
    
    public CaixaTela() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        controller = new CaixaController();
        carregarTabelaCaixa();

    }

    public void carregarTabelaCaixa() {

        DefaultTableModel modelo = (DefaultTableModel) jTableCaixa.getModel();
        modelo.setNumRows(0);

        CaixaDAO dao = new CaixaDAO();

        try {

            for (Caixa c : dao.listarCaixa()) {

                modelo.addRow(new Object[]{
                    c.getIdpc(),
                    c.getClientepc(),
                    c.getDatapc(),
                    c.getPrecopc(),});

            }

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Error ao carregar tabela" + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCaixa = new javax.swing.JTable();
        jButtonResul = new javax.swing.JButton();
        jButtonResul1 = new javax.swing.JButton();
        jButtonResul2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Caixa");

        jTableCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Data", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCaixa.setSelectionBackground(new java.awt.Color(153, 102, 255));
        jScrollPane1.setViewportView(jTableCaixa);
        if (jTableCaixa.getColumnModel().getColumnCount() > 0) {
            jTableCaixa.getColumnModel().getColumn(0).setResizable(false);
            jTableCaixa.getColumnModel().getColumn(1).setResizable(false);
            jTableCaixa.getColumnModel().getColumn(2).setResizable(false);
            jTableCaixa.getColumnModel().getColumn(3).setResizable(false);
        }

        jButtonResul.setBackground(new java.awt.Color(153, 102, 255));
        jButtonResul.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResul.setText("Resultado");
        jButtonResul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResulActionPerformed(evt);
            }
        });

        jButtonResul1.setBackground(new java.awt.Color(153, 102, 255));
        jButtonResul1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResul1.setText("E-mail");
        jButtonResul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResul1ActionPerformed(evt);
            }
        });

        jButtonResul2.setBackground(new java.awt.Color(153, 102, 255));
        jButtonResul2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonResul2.setText("Apagar");
        jButtonResul2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResul2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonResul1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonResul)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonResul2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonResul)
                    .addComponent(jButtonResul1)
                    .addComponent(jButtonResul2))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonResulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResulActionPerformed
        ResulCaixaTela dialog = null;
        try {
            dialog = new ResulCaixaTela(new javax.swing.JFrame(), true);
        } catch (SQLException ex) {
            Logger.getLogger(ResulCaixaTela.class.getName()).log(Level.SEVERE, null, ex);
        }

//       dialog.setLocationRelativeTo(null);
        dialog.setLocation(660, 340);
        dialog.setVisible(true);


    }//GEN-LAST:event_jButtonResulActionPerformed

    private void jButtonResul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResul1ActionPerformed
        try {
            enviarEmail();
        } catch (SQLException ex) {
            Logger.getLogger(CaixaTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonResul1ActionPerformed

    private void jButtonResul2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResul2ActionPerformed
        Object id = jTableCaixa.getValueAt(jTableCaixa.getSelectedRow(), 0);

        try {
            controller.deletarCaixa(id);
            
            carregarTabelaCaixa();

        } catch (Exception ex) {
            Logger.getLogger(CadastroClienteTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonResul2ActionPerformed

    public void totalpreco() throws SQLException {
        double soma = 0;

        Connection conexao = Conexao.getConnection();
        Statement stmt = conexao.createStatement();
        // Consulta para obter a soma da variável do banco de dados (substitua o nome da tabela e da coluna conforme sua estrutura)

        String query = "SELECT sum(preço) AS soma FROM caixa";

        ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {
            soma = rs.getDouble("soma");

        }
    }

    public void contador() throws SQLException {

        int contador = 0;
        Connection conexao = Conexao.getConnection();
        Statement stmt = conexao.createStatement();
        // Consulta para obter a soma da variável do banco de dados (substitua o nome da tabela e da coluna conforme sua estrutura)

        String query2 = "SELECT count(idcaixa) AS contador FROM caixa";

        ResultSet rs2 = stmt.executeQuery(query2);

        if (rs2.next()) {

            contador = rs2.getInt(contador);
        }
    }

    public void enviarEmail() throws SQLException {

        int contador = 0;
        double soma = 0;
        Connection conexao = Conexao.getConnection();
        Statement stmt = conexao.createStatement();
        // Consulta para obter a soma da variável do banco de dados (substitua o nome da tabela e da coluna conforme sua estrutura)

        String query2 = "SELECT count(idcaixa) as contador, sum(preço) as soma FROM caixa";

        ResultSet rs2 = stmt.executeQuery(query2);

        if (rs2.next()) {

            contador = rs2.getInt("contador");
            soma = rs2.getDouble("soma");

            String meuEmail = "denisecabeleireirajanga@gmail.com";
            String minhaSenha = "erjecmpvgkwdeybw";

            SimpleEmail email = new SimpleEmail();

            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
            email.setSSLOnConnect(true);

            try {
                email.setFrom(meuEmail);
                email.setSubject("Denise Cabeleireira - Caixa");
                email.setMsg("O valor total arrecadado de todos os agendamentos concluidos é: R$" + soma
                        + ". Tendo assim, " + contador + " agendamentos no total contabilizados com sucesso!");

                email.addTo("denisecabeleireirajanga@gmail.com");
                email.send();
                rs2.close();
                stmt.close();
                conexao.close();
                try {
                    JOptionPane.showMessageDialog(null, "E-mail enviado com sucesso!");

                } catch (Exception e) {
                }

            } catch (EmailException e) {
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonResul;
    private javax.swing.JButton jButtonResul1;
    private javax.swing.JButton jButtonResul2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCaixa;
    // End of variables declaration//GEN-END:variables
}
