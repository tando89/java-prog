package com.example.javapracticeifelse;
import java.util.*;
public class myClass {
    public static void main(String[] args) {
        //System.out.println("Your love score is: " + ifYouHadMyLove("John", " Cindy"));
        System.out.println(CalBMI(75, 1.6f));
    }

//    public static int ifYouHadMyLove(String yourName, String yourCrushName){
//        Random random = new Random();
//        int loveScore = random.nextInt(101);
//
//        if (loveScore > 80) {
//            System.out.println(yourName + " and" + yourCrushName + " You are born for each other");
//        } else if (loveScore > 40) {
//            System.out.println(yourName + " and" + yourCrushName + " You are almost in love");
//        }
//
//        else {
//            System.out.println("You have no love");
//        }
//        return loveScore;
//    }
    public static float CalBMI (float mass, float height) {
        float BMI = mass / height;
        if (BMI > 25) {
            System.out.println("You are overweight");
        } else if (BMI > 18.5f && BMI < 25) {
            System.out.println("You are normal weight");
        } else {
            System.out.println("You are underweight");
        }
        return BMI;
    }
}
