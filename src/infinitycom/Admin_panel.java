package infinitycom;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import users.Admin;

public class Admin_panel extends javax.swing.JFrame {

    Admin admin;

    Encryption enc = Encryption.getEncryption();

    Update_stock update_stock = new Update_stock();
    
    public Admin_panel() {
        initComponents();
    }

    public Admin_panel(Admin user) {
        initComponents();

        //initialize admin
        this.admin = user;

        //Select users menu for first time login as the default
        default_selected();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        main_panel = new javax.swing.JPanel();
        menus_bg = new javax.swing.JPanel();
        menus = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        inventory = new javax.swing.JLabel();
        reports = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        theme = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        header_text = new javax.swing.JLabel();
        dynamic1 = new javax.swing.JPanel();
        users_panel = new javax.swing.JPanel();
        users_add_update = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        user_type = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        user_name = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        user_email = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        user_pwd = new javax.swing.JPasswordField();
        user_btn = new javax.swing.JButton();
        clear_user_form = new javax.swing.JButton();
        remove_user = new javax.swing.JButton();
        reset_default_pwd = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        view_users = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        inventory_panel = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cat_name = new javax.swing.JTextField();
        cat_btn = new javax.swing.JButton();
        clear_cat_form = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        categoty_table = new javax.swing.JTable();
        remove_cat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        add_stock_id = new javax.swing.JTextField();
        add_inv = new javax.swing.JButton();
        clear_add_inv = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        add_product_name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        add_product_cat = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        add_qty = new javax.swing.JTextField();
        add_stock_price = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        add_selling_price = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventory_table = new javax.swing.JTable();
        stock_update = new javax.swing.JButton();
        stock_remove = new javax.swing.JButton();
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

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Infinity com - Admin panel");
        setLocationByPlatform(true);
        setResizable(false);

        main_panel.setBackground(new java.awt.Color(255, 255, 255));

        menus.setBackground(new java.awt.Color(255, 255, 255));

        users.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/user_male_circle_64px.png"))); // NOI18N
        users.setText(" Users");
        users.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });

        inventory.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        inventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/move_by_trolley_64px.png"))); // NOI18N
        inventory.setText(" Inventory");
        inventory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        inventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryMouseClicked(evt);
            }
        });

        reports.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/graph_report_64px.png"))); // NOI18N
        reports.setText(" Reports");
        reports.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
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
                    .addComponent(users, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menusLayout.setVerticalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(users)
                .addGap(18, 18, 18)
                .addComponent(inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reports)
                .addGap(18, 18, 18)
                .addComponent(settings)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        users_panel.setBackground(new java.awt.Color(255, 255, 255));

        users_add_update.setBackground(new java.awt.Color(255, 255, 255));
        users_add_update.setBorder(javax.swing.BorderFactory.createTitledBorder("Add new & update exsisting user"));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("User Type");

        user_type.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Admin" }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("User name");

        user_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Email");

        user_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Password");

        user_pwd.setEditable(false);
        user_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_pwd.setText("12345");

        user_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_btn.setText("Add");
        user_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_btnActionPerformed(evt);
            }
        });

        clear_user_form.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear_user_form.setText("Clear form");
        clear_user_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_user_formActionPerformed(evt);
            }
        });

        remove_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        remove_user.setText("Remove");
        remove_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_userActionPerformed(evt);
            }
        });

        reset_default_pwd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reset_default_pwd.setText("Reset default password");
        reset_default_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_default_pwdActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("<html> Info : Concern the default password as 12345  </html> ");

        javax.swing.GroupLayout users_add_updateLayout = new javax.swing.GroupLayout(users_add_update);
        users_add_update.setLayout(users_add_updateLayout);
        users_add_updateLayout.setHorizontalGroup(
            users_add_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(users_add_updateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(users_add_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(user_name)
                    .addComponent(user_email)
                    .addComponent(user_pwd)
                    .addGroup(users_add_updateLayout.createSequentialGroup()
                        .addComponent(reset_default_pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(users_add_updateLayout.createSequentialGroup()
                        .addComponent(clear_user_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(remove_user, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(users_add_updateLayout.createSequentialGroup()
                        .addGroup(users_add_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(users_add_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(user_type, javax.swing.GroupLayout.Alignment.LEADING, 0, 191, Short.MAX_VALUE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        users_add_updateLayout.setVerticalGroup(
            users_add_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(users_add_updateLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(users_add_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(user_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(reset_default_pwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(users_add_updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_user_form, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove_user, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        view_users.setBackground(new java.awt.Color(255, 255, 255));
        view_users.setBorder(javax.swing.BorderFactory.createTitledBorder("All Users"));

        user_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        user_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_table.setGridColor(new java.awt.Color(204, 204, 204));
        user_table.setName(""); // NOI18N
        user_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        user_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(user_table);

        javax.swing.GroupLayout view_usersLayout = new javax.swing.GroupLayout(view_users);
        view_users.setLayout(view_usersLayout);
        view_usersLayout.setHorizontalGroup(
            view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_usersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        view_usersLayout.setVerticalGroup(
            view_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view_usersLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        javax.swing.GroupLayout users_panelLayout = new javax.swing.GroupLayout(users_panel);
        users_panel.setLayout(users_panelLayout);
        users_panelLayout.setHorizontalGroup(
            users_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(users_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(users_add_update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(view_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        users_panelLayout.setVerticalGroup(
            users_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(users_panelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(users_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(users_add_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(view_users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        dynamic1.add(users_panel, "card2");

        inventory_panel.setBackground(new java.awt.Color(255, 255, 255));

        tabs.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabsMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Maintain Categories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Category name");

        cat_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cat_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cat_btn.setText("Add");
        cat_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat_btnActionPerformed(evt);
            }
        });

        clear_cat_form.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear_cat_form.setText("Clear");
        clear_cat_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_cat_formActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(clear_cat_form, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(cat_name, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cat_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cat_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_cat_form, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "All Categories", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        categoty_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        categoty_table.setGridColor(new java.awt.Color(204, 204, 204));
        categoty_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        categoty_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoty_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(categoty_table);

        remove_cat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        remove_cat.setText("Remove");
        remove_cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_catActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remove_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(remove_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabs.addTab("Category", jPanel1);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        jPanel7.setBackground(new java.awt.Color(250, 250, 250));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add new stock", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Stock ID");

        add_stock_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_inv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_inv.setText("Add");
        add_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_invActionPerformed(evt);
            }
        });

        clear_add_inv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear_add_inv.setText("Clear");
        clear_add_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_add_invActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Product Name (optional)");

        add_product_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Product Catogory");

        add_product_cat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Quantity");

        add_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        add_stock_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Stock price");

        add_selling_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Selling price");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(add_product_cat, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(add_selling_price, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add_stock_price, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add_qty, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_product_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_stock_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(clear_add_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_product_cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_stock_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_stock_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_selling_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_add_inv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab(" Add new Stock", jPanel2);

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        inventory_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inventory_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        inventory_table.setGridColor(new java.awt.Color(204, 204, 204));
        inventory_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        inventory_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventory_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(inventory_table);

        stock_update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stock_update.setText("Update");
        stock_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_updateActionPerformed(evt);
            }
        });

        stock_remove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stock_remove.setText("Remove");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(stock_update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(stock_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stock_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stock_remove, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabs.addTab(" Maintain Inventory ", jPanel3);

        javax.swing.GroupLayout inventory_panelLayout = new javax.swing.GroupLayout(inventory_panel);
        inventory_panel.setLayout(inventory_panelLayout);
        inventory_panelLayout.setHorizontalGroup(
            inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventory_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        inventory_panelLayout.setVerticalGroup(
            inventory_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inventory_panelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        dynamic1.add(inventory_panel, "card2");

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
                .addContainerGap(299, Short.MAX_VALUE))
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

    private void remove_selection() {
        users.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        inventory.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        reports.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        settings.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        logout.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

    }

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        default_selected();
    }//GEN-LAST:event_usersMouseClicked

    private void inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryMouseClicked
        this.remove_selection();
        inventory.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        dynamic1.removeAll();
        dynamic1.repaint();
        dynamic1.revalidate();

        dynamic1.add(inventory_panel);
        dynamic1.repaint();
        dynamic1.revalidate();

        //refresh category form, category table
        refresh_cat_form();
        refresh_cat_tbl();
        refresh_inv_add_form();
        refresh_inventory_tbl();
      
        
    }//GEN-LAST:event_inventoryMouseClicked

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        this.remove_selection();
        reports.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        dynamic1.removeAll();
        dynamic1.repaint();
        dynamic1.revalidate();

        //dynamic1.add(null);
        dynamic1.repaint();
        dynamic1.revalidate();
    }//GEN-LAST:event_reportsMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
        this.remove_selection();
        settings.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        dynamic1.removeAll();
        dynamic1.repaint();
        dynamic1.revalidate();

        dynamic1.add(setting_panel);
        dynamic1.repaint();
        dynamic1.revalidate();

        //set user details to edi
        set_data_to_edit();
    }//GEN-LAST:event_settingsMouseClicked

    private void exit() {
        this.dispose();
    }


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
                    admin = null;
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

    private void default_selected() {
        this.remove_selection();
        users.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        dynamic1.removeAll();
        dynamic1.repaint();
        dynamic1.revalidate();

        dynamic1.add(users_panel);
        dynamic1.repaint();
        dynamic1.revalidate();

        //refresh table
        refresh_user_tbl();

        // reafresh user form(
        refresh_user_form();
    }

    private void refresh_user_form() {

        admin.setSelected_user(0);

        user_type.setSelectedIndex(0);
        user_name.setText("");
        user_email.setText("");
        user_pwd.setText("12345");

        reset_default_pwd.setEnabled(false);
        reset_default_pwd.setSelected(false);
        remove_user.setEnabled(false);
        user_btn.setText("Add");
    }


    private void user_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_btnActionPerformed

        String UType = (String) user_type.getSelectedItem();
        String UName = user_name.getText();
        String UEmail = user_email.getText();
        String UPwd = enc.encryptThis(user_pwd.getText());

        if ((!"".equals(UName)) && (!"".equals(UEmail)) && (!"".equals(UPwd))) {
            this.admin.user_redirector(UType, UName, UEmail, UPwd);

            //refresh table
            refresh_user_tbl();
            refresh_user_form();
        } else {
            JOptionPane.showMessageDialog(null, "Fill all required fields.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_user_btnActionPerformed

    private void user_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel) user_table.getModel();
        int selected_row_index = user_table.getSelectedRow();

        /*Get selected id*/
        String selected_id = model.getValueAt(selected_row_index, 0).toString();

        this.admin.setSelected_user(Integer.parseInt(selected_id));

        try {
            ResultSet selected_user_res = this.admin.get_selected_user();
            if (selected_user_res.next()) {

                if ("Admin".equals(selected_user_res.getString("role"))) {
                    user_type.setSelectedIndex(1);
                }
                user_name.setText(selected_user_res.getString("user_name"));
                user_email.setText(selected_user_res.getString("user_email"));
                //user_pwd.setText(selected_user_res.getString("user_password"));
                user_pwd.setText("");

                reset_default_pwd.setSelected(false);
                reset_default_pwd.setEnabled(true);
                remove_user.setEnabled(true);
                user_btn.setText("Save");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_user_tableMouseClicked

    private void clear_user_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_user_formActionPerformed
        refresh_user_form();
        refresh_user_tbl();
    }//GEN-LAST:event_clear_user_formActionPerformed

    private void reset_default_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_default_pwdActionPerformed

        boolean reset_pwd = reset_default_pwd.isSelected();

        if (reset_pwd) {
            int reset_pwd_confirm = JOptionPane.showConfirmDialog(null, "Are you sure want to reset default password?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (reset_pwd_confirm == 0) {
                user_pwd.setText("12345");
            } else {
                reset_default_pwd.setSelected(false);
                user_pwd.setText("");
            }

        }
    }//GEN-LAST:event_reset_default_pwdActionPerformed

    private void remove_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_userActionPerformed

        int confirm_delete = JOptionPane.showConfirmDialog(null, "Are you sure want to reset delete this user?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm_delete == 0) {
            this.admin.delete_user();

            refresh_user_form();
            refresh_user_tbl();
        }
    }//GEN-LAST:event_remove_userActionPerformed

    public void refresh_user_tbl() {

        ResultSet res_users = this.admin.get_all_users();
        if (res_users != null) {
            user_table.setModel(DbUtils.resultSetToTableModel(res_users));
        }
    }

    private void set_data_to_edit() {

        ResultSet user_details_res = this.admin.get_user_details_for_edit();

        try {
            if (user_details_res.next()) {
                edit_user_name.setText(user_details_res.getString("user_name"));
                edit_user_email.setText(user_details_res.getString("user_email"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void save_user_detail_changesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_user_detail_changesActionPerformed

        String Uname = edit_user_name.getText();
        String Uemail = edit_user_email.getText();

        this.admin.edit_user_details(Uname, Uemail);

        set_data_to_edit();
    }//GEN-LAST:event_save_user_detail_changesActionPerformed

    private void change_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_pwdActionPerformed

        ResultSet user_pwd_res = this.admin.get_pwd_to_change();

        try {
            if (user_pwd_res.next()) {

                String CurrentPWD = enc.encryptThis(current_pwd.getText());
                String NewPWD = enc.encryptThis(new_pwd.getText());
                String ConfirmPWD = enc.encryptThis(confirm_pwd.getText());

                if (user_pwd_res.getString("user_password").equals(CurrentPWD)) {

                    if (NewPWD.equals(ConfirmPWD)) {
                        if (this.admin.change_pwd(NewPWD)) {
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


    private void cat_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat_btnActionPerformed

        String category_name = cat_name.getText();

        if (!"".equals(category_name)) {

            this.admin.category_redirector(category_name);

            //refresh category form, category table
            refresh_cat_form();
            refresh_cat_tbl();

            refresh_inv_add_form();

        } else {
            JOptionPane.showMessageDialog(null, "No enterd category name.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_cat_btnActionPerformed

    private void categoty_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoty_tableMouseClicked

        DefaultTableModel model = (DefaultTableModel) categoty_table.getModel();
        int selected_row_index = categoty_table.getSelectedRow();

        /*Get selected id*/
        String selected_id = model.getValueAt(selected_row_index, 0).toString();
        System.out.println(selected_id);
        this.admin.setSelected_category(Integer.parseInt(selected_id));

        try {
            ResultSet selected_cat_res = this.admin.get_selected_category();
            if (selected_cat_res.next()) {

                cat_name.setText(selected_cat_res.getString("cat_name"));

                remove_cat.setEnabled(true);
                cat_btn.setText("Save");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_categoty_tableMouseClicked

    private void clear_cat_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_cat_formActionPerformed
        //refresh category form, category table
        refresh_cat_form();
        refresh_cat_tbl();
    }//GEN-LAST:event_clear_cat_formActionPerformed

    private void remove_catActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_catActionPerformed

        this.admin.delete_category();

        //refresh category form, category table
        refresh_cat_form();
        refresh_cat_tbl();

    }//GEN-LAST:event_remove_catActionPerformed

    private void tabsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsMouseClicked

        //refresh category form, category table
        /*  refresh_cat_form();
            refresh_cat_tbl();
            
            refresh_inv_add_form();*/
    }//GEN-LAST:event_tabsMouseClicked

    private void clear_add_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_add_invActionPerformed
        //refresh add inventory form
        refresh_inv_add_form();
    }//GEN-LAST:event_clear_add_invActionPerformed

    private void add_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_invActionPerformed

        try {

            int product_id = Integer.parseInt(add_stock_id.getText());
            String product_category = (String) add_product_cat.getSelectedItem();
            String product_name = add_product_name.getText();
            int qty = Integer.parseInt(add_qty.getText());
            float stock_price = Float.parseFloat(add_stock_price.getText());
            float selling_price = Float.parseFloat(add_selling_price.getText());

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String d = formatter.format(date);

            this.admin.add_inventory(product_id, product_category, product_name, qty, stock_price, selling_price, d);
            refresh_inventory_tbl();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_add_invActionPerformed

    private void inventory_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventory_tableMouseClicked
        
        
        DefaultTableModel model = (DefaultTableModel) inventory_table.getModel();
        int selected_row_index = inventory_table.getSelectedRow();

        /*Get selected id*/
        String selected_id = model.getValueAt(selected_row_index, 0).toString();
        //System.out.println(selected_id);
        this.admin.setSelected_stock(Integer.parseInt(selected_id));

        try {
            ResultSet selected_stock_res = this.admin.get_selected_stock();
            if (selected_stock_res.next()) {

                update_stock.set_update_stock_form(selected_stock_res.getString("product_category"), selected_stock_res.getString("stock_id"), selected_stock_res.getString("product_name"), selected_stock_res.getString("quantity"),selected_stock_res.getString("stock_price") , selected_stock_res.getString("selling_price") );

                stock_update.setEnabled(true);
                stock_remove.setEnabled(true);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
       
    }//GEN-LAST:event_inventory_tableMouseClicked

    private void stock_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_updateActionPerformed
        
        update_stock.setVisible(true);
        
    }//GEN-LAST:event_stock_updateActionPerformed

    private void refresh_inv_add_form() {

        ResultSet all_cat = this.admin.get_all_categories();

        try {
            add_product_cat.removeAllItems();
            while (all_cat.next()) {
                add_product_cat.addItem(all_cat.getString("Category name"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        add_stock_id.setText("");
        add_product_name.setText("");
        add_qty.setText("");
        add_stock_price.setText("");
        add_selling_price.setText("");

    }

    private void refresh_inventory_tbl() {

        ResultSet res_stocks = this.admin.get_all_stocks();
        if (res_stocks != null) {
            inventory_table.setModel(DbUtils.resultSetToTableModel(res_stocks));
        }
    }
    
   

    private void refresh_cat_form() {

        admin.setSelected_category(0);

        cat_name.setText("");
        cat_btn.setText("Add");
        remove_cat.setEnabled(false);

    }

    private void refresh_cat_tbl() {

        ResultSet res_cats = this.admin.get_all_categories();
        if (res_cats != null) {
            categoty_table.setModel(DbUtils.resultSetToTableModel(res_cats));
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_inv;
    private javax.swing.JComboBox<String> add_product_cat;
    private javax.swing.JTextField add_product_name;
    private javax.swing.JTextField add_qty;
    private javax.swing.JTextField add_selling_price;
    private javax.swing.JTextField add_stock_id;
    private javax.swing.JTextField add_stock_price;
    private javax.swing.JPanel barcode_config;
    private javax.swing.JButton cat_btn;
    private javax.swing.JTextField cat_name;
    private javax.swing.JTable categoty_table;
    private javax.swing.JPanel change_password;
    private javax.swing.JButton change_pwd;
    private javax.swing.JButton clear_add_inv;
    private javax.swing.JButton clear_cat_form;
    private javax.swing.JButton clear_user_form;
    private javax.swing.JPasswordField confirm_pwd;
    private javax.swing.JPasswordField current_pwd;
    private javax.swing.JPanel dynamic1;
    private javax.swing.JPanel edit_profile;
    private javax.swing.JTextField edit_user_email;
    private javax.swing.JTextField edit_user_name;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_text;
    private javax.swing.JLabel inventory;
    private javax.swing.JPanel inventory_panel;
    private javax.swing.JTable inventory_table;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel logout;
    private javax.swing.JProgressBar logout_ProgressBar;
    private javax.swing.JPanel logout_panel;
    private javax.swing.JLabel logout_status;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel menus_bg;
    private javax.swing.JPasswordField new_pwd;
    private javax.swing.JButton remove_cat;
    private javax.swing.JButton remove_user;
    private javax.swing.JLabel reports;
    private javax.swing.JCheckBox reset_default_pwd;
    private javax.swing.JButton save_user_detail_changes;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel settings;
    private javax.swing.JButton stock_remove;
    private javax.swing.JButton stock_update;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel theme;
    private javax.swing.JButton user_btn;
    private javax.swing.JTextField user_email;
    private javax.swing.JTextField user_name;
    private javax.swing.JPasswordField user_pwd;
    private javax.swing.JTable user_table;
    private javax.swing.JComboBox<String> user_type;
    private javax.swing.JLabel users;
    private javax.swing.JPanel users_add_update;
    private javax.swing.JPanel users_panel;
    private javax.swing.JPanel view_users;
    // End of variables declaration//GEN-END:variables
}
