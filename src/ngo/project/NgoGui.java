package ngo.project;
import java.awt.Color;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.*;
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
    String TempName ;
    String TempId;
    String TempOrganizationId;
    String TempOrganizationName;
    String AddOrganizationNamesearch;
    String ageSearchAddOrganizationIdsearch; 
    String searchString;
    boolean Find;
    boolean Login = false;
    boolean adminauthorization = true;
    boolean NewOrganization = true;
    boolean EditOrganization = false;
    Authorization AdminAuthorization = new Authorization (adminauthorization,Login,NewOrganization,EditOrganization,Find);
    public NgoGui() throws IOException  {
        initComponents();
        Maketxtfile();
        Blacklist();
        showallorganization();
        DeleteFile();
        MainMenu.setVisible(true);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganization.setVisible(false);
        AddOrganizationbtn.setVisible(false);
        AddMember.setVisible(false);
        AddAdmin.setVisible(false);
        AddAdminbtn1.setVisible(false);
        Logoutbtn.setVisible(false);

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainMenu = new javax.swing.JPanel();
        SearchOrganizationbtn = new javax.swing.JButton();
        Searchpn = new javax.swing.JScrollPane();
        SearchOrganizationlist = new javax.swing.JTextArea();
        SearchOrganizationtxt = new javax.swing.JTextField();
        Exitbtn1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        AddOrganizationbtn = new javax.swing.JButton();
        AddAdminbtn1 = new javax.swing.JButton();
        Logoutbtn = new javax.swing.JButton();
        SearchOrganization = new javax.swing.JPanel();
        Exitbtn2 = new javax.swing.JButton();
        BackMenubtn1 = new javax.swing.JButton();
        SeachMemberbtn = new javax.swing.JButton();
        SearchMembertxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemberList = new javax.swing.JTextArea();
        DeleteOrganizationbtn = new javax.swing.JButton();
        EditOrganizationbtn = new javax.swing.JButton();
        AddMemberbtn = new javax.swing.JButton();
        OrganizationNameTxt = new javax.swing.JTextField();
        OrganizationIdTxt = new javax.swing.JTextField();
        OrganizationAddressTxt = new javax.swing.JTextField();
        OrganizationEmailTxt = new javax.swing.JTextField();
        OrganizationContactTxt = new javax.swing.JTextField();
        OrganizationChairpersonTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        SearchMemberlbl = new javax.swing.JLabel();
        SearchMember = new javax.swing.JPanel();
        MemberNamelbl = new javax.swing.JLabel();
        MemberIdlbl = new javax.swing.JLabel();
        MemberAddresslbl = new javax.swing.JLabel();
        MemberEmaillbl = new javax.swing.JLabel();
        MemberHomelbl = new javax.swing.JLabel();
        MemberPhonelbl = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Hiddeneditmember = new javax.swing.JPanel();
        MemberFirstNameTxt = new javax.swing.JTextField();
        MemberEmailTxt = new javax.swing.JTextField();
        MemberIdTxt = new javax.swing.JTextField();
        MemberAddressTxt = new javax.swing.JTextField();
        MemberPhoneTxt = new javax.swing.JTextField();
        MemberHomenumberTxt = new javax.swing.JTextField();
        Returnbtn = new javax.swing.JButton();
        Memberbirthdatelbl1 = new javax.swing.JLabel();
        MemberBirthDateTxt = new javax.swing.JTextField();
        Membergenderlbl1 = new javax.swing.JLabel();
        MemberGenderTxt = new javax.swing.JTextField();
        EditMember = new javax.swing.JButton();
        MemberPhonelbl2 = new javax.swing.JLabel();
        MemberPositionTxt = new javax.swing.JTextField();
        MemberNamelbl1 = new javax.swing.JLabel();
        MemberLastNameTxt = new javax.swing.JTextField();
        HiddenLogin = new javax.swing.JPanel();
        AdminUsername = new javax.swing.JTextField();
        AdminPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Loginbtn = new javax.swing.JButton();
        Passwordlbl = new javax.swing.JLabel();
        Usernamelbl1 = new javax.swing.JLabel();
        Wronglbl = new javax.swing.JLabel();
        BackMenubtn3 = new javax.swing.JButton();
        AddMember = new javax.swing.JPanel();
        MemberFirsyNamelbl1 = new javax.swing.JLabel();
        MemberIdlbl1 = new javax.swing.JLabel();
        MemberAddresslbl1 = new javax.swing.JLabel();
        MemberEmaillbl1 = new javax.swing.JLabel();
        MemberPhonelbl1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        AddMemberLastNametxt = new javax.swing.JTextField();
        AddMemberEmailtxt = new javax.swing.JTextField();
        AddMemberFirstNametxt = new javax.swing.JTextField();
        AddMemberAddresstxt = new javax.swing.JTextField();
        AddMemberPhonetxt = new javax.swing.JTextField();
        AddMemberHomenumbertxt = new javax.swing.JTextField();
        Returnbtn1 = new javax.swing.JButton();
        Addmember = new javax.swing.JButton();
        MemberHomelbl1 = new javax.swing.JLabel();
        Membergenderlbl = new javax.swing.JLabel();
        Memberbirthdatelbl = new javax.swing.JLabel();
        AddMemberGendertxt = new javax.swing.JTextField();
        AddMemberBirthdatetxt = new javax.swing.JTextField();
        MemberAddresslbl2 = new javax.swing.JLabel();
        AddMemberPositiontxt = new javax.swing.JTextField();
        AddMemberFirstNamelbl = new javax.swing.JLabel();
        AddMemberPositionlbl = new javax.swing.JLabel();
        AddMemberPhonelbl = new javax.swing.JLabel();
        AddMemberHomelbl = new javax.swing.JLabel();
        AddMemberGenderlbl = new javax.swing.JLabel();
        AddMemberBirthDatelbl = new javax.swing.JLabel();
        AddMemberLastNamelbl = new javax.swing.JLabel();
        AddMemberEmaillbl = new javax.swing.JLabel();
        AddMemberAddresslbl = new javax.swing.JLabel();
        AddOrganization = new javax.swing.JPanel();
        AddnewOrganizationbtnsave = new javax.swing.JButton();
        MainMenubtn4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AddOrganizationNametxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AddOrganizationContacttxt = new javax.swing.JTextField();
        AddOrganizationChairpersontxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AddOrganizationEmailtxt = new javax.swing.JTextField();
        OrganizationNamelbl = new javax.swing.JLabel();
        OrganizationContactlbl = new javax.swing.JLabel();
        OrganizationChairpersonlbl = new javax.swing.JLabel();
        OrganizationAddressProvincelbl = new javax.swing.JLabel();
        OrganizationEmaillbl = new javax.swing.JLabel();
        AddOrganizationAddressCitytxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        AddOrganizationAddressProvincetxt = new javax.swing.JTextField();
        AddOrganizationAddressPostcodetxt = new javax.swing.JTextField();
        AddOrganizationAddressStreettxt = new javax.swing.JTextField();
        OrganizationAddressPostcodelbl = new javax.swing.JLabel();
        OrganizationAddressCitylbl = new javax.swing.JLabel();
        OrganizationAddressStreetlbl = new javax.swing.JLabel();
        AddAdmin = new javax.swing.JPanel();
        AddAdminbtn = new javax.swing.JButton();
        AdminUsernametxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AdminUsernamelbl = new javax.swing.JLabel();
        AdminPasswordlbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AdminRetypePasswordlbl = new javax.swing.JLabel();
        AdminPasswordtxt = new javax.swing.JPasswordField();
        AdminRetypePasswordtxt = new javax.swing.JPasswordField();
        BackMenubtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchOrganizationbtn.setText("Search Organization");
        SearchOrganizationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchOrganizationbtnActionPerformed(evt);
            }
        });

        SearchOrganizationlist.setColumns(20);
        SearchOrganizationlist.setRows(5);
        Searchpn.setViewportView(SearchOrganizationlist);

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

        AddAdminbtn1.setText("Add Admin");
        AddAdminbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAdminbtn1ActionPerformed(evt);
            }
        });

        Logoutbtn.setText("LogOut");
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Searchpn)
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddAdminbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exitbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                        .addComponent(SearchOrganizationbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchOrganizationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchOrganizationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchOrganizationbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Searchpn, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddAdminbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Exitbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

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

        SeachMemberbtn.setText("Search Member");
        SeachMemberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeachMemberbtnActionPerformed(evt);
            }
        });

        SearchMembertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMembertxtActionPerformed(evt);
            }
        });

        MemberList.setColumns(20);
        MemberList.setRows(5);
        jScrollPane1.setViewportView(MemberList);

        DeleteOrganizationbtn.setText("Delete");
        DeleteOrganizationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteOrganizationbtnActionPerformed(evt);
            }
        });

        EditOrganizationbtn.setText("Edit");
        EditOrganizationbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditOrganizationbtnActionPerformed(evt);
            }
        });

        AddMemberbtn.setText("Add");
        AddMemberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberbtnActionPerformed(evt);
            }
        });

        OrganizationNameTxt.setText("Organization Name");
        OrganizationNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationNameTxtActionPerformed(evt);
            }
        });

        OrganizationIdTxt.setText("Organization ID");

        OrganizationAddressTxt.setText("Address");

        OrganizationEmailTxt.setText("Email:");
        OrganizationEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationEmailTxtActionPerformed(evt);
            }
        });

        OrganizationContactTxt.setText("Contact number:");
        OrganizationContactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationContactTxtActionPerformed(evt);
            }
        });

        OrganizationChairpersonTxt.setText("Organization Chairperson");

        jLabel4.setText("Organization ID:");

        jLabel13.setText("Organization Name:");

        jLabel18.setText("Chairperson:");

        jLabel19.setText("Email:");

        jLabel20.setText("Contact:");

        jLabel21.setText("Address");

        javax.swing.GroupLayout SearchOrganizationLayout = new javax.swing.GroupLayout(SearchOrganization);
        SearchOrganization.setLayout(SearchOrganizationLayout);
        SearchOrganizationLayout.setHorizontalGroup(
            SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                                .addComponent(OrganizationIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrganizationNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jLabel18))
                            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OrganizationChairpersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SeachMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SearchMemberlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                                .addComponent(SearchMembertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SearchOrganizationLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(OrganizationEmailTxt))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SearchOrganizationLayout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OrganizationContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(OrganizationAddressTxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BackMenubtn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeleteOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Exitbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SearchOrganizationLayout.setVerticalGroup(
            SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(SeachMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchMembertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrganizationNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationChairpersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(SearchMemberlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(11, 11, 11)
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addComponent(OrganizationAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrganizationEmailTxt)))
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Exitbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BackMenubtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DeleteOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        MemberNamelbl.setText("Member LastName");

        MemberIdlbl.setText("Member Id");

        MemberAddresslbl.setText("Address");

        MemberEmaillbl.setText("Email");

        MemberHomelbl.setText("Home number");

        MemberPhonelbl.setText("Phone number");

        jButton3.setText("Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HiddeneditmemberLayout = new javax.swing.GroupLayout(Hiddeneditmember);
        Hiddeneditmember.setLayout(HiddeneditmemberLayout);
        HiddeneditmemberLayout.setHorizontalGroup(
            HiddeneditmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HiddeneditmemberLayout.setVerticalGroup(
            HiddeneditmemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MemberFirstNameTxt.setText("FirstName");
        MemberFirstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberFirstNameTxtActionPerformed(evt);
            }
        });

        MemberEmailTxt.setText("Email");

        MemberIdTxt.setText("Id");

        MemberAddressTxt.setText("Address");

        MemberPhoneTxt.setText("Phone");
        MemberPhoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberPhoneTxtActionPerformed(evt);
            }
        });

        MemberHomenumberTxt.setText("Home");
        MemberHomenumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberHomenumberTxtActionPerformed(evt);
            }
        });

        Returnbtn.setText("Return");
        Returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnbtnActionPerformed(evt);
            }
        });

        Memberbirthdatelbl1.setText("Birthdate");

        MemberBirthDateTxt.setText("Birthdate");
        MemberBirthDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberBirthDateTxtActionPerformed(evt);
            }
        });

        Membergenderlbl1.setText("Gender");

        MemberGenderTxt.setText("Gender");
        MemberGenderTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberGenderTxtActionPerformed(evt);
            }
        });

        EditMember.setText("Edit Member");
        EditMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMemberActionPerformed(evt);
            }
        });

        MemberPhonelbl2.setText("Position");

        MemberPositionTxt.setText("Position");
        MemberPositionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberPositionTxtActionPerformed(evt);
            }
        });

        MemberNamelbl1.setText("Member LastName");

        MemberLastNameTxt.setText("LastName");
        MemberLastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberLastNameTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SearchMemberLayout = new javax.swing.GroupLayout(SearchMember);
        SearchMember.setLayout(SearchMemberLayout);
        SearchMemberLayout.setHorizontalGroup(
            SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchMemberLayout.createSequentialGroup()
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hiddeneditmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SearchMemberLayout.createSequentialGroup()
                                .addComponent(EditMember, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Returnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SearchMemberLayout.createSequentialGroup()
                                .addComponent(MemberPhonelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MemberPositionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(MemberNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberFirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(MemberPhonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(Membergenderlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(MemberIdlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(MemberHomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberHomenumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(Memberbirthdatelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberBirthDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(MemberAddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(MemberEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SearchMemberLayout.createSequentialGroup()
                                    .addComponent(MemberNamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(MemberLastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SearchMemberLayout.setVerticalGroup(
            SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberFirstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberNamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberLastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberIdlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Membergenderlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Memberbirthdatelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberBirthDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberAddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(MemberEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MemberHomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberHomenumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(MemberEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemberPhonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemberPhonelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberPositionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditMember, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Returnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Hiddeneditmember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LoginbtnKeyTyped(evt);
            }
        });

        Passwordlbl.setForeground(new java.awt.Color(255, 0, 0));

        Usernamelbl1.setForeground(new java.awt.Color(255, 0, 0));

        Wronglbl.setForeground(new java.awt.Color(255, 0, 0));

        BackMenubtn3.setText("Main Menu");
        BackMenubtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenubtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HiddenLoginLayout = new javax.swing.GroupLayout(HiddenLogin);
        HiddenLogin.setLayout(HiddenLoginLayout);
        HiddenLoginLayout.setHorizontalGroup(
            HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HiddenLoginLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(HiddenLoginLayout.createSequentialGroup()
                        .addComponent(Loginbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Wronglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Passwordlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Usernamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HiddenLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackMenubtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HiddenLoginLayout.setVerticalGroup(
            HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HiddenLoginLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HiddenLoginLayout.createSequentialGroup()
                        .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(HiddenLoginLayout.createSequentialGroup()
                        .addComponent(Usernamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Passwordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Loginbtn)
                    .addComponent(Wronglbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackMenubtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        Passwordlbl.getAccessibleContext().setAccessibleName("Usernamelbl");

        MemberFirsyNamelbl1.setText("Member FirstName");

        MemberIdlbl1.setText("Member LastName");

        MemberAddresslbl1.setText("Address");

        MemberEmaillbl1.setText("Email");

        MemberPhonelbl1.setText("Phone number");

        jButton4.setText("Main Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        AddMemberLastNametxt.setText("LastName");
        AddMemberLastNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberLastNametxtActionPerformed(evt);
            }
        });

        AddMemberEmailtxt.setText("Email");

        AddMemberFirstNametxt.setText("Firstname");
        AddMemberFirstNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberFirstNametxtActionPerformed(evt);
            }
        });

        AddMemberAddresstxt.setText("Address");

        AddMemberPhonetxt.setText("Phone");
        AddMemberPhonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberPhonetxtActionPerformed(evt);
            }
        });

        AddMemberHomenumbertxt.setText("Home");
        AddMemberHomenumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberHomenumbertxtActionPerformed(evt);
            }
        });

        Returnbtn1.setText("Return");
        Returnbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Returnbtn1ActionPerformed(evt);
            }
        });

        Addmember.setText("Add");
        Addmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddmemberActionPerformed(evt);
            }
        });

        MemberHomelbl1.setText("Home number");

        Membergenderlbl.setText("Gender");

        Memberbirthdatelbl.setText("Birthdate");

        AddMemberGendertxt.setText("Gender");
        AddMemberGendertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberGendertxtActionPerformed(evt);
            }
        });

        AddMemberBirthdatetxt.setText("Birthdate");
        AddMemberBirthdatetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberBirthdatetxtActionPerformed(evt);
            }
        });

        MemberAddresslbl2.setText("Position");

        AddMemberPositiontxt.setText("Position");
        AddMemberPositiontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberPositiontxtActionPerformed(evt);
            }
        });

        AddMemberFirstNamelbl.setForeground(new java.awt.Color(255, 0, 0));

        AddMemberPositionlbl.setForeground(new java.awt.Color(255, 0, 0));

        AddMemberPhonelbl.setForeground(new java.awt.Color(255, 0, 0));

        AddMemberHomelbl.setForeground(new java.awt.Color(255, 0, 0));

        AddMemberGenderlbl.setForeground(new java.awt.Color(255, 0, 0));

        AddMemberBirthDatelbl.setForeground(new java.awt.Color(255, 0, 0));

        AddMemberLastNamelbl.setForeground(new java.awt.Color(255, 0, 0));

        AddMemberEmaillbl.setForeground(new java.awt.Color(255, 0, 0));

        AddMemberAddresslbl.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout AddMemberLayout = new javax.swing.GroupLayout(AddMember);
        AddMember.setLayout(AddMemberLayout);
        AddMemberLayout.setHorizontalGroup(
            AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddMemberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addComponent(MemberIdlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddMemberLastNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddMemberLastNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addComponent(MemberFirsyNamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(AddMemberFirstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddMemberFirstNamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addComponent(Membergenderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddMemberGendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddMemberGenderlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AddMemberLayout.createSequentialGroup()
                                .addComponent(MemberAddresslbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddMemberPositiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddMemberLayout.createSequentialGroup()
                                .addComponent(MemberHomelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddMemberHomenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddMemberLayout.createSequentialGroup()
                                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Memberbirthdatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MemberEmaillbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddMemberBirthdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddMemberEmailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AddMemberLayout.createSequentialGroup()
                                .addComponent(MemberPhonelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddMemberPhonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddMemberEmaillbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddMemberPhonelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddMemberLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(AddMemberPositionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddMemberHomelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddMemberBirthDatelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddMemberLayout.createSequentialGroup()
                                .addComponent(MemberAddresslbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddMemberAddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddMemberLayout.createSequentialGroup()
                                .addComponent(Addmember, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddMemberAddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Returnbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        AddMemberLayout.setVerticalGroup(
            AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddMemberFirstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberFirsyNamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMemberFirstNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddMemberLastNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMemberLastNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberIdlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Membergenderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMemberGendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMemberGenderlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addComponent(AddMemberBirthDatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddMemberEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddMemberBirthdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Memberbirthdatelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MemberEmaillbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddMemberEmailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MemberHomelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddMemberHomenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddMemberHomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MemberPhonelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddMemberPhonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddMemberPhonetxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddMemberPositionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberAddresslbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMemberPositiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(AddMemberAddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddMemberAddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberAddresslbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Addmember, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Returnbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

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

        AddOrganizationNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationNametxtActionPerformed(evt);
            }
        });

        jLabel9.setText("Contact number");

        jLabel10.setText("Chairperson");

        jLabel11.setText("Address");

        AddOrganizationContacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationContacttxtActionPerformed(evt);
            }
        });

        AddOrganizationChairpersontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationChairpersontxtActionPerformed(evt);
            }
        });

        jLabel12.setText("Email");

        AddOrganizationEmailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationEmailtxtActionPerformed(evt);
            }
        });

        OrganizationNamelbl.setForeground(new java.awt.Color(255, 0, 0));

        OrganizationContactlbl.setForeground(new java.awt.Color(255, 0, 0));

        OrganizationChairpersonlbl.setForeground(new java.awt.Color(255, 0, 0));

        OrganizationAddressProvincelbl.setForeground(new java.awt.Color(255, 0, 0));

        OrganizationEmaillbl.setForeground(new java.awt.Color(255, 0, 0));

        AddOrganizationAddressCitytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationAddressCitytxtActionPerformed(evt);
            }
        });

        jLabel14.setText("City");

        jLabel15.setText("Province");

        jLabel16.setText("Postcode");

        jLabel17.setText("Street Name");

        AddOrganizationAddressProvincetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationAddressProvincetxtActionPerformed(evt);
            }
        });

        AddOrganizationAddressPostcodetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationAddressPostcodetxtActionPerformed(evt);
            }
        });

        AddOrganizationAddressStreettxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationAddressStreettxtActionPerformed(evt);
            }
        });

        OrganizationAddressPostcodelbl.setForeground(new java.awt.Color(255, 0, 0));

        OrganizationAddressCitylbl.setForeground(new java.awt.Color(255, 0, 0));

        OrganizationAddressStreetlbl.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout AddOrganizationLayout = new javax.swing.GroupLayout(AddOrganization);
        AddOrganization.setLayout(AddOrganizationLayout);
        AddOrganizationLayout.setHorizontalGroup(
            AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddOrganizationLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(AddOrganizationNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddOrganizationLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddOrganizationChairpersontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddOrganizationContacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddOrganizationEmailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddOrganizationAddressCitytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrganizationNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrganizationContactlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrganizationEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrganizationChairpersonlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrganizationAddressCitylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddOrganizationLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(AddOrganizationAddressPostcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrganizationAddressPostcodelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddOrganizationLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                                        .addComponent(AddOrganizationAddressStreettxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OrganizationAddressStreetlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                                        .addComponent(AddOrganizationAddressProvincetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OrganizationAddressProvincelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddOrganizationLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(MainMenubtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddnewOrganizationbtnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        AddOrganizationLayout.setVerticalGroup(
            AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrganizationLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrganizationNamelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddOrganizationContacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addComponent(OrganizationContactlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrganizationEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(AddOrganizationChairpersontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrganizationChairpersonlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(AddOrganizationEmailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(AddOrganizationNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddOrganizationAddressCitytxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(AddOrganizationAddressProvincetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddOrganizationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddOrganizationLayout.createSequentialGroup()
                        .addComponent(OrganizationAddressCitylbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrganizationAddressProvincelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddOrganizationAddressStreettxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationAddressStreetlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddOrganizationAddressPostcodetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(OrganizationAddressPostcodelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddnewOrganizationbtnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainMenubtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        AddAdminbtn.setText("Add");
        AddAdminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAdminbtnActionPerformed(evt);
            }
        });

        AdminUsernametxt.setText("UserName");
        AdminUsernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminUsernametxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Admin Username");

        jLabel7.setText("Admin Password");

        AdminUsernamelbl.setForeground(new java.awt.Color(255, 0, 0));

        AdminPasswordlbl.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setText("Retype Password");

        AdminRetypePasswordlbl.setForeground(new java.awt.Color(255, 0, 0));

        BackMenubtn2.setText("Main Menu");
        BackMenubtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenubtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddAdminLayout = new javax.swing.GroupLayout(AddAdmin);
        AddAdmin.setLayout(AddAdminLayout);
        AddAdminLayout.setHorizontalGroup(
            AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAdminLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(AddAdminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addComponent(AdminRetypePasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AdminRetypePasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(BackMenubtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AdminPasswordtxt)
                            .addComponent(AdminUsernametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdminPasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminUsernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        AddAdminLayout.setVerticalGroup(
            AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAdminLayout.createSequentialGroup()
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminUsernametxt)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddAdminLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(AdminUsernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdminPasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdminPasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminRetypePasswordtxt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addComponent(AdminRetypePasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackMenubtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddAdminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HiddenLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SearchOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SearchMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(HiddenLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void DeleteFile(){
     String Delete;
     try{
     BufferedReader BrD = new BufferedReader(new FileReader("C:\\NGO Project\\Delete.txt"));
     while((Delete = BrD.readLine())!=null){ 
     File fdelete = new File("C:\\NGO Project\\"+Delete+".txt");
     fdelete.delete();
     }
     BrD.close();
     BufferedWriter EraseFile = new BufferedWriter(new FileWriter("C:\\NGO Project\\Delete.txt"));
     EraseFile.close();
     }  catch (FileNotFoundException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    private void showallorganization(){
        String searchString = "";
        String Id;
     SearchOrganizationlist.setText("Organization Name \t\t\t Organization ID \n");
        try {
            BufferedReader brs = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
            while((Id = brs.readLine()) != null){
                        searchString += ("Id:"+Id+"\nName :"+brs.readLine()+"\n\n");
                        SearchOrganizationlist.setText(searchString);
                    }
             }   catch (FileNotFoundException ex) {       
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }       
}
    private void FindingOrganization() throws IOException{
        String Name;
        String  repeat = "";
        try{
             BufferedReader bro = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
                while((AddOrganizationNamesearch = bro.readLine())!= null){
                    Name = bro.readLine();
                if ((AddOrganizationNamesearch.equalsIgnoreCase(SearchOrganizationtxt.getText()))||(Name.equalsIgnoreCase(SearchOrganizationtxt.getText()))){  
                  BufferedReader BrOM = new BufferedReader(new FileReader("C:\\NGO Project\\"+Name+".txt"));
                  OrganizationIdTxt.setText(BrOM.readLine());
                  OrganizationNameTxt.setText(BrOM.readLine());
                  OrganizationContactTxt.setText(BrOM.readLine());
                  OrganizationChairpersonTxt.setText(BrOM.readLine());
                  OrganizationEmailTxt.setText(BrOM.readLine());
                  OrganizationAddressTxt.setText(BrOM.readLine());
                  while((Name = BrOM.readLine())!=null){
                  repeat +=("ID:"+Name+"\n"+
                            "Name:"+BrOM.readLine()+" "+BrOM.readLine()+"\n\n");
                  BrOM.readLine();
                  BrOM.readLine();
                  BrOM.readLine();
                  BrOM.readLine();
                  BrOM.readLine();
                  BrOM.readLine();
                  BrOM.readLine();
                  MemberList.setText(repeat);
                }  
                Find = true;
                break;  
                }else{
                    Find = false;
                } 
                }
            }catch (FileNotFoundException ex) {       
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }
       private void FindMember() throws IOException{
        String Id;
        String FirstName;
        String LastName;
        Find = false;
        try{
            BufferedReader BrFM = new BufferedReader(new FileReader("C:\\NGO Project\\"+OrganizationNameTxt.getText()+".txt"));
            BrFM.readLine();
            BrFM.readLine();
            BrFM.readLine();
            BrFM.readLine();
            BrFM.readLine();
            BrFM.readLine();
             while((Id = BrFM.readLine())!= null){
                 FirstName = BrFM.readLine();
                 LastName = BrFM.readLine();
                if (Id.equalsIgnoreCase(SearchMembertxt.getText())||LastName.equalsIgnoreCase(SearchMembertxt.getText())||FirstName.equalsIgnoreCase(SearchMembertxt.getText())){ 
                  MemberIdTxt.setText(Id);
                  MemberFirstNameTxt.setText(FirstName);
                  MemberLastNameTxt.setText(LastName);
                  MemberGenderTxt.setText(BrFM.readLine());
                  MemberBirthDateTxt.setText(BrFM.readLine());
                  MemberEmailTxt.setText(BrFM.readLine());
                  MemberPhoneTxt.setText(BrFM.readLine());
                  MemberHomenumberTxt.setText(BrFM.readLine());
                  MemberAddressTxt.setText(BrFM.readLine());
                  MemberPositionTxt.setText(BrFM.readLine());
                  Find = true;
                  break;
                  }
                else{
                    BrFM.readLine();
                    BrFM.readLine();
                    BrFM.readLine();
                    BrFM.readLine();
                    BrFM.readLine();
                    BrFM.readLine();
                    BrFM.readLine();
                    Find = false;
                }
                }
             if(Find == false){     
            JOptionPane.showMessageDialog(null, "Member are not found");
            }
            }catch (FileNotFoundException ex) {       
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }


    private void Backtomainmenu(){
        showallorganization();
        if(adminauthorization == false){
            MainMenu.setVisible(true);
            HiddenLogin.setVisible(false);
            SearchOrganization.setVisible(false);
            SearchMember.setVisible(false);
            AddOrganizationbtn.setVisible(false);
            AddOrganization.setVisible(false);
            AddMember.setVisible(false);
            AddAdmin.setVisible(false);
            AddAdminbtn1.setVisible(false);
            Logoutbtn.setVisible(false);
        }
        else if (adminauthorization == true){
            MainMenu.setVisible(true);
            HiddenLogin.setVisible(false);
            SearchOrganization.setVisible(false);
            SearchMember.setVisible(false);
            AddOrganization.setVisible(false);
            AddMember.setVisible(false);
            AddAdmin.setVisible(false);
            AddOrganizationbtn.setVisible(true);
            AddAdminbtn1.setVisible(true);
            Logoutbtn.setVisible(true);
        }
    }
    
    private void Blacklist(){
        OrganizationIdTxt.setEditable(false);
        OrganizationNameTxt.setEditable(false);
        OrganizationEmailTxt.setEditable(false);
        OrganizationContactTxt.setEditable(false);
        OrganizationAddressTxt.setEditable(false);
        OrganizationChairpersonTxt.setEditable(false);
        
        MemberIdTxt.setEditable(false);
        MemberFirstNameTxt.setEditable(false);
        MemberAddressTxt.setEditable(false);
        MemberEmailTxt.setEditable(false);
        MemberPhoneTxt.setEditable(false);
        MemberHomenumberTxt.setEditable(false);
        
        MemberList.setEditable(false);
        SearchOrganizationlist.setEditable(false);
    }
    private void Whitelist(){
        OrganizationIdTxt.setEditable(true);
        OrganizationNameTxt.setEditable(true);
        OrganizationEmailTxt.setEditable(true);
        OrganizationContactTxt.setEditable(true);
        OrganizationAddressTxt.setEditable(true);
        OrganizationChairpersonTxt.setEditable(true);
        
        MemberIdTxt.setEditable(true);
        MemberFirstNameTxt.setEditable(true);
        MemberAddressTxt.setEditable(true);
        MemberEmailTxt.setEditable(true);
        MemberPhoneTxt.setEditable(true);
        MemberHomenumberTxt.setEditable(true);
    }
    private void SearchOrganizationtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOrganizationtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchOrganizationtxtActionPerformed

    private void Exitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exitbtn1ActionPerformed
        DeleteFile();
        System.exit(0);
    }//GEN-LAST:event_Exitbtn1ActionPerformed

    private void AdminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminUsernameActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
      String Username;
      String Password;
      int count = 0;
      Usernamelbl1.setText("") ;
      Passwordlbl.setText("") ;
      Wronglbl.setText("") ;
   
        
        try {
               BufferedReader BrA = new BufferedReader(new FileReader("C:\\NGO Project\\NgoAdmin.txt"));
            while ((Username = BrA.readLine())!= null){
            count++;    
            Password = BrA.readLine();
            if((AdminUsername.getText().equalsIgnoreCase(Username)) && (AdminPassword.getText().equalsIgnoreCase(Password))){
            Login = true;   
            break;
            }
        }
            
        }catch (FileNotFoundException ex) {
         Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (count == 0){
            Login = true;
        }
        if(Login == true){
        JOptionPane.showMessageDialog(null,"Login success");
        adminauthorization = true;
        MainMenu.setVisible(true);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganization.setVisible(false);
        AddOrganizationbtn.setVisible(true);
        AddMember.setVisible(false);
        AddAdmin.setVisible(false);
        AddAdminbtn1.setVisible(true);
        Logoutbtn.setVisible(false);
        Login = false;
       }
        else if (Login == false){
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
        
    }//GEN-LAST:event_LoginbtnKeyPressed
    
    private void Maketxtfile(){
        int count = 0;
        int count1 = 3;
        String Check;
        ArrayList<String> FileList = new ArrayList<String>();
        FileList.add("NgoAdmin.txt");
        FileList.add("Delete.txt");
        FileList.add("Organizationlist.txt");
        try{
        File dir = new File("C:\\NGO Project");
        if(!dir.exists()){   
            dir.mkdir();
        }
            while (count != count1 ){        
            BufferedWriter BwMTF = new BufferedWriter(new FileWriter("C:\\NGO Project\\"+FileList.get(count),true));
            BwMTF.close();
            count++; 
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void SearchOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchOrganizationbtnActionPerformed
      if (SearchOrganizationtxt.getText().equalsIgnoreCase("Operation Admin"))
      {
      if(adminauthorization == false){    
      MainMenu.setVisible(false);
      HiddenLogin.setVisible(true);
      SearchOrganization.setVisible(false);
      SearchMember.setVisible(false);
      AddOrganization.setVisible(false);
      }else{
          JOptionPane.showMessageDialog(null,"Please logout first");
      }
      }
      else{
          try {
              FindingOrganization();
              if ( Find == true){    
      if(adminauthorization == false){
      EditOrganizationbtn.setVisible(false);
      DeleteOrganizationbtn.setVisible(false);
      MainMenu.setVisible(false);
      HiddenLogin.setVisible(false);
      SearchOrganization.setVisible(true);
      SearchMember.setVisible(false);
      AddOrganization.setVisible(false);
      AddMember.setVisible(false);
      AddAdmin.setVisible(false);
      EditOrganizationbtn.setVisible(false);
      AddMemberbtn.setVisible(false);
      }else if (adminauthorization == true){
      MainMenu.setVisible(false);
      HiddenLogin.setVisible(false);
      SearchOrganization.setVisible(true);
      SearchMember.setVisible(false);
      AddOrganization.setVisible(false);
      AddMember.setVisible(false);
      AddAdmin.setVisible(false);
      EditOrganizationbtn.setVisible(true);
      AddMemberbtn.setVisible(true);
      DeleteOrganizationbtn.setVisible(true);
      }
      }else{
          JOptionPane.showMessageDialog(null,"Organization not found");
      }
      } catch (IOException ex) {
              Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
      }
      }
      
    }//GEN-LAST:event_SearchOrganizationbtnActionPerformed

    private void AddOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationbtnActionPerformed
        MainMenu.setVisible(false);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganization.setVisible(true);
        AddMember.setVisible(false);
        AddAdmin.setVisible(false);
    }//GEN-LAST:event_AddOrganizationbtnActionPerformed

    private void AdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPasswordActionPerformed

    private void EditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMemberActionPerformed
        String MemberName;
        int count = 0;
        int  count1 = 16;
        int countposition = 0;
        String Position;
        ArrayList<String> list = new ArrayList<String>();
        if (EditOrganization == false){
            JOptionPane.showMessageDialog(null, "Edit Mode");
            Whitelist();
            TempOrganizationName = MemberIdTxt.getText();
            EditOrganization = true; 
        }else if(EditOrganization == true){
           try {     
                   BufferedReader BrEO = new BufferedReader(new FileReader("C:\\NGO Project\\"+OrganizationNameTxt.getText()+".txt"));
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   while ((MemberName = BrEO.readLine())!= null){
                   if((TempOrganizationName.equalsIgnoreCase(MemberName))){
                   BrEO.readLine();
                   BrEO.readLine();
                   BrEO.readLine();
                   BrEO.readLine();
                   BrEO.readLine();
                   BrEO.readLine();
                   BrEO.readLine();
                   BrEO.readLine();
                   BrEO.readLine();
                   list.add(MemberIdTxt.getText());
                   list.add(MemberFirstNameTxt.getText());
                   list.add(MemberLastNameTxt.getText());
                   list.add(MemberGenderTxt.getText());
                   list.add(MemberBirthDateTxt.getText());
                   list.add(MemberEmailTxt.getText());
                   list.add(MemberPhoneTxt.getText());
                   list.add(MemberHomenumberTxt.getText());
                   list.add(MemberAddressTxt.getText());
                   list.add(MemberPositionTxt.getText());
                   }else
                   {
                   list.add(MemberName);
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   list.add(BrEO.readLine());
                   Position = BrEO.readLine();
                   if((countposition != 4)&&(!Position.equalsIgnoreCase("Member"))){
                   list.add(Position);
                   countposition++;
                   }else if((countposition == 4)&&(!MemberPositionTxt.getText().equalsIgnoreCase("Member"))){
                       JOptionPane.showMessageDialog(null,"There already 4 executive member");
                       break;
                   }else if(Position.equalsIgnoreCase("Member")){
                   list.add(Position);
                   }
                   count1 += 10;
                   }
                   }
                   BrEO.close();
                   BufferedWriter BwEOT= new BufferedWriter(new FileWriter("C:\\NGO Project\\"+OrganizationNameTxt.getText()+".txt"));
                   while (count != count1){
                   BwEOT.write(list.get(count));
                   BwEOT.newLine();
                   count++;
                   }
                   list.clear();
                   BwEOT.close();
                   EditOrganization = false;
                   Blacklist();
                   JOptionPane.showMessageDialog(null, "Edit Success");
        } catch (FileNotFoundException ex) {
                Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }                                                   
    }//GEN-LAST:event_EditMemberActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Backtomainmenu();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void LoginbtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginbtnKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginbtnKeyTyped

    private void MemberPhoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberPhoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberPhoneTxtActionPerformed

    private void MemberHomenumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberHomenumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberHomenumberTxtActionPerformed

    private void MemberFirstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberFirstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberFirstNameTxtActionPerformed

    private void AdminUsernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminUsernametxtActionPerformed

    }//GEN-LAST:event_AdminUsernametxtActionPerformed

    private void AddAdminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAdminbtnActionPerformed
                String Name;
                int found = 0;
                AdminUsernamelbl.setText("");
                AdminPasswordlbl.setText("");
                AdminRetypePasswordlbl.setText("");
        if((!AdminUsernametxt.getText().isEmpty()) && (!AdminPasswordtxt.getText().isEmpty()) && (AdminPasswordtxt.getText().equalsIgnoreCase(AdminRetypePasswordtxt.getText()) ) ){
            try{
             BufferedWriter BwAF = new BufferedWriter(new FileWriter("C:\\NGO Project\\NgoAdmin.txt",true));
             BwAF.close();
             BufferedReader BrNgoAdmin = new BufferedReader(new FileReader("C:\\NGO Project\\NgoAdmin.txt"));
             while ((Name = BrNgoAdmin.readLine())!= null && BrNgoAdmin != null){
                     BrNgoAdmin.readLine();   
                     if(Name.equalsIgnoreCase(AdminUsernametxt.getText())){
                         found = 1;
                     }
            }
             BrNgoAdmin.close();
             if (found == 0 ){
             PrintWriter PwNgoAdmin = new PrintWriter(new BufferedWriter(new FileWriter("C:\\NGO Project\\NgoAdmin.txt",true)));
             PwNgoAdmin.println(AdminUsernametxt.getText());
             PwNgoAdmin.println(AdminPasswordtxt.getText());
             AdminUsernametxt.setText("");
             AdminPasswordtxt.setText("");
             AdminRetypePasswordtxt.setText("");
             
             JOptionPane.showMessageDialog(null, "New Admin Created!");
             PwNgoAdmin.close();
            }else{
                 AdminUsernametxt.setText("");
                 JOptionPane.showMessageDialog(null, "This username has already been used");
             }
        }catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if(AdminUsernametxt.getText().isEmpty()){
                AdminUsernamelbl.setText("Please fill the Username");
            }
            if(AdminPasswordtxt.getText().isEmpty()){
                AdminPasswordlbl.setText("Please fill the Password");
            }
            if(!AdminPasswordtxt.getText().equalsIgnoreCase(AdminRetypePasswordtxt.getText())){
                AdminPasswordtxt.setText("");
                AdminRetypePasswordtxt.setText("");
                AdminRetypePasswordlbl.setText("Password inputed do not match");
            }
        }
    }//GEN-LAST:event_AddAdminbtnActionPerformed

    private void AddAdminbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAdminbtn1ActionPerformed
        MainMenu.setVisible(false);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganization.setVisible(false);
        AddOrganizationbtn.setVisible(false);
        AddMember.setVisible(false);
        AddAdmin.setVisible(true);
    }//GEN-LAST:event_AddAdminbtn1ActionPerformed

    private void BackMenubtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenubtn2ActionPerformed
        Backtomainmenu();
    }//GEN-LAST:event_BackMenubtn2ActionPerformed

    private void BackMenubtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenubtn3ActionPerformed
        Backtomainmenu();
    }//GEN-LAST:event_BackMenubtn3ActionPerformed

    private void ReturnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnbtnActionPerformed
        try {
            FindingOrganization();
        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }
      if(adminauthorization == false){
      MainMenu.setVisible(false);
      HiddenLogin.setVisible(false);
      SearchOrganization.setVisible(true);
      SearchMember.setVisible(false);
      AddOrganization.setVisible(false);
      AddMember.setVisible(false);
      AddAdmin.setVisible(false);
      EditOrganizationbtn.setVisible(false);
      AddMemberbtn.setVisible(false);
      EditOrganizationbtn.setVisible(false);
      DeleteOrganizationbtn.setVisible(false);
      }else if (adminauthorization == true){
      MainMenu.setVisible(false);
      HiddenLogin.setVisible(false);
      SearchOrganization.setVisible(true);
      SearchMember.setVisible(false);
      AddOrganization.setVisible(false);
      AddMember.setVisible(false);
      AddAdmin.setVisible(false);
      EditOrganizationbtn.setVisible(true);
      AddMemberbtn.setVisible(true);
      DeleteOrganizationbtn.setVisible(true);
        }
    }//GEN-LAST:event_ReturnbtnActionPerformed

    private void MemberBirthDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberBirthDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberBirthDateTxtActionPerformed

    private void MemberGenderTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberGenderTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberGenderTxtActionPerformed

    private void AddOrganizationAddressPostcodetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationAddressPostcodetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationAddressPostcodetxtActionPerformed

    private void AddOrganizationAddressProvincetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationAddressProvincetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationAddressProvincetxtActionPerformed

    private void AddOrganizationAddressCitytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationAddressCitytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationAddressCitytxtActionPerformed

    private void AddOrganizationEmailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationEmailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationEmailtxtActionPerformed

    private void AddOrganizationChairpersontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationChairpersontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationChairpersontxtActionPerformed

    private void AddOrganizationContacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationContacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationContacttxtActionPerformed

    private void AddOrganizationNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationNametxtActionPerformed

    private void MainMenubtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenubtn4ActionPerformed
        showallorganization();
        Backtomainmenu();
    }//GEN-LAST:event_MainMenubtn4ActionPerformed

    private void AddnewOrganizationbtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewOrganizationbtnsaveActionPerformed
        String Id;
        String Name;
        int TempId = 0 ;
        OrganizationNamelbl.setText("");
        OrganizationContactlbl.setText("");
        OrganizationAddressProvincelbl.setText("");
        OrganizationEmaillbl.setText("");
        OrganizationChairpersonlbl.setText("");

        try{
            BufferedReader BrC = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
            while((Id = BrC.readLine())!=null){
                Name = BrC.readLine();
                if ( TempId<=Integer.parseInt(Id)){
                TempId = Integer.parseInt(Id) + 1;
                }
                if(AddOrganizationNametxt.getText().equals(Name)){
                    NewOrganization = false;
                }else{
                    NewOrganization = true;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ((NewOrganization == true)&&(!AddOrganizationNametxt.getText().isEmpty())&&(!AddOrganizationContacttxt.getText().isEmpty())&&(!AddOrganizationChairpersontxt.getText().isEmpty())&&(!AddOrganizationEmailtxt.getText().isEmpty())&&(!AddOrganizationAddressProvincetxt.getText().isEmpty())&&(!AddOrganizationAddressStreettxt.getText().isEmpty())&&(!AddOrganizationAddressCitytxt.getText().isEmpty())&&(!AddOrganizationAddressPostcodetxt.getText().isEmpty())){
                    OrganizationNamelbl.setText("");
                    OrganizationContactlbl.setText("");
                    OrganizationChairpersonlbl.setText("");
                    OrganizationEmaillbl.setText("");
                    OrganizationAddressProvincelbl.setText("");
                    OrganizationAddressStreetlbl.setText("");
                    OrganizationAddressPostcodelbl.setText("");
                    OrganizationAddressCitylbl.setText("");
            try {
                PrintWriter PwOM = new PrintWriter(new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationList.txt",true)));
                PwOM.println(TempId);
                PwOM.println(AddOrganizationNametxt.getText());
                PwOM.close();
                PrintWriter PwO = new PrintWriter(new BufferedWriter(new FileWriter("C:\\NGO Project\\"+AddOrganizationNametxt.getText() +".txt",true)));
                    PwO.println(TempId);
                    PwO.println(AddOrganizationNametxt.getText());
                    PwO.println(AddOrganizationContacttxt.getText());
                    PwO.println(AddOrganizationChairpersontxt.getText());
                    PwO.println(AddOrganizationEmailtxt.getText());
                    PwO.println(AddOrganizationAddressCitytxt.getText()+","+AddOrganizationAddressStreettxt.getText()+","+AddOrganizationAddressProvincetxt.getText()+","+AddOrganizationAddressPostcodetxt.getText());

                    AddOrganizationNametxt.setText("");
                    AddOrganizationChairpersontxt.setText("");
                    AddOrganizationContacttxt.setText("");
                    AddOrganizationEmailtxt.setText("");
                    AddOrganizationAddressStreettxt.setText("");
                    AddOrganizationAddressProvincetxt.setText("");
                    AddOrganizationAddressCitytxt.setText("");
                    AddOrganizationAddressPostcodetxt.setText("");

                    JOptionPane.showMessageDialog(null, "Save Data Successful!");

                    PwO.close();

                } catch (IOException ex) {
                    Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                if(AddOrganizationNametxt.getText().isEmpty()){
                    OrganizationNamelbl.setText("Please fill the Name");
                }
                if(AddOrganizationContacttxt.getText().isEmpty()){
                    OrganizationContactlbl.setText("Please fill the Contact");
                }
                if(AddOrganizationChairpersontxt.getText().isEmpty()){
                    OrganizationChairpersonlbl.setText("Please fill the Chairperson");
                }
                if(AddOrganizationEmailtxt.getText().isEmpty()){
                    OrganizationEmaillbl.setText("Please fill the Email");
                }
                if(AddOrganizationAddressStreettxt.getText().isEmpty()){
                    OrganizationAddressProvincelbl.setText("Please fill the Province");
                }
                if(AddOrganizationAddressStreettxt.getText().isEmpty()){
                    OrganizationAddressStreetlbl.setText("Please fill the Street");
                }
                if(AddOrganizationAddressStreettxt.getText().isEmpty()){
                    OrganizationAddressPostcodelbl.setText("Please fill the Postcode");
                }
                if(AddOrganizationAddressStreettxt.getText().isEmpty()){
                    OrganizationAddressCitylbl.setText("Please fill the City");
                }
                    if(NewOrganization == false){
                        OrganizationNamelbl.setText("Organization Already Exist");
                        JOptionPane.showMessageDialog(null,"Organization Already Exist");
                        AddOrganizationNametxt.setText("");
                } 
            }
    }//GEN-LAST:event_AddnewOrganizationbtnsaveActionPerformed

    private void AddOrganizationAddressStreettxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationAddressStreettxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationAddressStreettxtActionPerformed

    private void AddMemberBirthdatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberBirthdatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberBirthdatetxtActionPerformed

    private void AddMemberGendertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberGendertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberGendertxtActionPerformed

    private void AddmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddmemberActionPerformed
        ArrayList<String> List = new ArrayList<String>();
        int count = 0;
        int count1 = 16;
        int Tempid = 0;
        String ID;
        String Name;
        String LastName;
        String Position;
        Find = true;
        int countPosition = 0;
        try {
            BufferedReader BrAM = new BufferedReader(new FileReader("C:\\NGO Project\\"+TempOrganizationName+".txt"));
                List.add(BrAM.readLine());
                List.add(BrAM.readLine());
                List.add(BrAM.readLine());
                List.add(BrAM.readLine());
                List.add(BrAM.readLine());
                List.add(BrAM.readLine());
                while((ID = BrAM.readLine())!=null){
                    Name = BrAM.readLine();
                    LastName = BrAM.readLine();
                    if(Tempid <= Integer.parseInt(ID)){
                        Tempid = Integer.parseInt(ID) + 1;
                    }
                    if((AddMemberFirstNametxt.getText().equalsIgnoreCase(Name))&&(AddMemberLastNametxt.getText().equalsIgnoreCase(LastName))){
                        Find = false;
                        break;
                    }else{
                        List.add(ID);
                        List.add(Name);
                        List.add(LastName);
                        count1++;
                        Find = true;
                    }
                    List.add(BrAM.readLine());
                    List.add(BrAM.readLine());
                    List.add(BrAM.readLine());
                    List.add(BrAM.readLine());
                    List.add(BrAM.readLine());
                    Position = BrAM.readLine();
                    if((countPosition != 4) &&!Position.equalsIgnoreCase("Member") ){
                     List.add(Position);
                     countPosition++;
                    }else if((countPosition >= 4) && (!AddMemberPositiontxt.getText().equalsIgnoreCase("Member"))){
                        JOptionPane.showMessageDialog(null, "Sorry only 4 executive Member are allowed");
                        Find = false;
                        AddMemberPositiontxt.setText("Only 4 executive Member are allowed");
                        break;
                    }else if(Position.equalsIgnoreCase("Member")){
                        List.add(Position);
                    }
                }
                if(Find == true){
                    List.add(ID = ""+Tempid);
                    List.add(AddMemberFirstNametxt.getText());
                    List.add(AddMemberLastNametxt.getText());
                    List.add(AddMemberGendertxt.getText());
                    List.add(AddMemberBirthdatetxt.getText());
                    List.add(AddMemberEmailtxt.getText());
                    List.add(AddMemberPhonetxt.getText());
                    List.add(AddMemberHomenumbertxt.getText());
                    List.add(AddMemberAddresstxt.getText());
                    List.add(AddMemberPositiontxt.getText());
                    BufferedWriter BwAM = new BufferedWriter(new BufferedWriter(new FileWriter("C:\\NGO Project\\"+TempOrganizationName+".txt")));
                        while(count != count1){
                            BwAM.write(List.get(count));
                            BwAM.newLine();
                            count++;
                        }
                        JOptionPane.showMessageDialog(null, "Save Data Successful!");

                        BwAM.close();
                    }else{
                        JOptionPane.showMessageDialog(null, "Member Name is already there ");
                    }
                    AddMemberFirstNametxt.setText("");
                    AddMemberLastNametxt.setText("");
                    AddMemberGendertxt.setText("");
                    AddMemberBirthdatetxt.setText("");        
                    AddMemberAddresstxt.setText("");
                    AddMemberEmailtxt.setText("");
                    AddMemberPhonetxt.setText("");
                    AddMemberHomenumbertxt.setText("");
                    AddMemberPositiontxt.setText("");
                } catch (IOException ex) {
                    Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                List.clear();
    }//GEN-LAST:event_AddmemberActionPerformed

    private void Returnbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Returnbtn1ActionPerformed
        try {
            FindingOrganization();
        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(adminauthorization == false){
            MainMenu.setVisible(false);
            HiddenLogin.setVisible(false);
            SearchOrganization.setVisible(true);
            SearchMember.setVisible(false);
            AddOrganization.setVisible(false);
            AddMember.setVisible(false);
            AddAdmin.setVisible(false);
            EditOrganizationbtn.setVisible(false);
            AddMemberbtn.setVisible(false);
            EditOrganizationbtn.setVisible(false);
            DeleteOrganizationbtn.setVisible(false);
        }else if (adminauthorization == true){
            MainMenu.setVisible(false);
            HiddenLogin.setVisible(false);
            SearchOrganization.setVisible(true);
            SearchMember.setVisible(false);
            AddOrganization.setVisible(false);
            AddMember.setVisible(false);
            AddAdmin.setVisible(false);
            EditOrganizationbtn.setVisible(true);
            AddMemberbtn.setVisible(true);
            DeleteOrganizationbtn.setVisible(true);
        }
    }//GEN-LAST:event_Returnbtn1ActionPerformed

    private void AddMemberHomenumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberHomenumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberHomenumbertxtActionPerformed

    private void AddMemberPhonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberPhonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberPhonetxtActionPerformed

    private void AddMemberFirstNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberFirstNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberFirstNametxtActionPerformed

    private void AddMemberLastNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberLastNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberLastNametxtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Backtomainmenu();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AddMemberPositiontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberPositiontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberPositiontxtActionPerformed

    private void MemberPositionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberPositionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberPositionTxtActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        adminauthorization = false;
        JOptionPane.showMessageDialog(null,"Logout successfull");
        Backtomainmenu();
    }//GEN-LAST:event_LogoutbtnActionPerformed

    private void MemberLastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberLastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberLastNameTxtActionPerformed

    private void OrganizationContactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationContactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganizationContactTxtActionPerformed

    private void OrganizationEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganizationEmailTxtActionPerformed

    private void OrganizationNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganizationNameTxtActionPerformed

    private void AddMemberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberbtnActionPerformed
        TempOrganizationName = OrganizationNameTxt.getText();
        MainMenu.setVisible(false);
        HiddenLogin.setVisible(false);
        SearchOrganization.setVisible(false);
        SearchMember.setVisible(false);
        AddOrganization.setVisible(false);
        AddMember.setVisible(true);
        AddAdmin.setVisible(false);
    }//GEN-LAST:event_AddMemberbtnActionPerformed

    private void EditOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditOrganizationbtnActionPerformed
        String OrganizationName;
        int count = 0;
        int  count1 = 5;
        Find = false;
        if (EditOrganization == false){
            JOptionPane.showMessageDialog(null, "Success");
            Whitelist();
            EditOrganization = true;
            TempOrganizationName = OrganizationNameTxt.getText();
        }else if(EditOrganization == true){
            try {BufferedReader brCF = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
                while((OrganizationName = brCF.readLine()) != null){
                    if((OrganizationName.equalsIgnoreCase(OrganizationNameTxt.getText())&&(!TempOrganizationName.equalsIgnoreCase(OrganizationNameTxt.getText())))){
                        Find = false;
                        JOptionPane.showMessageDialog(null,"Organziation Name already exist");
                    }else{
                        Find = true;
                    }
                }
                if(Find == true){
                    BufferedReader brD = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
                    BufferedWriter bwTemp = new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationListtemp.txt"));
                    while((OrganizationName = brD.readLine()) != null){
                        //If Match Just Continue
                        if(OrganizationName.equalsIgnoreCase(TempOrganizationName) ){
                            bwTemp.write(OrganizationNameTxt.getText());
                            bwTemp.newLine();
                        }else{
                            bwTemp.write(OrganizationName);
                            bwTemp.newLine();
                        }
                    }
                    brD.close();
                    bwTemp.close();

                    BufferedReader brTemp = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationListtemp.txt"));
                    BufferedWriter writeAgain = new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationList.txt"));
                    while((OrganizationName = brTemp.readLine()) != null){
                        writeAgain.write(OrganizationName);
                        writeAgain.newLine();
                    }
                    brTemp.close();
                    writeAgain.close();
                    ArrayList<String> list = new ArrayList<String>();
                    BufferedReader BrEO = new BufferedReader(new FileReader("C:\\NGO Project\\"+TempOrganizationName+".txt"));
                        BrEO.readLine();
                        BrEO.readLine();
                        BrEO.readLine();
                        BrEO.readLine();
                        BrEO.readLine();
                        BrEO.readLine();
                        list.add(OrganizationIdTxt.getText());
                        list.add(OrganizationNameTxt.getText());
                        list.add(OrganizationEmailTxt.getText());
                        list.add(OrganizationChairpersonTxt.getText());
                        list.add(OrganizationContactTxt.getText());
                        list.add(OrganizationAddressTxt.getText());
                        while ((OrganizationName = BrEO.readLine())!= null){
                            list.add(OrganizationName);
                            count1++;
                        }
                        BrEO.close();
                        BufferedWriter BwEOT= new BufferedWriter(new FileWriter("C:\\NGO Project\\"+OrganizationNameTxt.getText()+".txt"));
                            while (count != count1){
                                BwEOT.write(list.get(count));
                                BwEOT.newLine();
                                count++;
                            }
                            list.clear();
                            BwEOT.close();
                            EditOrganization = false;
                            Blacklist();
                            JOptionPane.showMessageDialog(null, "Success");
                            BufferedWriter BwD= new BufferedWriter(new FileWriter("C:\\NGO Project\\Delete.txt"));
                            if(!TempOrganizationName.equals(OrganizationNameTxt.getText())){
                                BwD.write(TempOrganizationName);
                                BwD.newLine();
                            }else{
                            }
                            BwD.close();
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
    }//GEN-LAST:event_EditOrganizationbtnActionPerformed

    private void DeleteOrganizationbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteOrganizationbtnActionPerformed
        String OrganizationName;
        String OrganizationId;
        int a = JOptionPane.showConfirmDialog(null, "Delete This Organization Data?");
        if(a == 0){
            try {
                BufferedReader brD = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
                BufferedWriter bwTemp = new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationListtemp.txt", true));
                while((OrganizationId = brD.readLine()) != null){
                    //If Match Just Continue
                    OrganizationName = brD.readLine();
                    if((OrganizationId.equalsIgnoreCase(OrganizationIdTxt.getText()))||(OrganizationName.equalsIgnoreCase(OrganizationNameTxt.getText())) ){
                        continue;
                    }else{
                        bwTemp.write(OrganizationId);
                        bwTemp.newLine();
                        bwTemp.write(OrganizationName);
                        bwTemp.newLine();
                    }
                }
                bwTemp.close();
                BufferedWriter eraseFile = new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationList.txt"));
                eraseFile.close();

                BufferedReader brTemp = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationListtemp.txt"));
                BufferedWriter writeAgain = new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationList.txt", true));

                while((OrganizationName = brTemp.readLine()) != null){
                    writeAgain.write(OrganizationName);
                    writeAgain.newLine();
                }
                writeAgain.close();
                BufferedWriter eraseFileTemp = new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationListtemp.txt"));
                eraseFileTemp.close();
                JOptionPane.showMessageDialog(null, "Delete Data Successful!");
                BufferedWriter BwDelete = new BufferedWriter(new FileWriter("C:\\NGO Project\\Delete.txt",true));
                BwDelete.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_DeleteOrganizationbtnActionPerformed

    private void SearchMembertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMembertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchMembertxtActionPerformed

    private void SeachMemberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeachMemberbtnActionPerformed
        try {
            FindMember();
        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Find == true){
            if(adminauthorization == false){
                MainMenu.setVisible(false);
                HiddenLogin.setVisible(false);
                SearchOrganization.setVisible(false);
                SearchMember.setVisible(true);
                EditMember.setVisible(false);
                AddOrganization.setVisible(false);
                AddMember.setVisible(false);
                AddAdmin.setVisible(false);
            }
            else if(adminauthorization == true){
                MainMenu.setVisible(false);
                HiddenLogin.setVisible(false);
                SearchOrganization.setVisible(false);
                SearchMember.setVisible(true);
                EditMember.setVisible(true);
                AddOrganization.setVisible(false);
                AddMember.setVisible(false);
                AddAdmin.setVisible(false);
            }
        }
    }//GEN-LAST:event_SeachMemberbtnActionPerformed

    private void BackMenubtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenubtn1ActionPerformed
        Backtomainmenu();
    }//GEN-LAST:event_BackMenubtn1ActionPerformed

    private void Exitbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exitbtn2ActionPerformed
        DeleteFile();
        System.exit(0);
    }//GEN-LAST:event_Exitbtn2ActionPerformed

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

              
                try {
                    new NgoGui().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddAdmin;
    private javax.swing.JButton AddAdminbtn;
    private javax.swing.JButton AddAdminbtn1;
    private javax.swing.JPanel AddMember;
    private javax.swing.JLabel AddMemberAddresslbl;
    private javax.swing.JTextField AddMemberAddresstxt;
    private javax.swing.JLabel AddMemberBirthDatelbl;
    private javax.swing.JTextField AddMemberBirthdatetxt;
    private javax.swing.JLabel AddMemberEmaillbl;
    private javax.swing.JTextField AddMemberEmailtxt;
    private javax.swing.JLabel AddMemberFirstNamelbl;
    private javax.swing.JTextField AddMemberFirstNametxt;
    private javax.swing.JLabel AddMemberGenderlbl;
    private javax.swing.JTextField AddMemberGendertxt;
    private javax.swing.JLabel AddMemberHomelbl;
    private javax.swing.JTextField AddMemberHomenumbertxt;
    private javax.swing.JLabel AddMemberLastNamelbl;
    private javax.swing.JTextField AddMemberLastNametxt;
    private javax.swing.JLabel AddMemberPhonelbl;
    private javax.swing.JTextField AddMemberPhonetxt;
    private javax.swing.JLabel AddMemberPositionlbl;
    private javax.swing.JTextField AddMemberPositiontxt;
    private javax.swing.JButton AddMemberbtn;
    private javax.swing.JPanel AddOrganization;
    private javax.swing.JTextField AddOrganizationAddressCitytxt;
    private javax.swing.JTextField AddOrganizationAddressPostcodetxt;
    private javax.swing.JTextField AddOrganizationAddressProvincetxt;
    private javax.swing.JTextField AddOrganizationAddressStreettxt;
    private javax.swing.JTextField AddOrganizationChairpersontxt;
    private javax.swing.JTextField AddOrganizationContacttxt;
    private javax.swing.JTextField AddOrganizationEmailtxt;
    private javax.swing.JTextField AddOrganizationNametxt;
    private javax.swing.JButton AddOrganizationbtn;
    private javax.swing.JButton Addmember;
    private javax.swing.JButton AddnewOrganizationbtnsave;
    private javax.swing.JPasswordField AdminPassword;
    private javax.swing.JLabel AdminPasswordlbl;
    private javax.swing.JPasswordField AdminPasswordtxt;
    private javax.swing.JLabel AdminRetypePasswordlbl;
    private javax.swing.JPasswordField AdminRetypePasswordtxt;
    private javax.swing.JTextField AdminUsername;
    private javax.swing.JLabel AdminUsernamelbl;
    private javax.swing.JTextField AdminUsernametxt;
    private javax.swing.JButton BackMenubtn1;
    private javax.swing.JButton BackMenubtn2;
    private javax.swing.JButton BackMenubtn3;
    private javax.swing.JButton DeleteOrganizationbtn;
    private javax.swing.JButton EditMember;
    private javax.swing.JButton EditOrganizationbtn;
    private javax.swing.JButton Exitbtn1;
    private javax.swing.JButton Exitbtn2;
    private javax.swing.JPanel HiddenLogin;
    private javax.swing.JPanel Hiddeneditmember;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JButton Logoutbtn;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton MainMenubtn4;
    private javax.swing.JTextField MemberAddressTxt;
    private javax.swing.JLabel MemberAddresslbl;
    private javax.swing.JLabel MemberAddresslbl1;
    private javax.swing.JLabel MemberAddresslbl2;
    private javax.swing.JTextField MemberBirthDateTxt;
    private javax.swing.JTextField MemberEmailTxt;
    private javax.swing.JLabel MemberEmaillbl;
    private javax.swing.JLabel MemberEmaillbl1;
    private javax.swing.JTextField MemberFirstNameTxt;
    private javax.swing.JLabel MemberFirsyNamelbl1;
    private javax.swing.JTextField MemberGenderTxt;
    private javax.swing.JLabel MemberHomelbl;
    private javax.swing.JLabel MemberHomelbl1;
    private javax.swing.JTextField MemberHomenumberTxt;
    private javax.swing.JTextField MemberIdTxt;
    private javax.swing.JLabel MemberIdlbl;
    private javax.swing.JLabel MemberIdlbl1;
    private javax.swing.JTextField MemberLastNameTxt;
    private javax.swing.JTextArea MemberList;
    private javax.swing.JLabel MemberNamelbl;
    private javax.swing.JLabel MemberNamelbl1;
    private javax.swing.JTextField MemberPhoneTxt;
    private javax.swing.JLabel MemberPhonelbl;
    private javax.swing.JLabel MemberPhonelbl1;
    private javax.swing.JLabel MemberPhonelbl2;
    private javax.swing.JTextField MemberPositionTxt;
    private javax.swing.JLabel Memberbirthdatelbl;
    private javax.swing.JLabel Memberbirthdatelbl1;
    private javax.swing.JLabel Membergenderlbl;
    private javax.swing.JLabel Membergenderlbl1;
    private javax.swing.JLabel OrganizationAddressCitylbl;
    private javax.swing.JLabel OrganizationAddressPostcodelbl;
    private javax.swing.JLabel OrganizationAddressProvincelbl;
    private javax.swing.JLabel OrganizationAddressStreetlbl;
    private javax.swing.JTextField OrganizationAddressTxt;
    private javax.swing.JTextField OrganizationChairpersonTxt;
    private javax.swing.JLabel OrganizationChairpersonlbl;
    private javax.swing.JTextField OrganizationContactTxt;
    private javax.swing.JLabel OrganizationContactlbl;
    private javax.swing.JTextField OrganizationEmailTxt;
    private javax.swing.JLabel OrganizationEmaillbl;
    private javax.swing.JTextField OrganizationIdTxt;
    private javax.swing.JTextField OrganizationNameTxt;
    private javax.swing.JLabel OrganizationNamelbl;
    private javax.swing.JLabel Passwordlbl;
    private javax.swing.JButton Returnbtn;
    private javax.swing.JButton Returnbtn1;
    private javax.swing.JButton SeachMemberbtn;
    private javax.swing.JPanel SearchMember;
    private javax.swing.JLabel SearchMemberlbl;
    private javax.swing.JTextField SearchMembertxt;
    private javax.swing.JPanel SearchOrganization;
    private javax.swing.JButton SearchOrganizationbtn;
    private javax.swing.JTextArea SearchOrganizationlist;
    private javax.swing.JTextField SearchOrganizationtxt;
    private javax.swing.JScrollPane Searchpn;
    private javax.swing.JLabel Usernamelbl1;
    private javax.swing.JLabel Wronglbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
