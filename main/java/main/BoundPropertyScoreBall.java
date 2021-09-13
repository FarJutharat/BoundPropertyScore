/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author macintoch
 */
public class BoundPropertyScoreBall {
    public static void main(String[] args){
        MyPropertyBean mySource = new MyPropertyBean();
        User1 user1 = new User1();
        User2 user2 = new User2();
        mySource.addPropertyChangeListener(user1);
        mySource.addPropertyChangeListener(user2);
  
        String score = "";
        Boolean checkout = false;
        Scanner inp = new Scanner(System.in);
        while(checkout!=true){
        System.out.print("Enter Score Thai : ");
        score = inp.nextLine();
        System.out.println(score + " UAE");
        if(score.equals("")) {
            checkout = true;
            return; }
        else mySource.setScore(score);
        }
    }
}
