/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stage4;

/**
 *
 * @author skeet
 */

import java.util.HashMap;
import java.io.*;
import javax.swing.JOptionPane;

public class Staff {
    
    private HashMap<Integer, StaffFile> staffFile;
    private static final String filename = "staff.csv";
    private static final String delimiter = ",";
    
    public Staff()
    {
        staffFile = new HashMap<>();
    }
    
    public void addStaff(StaffFile aStaff)
    {
        int id = aStaff.getStaffID();
        staffFile.put(id, aStaff);
    }
   
    
    public void removeStaff(int id)
    {
        staffFile.remove(id);
    }
    
    
    public StaffFile getStaf(int id)
    {
        return staffFile.get(id);
    }
    
    public HashMap<Integer, StaffFile> getStaff()
    {
        return staffFile;
    }
    
}

