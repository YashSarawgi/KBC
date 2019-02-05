
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SRLAB5
 */
public class Production_Page extends javax.swing.JFrame {
Timer t,h,i;
    /**
     * Creates new form Production_Page
     */
    public void cl()
    {
      Login_Page a=new Login_Page();
             a.setVisible(true);
             i.stop();        
             t.stop();
             h.stop();
             this.dispose();
    }
    public Production_Page() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        jLabel17.setVisible(false);
        jLabel18.setVisible(false);
        jLabel19.setVisible(false);
        jLabel20.setVisible(false);
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        jProgressBar1.setVisible(false);
         t=new Timer(100, new ActionListener(){
     @Override
            public void actionPerformed(ActionEvent e)
    {
                crt++;
             switch (crt)
             {
                  case 1:jLabel1.setVisible(true);
                 jLabel1.setFont(new Font("Arial",Font.BOLD,10));break;
                  case 2:jLabel2.setVisible(true);
                   jLabel2.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel1.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 3:jLabel3.setVisible(true);
                   jLabel3.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel2.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 4:jLabel4.setVisible(true);
                   jLabel4.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel3.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 5:jLabel5.setVisible(true);
                   jLabel5.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel4.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 6:jLabel6.setVisible(true);
                   jLabel6.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel5.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 7:jLabel7.setVisible(true);
                   jLabel7.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel6.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 8:jLabel8.setVisible(true);
                   jLabel8.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel7.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 9:jLabel9.setVisible(true);
                   jLabel9.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel8.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 10:jLabel10.setVisible(true);
                   jLabel10.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel9.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 11:jLabel11.setVisible(true);
                   jLabel11.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel10.setFont(new Font("Arial",Font.BOLD,25));break; 
                  case 12:jLabel12.setVisible(true);
                   jLabel12.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel11.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 13:jLabel13.setVisible(true);
                   jLabel13.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel12.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 14:jLabel14.setVisible(true);
                   jLabel14.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel13.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 15:jLabel15.setVisible(true);
                   jLabel15.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel14.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 16:jLabel16.setVisible(true);
                   jLabel16.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel15.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 17:jLabel17.setVisible(true);
                   jLabel17.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel16.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 18:jLabel18.setVisible(true);
                   jLabel18.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel17.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 19:jLabel19.setVisible(true);
                   jLabel19.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel18.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 20:jLabel20.setVisible(true);
                   jLabel20.setFont(new Font("Arial",Font.BOLD,10));
                 jLabel19.setFont(new Font("Arial",Font.BOLD,25));break;
                  case 21:jLabel20.setFont(new Font("Arial",Font.BOLD,25));
                    jLabel23.setVisible(true);
                    jLabel21.setVisible(true);
                    jLabel22.setVisible(true);
                    jProgressBar1.setVisible(true);
                    i=new Timer(400, new ActionListener()
    {
     @Override
            public void actionPerformed(ActionEvent e){
        cr++;
        if(cr%3==0)
        {
         jLabel21.setText("LOADING.");
        }
        else   if(cr%3==1)
        {
         jLabel21.setText("LOADING..");
        }
        else   if(cr%3==2)
        {
         jLabel21.setText("LOADING...");
        }
     }});i.start();
                       
        h=new Timer(100, new ActionListener(){
     @Override
         
     public void actionPerformed(ActionEvent e){
          
         ctr++;
        jProgressBar1.setValue(ctr);
        jLabel22.setText(ctr+"%");
        if(ctr==101)
         {
          cl();     
         }
     }});h.start();
                   break;
                   default: crt=100;break;
             }
    }
     });
        t.start(); 
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Y");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 140, 29, 61);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("A");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 140, 30, 61);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("S");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 140, 28, 61);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("H");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 140, 34, 61);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("R");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 140, 31, 61);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setText("A");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 140, 30, 61);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("J");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 140, 21, 61);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("G");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 140, 33, 61);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("A");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(460, 140, 30, 61);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setText("M");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 140, 39, 61);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setText("E");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(500, 140, 28, 61);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 0));
        jLabel12.setText("S");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(520, 140, 28, 61);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setText("P");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(570, 140, 28, 61);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setText("R");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(590, 140, 31, 61);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 0));
        jLabel15.setText("E");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(610, 140, 28, 61);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 0));
        jLabel16.setText("S");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(630, 140, 28, 61);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 0));
        jLabel17.setText("E");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(650, 140, 28, 61);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 0));
        jLabel18.setText("N");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(670, 140, 33, 61);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 51, 0));
        jLabel19.setText("T");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(690, 140, 29, 61);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 0));
        jLabel20.setText("S");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(710, 140, 28, 61);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jLabel21);
        jLabel21.setBounds(170, 290, 151, 29);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 0));
        getContentPane().add(jLabel22);
        jLabel22.setBounds(660, 290, 86, 26);
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(80, 330, 680, 40);

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/kbc logo - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(90, 270, 50, 50);

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/yash_raj_logo.png"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(140, 100, 120, 140);

        setSize(new java.awt.Dimension(829, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 int crt=0,ctr,cr=0;
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
            java.util.logging.Logger.getLogger(Production_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Production_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Production_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Production_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Production_Page().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
