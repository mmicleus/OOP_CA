/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trackerapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalTime;
import trackerapp.Lists.ActivityList;
import trackerapp.Lists.WorkoutPlanList;
import java.util.ArrayList;
import trackerapp.Lists.ReminderList;
import trackerapp.enums.Reminder;
import trackerapp.enums.WorkoutExperience;
import trackerapp.enums.WorkoutType;
import trackerapp.forms.ActivityLogsForm;
import trackerapp.forms.MenuForm;
import trackerapp.forms.WorkoutPlansForm;

/**
 *
 * @author micle
 */
public class TrackerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ReminderLogic scheduler = new ReminderLogic();
        scheduler.setReminders();
        
        
        MenuForm menuForm = new MenuForm();
        menuForm.setLocationRelativeTo(null);
        menuForm.setVisible(true);
        
    }  
}
