/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp.Lists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import trackerapp.Activity;
import trackerapp.enums.Reminder;

/**
 *
 * @author micle
 */
public class ReminderList {
     ArrayList<Reminder> reminders;
     String filename = "Reminders.ser";
    
    private ReminderList(){
        reminders = new ArrayList<Reminder>();
        
        
        try{
            loadReminders();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    
    private static ReminderList INSTANCE = new ReminderList();
    
    public static ReminderList getInstance(){
        return INSTANCE;
    }
    
    
    
    public void addReminder(Reminder reminder){
        reminders.add(reminder);
    }
    
    public void removeReminder(Reminder reminder){
        
        for(Reminder item:reminders){
            if(item == reminder){
                reminders.remove(item);
                return;
            }
        }
    }
    
    public ArrayList<Reminder> getReminders(){
        return reminders;
    }
    
    public void loadReminders() throws FileNotFoundException, IOException {
        
            FileInputStream fileIn;
            ObjectInputStream in;
            

            try{
                fileIn = new FileInputStream(filename);
                in = new ObjectInputStream(fileIn);
                reminders = (ArrayList<Reminder>)in.readObject();
            }
            catch(Exception ex){
               //JOptionPane.showMessageDialog(null,ex.toString());
            } 
    }
    
     public void saveReminders() throws FileNotFoundException, IOException {
        
            FileOutputStream fileOut;
            ObjectOutputStream out;

            try{
               fileOut = new FileOutputStream(filename);
                out = new ObjectOutputStream(fileOut);
                out.writeObject(reminders);
            }
            catch(FileNotFoundException ex){
                File newFile = new File(filename);
                newFile.createNewFile();
                saveReminders();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex.toString());
            }
             
    }
}
