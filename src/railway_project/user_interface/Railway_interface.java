package railway_project.user_interface;

import railway_project.Initializer;
import railway_project.City;
import railway_project.Operations;
import railway_project.Person;
import railway_project.Train;

/**
 *
 * @author gabos
 */
public class Railway_interface extends javax.swing.JFrame {
    private Train berlinTrains;
    Initializer initApp = new Initializer();
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
        Hide_trains();
        Set_trains_locations();
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
    
    public void Set_trains_locations(){
//        initApp.create_cities();
//        berlinTrains = initApp.create_trains();
//        if(berlinTrains != null){
        lblTrain.setLocation(berlinCoordinatesX, berlinCoordinatesY);
        lblTrain1.setLocation(berlinCoordinatesX+60, berlinCoordinatesY);
        lblTrain2.setLocation(hamburgoCoordinatesX, hamburgoCoordinatesY);
        lblTrain3.setLocation(hamburgoCoordinatesX+60, hamburgoCoordinatesY);
        lblTrain4.setLocation(frankfurtCoordinatesX, frankfurtCoordinatesY);
        lblTrain5.setLocation(frankfurtCoordinatesX+60, frankfurtCoordinatesY);
        lblTrain6.setLocation(munichCoordinatesX, munichCoordinatesY);
        lblTrain7.setLocation(munichCoordinatesX+60, munichCoordinatesY);
        lblTrain8.setLocation(leipzigCoordinatesX, leipzigCoordinatesY);
        lblTrain9.setLocation(leipzigCoordinatesX+60, leipzigCoordinatesY);
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        lblmap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        lblTrain1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 790, -1, -1));

        lblTrain2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        lblTrain3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, -1, -1));

        lblTrain4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, -1, -1));

        lblTrain5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, -1));

        lblTrain6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, -1));

        lblTrain7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        lblTrain8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        lblTrain9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/train_resized_resized.png"))); // NOI18N
        getContentPane().add(lblTrain9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 790, -1, -1));

        initialize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/icons8-circled-play-96.png"))); // NOI18N
        initialize.setContentAreaFilled(false);
        initialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializeActionPerformed(evt);
            }
        });
        getContentPane().add(initialize, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 870, 90, 90));

        lblmap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/railway_project/interface_media/mapa.png"))); // NOI18N
        getContentPane().add(lblmap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializeActionPerformed
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
    private javax.swing.JButton initialize;
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
