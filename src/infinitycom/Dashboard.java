
package infinitycom;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import users.Cashier;

/**
 *
 * @author Ruvindu
 */
public class Dashboard extends javax.swing.JFrame {

    Cashier cashier;
    
    Encryption enc = Encryption.getEncryption();
    
    public Dashboard() {
        initComponents();
    }

    Dashboard(Cashier user) {
        initComponents();
        
       //initialize cashier
        this.cashier = user;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        menus_bg = new javax.swing.JPanel();
        menus = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        theme = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        header_text = new javax.swing.JLabel();
        dynamic1 = new javax.swing.JPanel();
        dashboard_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        setting_panel = new javax.swing.JPanel();
        edit_profile = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edit_user_email = new javax.swing.JTextField();
        edit_user_name = new javax.swing.JTextField();
        save_user_detail_changes = new javax.swing.JButton();
        barcode_config = new javax.swing.JPanel();
        change_password = new javax.swing.JPanel();
        current_pwd = new javax.swing.JPasswordField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        new_pwd = new javax.swing.JPasswordField();
        jLabel31 = new javax.swing.JLabel();
        confirm_pwd = new javax.swing.JPasswordField();
        change_pwd = new javax.swing.JButton();
        logout_panel = new javax.swing.JPanel();
        logout_ProgressBar = new javax.swing.JProgressBar();
        logout_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setLocationByPlatform(true);

        main_panel.setBackground(new java.awt.Color(255, 255, 255));

        menus.setBackground(new java.awt.Color(255, 255, 255));

        dashboard.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/user_male_circle_64px.png"))); // NOI18N
        dashboard.setText("Dashboard");
        dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        settings.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/settings_64px.png"))); // NOI18N
        settings.setText(" Settings");
        settings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/logout_rounded_64px.png"))); // NOI18N
        logout.setText(" Log out");
        logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        theme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/theme copy.png"))); // NOI18N

        javax.swing.GroupLayout menusLayout = new javax.swing.GroupLayout(menus);
        menus.setLayout(menusLayout);
        menusLayout.setHorizontalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menusLayout.setVerticalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(dashboard)
                .addGap(18, 18, 18)
                .addComponent(settings)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(204, 204, 204));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        header_text.setFont(new java.awt.Font("Adobe Caslon Pro Bold", 1, 32)); // NOI18N
        header_text.setForeground(new java.awt.Color(255, 255, 255));
        header_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header_text.setText("Infinity com");
        header_text.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header_text, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout menus_bgLayout = new javax.swing.GroupLayout(menus_bg);
        menus_bg.setLayout(menus_bgLayout);
        menus_bgLayout.setHorizontalGroup(
            menus_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menus_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menus_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menus_bgLayout.setVerticalGroup(
            menus_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menus_bgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dynamic1.setBackground(new java.awt.Color(255, 255, 255));
        dynamic1.setLayout(new java.awt.CardLayout());

        dashboard_panel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout dashboard_panelLayout = new javax.swing.GroupLayout(dashboard_panel);
        dashboard_panel.setLayout(dashboard_panelLayout);
        dashboard_panelLayout.setHorizontalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(785, Short.MAX_VALUE))
        );
        dashboard_panelLayout.setVerticalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(587, Short.MAX_VALUE))
        );

        dynamic1.add(dashboard_panel, "card2");

        setting_panel.setBackground(new java.awt.Color(255, 255, 255));

        edit_profile.setBackground(new java.awt.Color(255, 255, 255));
        edit_profile.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit profile details"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("User Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email");

        edit_user_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        edit_user_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        save_user_detail_changes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        save_user_detail_changes.setText("Save");
        save_user_detail_changes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_user_detail_changesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_profileLayout = new javax.swing.GroupLayout(edit_profile);
        edit_profile.setLayout(edit_profileLayout);
        edit_profileLayout.setHorizontalGroup(
            edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_profileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit_user_email)
                    .addComponent(edit_user_name)
                    .addGroup(edit_profileLayout.createSequentialGroup()
                        .addGroup(edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_profileLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(save_user_detail_changes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        edit_profileLayout.setVerticalGroup(
            edit_profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_profileLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_user_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_user_detail_changes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        barcode_config.setBackground(new java.awt.Color(255, 255, 255));
        barcode_config.setBorder(javax.swing.BorderFactory.createTitledBorder("Barcode reader configuration"));

        javax.swing.GroupLayout barcode_configLayout = new javax.swing.GroupLayout(barcode_config);
        barcode_config.setLayout(barcode_configLayout);
        barcode_configLayout.setHorizontalGroup(
            barcode_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
        barcode_configLayout.setVerticalGroup(
            barcode_configLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        change_password.setBackground(new java.awt.Color(255, 255, 255));
        change_password.setBorder(javax.swing.BorderFactory.createTitledBorder("Change password"));

        current_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Current Password");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("New Password");

        new_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Confirm Password");

        confirm_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        change_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        change_pwd.setText("Change");
        change_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_pwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout change_passwordLayout = new javax.swing.GroupLayout(change_password);
        change_password.setLayout(change_passwordLayout);
        change_passwordLayout.setHorizontalGroup(
            change_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, change_passwordLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(change_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(change_passwordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(change_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(change_passwordLayout.createSequentialGroup()
                        .addGroup(change_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addGap(166, 166, 166))
                    .addGroup(change_passwordLayout.createSequentialGroup()
                        .addGroup(change_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(current_pwd, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirm_pwd))
                        .addContainerGap())
                    .addGroup(change_passwordLayout.createSequentialGroup()
                        .addComponent(new_pwd)
                        .addContainerGap())))
        );
        change_passwordLayout.setVerticalGroup(
            change_passwordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(change_passwordLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(current_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(new_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(change_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout setting_panelLayout = new javax.swing.GroupLayout(setting_panel);
        setting_panel.setLayout(setting_panelLayout);
        setting_panelLayout.setHorizontalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edit_profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(change_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(barcode_config, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setting_panelLayout.setVerticalGroup(
            setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setting_panelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(setting_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barcode_config, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(setting_panelLayout.createSequentialGroup()
                        .addComponent(edit_profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(change_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dynamic1.add(setting_panel, "card2");

        logout_panel.setBackground(new java.awt.Color(255, 255, 255));

        logout_status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logout_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout logout_panelLayout = new javax.swing.GroupLayout(logout_panel);
        logout_panel.setLayout(logout_panelLayout);
        logout_panelLayout.setHorizontalGroup(
            logout_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_panelLayout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(logout_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logout_panelLayout.createSequentialGroup()
                        .addComponent(logout_ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logout_panelLayout.createSequentialGroup()
                        .addComponent(logout_status, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(342, 342, 342))))
        );
        logout_panelLayout.setVerticalGroup(
            logout_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout_panelLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(logout_ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout_status, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        dynamic1.add(logout_panel, "card2");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(menus_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynamic1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menus_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dynamic1, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void default_selected(){
        this.remove_selection();
        dashboard.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        
        dynamic1.removeAll();
        dynamic1.repaint();
        dynamic1.revalidate();
        
        dynamic1.add(dashboard_panel);
        dynamic1.repaint();
        dynamic1.revalidate();
    }
    
     private void remove_selection() {
        dashboard.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        settings.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        logout.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

    }
     
    private void exit() {
        this.dispose();
    }
    
    private void set_data_to_edit() {

        ResultSet user_details_res = this.cashier.get_user_details_for_edit();

        try {
            if (user_details_res.next()) {
                edit_user_name.setText(user_details_res.getString("user_name"));
                edit_user_email.setText(user_details_res.getString("user_email"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        default_selected();
    }//GEN-LAST:event_dashboardMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        this.remove_selection();
        settings.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        dynamic1.removeAll();
        dynamic1.repaint();
        dynamic1.revalidate();

        dynamic1.add(setting_panel);
        dynamic1.repaint();
        dynamic1.revalidate();

       //load data from db for edit
       set_data_to_edit();
    }//GEN-LAST:event_settingsMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        this.remove_selection();
        logout.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        int confirm_logout = JOptionPane.showConfirmDialog(null, "Are you sure want to logout?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm_logout == 0) {

            dynamic1.removeAll();
            dynamic1.repaint();
            dynamic1.revalidate();

            dynamic1.add(logout_panel);
            dynamic1.repaint();
            dynamic1.revalidate();

            Thread t1 = new Thread() {

                public void run() {
                    logout_status.setText("Clear sessions...");
                    cashier = null;
                    for (int i = 0; i < 40; i++) {
                        logout_ProgressBar.setValue(i);
                        try {
                            sleep(8);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Admin_panel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    logout_status.setText("Logging out...");
                    for (int i = 41; i < 101; i++) {
                        logout_ProgressBar.setValue(i);
                        try {
                            sleep(9);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Admin_panel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    new InfinityComMain().setVisible(true);
                    exit();

                }
            };
            t1.start();

        }
    }//GEN-LAST:event_logoutMouseClicked

    private void change_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_pwdActionPerformed

        ResultSet user_pwd_res = this.cashier.get_pwd_to_change();

        try {
            if (user_pwd_res.next()) {

                String CurrentPWD = enc.encryptThis(current_pwd.getText());
                String NewPWD = enc.encryptThis(new_pwd.getText());
                String ConfirmPWD = enc.encryptThis(confirm_pwd.getText());

                if (user_pwd_res.getString("user_password").equals(CurrentPWD)) {

                    if (NewPWD.equals(ConfirmPWD)) {
                        if (this.cashier.change_pwd(NewPWD)) {
                            current_pwd.setText("");
                            new_pwd.setText("");
                            confirm_pwd.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "New password not valid.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid current password.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_change_pwdActionPerformed

    private void save_user_detail_changesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_user_detail_changesActionPerformed

        String Uname = edit_user_name.getText();
        String Uemail = edit_user_email.getText();

        this.cashier.edit_user_details(Uname, Uemail);

        set_data_to_edit();
    }//GEN-LAST:event_save_user_detail_changesActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barcode_config;
    private javax.swing.JPanel change_password;
    private javax.swing.JButton change_pwd;
    private javax.swing.JPasswordField confirm_pwd;
    private javax.swing.JPasswordField current_pwd;
    private javax.swing.JLabel dashboard;
    private javax.swing.JPanel dashboard_panel;
    private javax.swing.JPanel dynamic1;
    private javax.swing.JPanel edit_profile;
    private javax.swing.JTextField edit_user_email;
    private javax.swing.JTextField edit_user_name;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel logout;
    private javax.swing.JProgressBar logout_ProgressBar;
    private javax.swing.JPanel logout_panel;
    private javax.swing.JLabel logout_status;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel menus_bg;
    private javax.swing.JPasswordField new_pwd;
    private javax.swing.JButton save_user_detail_changes;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel theme;
    // End of variables declaration//GEN-END:variables
}
