/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;




public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() throws SQLException {
        initComponents();
        obterQntAVariavelBD();
        obterQntCVariavelBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jLabelLogo1 = new javax.swing.JLabel();
        jLabelLogo2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Inicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CadastroCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Caixa = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Agendamento = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDesktopPanel = new javax.swing.JPanel();
        iniciod = new javax.swing.JPanel();
        jLabelLogo3 = new javax.swing.JLabel();
        jLabelLogo4 = new javax.swing.JLabel();
        jLabelLogo5 = new javax.swing.JLabel();
        jLabelLogo6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelLogo7 = new javax.swing.JLabel();
        jLabelLogo8 = new javax.swing.JLabel();
        jLabelLogo9 = new javax.swing.JLabel();
        oi = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelLogo13 = new javax.swing.JLabel();
        jLabelLogo14 = new javax.swing.JLabel();
        jLabelLogo15 = new javax.swing.JLabel();
        inicio2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 102, 255));

        jLabelLogo1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabelLogo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo1.setText("DC");

        jLabelLogo2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelLogo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo2.setText("D E N I S E   C A B E L E I R E I R A");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("________________________________________");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("________________________________________");

        Inicio.setBackground(new java.awt.Color(255, 255, 255));
        Inicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InicioMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 102, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("Inicio");

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CadastroCliente.setBackground(new java.awt.Color(255, 255, 255));
        CadastroCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CadastroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CadastroClienteMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 102, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 255));
        jLabel3.setText("Cadastro Cliente");

        javax.swing.GroupLayout CadastroClienteLayout = new javax.swing.GroupLayout(CadastroCliente);
        CadastroCliente.setLayout(CadastroClienteLayout);
        CadastroClienteLayout.setHorizontalGroup(
            CadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        CadastroClienteLayout.setVerticalGroup(
            CadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Caixa.setBackground(new java.awt.Color(255, 255, 255));
        Caixa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Caixa.setPreferredSize(new java.awt.Dimension(191, 32));
        Caixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CaixaMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(153, 102, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 102, 255));
        jLabel4.setText("Caixa");

        javax.swing.GroupLayout CaixaLayout = new javax.swing.GroupLayout(Caixa);
        Caixa.setLayout(CaixaLayout);
        CaixaLayout.setHorizontalGroup(
            CaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CaixaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(75, 75, 75))
        );
        CaixaLayout.setVerticalGroup(
            CaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Agendamento.setBackground(new java.awt.Color(255, 255, 255));
        Agendamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Agendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgendamentoMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 102, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 255));
        jLabel5.setText("Agendamento");

        javax.swing.GroupLayout AgendamentoLayout = new javax.swing.GroupLayout(Agendamento);
        Agendamento.setLayout(AgendamentoLayout);
        AgendamentoLayout.setHorizontalGroup(
            AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendamentoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        AgendamentoLayout.setVerticalGroup(
            AgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(153, 102, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabelLogo1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabelLogo2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Agendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Caixa, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogo2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(110, 110, 110)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Agendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Caixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        jDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        iniciod.setBackground(new java.awt.Color(255, 255, 255));

        jLabelLogo3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabelLogo3.setForeground(new java.awt.Color(153, 102, 255));
        jLabelLogo3.setText("bem vinda(o),");

        jLabelLogo4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelLogo4.setForeground(new java.awt.Color(153, 102, 255));
        jLabelLogo4.setText("ao gerenciamento");

        jLabelLogo5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelLogo5.setForeground(new java.awt.Color(153, 102, 255));
        jLabelLogo5.setText("do seu salão!");

        jLabelLogo6.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelLogo6.setForeground(new java.awt.Color(153, 102, 255));
        jLabelLogo6.setText("Seja");

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelLogo7.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelLogo7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo7.setText("Quantidade de");

        jLabelLogo8.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLogo8.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo8.setText("Agendamentos");

        jLabelLogo9.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLogo9.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo9.setText("------------------------");

        oi.setBackground(new java.awt.Color(255, 255, 255));
        oi.setFont(oi.getFont().deriveFont(oi.getFont().getStyle() | java.awt.Font.BOLD, 90));
        oi.setForeground(new java.awt.Color(255, 255, 255));
        oi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oi.setText("Q");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLogo7)
                    .addComponent(jLabelLogo8, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(oi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLogo9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelLogo7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabelLogo9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogo8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oi, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelLogo13.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelLogo13.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo13.setText("Quantidade de");

        jLabelLogo14.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLogo14.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo14.setText("Clientes Cadastados");

        jLabelLogo15.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogo15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLogo15.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogo15.setText("------------------------");

        inicio2.setBackground(new java.awt.Color(255, 255, 255));
        inicio2.setFont(inicio2.getFont().deriveFont(inicio2.getFont().getStyle() | java.awt.Font.BOLD, 90));
        inicio2.setForeground(new java.awt.Color(255, 255, 255));
        inicio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio2.setText("Q");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelLogo15, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLogo13))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogo14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicio2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelLogo13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabelLogo15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLogo14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout iniciodLayout = new javax.swing.GroupLayout(iniciod);
        iniciod.setLayout(iniciodLayout);
        iniciodLayout.setHorizontalGroup(
            iniciodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciodLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(iniciodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogo3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogo6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(iniciodLayout.createSequentialGroup()
                        .addGroup(iniciodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogo4)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(iniciodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLogo5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        iniciodLayout.setVerticalGroup(
            iniciodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciodLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(iniciodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciodLayout.createSequentialGroup()
                        .addComponent(jLabelLogo6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLogo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(iniciodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLogo4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLogo5))
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciodLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(iniciod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(iniciod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      LoginView telainicio = new LoginView();
      this.dispose();
      telainicio.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void InicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMousePressed
        
    }//GEN-LAST:event_InicioMousePressed

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        jDesktopPanel.removeAll();
        jDesktopPanel.add(iniciod);
        jDesktopPanel.revalidate();
        jDesktopPanel.repaint();
        try {
            obterQntAVariavelBD();
            obterQntCVariavelBD();
        } catch (SQLException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        

        
        
    }//GEN-LAST:event_InicioMouseClicked

    private void CadastroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CadastroClienteMouseClicked
        CadastroClienteTela cctela = new CadastroClienteTela();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(cctela).setVisible(true);
     
        
    }//GEN-LAST:event_CadastroClienteMouseClicked

    private void AgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgendamentoMouseClicked
        AgendamentoTela agtela = new AgendamentoTela();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(agtela).setVisible(true);
    }//GEN-LAST:event_AgendamentoMouseClicked

    private void CaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaixaMouseClicked
        CaixaTela caixatela = new CaixaTela();
        jDesktopPanel.removeAll();
        jDesktopPanel.add(caixatela).setVisible(true);
        
    }//GEN-LAST:event_CaixaMouseClicked

    
        private void obterQntAVariavelBD() throws SQLException {
        int soma = 0;

        Connection conexao = Conexao.getConnection();
        Statement stmt = conexao.createStatement();
        String again = "select * from agendamento";
        // Consulta para obter a soma da variável do banco de dados (substitua o nome da tabela e da coluna conforme sua estrutura)
        String query = "SELECT count(idagendamento) AS soma FROM agendamento";
        ResultSet rs = stmt.executeQuery(query);
   
        
        if (rs.next()) {
            soma = rs.getInt("soma");
            oi.setText(String.valueOf(soma));
        }
        // Fecha os recursos
        rs.close();
        stmt.close();
        conexao.close();
        
        
    }
  
    private void obterQntCVariavelBD() throws SQLException {
        int quantidade = 0;

        
      
        Connection conexao = Conexao.getConnection();
        Statement stmt = conexao.createStatement();
        
        // Consulta para obter a soma da variável do banco de dados (substitua o nome da tabela e da coluna conforme sua estrutura)
        String query = "SELECT count(idcliente) AS quantidade FROM cliente";
        ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {
            quantidade = rs.getInt("quantidade");
            inicio2.setText(String.valueOf(quantidade));
        }
        // Fecha os recursos
        rs.close();
        stmt.close();
        conexao.close();

    }
   
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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public JPanel getjDesktopPanel() {
        return jDesktopPanel;
    }

    public void setjDesktopPanel(JPanel jDesktopPanel) {
        this.jDesktopPanel = jDesktopPanel;
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agendamento;
    private javax.swing.JPanel CadastroCliente;
    private javax.swing.JPanel Caixa;
    private javax.swing.JPanel Inicio;
    private javax.swing.JLabel inicio2;
    private javax.swing.JPanel iniciod;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jDesktopPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelLogo1;
    private javax.swing.JLabel jLabelLogo13;
    private javax.swing.JLabel jLabelLogo14;
    private javax.swing.JLabel jLabelLogo15;
    private javax.swing.JLabel jLabelLogo2;
    private javax.swing.JLabel jLabelLogo3;
    private javax.swing.JLabel jLabelLogo4;
    private javax.swing.JLabel jLabelLogo5;
    private javax.swing.JLabel jLabelLogo6;
    private javax.swing.JLabel jLabelLogo7;
    private javax.swing.JLabel jLabelLogo8;
    private javax.swing.JLabel jLabelLogo9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel oi;
    // End of variables declaration//GEN-END:variables
}
