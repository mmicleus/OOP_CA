/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp.Lists;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import trackerapp.Exercise;
import trackerapp.Workout;
import trackerapp.WorkoutPlan;
import trackerapp.WorkoutPlanFilters;
import trackerapp.enums.WorkoutExperience;
import trackerapp.enums.WorkoutType;

/**
 *
 * @author micle
 */
public class WorkoutPlanList implements Serializable {
     ArrayList<WorkoutPlan> plans;
     String filename="WorkoutPlans.ser";
    
     private WorkoutPlanList(){
        
        try{
            loadWorkoutPlans();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
    }
    
   
    private static WorkoutPlanList INSTANCE = new WorkoutPlanList();
    
    
    public static WorkoutPlanList getInstance(){
        return INSTANCE;
    }
    
    public void addPlan(WorkoutPlan plan){
        plans.add(plan);
    }
    
    public ArrayList<WorkoutPlan> getPlans(){
        return plans;
    }
    
    public ArrayList<WorkoutPlan> GeneratePlans(){
              ArrayList<WorkoutPlan> workoutPlans = new ArrayList<WorkoutPlan>();

        ArrayList<Workout> workouts1 = new ArrayList<Workout>();
        ArrayList<Workout> workouts2 = new ArrayList<Workout>();
        ArrayList<Workout> workouts3 = new ArrayList<Workout>();
        ArrayList<Workout> workouts4 = new ArrayList<Workout>();
        ArrayList<Workout> workouts5 = new ArrayList<Workout>();
        ArrayList<Workout> workouts6 = new ArrayList<Workout>();
        ArrayList<Workout> workouts7 = new ArrayList<Workout>();
        ArrayList<Workout> workouts8 = new ArrayList<Workout>();
        ArrayList<Workout> workouts9 = new ArrayList<Workout>();
        ArrayList<Workout> workouts10 = new ArrayList<Workout>();
        
        ArrayList<Exercise> exercises1 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises2 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises3 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises4 = new ArrayList<Exercise>();
        
        
         ArrayList<Exercise> exercises5 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises6 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises7 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises8 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises9 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises10 = new ArrayList<Exercise>();
        ArrayList<Exercise> exercises11 = new ArrayList<Exercise>();
        
        
        
        exercises1.add(new Exercise("Shoulder Press",5,6));
        exercises1.add(new Exercise("Lateral Raises",4,14));
        exercises1.add(new Exercise("Dumbell Kickback",4,12));
        exercises1.add(new Exercise("Skull Crushers",5,14));
        exercises1.add(new Exercise("Squats",6,6));
        
        exercises5.add(new Exercise("Shoulder Press",5,6));
        exercises5.add(new Exercise("Lateral Raises",4,14));
        exercises5.add(new Exercise("Dumbell Kickback",4,12));

        
        
        exercises2.add(new Exercise("Bench Press",5,6));
        exercises2.add(new Exercise("Cable Flys",3,20));
        exercises2.add(new Exercise("Dumbell Curls",4,12));
        exercises2.add(new Exercise("Cable Curls",4,12));
        exercises2.add(new Exercise("T-bar rows",4,10));
        
        
         exercises6.add(new Exercise("Bench Press",5,6));
        exercises6.add(new Exercise("Cable Flys",3,20));
        exercises6.add(new Exercise("Dumbell Curls",4,12));
        
        
        exercises3.add(new Exercise("Barbell Shrugs",5,6));
        exercises3.add(new Exercise("Barbell Deadlift",3,20));
        exercises3.add(new Exercise("Upright rows",4,12));
        exercises3.add(new Exercise("Face Pulls",4,12));
        
        exercises7.add(new Exercise("Barbell Shrugs",5,6));
        exercises7.add(new Exercise("Barbell Deadlift",3,20));
        exercises7.add(new Exercise("Upright rows",4,12));
        exercises7.add(new Exercise("Face Pulls",4,12));
        
        exercises8.add(new Exercise("Pull Ups",5,6));
        exercises8.add(new Exercise("Jump Squats",3,20));
        exercises8.add(new Exercise("Push Ups",4,12));
        exercises8.add(new Exercise("Crunches",4,12));
        
        exercises9.add(new Exercise("Burpees",5,6));
        exercises9.add(new Exercise("Jump Rope",3,20));
        exercises9.add(new Exercise("Chin Ups",4,12));
        exercises9.add(new Exercise("Dips",4,12));
        
        
        exercises10.add(new Exercise("Hanging Leg Raises",5,6));
        exercises10.add(new Exercise("Knee Push-Ups",3,20));
        exercises10.add(new Exercise("Lateral Squats",4,12));
        exercises10.add(new Exercise("Muscle-ups",4,12));
        
        exercises11.add(new Exercise("Treadmill",5,6));
        exercises11.add(new Exercise("Swimming",3,20));
        exercises11.add(new Exercise("Mountain Climbers",4,12));
        
       
        
        workouts1.add(new Workout(0,exercises1));
        workouts1.add(new Workout(2,exercises2));
        workouts1.add(new Workout(4,exercises1));
        
        
        workouts2.add(new Workout(1,exercises1));
        workouts2.add(new Workout(3,exercises2));
        
        workouts3.add(new Workout(0,exercises1));
        workouts3.add(new Workout(1,exercises2));
        workouts3.add(new Workout(2,exercises3));
        workouts3.add(new Workout(3,exercises1));
        workouts3.add(new Workout(4,exercises2));
        
        
        workouts4.add(new Workout(0,exercises5));
        workouts4.add(new Workout(1,exercises6));
        workouts4.add(new Workout(2,exercises7));
        workouts4.add(new Workout(3,exercises5));
        workouts4.add(new Workout(4,exercises6));
        
        
        workouts5.add(new Workout(1,exercises5));
        workouts5.add(new Workout(4,exercises6));
        
        
        workouts6.add(new Workout(0,exercises5));
        workouts6.add(new Workout(2,exercises6));
        workouts6.add(new Workout(4,exercises7));
        
        workouts7.add(new Workout(0,exercises8));
        workouts7.add(new Workout(2,exercises9));
        workouts7.add(new Workout(4,exercises10));
        
        
        workouts8.add(new Workout(0,exercises8));
        workouts8.add(new Workout(1,exercises9));
        workouts8.add(new Workout(2,exercises10));
        workouts8.add(new Workout(3,exercises8));
        workouts8.add(new Workout(4,exercises9));
        
        
        workouts9.add(new Workout(0,exercises8));
        workouts9.add(new Workout(1,exercises9));
        workouts9.add(new Workout(2,exercises10));
        workouts9.add(new Workout(3,exercises8));
        workouts9.add(new Workout(4,exercises9));
        workouts9.add(new Workout(5,exercises10));
        workouts9.add(new Workout(6,exercises11));

        
        
               
        
        workoutPlans.add(new WorkoutPlan(workouts1,WorkoutExperience.ADVANCED,WorkoutType.WEIGHTLIFTING));
        workoutPlans.add(new WorkoutPlan(workouts2,WorkoutExperience.ADVANCED,WorkoutType.WEIGHTLIFTING));
         workoutPlans.add(new WorkoutPlan(workouts3,WorkoutExperience.ADVANCED,WorkoutType.WEIGHTLIFTING));
         
          workoutPlans.add(new WorkoutPlan(workouts4,WorkoutExperience.BEGINNER,WorkoutType.WEIGHTLIFTING));
          workoutPlans.add(new WorkoutPlan(workouts5,WorkoutExperience.BEGINNER,WorkoutType.WEIGHTLIFTING));
          workoutPlans.add(new WorkoutPlan(workouts6,WorkoutExperience.BEGINNER,WorkoutType.WEIGHTLIFTING));
          
          
          workoutPlans.add(new WorkoutPlan(workouts7,WorkoutExperience.INTERMEDIATE,WorkoutType.CALITHENICS));
          workoutPlans.add(new WorkoutPlan(workouts8,WorkoutExperience.INTERMEDIATE,WorkoutType.CALITHENICS));
          workoutPlans.add(new WorkoutPlan(workouts9,WorkoutExperience.INTERMEDIATE,WorkoutType.CALITHENICS));
        
          return workoutPlans;
    }
    
    public ArrayList<WorkoutPlan> getPlansByFilters(WorkoutPlanFilters filters){
        ArrayList<WorkoutPlan> results = new ArrayList<WorkoutPlan>();
        
        for(WorkoutPlan wp : plans){
            if(wp.getExperience() == filters.getExperience() 
               && wp.getType() == filters.getWorkoutType()
               && wp.getWorkouts().size() == filters.getDaysAWeek()){
            
                results.add(wp);
                
            } 
        }
        
        return results;
    }
    
    
    public void loadWorkoutPlans() throws FileNotFoundException, IOException {
        
        FileInputStream fileIn;
        ObjectInputStream in;
        
        try{
            fileIn = new FileInputStream(filename);
            in = new ObjectInputStream(fileIn);
            plans = (ArrayList<WorkoutPlan>)in.readObject();
        }
        catch(Exception ex){
            plans = GeneratePlans();
        }
    }
    

    
    
}
