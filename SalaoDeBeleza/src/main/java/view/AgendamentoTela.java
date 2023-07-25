
package view;

import controller.AgendamentoController;
import dao.AgendamentoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;

public class AgendamentoTela extends javax.swing.JInternalFrame {

    private final AgendamentoController controller;

    public AgendamentoTela() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        controller = new AgendamentoController();
        carregarTabelaA();
    }

    public void carregarTabelaA() {

        DefaultTableModel modelo = (DefaultTableModel) jTableAgendamento.getModel();
        modelo.setNumRows(0);

        AgendamentoDAO dao = new AgendamentoDAO();

        try {

            for (Agendamento c : dao.listarAgendamento()) {

                modelo.addRow(new Object[]{
                    c.getId(),
                    c.getCliente(),
                    c.getServico(),
                    c.getPreco(),
                    c.getData(),
                    c.getHorario(),});

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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAgendamento = new javax.swing.JTable();
        BotaoApagar = new javax.swing.JButton();
        BotaoAgendar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BotaoAlterar = new javax.swing.JButton();
        jTextFieldIdA = new javax.swing.JTextField();
        BotaoLimpar = new javax.swing.JButton();
        CampoClienteA = new javax.swing.JFormattedTextField();
        CampoServicoA = new javax.swing.JFormattedTextField();
        CampoPrecoA = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        CampoDataA = new javax.swing.JFormattedTextField();
        CampoHorarioA = new javax.swing.JFormattedTextField();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(51, 51, 255));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Cliente:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Horário:");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 255));
        jLabel5.setText("Serviço:");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 102, 255));
        jLabel6.setText("Preço:");

        jTableAgendamento.setBackground(new java.awt.Color(204, 204, 204));
        jTableAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Serviço", "Preço", "Data", "Horário"
            }
        ));
        jTableAgendamento.setGridColor(new java.awt.Color(153, 102, 255));
        jTableAgendamento.setSelectionBackground(new java.awt.Color(153, 102, 255));
        jTableAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAgendamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAgendamento);

        BotaoApagar.setBackground(new java.awt.Color(153, 102, 255));
        BotaoApagar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoApagar.setText("Apagar");
        BotaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoApagarActionPerformed(evt);
            }
        });

        BotaoAgendar.setBackground(new java.awt.Color(153, 102, 255));
        BotaoAgendar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAgendar.setText("Agendar");
        BotaoAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAgendarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 102, 255));
        jLabel7.setText("Agendamento");

        BotaoAlterar.setBackground(new java.awt.Color(153, 102, 255));
        BotaoAlterar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAlterar.setText("Alterar");
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        jTextFieldIdA.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldIdA.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldIdA.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextFieldIdA.setEnabled(false);
        jTextFieldIdA.setSelectionColor(new java.awt.Color(255, 255, 255));

        BotaoLimpar.setBackground(new java.awt.Color(153, 102, 255));
        BotaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        CampoClienteA.setBackground(new java.awt.Color(204, 204, 204));

        CampoServicoA.setEditable(false);
        CampoServicoA.setBackground(new java.awt.Color(204, 204, 204));

        CampoPrecoA.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("Data:");

        CampoDataA.setBackground(new java.awt.Color(204, 204, 204));
        try {
            CampoDataA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        CampoHorarioA.setBackground(new java.awt.Color(204, 204, 204));
        try {
            CampoHorarioA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(198, 198, 198))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BotaoAgendar, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CampoServicoA, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(CampoClienteA))
                                    .addComponent(CampoPrecoA, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(CampoHorarioA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addComponent(CampoDataA, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jTextFieldIdA, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldIdA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(CampoClienteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CampoServicoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(CampoPrecoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CampoDataA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoHorarioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(BotaoAgendar)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLimpar)
                    .addComponent(BotaoAlterar)
                    .addComponent(BotaoApagar))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoApagarActionPerformed

        Object id = jTableAgendamento.getValueAt(jTableAgendamento.getSelectedRow(), 0);

        try {
            controller.apagar(id);
            carregarTabelaA();

        } catch (Exception ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BotaoApagarActionPerformed

    private void BotaoAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAgendarActionPerformed

        String cliente = CampoClienteA.getText();

        String servico = CampoServicoA.getText();
        Double preco = Double.parseDouble(CampoPrecoA.getText());
        String data = CampoDataA.getText();
        String horario = CampoHorarioA.getText();

        try {
            controller.agendar(cliente, servico, preco, data, horario);
            LimparCampos();
            carregarTabelaA();

        } catch (Exception ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BotaoAgendarActionPerformed

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed

        Object id = jTableAgendamento.getValueAt(jTableAgendamento.getSelectedRow(), 0);
        String cliente = CampoClienteA.getText();
        String servico = CampoServicoA.getText();
        Double preco = Double.parseDouble(CampoPrecoA.getText());
        String data = CampoDataA.getText();
        String horario = CampoHorarioA.getText();

        try {
            controller.alterar(id, cliente, servico, preco, data, horario);
            LimparCampos();
            carregarTabelaA();

        } catch (Exception ex) {
            Logger.getLogger(AgendamentoTela.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BotaoAlterarActionPerformed

    private void jTableAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAgendamentoMouseClicked
        CarregarCampos();


    }//GEN-LAST:event_jTableAgendamentoMouseClicked

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed


    }//GEN-LAST:event_BotaoLimparActionPerformed

    public void CarregarCampos() {

        int setar = jTableAgendamento.getSelectedRow();

        CampoClienteA.setText(jTableAgendamento.getValueAt(setar, 1).toString());
        CampoServicoA.setText(jTableAgendamento.getValueAt(setar, 2).toString());
        CampoPrecoA.setText(jTableAgendamento.getValueAt(setar, 3).toString());
        CampoDataA.setText(jTableAgendamento.getValueAt(setar, 4).toString());
        CampoHorarioA.setText(jTableAgendamento.getValueAt(setar, 5).toString());
    }

    public void LimparCampos() {
        CampoClienteA.setText("");
        CampoServicoA.setText("");
        CampoPrecoA.setText("");
        CampoDataA.setText("");
        CampoHorarioA.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAgendar;
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoApagar;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JFormattedTextField CampoClienteA;
    private javax.swing.JFormattedTextField CampoDataA;
    private javax.swing.JFormattedTextField CampoHorarioA;
    private javax.swing.JFormattedTextField CampoPrecoA;
    private javax.swing.JFormattedTextField CampoServicoA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableAgendamento;
    private javax.swing.JTextField jTextFieldIdA;
    // End of variables declaration//GEN-END:variables
}
