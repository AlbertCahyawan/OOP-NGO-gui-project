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
    boolean adminauthorization = false;
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
        SearchMember = new javax.swing.JPanel();
        MemberNamelbl = new javax.swing.JLabel();
        MemberIdlbl = new javax.swing.JLabel();
        MemberAddresslbl = new javax.swing.JLabel();
        MemberEmaillbl = new javax.swing.JLabel();
        MemberHomelbl = new javax.swing.JLabel();
        MemberPhonelbl = new javax.swing.JLabel();
        Exitbtn3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Hiddeneditmember = new javax.swing.JPanel();
        EditMember = new javax.swing.JButton();
        MemberNameTxt = new javax.swing.JTextField();
        MemberEmailTxt = new javax.swing.JTextField();
        MemberIdTxt = new javax.swing.JTextField();
        MemberAddressTxt = new javax.swing.JTextField();
        MemberPhoneTxt = new javax.swing.JTextField();
        MemberHomenumberTxt = new javax.swing.JTextField();
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
        AddOrganizationAddresstxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AddOrganizationEmailtxt = new javax.swing.JTextField();
        OrganizationNamelbl = new javax.swing.JLabel();
        OrganizationContactlbl = new javax.swing.JLabel();
        OrganizationChairpersonlbl = new javax.swing.JLabel();
        OrganizationAddresslbl = new javax.swing.JLabel();
        OrganizationEmaillbl = new javax.swing.JLabel();
        AddMember = new javax.swing.JPanel();
        MemberNamelbl1 = new javax.swing.JLabel();
        MemberIdlbl1 = new javax.swing.JLabel();
        MemberAddresslbl1 = new javax.swing.JLabel();
        MemberEmaillbl1 = new javax.swing.JLabel();
        MemberHomelbl1 = new javax.swing.JLabel();
        MemberPhonelbl1 = new javax.swing.JLabel();
        Exitbtn4 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Hiddeneditmember1 = new javax.swing.JPanel();
        Addmember = new javax.swing.JButton();
        AddMemberNametxt = new javax.swing.JTextField();
        AddMemberEmailtxt = new javax.swing.JTextField();
        AddMemberIdtxt = new javax.swing.JTextField();
        AddMemberAddresstxt = new javax.swing.JTextField();
        AddMemberPhone = new javax.swing.JTextField();
        AddMemberHomenumbertxt = new javax.swing.JTextField();
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

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Searchpn)
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(AddAdminbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exitbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                        .addComponent(SearchOrganizationbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchOrganizationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddAdminbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainMenuLayout.createSequentialGroup()
                        .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchOrganizationtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchOrganizationbtn)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Searchpn, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Exitbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(AddOrganizationbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(137, Short.MAX_VALUE))
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

        OrganizationIdTxt.setText("Organization ID");

        OrganizationAddressTxt.setText("Address");

        OrganizationEmailTxt.setText("Email");
        OrganizationEmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationEmailTxtActionPerformed(evt);
            }
        });

        OrganizationContactTxt.setText("Contact number");
        OrganizationContactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizationContactTxtActionPerformed(evt);
            }
        });

        OrganizationChairpersonTxt.setText("Organization Chairperson");

        javax.swing.GroupLayout SearchOrganizationLayout = new javax.swing.GroupLayout(SearchOrganization);
        SearchOrganization.setLayout(SearchOrganizationLayout);
        SearchOrganizationLayout.setHorizontalGroup(
            SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(OrganizationAddressTxt)
                            .addComponent(OrganizationEmailTxt)
                            .addComponent(OrganizationContactTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                                .addComponent(BackMenubtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Exitbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                                .addComponent(EditOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchOrganizationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SeachMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchMembertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addComponent(OrganizationNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrganizationIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrganizationChairpersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 328, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SearchOrganizationLayout.setVerticalGroup(
            SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchMembertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeachMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrganizationIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationChairpersonTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditOrganizationbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddMemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(SearchOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackMenubtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exitbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SearchOrganizationLayout.createSequentialGroup()
                        .addComponent(OrganizationAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrganizationEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrganizationContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
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

        MemberNameTxt.setText("Name");
        MemberNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberNameTxtActionPerformed(evt);
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
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MemberNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SearchMemberLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Exitbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MemberIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MemberAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberHomenumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        SearchMemberLayout.setVerticalGroup(
            SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MemberNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(MemberAddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberPhonelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberHomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(SearchMemberLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SearchMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MemberIdlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MemberIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MemberHomenumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HiddenLoginLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
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
                .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Passwordlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Usernamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BackMenubtn3))
                .addGap(42, 42, 42))
        );
        HiddenLoginLayout.setVerticalGroup(
            HiddenLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HiddenLoginLayout.createSequentialGroup()
                .addGap(107, 107, 107)
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
                    .addComponent(Wronglbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackMenubtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        Passwordlbl.getAccessibleContext().setAccessibleName("Usernamelbl");

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

        AddOrganizationAddresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationAddresstxtActionPerformed(evt);
            }
        });

        jLabel12.setText("Email");

        AddOrganizationEmailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddOrganizationEmailtxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddOrganizationLayout = new javax.swing.GroupLayout(AddOrganization);
        AddOrganization.setLayout(AddOrganizationLayout);
        AddOrganizationLayout.setHorizontalGroup(
            AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrganizationLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(AddnewOrganizationbtnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(MainMenubtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(AddOrganizationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddOrganizationNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddOrganizationContacttxt)
                            .addComponent(AddOrganizationChairpersontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddOrganizationEmailtxt))
                    .addGroup(AddOrganizationLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrganizationAddresslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddOrganizationAddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OrganizationNamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrganizationChairpersonlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrganizationContactlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OrganizationEmaillbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        AddOrganizationLayout.setVerticalGroup(
            AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddOrganizationLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AddOrganizationNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationNamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(AddOrganizationContacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationContactlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(AddOrganizationChairpersontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationChairpersonlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(AddOrganizationEmailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OrganizationEmaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddOrganizationAddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OrganizationAddresslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(AddOrganizationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddnewOrganizationbtnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MainMenubtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        MemberNamelbl1.setText("Member Name");

        MemberIdlbl1.setText("Member Id");

        MemberAddresslbl1.setText("Address");

        MemberEmaillbl1.setText("Email");

        MemberHomelbl1.setText("Home number");

        MemberPhonelbl1.setText("Phone number");

        Exitbtn4.setText("Exit");
        Exitbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exitbtn4ActionPerformed(evt);
            }
        });

        jButton4.setText("Main Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Addmember.setText("Add");
        Addmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddmemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Hiddeneditmember1Layout = new javax.swing.GroupLayout(Hiddeneditmember1);
        Hiddeneditmember1.setLayout(Hiddeneditmember1Layout);
        Hiddeneditmember1Layout.setHorizontalGroup(
            Hiddeneditmember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Hiddeneditmember1Layout.createSequentialGroup()
                .addComponent(Addmember, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Hiddeneditmember1Layout.setVerticalGroup(
            Hiddeneditmember1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Hiddeneditmember1Layout.createSequentialGroup()
                .addComponent(Addmember, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AddMemberNametxt.setText("Name");
        AddMemberNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberNametxtActionPerformed(evt);
            }
        });

        AddMemberEmailtxt.setText("Email");

        AddMemberIdtxt.setText("Id");

        AddMemberAddresstxt.setText("Address");

        AddMemberPhone.setText("Phone");
        AddMemberPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberPhoneActionPerformed(evt);
            }
        });

        AddMemberHomenumbertxt.setText("Home");
        AddMemberHomenumbertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemberHomenumbertxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddMemberLayout = new javax.swing.GroupLayout(AddMember);
        AddMember.setLayout(AddMemberLayout);
        AddMemberLayout.setHorizontalGroup(
            AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MemberAddresslbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberNamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberIdlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberEmaillbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberPhonelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MemberHomelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Hiddeneditmember1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddMemberNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddMemberLayout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Exitbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddMemberIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddMemberAddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddMemberEmailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddMemberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddMemberHomenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        AddMemberLayout.setVerticalGroup(
            AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddMemberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MemberNamelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMemberNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(MemberAddresslbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberEmaillbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberPhonelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MemberHomelbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MemberIdlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddMemberIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddMemberAddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddMemberEmailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddMemberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddMemberHomenumbertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addComponent(Hiddeneditmember1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addGroup(AddMemberLayout.createSequentialGroup()
                        .addGroup(AddMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exitbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(49, 49, 49)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddAdminLayout.createSequentialGroup()
                                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AdminUsernametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(AdminPasswordtxt))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdminUsernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdminPasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AddAdminLayout.createSequentialGroup()
                                .addComponent(AdminRetypePasswordtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AdminRetypePasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addComponent(AddAdminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(BackMenubtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(92, Short.MAX_VALUE))))
        );
        AddAdminLayout.setVerticalGroup(
            AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAdminLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AdminUsernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AdminUsernamelbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(AdminPasswordtxt))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminPasswordlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AdminRetypePasswordtxt))
                    .addComponent(AdminRetypePasswordlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(AddAdminbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddAdminLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BackMenubtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
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
                    .addContainerGap(197, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(AddMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(173, 173, 173)))
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
                    .addContainerGap(135, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(AddMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(53, 53, 53)))
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
     SearchOrganizationlist.setText("Organization Name \t\t\t Organization ID \n");
        try {
            BufferedReader brs = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
            while((AddOrganizationNamesearch = brs.readLine()) != null){
                        searchString += ("Name :" + AddOrganizationNamesearch +"\n\n");
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
                if (AddOrganizationNamesearch.equalsIgnoreCase(SearchOrganizationtxt.getText())){  
                  BufferedReader BrOM = new BufferedReader(new FileReader("C:\\NGO Project\\"+SearchOrganizationtxt.getText()+".txt"));
                  OrganizationNameTxt.setText(BrOM.readLine());
                  OrganizationContactTxt.setText(BrOM.readLine());
                  OrganizationChairpersonTxt.setText(BrOM.readLine());
                  OrganizationEmailTxt.setText(BrOM.readLine());
                  OrganizationAddressTxt.setText(BrOM.readLine());
                  while((Name = BrOM.readLine())!=null){
                  repeat +=("Name:"+Name+"\n");    
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
        String Name;
        try{
             BufferedReader BrFM = new BufferedReader(new FileReader("C:\\NGO Project\\"+OrganizationNameTxt.getText()+".txt"));
            BrFM.readLine();
            BrFM.readLine();
            BrFM.readLine();
            BrFM.readLine();
            BrFM.readLine();
             while((Name = BrFM.readLine())!= null){
                if (Name.equalsIgnoreCase(SearchMembertxt.getText())){ 
                  MemberNameTxt.setText(Name);
                  MemberAddressTxt.setText(BrFM.readLine());
                  MemberEmailTxt.setText(BrFM.readLine());
                  MemberPhoneTxt.setText(BrFM.readLine());
                  MemberHomenumberTxt.setText(BrFM.readLine());
                  Find = true;
                  break;
                  }
                else{
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
        MemberNameTxt.setEditable(false);
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
        MemberNameTxt.setEditable(true);
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
      Usernamelbl1.setText("") ;
      Passwordlbl.setText("") ;
      Wronglbl.setText("") ;
   
        
        try {
               BufferedReader BrA = new BufferedReader(new FileReader("C:\\NGO Project\\NgoAdmin.txt"));
        while ((Username = BrA.readLine())!= null){
            Password = BrA.readLine();
            if((AdminUsername.getText().equalsIgnoreCase(Username)) && (AdminPassword.getText().equalsIgnoreCase(Password))){
            Login = true;    
            }
        }
            
        }catch (FileNotFoundException ex) {
         Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Login == true){
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
        ArrayList<String> FileList = new ArrayList<String>();
        FileList.add("NgoAdmin.txt");
        FileList.add("Delete.txt");
        FileList.add("Organizationlist.txt");
        try{
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
      MainMenu.setVisible(false);
      HiddenLogin.setVisible(true);
      SearchOrganization.setVisible(false);
      SearchMember.setVisible(false);
      AddOrganization.setVisible(false);
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

    private void MainMenubtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenubtn4ActionPerformed
        showallorganization();
        Backtomainmenu();
    }//GEN-LAST:event_MainMenubtn4ActionPerformed

    private void AddnewOrganizationbtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddnewOrganizationbtnsaveActionPerformed
        String Name;
        OrganizationNamelbl.setText("");
        OrganizationContactlbl.setText("");
        OrganizationAddresslbl.setText("");
        OrganizationEmaillbl.setText("");
        OrganizationChairpersonlbl.setText("");
        
        try{
            BufferedReader BrC = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
            while((Name = BrC.readLine())!=null){
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
        
        if ((NewOrganization == true)&&(!AddOrganizationNametxt.getText().isEmpty())&&(!AddOrganizationContacttxt.getText().isEmpty())&&(!AddOrganizationChairpersontxt.getText().isEmpty())&&(!AddOrganizationEmailtxt.getText().isEmpty())&&(!AddOrganizationAddresstxt.getText().isEmpty())){
        try {
            PrintWriter PwOM = new PrintWriter(new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationList.txt",true)));
            PwOM.println(AddOrganizationNametxt.getText());
            PwOM.close();
            PrintWriter PwO = new PrintWriter(new BufferedWriter(new FileWriter("C:\\NGO Project\\"+AddOrganizationNametxt.getText() +".txt",true)));
            PwO.println(AddOrganizationNametxt.getText());
            PwO.println(AddOrganizationContacttxt.getText());
            PwO.println(AddOrganizationChairpersontxt.getText());
            PwO.println(AddOrganizationEmailtxt.getText());
            PwO.println(AddOrganizationAddresstxt.getText());

            AddOrganizationNametxt.setText("");
            AddOrganizationChairpersontxt.setText("");
            AddOrganizationContacttxt.setText("");
            AddOrganizationEmailtxt.setText("");
            AddOrganizationAddresstxt.setText("");
            
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
            if(AddOrganizationAddresstxt.getText().isEmpty()){
             OrganizationAddresslbl.setText("Please fill the Address");
            if(NewOrganization == false){
             OrganizationNamelbl.setText("Organization Already Exist");   
             JOptionPane.showMessageDialog(null,"Organization Already Exist");
             AddOrganizationNametxt.setText("");
            }
            }
        }
    }//GEN-LAST:event_AddnewOrganizationbtnsaveActionPerformed

    private void AddOrganizationNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationNametxtActionPerformed

    private void AdminPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPasswordActionPerformed

    private void EditMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMemberActionPerformed
        String MemberName;
        int count = 0;
        int  count1 = 4;
        ArrayList<String> list = new ArrayList<String>();
        if (EditOrganization == false){
            JOptionPane.showMessageDialog(null, "Success");
            Whitelist();
            TempOrganizationName = MemberNameTxt.getText();
            EditOrganization = true; 
        }else if(EditOrganization == true){
           try {     
                   BufferedReader BrEO = new BufferedReader(new FileReader("C:\\NGO Project\\"+OrganizationNameTxt.getText()+".txt"));
                   while ((MemberName = BrEO.readLine())!= null){
                   if((TempOrganizationName.equalsIgnoreCase(MemberName))){
                   list.add(MemberNameTxt.getText());
                   list.add(MemberAddressTxt.getText());
                   list.add(MemberEmailTxt.getText());
                   list.add(MemberPhoneTxt.getText());
                   list.add(MemberHomenumberTxt.getText());
                   }else
                   {
                   list.add(MemberName);
                   count1++;
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
                   JOptionPane.showMessageDialog(null, "Success");
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

    private void Exitbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exitbtn3ActionPerformed
        DeleteFile();
        System.exit(0);
    }//GEN-LAST:event_Exitbtn3ActionPerformed

    private void LoginbtnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginbtnKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginbtnKeyTyped

    private void OrganizationContactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationContactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganizationContactTxtActionPerformed

    private void OrganizationEmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizationEmailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganizationEmailTxtActionPerformed

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
        int  count1 = 4;
        Find = false;
        if (EditOrganization == false){
            JOptionPane.showMessageDialog(null, "Success");
            Whitelist();
            EditOrganization = true;
            TempOrganizationName = OrganizationNameTxt.getText();
        }else if(EditOrganization == true){
           try {BufferedReader brCF = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
                while((OrganizationName = brCF.readLine()) != null){
                    if(OrganizationName.equalsIgnoreCase(OrganizationNameTxt.getText())){
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
                   BwD.close();
                   }else{
                   BwD.close();
                   }
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
        int a = JOptionPane.showConfirmDialog(null, "Delete This Organization Data?");
        
        if(a == 0){
           try {
                BufferedReader brD = new BufferedReader(new FileReader("C:\\NGO Project\\OrganizationList.txt"));
                BufferedWriter bwTemp = new BufferedWriter(new FileWriter("C:\\NGO Project\\OrganizationListtemp.txt", true));    
                    while((OrganizationName = brD.readLine()) != null){
                        //If Match Just Continue
                        if(OrganizationName.equalsIgnoreCase(OrganizationNameTxt.getText()) ){
                        continue;
                        }else{
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
               
        } catch (FileNotFoundException ex) {
                Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }


    }//GEN-LAST:event_DeleteOrganizationbtnActionPerformed

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

    private void MemberPhoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberPhoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberPhoneTxtActionPerformed

    private void MemberHomenumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberHomenumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberHomenumberTxtActionPerformed

    private void MemberNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MemberNameTxtActionPerformed

    private void AddMemberHomenumbertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberHomenumbertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberHomenumbertxtActionPerformed

    private void AddMemberPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberPhoneActionPerformed

    private void AddMemberNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemberNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddMemberNametxtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Backtomainmenu();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Exitbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exitbtn4ActionPerformed
        DeleteFile();
        System.exit(0);
    }//GEN-LAST:event_Exitbtn4ActionPerformed

    private void AdminUsernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminUsernametxtActionPerformed
       AdminUsernametxt.setText("");
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

    private void AddOrganizationContacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationContacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationContacttxtActionPerformed

    private void AddOrganizationChairpersontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationChairpersontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationChairpersontxtActionPerformed

    private void AddOrganizationAddresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationAddresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationAddresstxtActionPerformed

    private void AddOrganizationEmailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddOrganizationEmailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddOrganizationEmailtxtActionPerformed

    private void SearchMembertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMembertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchMembertxtActionPerformed

    private void BackMenubtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenubtn2ActionPerformed
        Backtomainmenu();
    }//GEN-LAST:event_BackMenubtn2ActionPerformed

    private void AddmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddmemberActionPerformed
        ArrayList<String> List = new ArrayList<String>();
        int count = 0;
        int count1 = 5;
        String repeat;
                
        try {
            BufferedReader BrAM = new BufferedReader(new FileReader("C:\\NGO Project\\"+TempOrganizationName+".txt"));
            while((repeat = BrAM.readLine())!=null){
                if(AddMemberNametxt.getText().equalsIgnoreCase(repeat)){
                    Find = false;
                    break;
                }else{
                List.add(repeat);
                count1++; 
                Find = true;
                }
        }
            if(Find == true){
            List.add(AddMemberNametxt.getText());
            List.add(AddMemberAddresstxt.getText());
            List.add(AddMemberEmailtxt.getText());
            List.add(AddMemberPhone.getText());
            List.add(AddMemberHomenumbertxt.getText());
            BufferedWriter BwAM = new BufferedWriter(new BufferedWriter(new FileWriter("C:\\NGO Project\\"+TempOrganizationName+".txt")));
            while(count != count1){
            BwAM.write(List.get(count));
            BwAM.newLine();
            count++;
            }
            JOptionPane.showMessageDialog(null, "Save Data Successful!");

            BwAM.close();
            }else{
                JOptionPane.showMessageDialog(null, "Member with same name are ");
            }
            AddMemberNametxt.setText("");
            AddMemberAddresstxt.setText("");
            AddMemberEmailtxt.setText("");
            AddMemberPhone.setText("");
            AddMemberHomenumbertxt.setText("");
        } catch (IOException ex) {
            Logger.getLogger(NgoGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        List.clear();
    }//GEN-LAST:event_AddmemberActionPerformed

    private void BackMenubtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenubtn3ActionPerformed
        Backtomainmenu();
    }//GEN-LAST:event_BackMenubtn3ActionPerformed

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
    private javax.swing.JTextField AddMemberAddresstxt;
    private javax.swing.JTextField AddMemberEmailtxt;
    private javax.swing.JTextField AddMemberHomenumbertxt;
    private javax.swing.JTextField AddMemberIdtxt;
    private javax.swing.JTextField AddMemberNametxt;
    private javax.swing.JTextField AddMemberPhone;
    private javax.swing.JButton AddMemberbtn;
    private javax.swing.JPanel AddOrganization;
    private javax.swing.JTextField AddOrganizationAddresstxt;
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
    private javax.swing.JButton Exitbtn3;
    private javax.swing.JButton Exitbtn4;
    private javax.swing.JPanel HiddenLogin;
    private javax.swing.JPanel Hiddeneditmember;
    private javax.swing.JPanel Hiddeneditmember1;
    private javax.swing.JButton Loginbtn;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton MainMenubtn4;
    private javax.swing.JTextField MemberAddressTxt;
    private javax.swing.JLabel MemberAddresslbl;
    private javax.swing.JLabel MemberAddresslbl1;
    private javax.swing.JTextField MemberEmailTxt;
    private javax.swing.JLabel MemberEmaillbl;
    private javax.swing.JLabel MemberEmaillbl1;
    private javax.swing.JLabel MemberHomelbl;
    private javax.swing.JLabel MemberHomelbl1;
    private javax.swing.JTextField MemberHomenumberTxt;
    private javax.swing.JTextField MemberIdTxt;
    private javax.swing.JLabel MemberIdlbl;
    private javax.swing.JLabel MemberIdlbl1;
    private javax.swing.JTextArea MemberList;
    private javax.swing.JTextField MemberNameTxt;
    private javax.swing.JLabel MemberNamelbl;
    private javax.swing.JLabel MemberNamelbl1;
    private javax.swing.JTextField MemberPhoneTxt;
    private javax.swing.JLabel MemberPhonelbl;
    private javax.swing.JLabel MemberPhonelbl1;
    private javax.swing.JTextField OrganizationAddressTxt;
    private javax.swing.JLabel OrganizationAddresslbl;
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
    private javax.swing.JButton SeachMemberbtn;
    private javax.swing.JPanel SearchMember;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
