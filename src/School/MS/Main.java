package School.MS;

import java.util.Scanner;

public class Main {
    static int flow = 0, id = 0, stop = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("System Started : ");
            System.out.println("Welcome in my School Management System : ");
            System.out.println("Which Functionality Do you want ? ");
            System.out.println("1 - Add new Teacher");
            System.out.println("2 - Add new Student");
            System.out.println("3 - Make a banking process for student / teacher");
            System.out.println("4 - Show Balance School");
            flow = input.nextInt();
            switch (flow) {
                case 1: {
                    System.out.println("Insert ID, Name and began Salary Respectively");
                    Teacher T = new Teacher(input.nextInt(), input.next(), input.nextInt());
                    School.addTeacher(T);
                    System.out.println("The process is completed.");
                }
                break;
                case 2: {
                    System.out.println("Insert ID, Name and Grade Respectively");
                    Student S = new Student(input.nextInt(), input.next(), input.nextInt());
                    School.addStudent(S);
                    System.out.println("The process is completed.");
                }
                break;
                case 3: {
                    System.out.println("Which process you needed?");
                    System.out.println("1 - Pay Fees of Student");
                    System.out.println("2 - Withdrawal for teacher");
                    flow = input.nextInt();
                    if (flow == 1) {
                        System.out.println("Enter ID of the student : ");
                        id = input.nextInt();
                        System.out.println("Available Fees of Student : " + School.named(id) + " Is = " + School.check(id));
                        System.out.println("Enter Amount in $ : ");
                        flow = input.nextInt();
                        School.verify(id, flow);
                    } else if (flow == 2) {
                        System.out.println("Enter ID of the Teacher : ");
                        id = input.nextInt();
                        id = School.wither(id);
                        if (id > 0) {
                            System.out.println("Okay, Place : " + id);
                        }
                    }
                }
                break;
                case 4: {
                    System.out.println("Earned : " + School.getTotalMoneyEarned());
                    System.out.println("Spent : " + School.getTotalMoneySpent());
                }
            }
            System.out.println("If you need Stop system Enter 0 Else Enter any num :");
            stop = input.nextInt();
        } while (stop != 0);
    }
}