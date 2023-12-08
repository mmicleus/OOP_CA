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
import trackerapp.Exercise;
import trackerapp.Workout;
import trackerapp.WorkoutPlan;
import trackerapp.enums.WorkoutExperience;
import trackerapp.enums.WorkoutType;

/**
 *
 * @author micle
 */
public class ActivityList {
    ArrayList<Activity> activities;
    String filename = "Activities.ser";
    //File file;
    
    private ActivityList(){
        activities = new ArrayList<Activity>();
        
        try{
            loadActivities();
        }
        catch(Exception ex){
           // JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        //activities = new ArrayList<Activity>();
      //  file = new File("cars.txt");
    }
    
    
    private static ActivityList INSTANCE = new ActivityList();
    
    public static ActivityList getInstance(){
        return INSTANCE;
    }
    
    public void addActivity(Activity activity){
        activities.add(activity);
    }
    
    
    
    public ArrayList<Activity> getActivities(){
        return activities;
    }
    
   
    
    
        public void loadActivities() throws FileNotFoundException, IOException {
        
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            try{
                activities = (ArrayList<Activity>)in.readObject();
                 
            }
            catch(Exception ex){  
               JOptionPane.showMessageDialog(null,ex.toString());
            }
            finally{
                in.close();
            } 
        }
        
        public void saveActivities() throws FileNotFoundException, IOException {
        
            FileOutputStream fileOut;
            ObjectOutputStream out;

            try{
                fileOut = new FileOutputStream(filename);
                out = new ObjectOutputStream(fileOut);
                out.writeObject(activities);
            }
            catch(FileNotFoundException ex){
                    File newFile = new File(filename);
                    newFile.createNewFile();
                    saveActivities();
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.toString());
            }
        }
        
        
}
