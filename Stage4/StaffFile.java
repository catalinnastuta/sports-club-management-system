/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stage4;

/**
 *
 * @author skeet
 */

public class StaffFile {
    
    private int staffID;
    private String name;
    private String email;
    private String phone;
    
    StaffFile(int id, String name, String email, String phone)
    {
        this.staffID = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    
    
    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String Phone) {
        this.phone = phone;
    }
    
    
    public String toString()
    {
        String s = "";
        s+= "ID " + this.staffID + ", Name: " + this.name + 
                ", Email: " + this.email + ",  Phone: " + this.phone;
        return s;
    }
   
    
    
}
