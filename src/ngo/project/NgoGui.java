package ngo.project;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author albertcahyawan
 */
public class NgoGui extends javax.swing.JFrame {
   
    boolean admin = false;
    public NgoGui() {
    
        initComponents();
        MainMenu.setVisible(true);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganization.setVisible(false);
        AddOrganizationbtn.setVisible(false);
       
    }       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenu = new javax.swing.JPanel();
        SearchOrganizationbtn = new javax.swing.JButton();
        Search = new javax.swing.JScrollPane();
        SearchOrganizationtxt = new javax.swing.JTextField();
        Exitbtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        AddOrganizationbtn = new javax.swing.JButton();
        SearchOrganization = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        Exitbtn2 = new javax.swing.JButton();
        BackMenubtn1 = new javax.swing.JButton();
        OrganizationAdresslbl = new javax.swing.JLabel();
        OrganiztionContactlb = new javax.swing.JLabel();
        OrganizationNamelbl = new javax.swing.JLabel();
        SeachMemberbtn = new javax.swing.JButton();
        SearchMembertxt = new javax.swing.JTextField();
        OrganizationIdlbl = new javax.swing.JLabel();
        OrganizationEmaillbl = new javax.swing.JLabel();
        SearchMember = new javax.swing.JPanel();
        MemberNamelbl = new javax.swing.JLabel();
        MemberIdlbl = new javax.swing.JLabel();
        MemberAddresslbl = new javax.swing.JLabel();
        MemberEmaillbl = new javax.swing.JLabel();
        MemberHomelbl = new javax.swing.JLabel();
        MemberPhonelbl = new javax.swing.JLabel();
        MemberAddresslbl1 = new javax.swing.JLabel();
        MemberEmaillbl1 = new javax.swing.JLabel();
        MemberHomelbl1 = new javax.swing.JLabel();
        MemberPhonelbl1 = new javax.swing.JLabel();
        MemberNamelbl1 = new javax.swing.JLabel();
        MemberIdlbl1 = new javax.swing.JLabel();
        Exitbtn3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Hiddeneditmember = new javax.swing.JPanel();
        EditMember = new javax.swing.JButton();
        HiddenLogin = new javax.swing.JPanel();
        AdminUsername = new javax.swing.JTextField();
        AdminPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Loginbtn = new javax.swing.JButton();
        Passwordlbl = new javax.swing.JLabel();
        Usernamelbl1 = new javax.swing.JLabel();
        Wronglbl = new javax.swing.JLabel();
        AddOrganization = new javax.swing.JPanel();
        AddOrganizationId = new javax.swing.JTextField();
        AddnewOrganizationbtnsave = new javax.swing.JButton();
        MainMenubtn4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddOrganizationName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchOrganizationbtn.setText("Search Organization");
        SearchOrganizationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchOrganizationbtnActionPerformed(evt);
            }
        });

        SearchOrganizationtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchOrganizationtxtActionPerformed(evt);
            }
        });

        Exitbtn1.setText("Exit");
        Exitbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exitbtn1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Organization List");

        AddOrganizationbtn.setText("Add Organization");
        AddOrganizationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Search)
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exitbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(SearchOrganizationbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchOrganizationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchOrganizationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchOrganizationbtn)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Exitbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(AddOrganizationbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        Exitbtn2.setText("Exit");
        Exitbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exitbtn2ActionPerformed(evt);
            }
        });

        BackMenubtn1.setText("Main Menu");
        BackMenubtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenubtn1ActionPerformed(evt);
            }
        });

        OrganizationAdresslbl.setText("Addres");

        OrganiztionContactlb.setText("Contact number");

        OrganizationNamelbl.setText("Organization Name");

        SeachMemberbtn.setText("Search Member");
        SeachMemberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeachMemberbtnActionPerformed(evt);
            }
        });

        OrganizationIdlbl.setText("Organization ID");

        OrganizationEmaillbl.setText("Email");

        javax.swing.GroupLayout SearchOrganizationLayout = new javax.swing.GroupLayout(SearchOrganization);
        SearchOrganization.setLayout(SearchOrganizationLayout);
        SearchOrganizationLayout.setHorizontalGroup(
            SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addComponent(OrganizationNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrganizationIdlbl)
                        .addGap(75, 75, 75)
                        .addComponent(SeachMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchMembertxt, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addComponent(jScrollPane2)
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(OrganiztionContactlb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(OrganizationAdresslbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackMenubtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exitbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addComponent(OrganizationEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SearchOrganizationLayout.setVerticalGroup(
            SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeachMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchMembertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationIdlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exitbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackMenubtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationAdresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrganizationEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(OrganiztionContactlb, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MemberNamelbl.setText("Member Name");

        MemberIdlbl.setText("Member Id");

        MemberAddresslbl.setText("Address");

        MemberEmaillbl.setText("Email");

        MemberHomelbl.setText("Home number");

        MemberPhonelbl.setText("Phone number");

        Exitbtn3.setText("Exit");
        Exitbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exitbtn3ActionPerformed(evt);
            }
        });

        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        EditMember.setText("Edit Member");
        EditMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HiddeneditmemberLayout = new javax.swing.GroupLayout(Hiddeneditmember);
        Hiddeneditmember.setLayout(HiddeneditmemberLayout);
        HiddeneditmemberLayout.setHorizontalGroup(
            HiddeneditmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HiddeneditmemberLayout.createSequentialGroup()
                .addComponent(EditMember, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HiddeneditmemberLayout.setVerticalGroup(
            HiddeneditmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HiddeneditmemberLayout.createSequentialGroup()
                .addComponent(EditMember, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SearchMemberLayout = new javax.swing.GroupLayout(SearchMember);
        SearchMember.setLayout(SearchMemberLayout);
        SearchMemberLayout.setHorizontalGroup(
            SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MemberAddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberIdlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberPhonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberHomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Hiddeneditmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemberHomelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberAddresslbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberNamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberIdlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberEmaillbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberPhonelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exitbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SearchMemberLayout.setVerticalGroup(
            SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addComponent(MemberNamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberIdlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberAddresslbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberEmaillbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MemberPhonelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberHomelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addComponent(MemberNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchMemberLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(MemberAddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchMemberLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MemberIdlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberPhonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberHomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addComponent(Hiddeneditmember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exitbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        AdminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminUsernameActionPerformed(evt);
            }
        });

        AdminPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPasswordActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        Loginbtn.setText("Login");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });
        Loginbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginbtnKeyPressed(evt);
            }
        });

        Passwordlbl.setForeground(new java.awt.Color(255, 0, 0));

        Usernamelbl1.setForeground(new java.awt.Color(255, 0, 0));

        Wronglbl.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout HiddenLoginLayout = new javax.swing.GroupLayout(HiddenLogin);
        HiddenLogin.setLayout(HiddenLoginLayout);
        HiddenLoginLayout.setHorizontalGroup(
            HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HiddenLoginLayout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HiddenLoginLayout.createSequentialGroup()
                        .addComponent(Loginbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Wronglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Usernamelbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        HiddenLoginLayout.setVerticalGroup(
            HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HiddenLoginLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Usernamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Loginbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Wronglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        Passwordlbl.getAccessibleContext().setAccessibleName("Usernamelbl");

        AddOrganizationId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationIdActionPerformed(evt);
            }
        });

        AddnewOrganizationbtnsave.setText("Add");
        AddnewOrganizationbtnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddnewOrganizationbtnsaveActionPerformed(evt);
            }
        });

        MainMenubtn4.setText("Main Menu");
        MainMenubtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenubtn4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Organization Name");

        jLabel4.setText("Organization Id");

        AddOrganizationName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddOrganizationLayout = new javax.swing.GroupLayout(AddOrganization);
        AddOrganization.setLayout(AddOrganizationLayout);
        AddOrganizationLayout.setHorizontalGroup(
            AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddnewOrganizationbtnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddOrganizationId)
                    .addComponent(AddOrganizationName, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(MainMenubtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        AddOrganizationLayout.setVerticalGroup(
            AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrganizationLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(AddOrganizationId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AddOrganizationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddnewOrganizationbtnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainMenubtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SearchOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SearchMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HiddenLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(AddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SearchOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(SearchMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(HiddenLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(AddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchOrganizationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOrganizationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchOrganizationtxtActionPerformed

    private void Exitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exitbtn1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exitbtn1ActionPerformed

    private void Exitbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exitbtn2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exitbtn2ActionPerformed

    private void AdminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminUsernameActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
      Usernamelbl1.setText("") ;
      Passwordlbl.setText("") ;
      Wronglbl.setText("") ;           
        if(AdminUsername.getText().equalsIgnoreCase("admin") && AdminPassword.getText().equalsIgnoreCase("admin")){
        admin = true;
        MainMenu.setVisible(true);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganization.setVisible(false);
        AddOrganizationbtn.setVisible(true);
       }
       else{
               
                if(AdminUsername.getText().isEmpty() ){
                Usernamelbl1.setText("please fill the Username") ;
                }
                if (AdminPassword.getText().isEmpty()){
                Passwordlbl.setText("please fill the Password") ;
                }
                if(!AdminUsername.getText().isEmpty() ||!AdminPassword.getText().isEmpty()){
                Wronglbl.setText("Wrong Password or Username") ;           
                }
       }
      
       
           
         
       
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void LoginbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginbtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginbtnKeyPressed

    private void SearchOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOrganizationbtnActionPerformed
      if (SearchOrganizationtxt.getText().equalsIgnoreCase("Operation Admin"))
      {
      MainMenu.setVisible(false);
      HiddenLogin.setVisible(true);
      SearchOrganization.setVisible(false);
      SearchMember.setVisible(false);
      AddOrganization.setVisible(false);
      }
      else{    
      MainMenu.setVisible(false);
      HiddenLogin.setVisible(false);
      SearchOrganization.setVisible(true);
      SearchMember.setVisible(false);
      AddOrganization.setVisible(false);
      }
    }//GEN-LAST:event_SearchOrganizationbtnActionPerformed

    private void BackMenubtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenubtn1ActionPerformed
       if(admin = false){
        MainMenu.setVisible(true);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganizationbtn.setVisible(false);
        AddOrganization.setVisible(false);
       }
       else if (admin = true){
        MainMenu.setVisible(true);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganizationbtn.setVisible(false);
       }
    }//GEN-LAST:event_BackMenubtn1ActionPerformed

    private void SeachMemberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeachMemberbtnActionPerformed
        if(admin = false){
        MainMenu.setVisible(false);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(true);
        EditMember.setVisible(false);
        AddOrganization.setVisible(false);
        }
        else if(admin = true){
        MainMenu.setVisible(false);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(true);
        EditMember.setVisible(true);    
        AddOrganization.setVisible(false);
        }
    }//GEN-LAST:event_SeachMemberbtnActionPerformed

    private void AddOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationbtnActionPerformed
        MainMenu.setVisible(false);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganization.setVisible(true);
    }//GEN-LAST:event_AddOrganizationbtnActionPerformed

    private void MainMenubtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenubtn4ActionPerformed
        MainMenu.setVisible(true);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganizationbtn.setVisible(true);
    }//GEN-LAST:event_MainMenubtn4ActionPerformed

    private void AddnewOrganizationbtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewOrganizationbtnsaveActionPerformed
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\albert cahyawan\\Desktop\\Organization.txt",true)));

            out.println(AddOrganizationId.getText());
            out.println(AddOrganizationName.getText());

            AddOrganizationId.setText("");
            AddOrganizationName.setText("");

            JOptionPane.showMessageDialog(null, "Save Data Successful!");

            out.close();

        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_AddnewOrganizationbtnsaveActionPerformed

    private void AddOrganizationNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationNameActionPerformed

    private void AddOrganizationIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationIdActionPerformed

    private void AdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPasswordActionPerformed

    private void EditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditMemberActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(admin = false){
            MainMenu.setVisible(true);
            HiddenLogin.setVisible(false);
            SearchOrganization.setVisible(false);
            SearchMember.setVisible(false);
            AddOrganizationbtn.setVisible(false);
            AddOrganization.setVisible(false);
        }
        else if (admin = true){
            MainMenu.setVisible(true);
            HiddenLogin.setVisible(false);
            SearchOrganization.setVisible(false);
            SearchMember.setVisible(false);
            AddOrganizationbtn.setVisible(false);
            AddOrganization.setVisible(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Exitbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exitbtn3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Exitbtn3ActionPerformed

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
            java.util.logging.Logger.getLogger(NgoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NgoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NgoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NgoGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NgoGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddOrganization;
    private javax.swing.JTextField AddOrganizationId;
    private javax.swing.JTextField AddOrganizationName;
    private javax.swing.JButton AddOrganizationbtn;
    private javax.swing.JButton AddnewOrganizationbtnsave;
    private javax.swing.JPasswordField AdminPassword;
    private javax.swing.JTextField AdminUsername;
    private javax.swing.JButton BackMenubtn1;
    private javax.swing.JButton EditMember;
    private javax.swing.JButton Exitbtn1;
    private javax.swing.JButton Exitbtn2;
    private javax.swing.JButton Exitbtn3;
    private javax.swing.JPanel HiddenLogin;
    private javax.swing.JPanel Hiddeneditmember;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton MainMenubtn4;
    private javax.swing.JLabel MemberAddresslbl;
    private javax.swing.JLabel MemberAddresslbl1;
    private javax.swing.JLabel MemberEmaillbl;
    private javax.swing.JLabel MemberEmaillbl1;
    private javax.swing.JLabel MemberHomelbl;
    private javax.swing.JLabel MemberHomelbl1;
    private javax.swing.JLabel MemberIdlbl;
    private javax.swing.JLabel MemberIdlbl1;
    private javax.swing.JLabel MemberNamelbl;
    private javax.swing.JLabel MemberNamelbl1;
    private javax.swing.JLabel MemberPhonelbl;
    private javax.swing.JLabel MemberPhonelbl1;
    private javax.swing.JLabel OrganizationAdresslbl;
    private javax.swing.JLabel OrganizationEmaillbl;
    private javax.swing.JLabel OrganizationIdlbl;
    private javax.swing.JLabel OrganizationNamelbl;
    private javax.swing.JLabel OrganiztionContactlb;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JButton SeachMemberbtn;
    private javax.swing.JScrollPane Search;
    private javax.swing.JPanel SearchMember;
    private javax.swing.JTextField SearchMembertxt;
    private javax.swing.JPanel SearchOrganization;
    private javax.swing.JButton SearchOrganizationbtn;
    private javax.swing.JTextField SearchOrganizationtxt;
    private javax.swing.JLabel Usernamelbl1;
    private javax.swing.JLabel Wronglbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
