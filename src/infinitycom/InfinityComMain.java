
package infinitycom;

import com.mysql.jdbc.Connection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import users.Admin;
import users.Cashier;
import users.UserProducer;
import users.Users;





public class InfinityComMain extends javax.swing.JFrame {

  
    Connection con;
    Encryption enc = Encryption.getEncryption();
    
  
    public InfinityComMain() {
        initComponents();
        
        try_to_connect();   
        check_as_me_remember();
    }
    
    private void try_to_connect(){
        try{
            con = DBConnection.getConnction().getConnction().createConnection();
            
            main_frame.removeAll();
            main_frame.repaint();
            main_frame.revalidate();

            main_frame.add(login);
            main_frame.repaint();
            main_frame.revalidate();
            
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e.getMessage(), "Error" , JOptionPane.ERROR_MESSAGE);
            main_frame.removeAll();
            main_frame.repaint();
            main_frame.revalidate();

            main_frame.add(connection_err);
            main_frame.repaint();
            main_frame.revalidate();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        main_frame = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        remember_me = new javax.swing.JCheckBox();
        login_btn = new javax.swing.JButton();
        forgotten_pwd = new javax.swing.JLabel();
        stauts = new javax.swing.JLabel();
        connection_err = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        retry = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Infinity com 1.0v");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/fromt page copy crop.png"))); // NOI18N

        jLabel7.setText("Copyright © 2020 Infinity com");

        main_frame.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("User name");

        username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Password");

        remember_me.setBackground(new java.awt.Color(255, 255, 255));
        remember_me.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        remember_me.setText("Remember me");

        login_btn.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        forgotten_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forgotten_pwd.setText("Forgotten password?");

        stauts.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stauts.setForeground(new java.awt.Color(204, 0, 0));
        stauts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stauts, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(username)
                            .addComponent(password)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(remember_me, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(forgotten_pwd)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(remember_me)
                .addGap(18, 18, 18)
                .addComponent(login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forgotten_pwd)
                .addGap(36, 36, 36)
                .addComponent(stauts, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        main_frame.add(login, "card2");

        connection_err.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel5.setText("Database connection failed!");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/ezgif.com-resize.gif"))); // NOI18N

        retry.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        retry.setText("Retry");
        retry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout connection_errLayout = new javax.swing.GroupLayout(connection_err);
        connection_err.setLayout(connection_errLayout);
        connection_errLayout.setHorizontalGroup(
            connection_errLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, connection_errLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(connection_errLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(connection_errLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        connection_errLayout.setVerticalGroup(
            connection_errLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, connection_errLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retry, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        main_frame.add(connection_err, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(main_frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        stauts.setText("");
    }//GEN-LAST:event_passwordKeyReleased

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        stauts.setText("");
    }//GEN-LAST:event_usernameKeyReleased

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed

        try {
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user where user_name = '" + username.getText() + "' and user_password = '" + enc.encryptThis(password.getText()) + "'");

            if(rs.next()){

                // Remamber me
                File file = new File("usr.dat");
                if(remember_me.isSelected())set_as_me_remember();
                else file.delete();
                
                //create a user
                UserProducer usr = new UserProducer();
                
                if("Admin".equals(rs.getString("role"))){
                    
                    Users a = usr.request_user("ADMIN");
                    a.user_producer( Integer.parseInt(rs.getString("user_id")), rs.getString("user_name"), rs.getString("user_email") );
                    
                    Admin_panel adminobj = new Admin_panel((Admin) a);
                    adminobj.setVisible(true);
                    this.dispose();
                         
                }else{
                    Users c = usr.request_user("CASHIER");
                    c.user_producer( Integer.parseInt(rs.getString("user_id")), rs.getString("user_name"), rs.getString("user_email") );
                    
                    Dashboard dashobj = new Dashboard((Cashier) c);
                    dashobj.setVisible(true);
                    this.dispose();
                }
                    

                
                
            }else{
                stauts.setText("Incorrect username or password!");
            }

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_login_btnActionPerformed

    private void retryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retryActionPerformed
        try_to_connect();
    }//GEN-LAST:event_retryActionPerformed

    
    private void check_as_me_remember(){

        // read the content from file
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("usr.dat"))) {
            String line = bufferedReader.readLine();
            username.setText(line);
        
        } catch (FileNotFoundException e) {
            // exception handling
        } catch (IOException e) {
            // exception handling
        }
    }
    
     private void set_as_me_remember(){

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("usr.dat"))) {         
            bufferedWriter.write(username.getText());
        } catch (IOException e) {
            // exception handling
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InfinityComMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfinityComMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfinityComMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfinityComMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfinityComMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel connection_err;
    private javax.swing.JLabel forgotten_pwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel login;
    private javax.swing.JButton login_btn;
    private javax.swing.JPanel main_frame;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox remember_me;
    private javax.swing.JButton retry;
    private javax.swing.JLabel stauts;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
