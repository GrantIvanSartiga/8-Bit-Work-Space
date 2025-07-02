/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg8.bit.work.space;

import java.io.*;

/**
 *
 * @author Marlon
 */
public class Users implements Serializable{
    private String uName;
    private String pass;
    private String fName;
    private String lastName;

    public Users(String uName, String pass, String fName, String lastName) {
        this.uName = uName;
        this.pass = pass;
        this.fName = fName;
        this.lastName = lastName;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
}
