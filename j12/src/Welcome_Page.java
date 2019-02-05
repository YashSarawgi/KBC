
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author srlab5
 */
public class Welcome_Page extends javax.swing.JFrame {
Timer t,h,i;

    /**
     * Creates new form Welcome_Page
     */
    public Welcome_Page() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yashraj", "root", "joker");
    
            Statement stmt2=(Statement) con.createStatement();
            String query2="Select * from users where status=2";
            ResultSet rs=stmt2.executeQuery(query2);
            if(rs.next())
                {
                f=1;
                }
            else
                {
                    f=0;
                }
        }
        catch(Exception p)
        {
            JOptionPane.showMessageDialog(this,p.getMessage());
        }
         jLabel12.setVisible(false);
         jLabel13.setVisible(false);
         jLabel1.setVisible(false);
         jButton1.setVisible(false);
         jButton2.setVisible(false);
         jButton3.setVisible(false);
         jLabel3.setVisible(false);
         jLabel5.setVisible(false);
         jLabel6.setVisible(false);
         jLabel8.setVisible(false);
         jLabel9.setVisible(false);
         jLabel10.setVisible(false);
         jLabel11.setVisible(false);
           if(f==0)
            {
             t=new Timer(410, new ActionListener(){
     @Override
            public void actionPerformed(ActionEvent e){
             ctr++;     
        switch (ctr)
            {
                case 1: jLabel6.setVisible(true);jLabel6.setText("W");
                InputStream music;
          try{
             music=new FileInputStream(new File("src\\audio\\welcomepademusic.wav"));
             AudioStream audios=new AudioStream(music); 
             AudioPlayer.player.start(audios);   
             }
          catch(IOException m){JOptionPane.showMessageDialog(null,m.getMessage());}break;
                case 2: jLabel6.setText("WE");break;
                case 3: jLabel6.setText("WEL");break;
                case 4: jLabel6.setText("WELC");break;
                case 5: jLabel6.setText("WELCO");break;
                case 6: jLabel6.setText("WELCOM");break;
                case 7: jLabel6.setText("WELCOME");break;
                case 8: jLabel6.setText("WELCOME T");break;
                case 9: jLabel6.setText("WELCOME TO");break;
                case 10: jLabel6.setText("WELCOME TO T");break;
                case 11: jLabel6.setText("WELCOME TO TH");break;
                case 12: jLabel6.setText("WELCOME TO THE");break;
                case 13: jLabel6.setText("WELCOME TO THE W");break;
                case 14: jLabel6.setText("WELCOME TO THE WO");break;
                case 15: jLabel6.setText("WELCOME TO THE WOR");break;
                case 16: jLabel6.setText("WELCOME TO THE WORL");break;
                case 17: jLabel6.setText("WELCOME TO THE WORLD");break;
                case 18: jLabel6.setText("WELCOME TO THE WORLD O");break;
                case 19: jLabel6.setText("WELCOME TO THE WORLD OF");break;
                case 20: jLabel6.setText("WELCOME TO THE WORLD OF K");break;
                case 21: jLabel6.setText("WELCOME TO THE WORLD OF K");break;
                case 22: jLabel6.setText("WELCOME TO THE WORLD OF K");break;
                case 23: jLabel6.setText("WELCOME TO THE WORLD OF KB");break;
                case 24: jLabel6.setText("WELCOME TO THE WORLD OF KB");break;
                case 25: jLabel6.setText("WELCOME TO THE WORLD OF KB");break;
                case 26: jLabel6.setText("WELCOME TO THE WORLD OF KBC");break;
                case 27: jLabel6.setText("WELCOME TO THE WORLD OF KBC");break;
                case 28: jLabel6.setText("WELCOME TO THE WORLD OF KBC");break;
                case 29: jLabel6.setVisible(false);jLabel8.setVisible(true);break;
                case 30: jLabel8.setVisible(false);jLabel9.setVisible(true);break;
                case 31: jLabel9.setVisible(false);jLabel10.setVisible(true);break;
                case 32: jLabel10.setVisible(false);jLabel11.setVisible(true);break;
                case 33: jLabel11.setVisible(false);jLabel1.setVisible(true);break;
                case 34: jLabel1.setVisible(false);jLabel5.setVisible(true);
                         jLabel12.setVisible(true);jLabel13.setVisible(true);break;
                case 35:
           InputStream music1;
          try{
             music1=new FileInputStream(new File("src\\audio\\Voice_023_sd.wav"));
             AudioStream audios=new AudioStream(music1); 
             AudioPlayer.player.start(audios);   
             }
          catch(IOException m){JOptionPane.showMessageDialog(null,m.getMessage());}
             h=new Timer(100, new ActionListener(){
     @Override
            public void actionPerformed(ActionEvent e){
              crt++;
     switch (crt)
     {
         case 1: t.stop();jTextArea1.append("A");break;
         case 2: jTextArea1.append("a");break;
         case 3: jTextArea1.append("p");break;
         case 4: jTextArea1.append("k");break;
         case 5: jTextArea1.append("a");break;
         case 6: jTextArea1.append(" s");break;
         case 7: jTextArea1.append("w");break;
         case 8: jTextArea1.append("a");break;
         case 9: jTextArea1.append("g");break;
         case 10: jTextArea1.append("a");break;
         case 11: jTextArea1.append("t");break;
         case 12: jTextArea1.append(" h");break;
         case 13: jTextArea1.append("a");break;
         case 14: jTextArea1.append("i");t.start();break;
         default: h.stop();break;
     }
     }
     });h.start();
                break;
                case 65: jLabel3.setVisible(true);  jLabel13.setVisible(false);
                jLabel12.setVisible(false);jTextArea1.setText(null);break;
                case 66:
                jButton1.setVisible(true);    
                jButton2.setVisible(true);    
                jButton3.setVisible(true);break;    
                default: break;
        }
     } 
        });
        t.start(); 
        }
           else
           {
               jLabel5.setVisible(true);
               jLabel3.setVisible(true);
               jButton1.setVisible(true);
               jButton2.setVisible(true);
               jButton3.setVisible(true);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO THE WORLD OF KBC");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 40, 810, 67);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Play");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 610, 140, 30);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Rules");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 610, 140, 30);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Quit");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(830, 610, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/yash_raj_logo - Copy.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(940, 10, 40, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/login2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 90, 480, 490);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("WELCOME TO THE WORLD OF KBC");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 0, 810, 67);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WELCOME TO THE WORLD OF KBC");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 260, 810, 67);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("WELCOME TO THE WORLD OF KBC");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(100, 200, 810, 67);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("WELCOME TO THE WORLD OF KBC");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 160, 810, 67);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("WELCOME TO THE WORLD OF KBC");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 120, 810, 67);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("WELCOME TO THE WORLD OF KBC");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(100, 80, 810, 67);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(10);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setTabSize(0);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 590, 250, 50);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/YASH FINAL.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(130, 100, 320, 480);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/RAJ FINAL.png"))); // NOI18N
        jLabel13.setText("jLabel12");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(580, 100, 320, 480);

        setSize(new java.awt.Dimension(1022, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 int f=0,crt=0,ctr=0,cr=0;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
{
    Class.forName("java.sql.DriverManager");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yashraj", "root", "joker");
    Statement stmt1=(Statement) con.createStatement();
    String query1="Update users set status=2 where status!=0;";
    stmt1.executeUpdate(query1);
}
catch (Exception e)
{
    JOptionPane.showMessageDialog(this, e.getMessage());
}
Rule_Page a=new Rule_Page();
a.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int a=JOptionPane.showConfirmDialog(this, "Are you sure you want to Quit", "Confirm", JOptionPane.YES_NO_OPTION);
switch(a)
{
    case 0:
    {
        System.exit(0);
         try
        {
            Class.forName("java.sql.DriverManager");
    Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yashraj", "root", "joker");
    Statement d=(Statement) c.createStatement();
    String q="Update users set status=0 where status!=0";
    d.executeUpdate(q);
        }
        catch (Exception e)
        {
           JOptionPane.showMessageDialog(this, e.getMessage()); 
        }break;
    }
    case 1:
    {
       JOptionPane.showMessageDialog(this, "Please continue with the game"); break;
    }
    default:
    {
        JOptionPane.showMessageDialog(this, "Please continue with the game"); break;
    }
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
{
    Class.forName("java.sql.DriverManager");
    Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yashraj", "root", "joker");
    Statement stmt1=(Statement) con.createStatement();
    String query1="Update users set status=2 where status!=0;";
    stmt1.executeUpdate(query1);
}
catch (Exception e)
{
    JOptionPane.showMessageDialog(this, e.getMessage());
}        
JOptionPane.showMessageDialog(this, "Lets Roll");
Questions_page a=new Questions_page();
a.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome_Page().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
