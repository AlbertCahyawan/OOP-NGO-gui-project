/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngo.project;

/**
 *
 * @author albertcahyawan
 */
public class Authorization {
    public boolean Admin;
    public boolean Login;
    public boolean NewOrganization;
    public boolean EditOrganization;
    public boolean Find;

    public Authorization(boolean Admin, boolean Login, boolean NewOrganization, boolean EditOrganization, boolean Find) {
        this.Admin = Admin;
        this.Login = Login;
        this.NewOrganization = NewOrganization;
        this.EditOrganization = EditOrganization;
        this.Find = Find;
    }

    public boolean isFind() {
        return Find;
    }

    public void setFind(boolean Find) {
        this.Find = Find;
    }

    public boolean getEditOrganization() {
        return EditOrganization;
    }

    public void setEditOrganization(boolean EditOrganization) {
        this.EditOrganization = EditOrganization;
    }

    public boolean getAdmin() {
        return Admin;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    public Boolean getLogin() {
        return Login;
    }

    public void setLogin(boolean Login) {
        this.Login = Login;
    }

    public Boolean getNewOrganization() {
        return NewOrganization;
    }

    public void setNewOrganization(boolean NewOrganization) {
        this.NewOrganization = NewOrganization;
    }
}
