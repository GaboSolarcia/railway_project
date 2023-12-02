package railway_project.user_interface;

import railway_project.Initializer;
import railway_project.Logic;

public class Railway_interface extends javax.swing.JFrame {
    Initializer initApp = new Initializer();
    Logic buttonLogic;
    int berlinCoordinatesX = 730;
    int berlinCoordinatesY = 320;
    int munichCoordinatesX = 490;
    int munichCoordinatesY = 790;
    int hamburgoCoordinatesX = 320;
    int hamburgoCoordinatesY = 290;
    int leipzigCoordinatesX = 650;
    int leipzigCoordinatesY = 490;
    int frankfurtCoordinatesX = 230;
    int frankfurtCoordinatesY = 520;
    
    
    public Railway_interface() {
        initComponents();
        setLayout(null);
        buttonLogic = new Logic();
        initApp.create_cities();
        initApp.create_trains();
        Hide_trains();
         
    }
    
    public void Hide_trains(){
        lblTrain.setVisible(false);
        lblTrain1.setVisible(false);
        lblTrain2.setVisible(false);
        lblTrain3.setVisible(false);
        lblTrain4.setVisible(false);
        lblTrain5.setVisible(false);
        lblTrain6.setVisible(false);
        lblTrain7.setVisible(false);
        lblTrain8.setVisible(false);
        lblTrain9.setVisible(false);
    }
    
    public void setTrainsTooltips(){
        lblTrain.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(0).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(0).people_amount
                         + "</html>");
        lblTrain1.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(1).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(1).people_amount
                         + "</html>");
        lblTrain2.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(2).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(2).people_amount
                         + "</html>");
        lblTrain3.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(3).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(3).people_amount
                         + "</html>");
        lblTrain4.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(4).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(4).people_amount
                         + "</html>");
        lblTrain5.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(5).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(5).people_amount
                         + "</html>");
        lblTrain6.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(6).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(6).people_amount
                         + "</html>");
        lblTrain7.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(7).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(7).people_amount
                         + "</html>");
        lblTrain8.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(8).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(8).people_amount
                         + "</html>");
        lblTrain9.setToolTipText("<html>"
                              + "Ciudad destino: " + initApp.getTrain(9).destination
                              +"<br>"
                              + "Cantidad de personas: " + initApp.getTrain(9).people_amount
                         + "</html>");
        lblBerlin.setToolTipText("Personas en espera: "+ initApp.getPeoplePerCity("Berlin"));
        lblFrankfurt.setToolTipText("Personas en espera: "+ initApp.getPeoplePerCity("Frankfurt"));
        lblMunich.setToolTipText("Personas en espera: "+ initApp.getPeoplePerCity("Munich"));
        lblLeipzig.setToolTipText("Personas en espera: "+ initApp.getPeoplePerCity("Leipzig"));
        lblHamburgo.setToolTipText("Personas en espera: "+ initApp.getPeoplePerCity("Hamburgo"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblBerlin = new javax.swing.JLabel();
        lblLeipzig = new javax.swing.JLabel();
        lblFrankfurt = new javax.swing.JLabel();
        lblMunich = new javax.swing.JLabel();
        lblHamburgo = new javax.swing.JLabel();
        lblTrain = new javax.swing.JLabel();
        lblTrain1 = new javax.swing.JLabel();
        lblTrain2 = new javax.swing.JLabel();
        lblTrain3 = new javax.swing.JLabel();
        lblTrain4 = new javax.swing.JLabel();
        lblTrain5 = new javax.swing.JLabel();
        lblTrain6 = new javax.swing.JLabel();
        lblTrain7 = new javax.swing.JLabel();
        lblTrain8 = new javax.swing.JLabel();
        lblTrain9 = new javax.swing.JLabel();
        initialize = new javax.swing.JButton();
        btnMoveTrains = new javax.swing.JButton();
        lblmap = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBerlin.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblBerlin.setForeground(new java.awt.Color(102, 0, 0));
        lblBerlin.setText("Berlin");
        getContentPane().add(lblBerlin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, -1));

        lblLeipzig.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblLeipzig.setForeground(new java.awt.Color(102, 0, 0));
        lblLeipzig.setText("Leipzig");
        getContentPane().add(lblLeipzig, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        lblFrankfurt.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblFrankfurt.setForeground(new java.awt.Color(102, 0, 0));
        lblFrankfurt.setText("Frankfurt");
        getContentPane().add(lblFrankfurt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, -1, -1));

        lblMunich.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblMunich.setForeground(new java.awt.Color(102, 0, 0));
        lblMunich.setText("Munich");
        getContentPane().add(lblMunich, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 750, -1, -1));

        lblHamburgo.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        lblHamburgo.setForeground(new java.awt.Color(102, 0, 0));
        lblHamburgo.setText("Hamburgo");
        getContentPane().add(lblHamburgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        lblTrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        lblTrain1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, -1));

        lblTrain2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, -1, -1));

        lblTrain3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 700, -1, -1));

        lblTrain4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        lblTrain5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        lblTrain5.setToolTipText("");
        getContentPane().add(lblTrain5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        lblTrain6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        lblTrain7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        lblTrain8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 490, -1, -1));

        lblTrain9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, -1, -1));

        initialize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/icons8-circled-play-96.png"))); // NOI18N
        initialize.setContentAreaFilled(false);
        initialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializeActionPerformed(evt);
            }
        });
        getContentPane().add(initialize, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 870, 90, 90));

        btnMoveTrains.setBackground(new java.awt.Color(255, 153, 255));
        btnMoveTrains.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnMoveTrains.setText("Mover");
        btnMoveTrains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveTrainsActionPerformed(evt);
            }
        });
        getContentPane().add(btnMoveTrains, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 870, 100, 90));

        lblmap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/mapa.png"))); // NOI18N
        getContentPane().add(lblmap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializeActionPerformed
        setTrainsTooltips(); 
        lblTrain.setVisible(true);
        lblTrain1.setVisible(true);
        lblTrain2.setVisible(true);
        lblTrain3.setVisible(true);
        lblTrain4.setVisible(true);
        lblTrain5.setVisible(true);
        lblTrain6.setVisible(true);
        lblTrain7.setVisible(true);
        lblTrain8.setVisible(true);
        lblTrain9.setVisible(true);
    }//GEN-LAST:event_initializeActionPerformed

    private void btnMoveTrainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveTrainsActionPerformed
        buttonLogic.switchCity();
    }//GEN-LAST:event_btnMoveTrainsActionPerformed

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
            java.util.logging.Logger.getLogger(Railway_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Railway_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Railway_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Railway_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Railway_interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoveTrains;
    private javax.swing.JButton initialize;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblBerlin;
    private javax.swing.JLabel lblFrankfurt;
    private javax.swing.JLabel lblHamburgo;
    private javax.swing.JLabel lblLeipzig;
    private javax.swing.JLabel lblMunich;
    private javax.swing.JLabel lblTrain;
    private javax.swing.JLabel lblTrain1;
    private javax.swing.JLabel lblTrain2;
    private javax.swing.JLabel lblTrain3;
    private javax.swing.JLabel lblTrain4;
    private javax.swing.JLabel lblTrain5;
    private javax.swing.JLabel lblTrain6;
    private javax.swing.JLabel lblTrain7;
    private javax.swing.JLabel lblTrain8;
    private javax.swing.JLabel lblTrain9;
    private javax.swing.JLabel lblmap;
    // End of variables declaration//GEN-END:variables
}
