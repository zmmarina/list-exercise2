package com.zmonteiro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Character> answers = new ArrayList<>();

        System.out.println("Did you call to the victim? (y/n): ");
        char question1 = sc.next().charAt(0);
        answers.add(question1);

        System.out.println("Have you been inside the crime scene? (y/n): ");
        char question2 = sc.next().charAt(0);
        answers.add(question2);

        System.out.println("Do you live close to the victim? (y/n): ");
        char question3 = sc.next().charAt(0);
        answers.add(question3);

        System.out.println("Did you owe to the victim? (y/n): ");
        char question4 = sc.next().charAt(0);
        answers.add(question4);

        System.out.println("Have you worked with the victim? (y/n): ");
        char question5 = sc.next().charAt(0);
        answers.add(question5);

        Iterator<Character> iteratorAnswers = answers.iterator();
        int sum = 0;
        while (iteratorAnswers.hasNext()){
            char next = iteratorAnswers.next();
            if(next == 'y' || next == 'Y'){
                sum++;
            }
        }

        if(sum == 2){
            System.out.println("Suspect");
        }else if(sum == 3 || sum == 4){
            System.out.println("Accessory");
        }else if(sum == 5){
            System.out.println("Assassin");
        }else{
            System.out.println("Innocent");
        }

        sc.close();
    }
}
