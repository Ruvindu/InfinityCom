
package infinitycom;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import users.Cashier;

/**
 *
 * @author Ruvindu
 */
public class Dashboard extends javax.swing.JFrame {

    Cashier cashier;
    
    Encryption enc = Encryption.getEncryption();
    ResultSet selling_stock_details;
  
    private int current_product_available_qty;
    
    public Dashboard() {
        initComponents();
        
    }

    Dashboard(Cashier user) {
        initComponents();
        
       //initialize cashier
        this.cashier = user;
        
        default_selected();
        
        remove_list.setEnabled(false);
        print_bill.setEnabled(false);
        add_to_returns.setEnabled(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        main_panel = new javax.swing.JPanel();
        menus_bg = new javax.swing.JPanel();
        menus = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        returns = new javax.swing.JLabel();
        theme = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        header_text = new javax.swing.JLabel();
        dynamic1 = new javax.swing.JPanel();
        dashboard_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        p_name = new javax.swing.JTextField();
        p_qty = new javax.swing.JTextField();
        p_id = new javax.swing.JTextField();
        p_price = new javax.swing.JTextField();
        p_discount = new javax.swing.JTextField();
        add_to_list = new javax.swing.JButton();
        print_bill = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        p_total = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        remove_list = new javax.swing.JButton();
        clear_all = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        p_list = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        invoice_number = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        billing_date = new javax.swing.JTextField();
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
        returns_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        return_list = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        inv_number_for_return = new javax.swing.JTextField();
        search_recodes = new javax.swing.JButton();
        add_to_returns = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        return_qty = new javax.swing.JSpinner();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setLocationByPlatform(true);

        main_panel.setBackground(new java.awt.Color(255, 255, 255));

        menus.setBackground(new java.awt.Color(255, 255, 255));

        dashboard.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/dashboard.png"))); // NOI18N
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

        returns.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/return_64px copy.png"))); // NOI18N
        returns.setText(" Returns");
        returns.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        returns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnsMouseClicked(evt);
            }
        });

        theme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infinitycom/theme copy.png"))); // NOI18N

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

        javax.swing.GroupLayout menusLayout = new javax.swing.GroupLayout(menus);
        menus.setLayout(menusLayout);
        menusLayout.setHorizontalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(theme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menusLayout.setVerticalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(dashboard)
                .addGap(18, 18, 18)
                .addComponent(settings)
                .addGap(18, 18, 18)
                .addComponent(returns, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Product ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Product name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Gross price");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Discount (%)");

        p_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                p_idKeyReleased(evt);
            }
        });

        add_to_list.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_to_list.setText("Add to list");
        add_to_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_listActionPerformed(evt);
            }
        });

        print_bill.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        print_bill.setText("Print bill");
        print_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_billActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Total amount");

        p_total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        p_total.setText("00.00");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("RS.");

        remove_list.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        remove_list.setText("Remove from list");
        remove_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_listActionPerformed(evt);
            }
        });

        clear_all.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear_all.setText("Clear all");
        clear_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_allActionPerformed(evt);
            }
        });

        p_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product name", "Gross price", "Quantity", "Discount(%)", "Net Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(p_list);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Invoice number");

        invoice_number.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Date");

        billing_date.setEditable(false);

        javax.swing.GroupLayout dashboard_panelLayout = new javax.swing.GroupLayout(dashboard_panel);
        dashboard_panel.setLayout(dashboard_panelLayout);
        dashboard_panelLayout.setHorizontalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(add_to_list, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_name, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_price, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_discount, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoice_number, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billing_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dashboard_panelLayout.createSequentialGroup()
                                .addComponent(remove_list, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(clear_all, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(print_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashboard_panelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(136, 136, 136)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p_total, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        dashboard_panelLayout.setVerticalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(p_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(p_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(p_discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(add_to_list, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(p_total)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(invoice_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(billing_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(remove_list, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear_all, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
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

        returns_panel.setBackground(new java.awt.Color(255, 255, 255));

        return_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Quantity", "Discount", "Net amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        return_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(return_list);
        if (return_list.getColumnModel().getColumnCount() > 0) {
            return_list.getColumnModel().getColumn(0).setResizable(false);
            return_list.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Invoice number");

        inv_number_for_return.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        search_recodes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        search_recodes.setText("Search");
        search_recodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_recodesActionPerformed(evt);
            }
        });

        add_to_returns.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_to_returns.setText("Add to return list");
        add_to_returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_returnsActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Select quantity you want to return");

        return_qty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout returns_panelLayout = new javax.swing.GroupLayout(returns_panel);
        returns_panel.setLayout(returns_panelLayout);
        returns_panelLayout.setHorizontalGroup(
            returns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returns_panelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(returns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(returns_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(search_recodes, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_to_returns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(returns_panelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(inv_number_for_return, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(returns_panelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(return_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        returns_panelLayout.setVerticalGroup(
            returns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returns_panelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(returns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(returns_panelLayout.createSequentialGroup()
                        .addGroup(returns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inv_number_for_return, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addComponent(search_recodes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addGroup(returns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(return_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(add_to_returns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        dynamic1.add(returns_panel, "card2");

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
        returns.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
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

    private void returnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnsMouseClicked
        this.remove_selection();
        returns.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));

        dynamic1.removeAll();
        dynamic1.repaint();
        dynamic1.revalidate();

        dynamic1.add(returns_panel);
        dynamic1.repaint();
        dynamic1.revalidate();
    }//GEN-LAST:event_returnsMouseClicked

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

    private void p_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p_idKeyReleased
      
        try {
            int get_p_id = Integer.parseInt(p_id.getText());
        
            //get available stock data
        
            this.selling_stock_details = cashier.get_more_details_for_fill_billing_form(get_p_id);
        
            if(selling_stock_details.next()){
                
                p_name.setText(selling_stock_details.getString("product_name"));
                p_price.setText(selling_stock_details.getString("selling_price"));
                p_qty.setText("1");
                p_discount.setText("0");
                
                this.current_product_available_qty = Integer.parseInt(selling_stock_details.getString("quantity"));
                        
            }else{
                p_name.setText("");
                p_price.setText("");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_p_idKeyReleased

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

    private void add_to_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_listActionPerformed
        
        String str_pid = p_id.getText();
        String str_pname = p_name.getText();
        String str_pqty = p_qty.getText();
        String str_pgrossprice = p_price.getText();
        String str_pdiscount = p_discount.getText();
        
        try {
            
            //int int_pid = Integer.parseInt(str_pid);
            int int_qty = Integer.parseInt(str_pqty);
            float float_pgrossprice = Float.parseFloat(str_pgrossprice);
            float float_pdiscount = Float.parseFloat(str_pdiscount);
            
                if(int_qty <= this.current_product_available_qty){

                    float net_price;
                    if(float_pdiscount>0){
                        net_price = (float_pgrossprice*int_qty)-((float_pgrossprice*int_qty)*(float_pdiscount/100));
                    }else{
                        net_price = (float_pgrossprice*int_qty);
                    }

                     DecimalFormat decimalFormat = new DecimalFormat("#.00");
                     String str_net_price = decimalFormat.format(net_price);

                     String data[] = {str_pid,str_pname,Float.toString(float_pgrossprice),Integer.toString(int_qty),Float.toString(float_pdiscount),str_net_price};

                        DefaultTableModel model = (DefaultTableModel) p_list.getModel();
                        model.addRow(data);

                        /*calc total amount*/

                           /*Float current_amount =  Float.parseFloat(p_total.getText());
                           Float new_amount = current_amount + net_price;
                           p_total.setText(String.valueOf(new_amount));*/

                           calc_total();
                        /**/


                        set_latest_inv_num();
                        billing_date.setText(date_now());

                        print_bill.setEnabled(true);
                        fresh_dashboard_form();
                        
                }else{
                    JOptionPane.showMessageDialog(null, "Quantity not enough in stock.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Enter valid details.", "Error", JOptionPane.ERROR_MESSAGE);
            }
      
        
      
    }//GEN-LAST:event_add_to_listActionPerformed

    private void p_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_listMouseClicked
        
        remove_list.setEnabled(true);
       
    }//GEN-LAST:event_p_listMouseClicked

    private void remove_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_listActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) p_list.getModel();
        
        try {
            int selected_row_index = p_list.getSelectedRow();

            /*remove selected row and calc new total*/
            model.removeRow(selected_row_index);
            calc_total();
            
            int nRow = model.getRowCount();
            if(nRow<=0){
                print_bill.setEnabled(false);
                fresh_inv_info();
            }
        
            remove_list.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No selected rows.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_remove_listActionPerformed

    private void clear_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_allActionPerformed
        fresh_dashboard_form();
        fresh_list_table();
        fresh_inv_info();
        
        print_bill.setEnabled(false);
    }//GEN-LAST:event_clear_allActionPerformed

    private void print_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_billActionPerformed
       
        DefaultTableModel dtm = (DefaultTableModel) p_list.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0 ; i < nRow ; i++)
            for (int j = 0 ; j < nCol ; j++)
                tableData[i][j] = dtm.getValueAt(i,j);
        
        boolean purchase_success = cashier.purchases_process(invoice_number.getText(), date_now(), time_now(), tableData, nRow, nCol);
        
        if(purchase_success){
            
            fresh_dashboard_form();
            fresh_list_table();
            fresh_inv_info();

            print_bill.setEnabled(false);
            
           
            
            
        }
    }//GEN-LAST:event_print_billActionPerformed

    private void search_recodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_recodesActionPerformed
       
        try {
            int inv_num = Integer.parseInt(inv_number_for_return.getText());
            
            ResultSet purchased_res = cashier.get_purchased_for_return(inv_num);
            
            
            if (purchased_res != null) {
                return_list.setModel(DbUtils.resultSetToTableModel(purchased_res));
            }else{
                 JOptionPane.showMessageDialog(null, "No recodes found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No recodes found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_search_recodesActionPerformed

    private void return_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_listMouseClicked
       
        add_to_returns.setEnabled(true);
        
        DefaultTableModel dtm = (DefaultTableModel) return_list.getModel();
        int selected_row = return_list.getSelectedRow();
        int q = (int) dtm.getValueAt(selected_row,1);

        return_qty.setModel(new javax.swing.SpinnerNumberModel(1, 0, q, 1));
        
        
        
    }//GEN-LAST:event_return_listMouseClicked

    private void add_to_returnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_returnsActionPerformed
        
        DefaultTableModel dtm = (DefaultTableModel) return_list.getModel();
        int selected_row = return_list.getSelectedRow();
        
        int invno =  Integer.parseInt(inv_number_for_return.getText());
        int product_id = (int) dtm.getValueAt(selected_row,0);
        int qty = (int) return_qty.getValue();     
        float loss = ((float)dtm.getValueAt(selected_row,3)/(int)dtm.getValueAt(selected_row,1))*qty ;
        
        cashier.add_to_returns(invno, product_id, this.date_now(), qty, loss);
        
    }//GEN-LAST:event_add_to_returnsActionPerformed

    
    private void fresh_inv_info(){
        invoice_number.setText("");
        billing_date.setText("");
    }
   
    private void fresh_dashboard_form(){
        p_id.setText("");
        p_name.setText("");
        p_qty.setText("");
        p_discount.setText("");
        p_price.setText("");   
    }
   
    private void fresh_list_table(){
        DefaultTableModel dm = (DefaultTableModel) p_list.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        p_total.setText("0.00");
    }
    
    private void set_latest_inv_num(){
        invoice_number.setText(String.valueOf(cashier.latest_invoice()));
    }
    
    private String date_now(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = new Date();  
        return formatter.format(date);  
    } 
    
    private String time_now(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
        Date date = new Date();  
        return formatter.format(date);
    }
    
    private void calc_total(){
    
        float total = 0.00f;
        
        DefaultTableModel dtm = (DefaultTableModel) p_list.getModel();
        int nRow = dtm.getRowCount();
        
        for(int i = 0; i<nRow; i++){
            total = total + Float.parseFloat((String) dtm.getValueAt(i,5));
        }
        
        p_total.setText(String.valueOf(total));
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
    private javax.swing.JButton add_to_list;
    private javax.swing.JButton add_to_returns;
    private javax.swing.JPanel barcode_config;
    private javax.swing.JTextField billing_date;
    private javax.swing.JPanel change_password;
    private javax.swing.JButton change_pwd;
    private javax.swing.JButton clear_all;
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
    private javax.swing.JTextField inv_number_for_return;
    private javax.swing.JTextField invoice_number;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logout;
    private javax.swing.JProgressBar logout_ProgressBar;
    private javax.swing.JPanel logout_panel;
    private javax.swing.JLabel logout_status;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel menus;
    private javax.swing.JPanel menus_bg;
    private javax.swing.JPasswordField new_pwd;
    private javax.swing.JTextField p_discount;
    private javax.swing.JTextField p_id;
    private javax.swing.JTable p_list;
    private javax.swing.JTextField p_name;
    private javax.swing.JTextField p_price;
    private javax.swing.JTextField p_qty;
    private javax.swing.JLabel p_total;
    private javax.swing.JButton print_bill;
    private javax.swing.JButton remove_list;
    private javax.swing.JTable return_list;
    private javax.swing.JSpinner return_qty;
    private javax.swing.JLabel returns;
    private javax.swing.JPanel returns_panel;
    private javax.swing.JButton save_user_detail_changes;
    private javax.swing.JButton search_recodes;
    private javax.swing.JPanel setting_panel;
    private javax.swing.JLabel settings;
    private javax.swing.JLabel theme;
    // End of variables declaration//GEN-END:variables
}
