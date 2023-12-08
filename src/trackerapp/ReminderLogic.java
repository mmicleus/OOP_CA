/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import trackerapp.Lists.ReminderList;
import trackerapp.enums.Reminder;


/**
 *
 * @author micle
 */
public class ReminderLogic {
    ReminderList reminderList;
    Thread remindersThread;
    LocalDateTime reminderTime;
    
    
   
    
    public ReminderLogic(){
        reminderList = ReminderList.getInstance();
        reminderTime = LocalDateTime.now().plusHours(1);
//        reminderTime = GenerateRandomTime(LocalDateTime.now());
    }
    
     public boolean equalDateTimeInstances(LocalDateTime d1,LocalDateTime d2){
        return ( (d1.getYear() == d2.getYear()) && 
               (d1.getMonth() == d2.getMonth()) &&
               (d1.getDayOfMonth() == d2.getDayOfMonth()) &&
               (d1.getHour() == d2.getHour()) &&
               (d1.getMinute() == d2.getMinute()) );
    }
    
    
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    
    public LocalDateTime GenerateRandomTime(LocalDateTime currentTime){
        return currentTime.plusMinutes(getRandomNumber(1,4));
    }
    
    
    
    public String getMessage(Reminder activity){
        String message = "";
                    switch(activity){
                case WORKOUT:
                    message = "Workout!";
                break;
                case DRINK_WATER:
                    message = "Drink Water!";
                break;
                case EAT_APPLE:
                    message = "Eat Apple!";
                break;
                case GO_WALK:
                    message = "Go for a walk!";
                break;
                case GO_CYCLING:
                    message = "Go Cycling!";
                break;
            }
                    
                    return message;
    }
    
    
    public String getReminderMessage(){
        String message = "Don't forget to:";
        ArrayList<Reminder> reminders = reminderList.getReminders();
        
        for(int i = 1;i <= reminders.size();i++){
            message = message + "\n" + i + "." + getMessage(reminders.get(i-1));
        }
        
        return message;
    }
    
    
    public void setReminders(){
        remindersThread = new Thread(() -> {
                //ArrayList<Reminder> remindersToSetOff = new ArrayList<Reminder>();
 
                
              while(true){
                  if(this.equalDateTimeInstances(LocalDateTime.now(), reminderTime)){
                      reminderTime = reminderTime.plusHours(1);
//                      reminderTime = GenerateRandomTime(reminderTime);
                      JOptionPane.showMessageDialog(null,getReminderMessage());
                  }
              }
            
        });
        
        remindersThread.start();
    }
    
}
