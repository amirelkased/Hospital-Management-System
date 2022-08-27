package School.MS;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class School {
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        School.teachers = teachers;
        School.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Update earned money
     *
     * @param totalMoneyEarned update bank
     */
    public static void UpdateTotalMoneyEarned(int totalMoneyEarned) {
        School.totalMoneyEarned += totalMoneyEarned;
    }

    /**
     * Update the end of month
     *
     * @param totalMoneySpent Spent
     */
    public static void UpdateTotalMoneySpent(int totalMoneySpent) {
        School.totalMoneySpent += totalMoneySpent;
        School.totalMoneyEarned -= totalMoneySpent;
    }

    /**
     * Get all about school
     *
     * @return all teacher, students and status of money
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * add new teacher
     *
     * @param teacher new teacher
     */
    public static void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * add new student
     *
     * @param student new teacher
     */
    public static void addStudent(Student student) {
        try {
            students.add(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verify(int x, int money) {
        boolean state = false;
        for (Student s : students) {
            if (s.getId() == x) {
                System.out.println("Verified and Waiting...");
                s.setFeesPaid(money);
                state = true;
            }
        }
        if (!state) System.out.println("Fail Verified, Try Again!");
    }

    public static int check(int x) {
        for (Student s : students) {
            if (s.getId() == x) {
                return s.getFeesTotal();
            }
        }
        return -1;
    }
    public static String named(int x) {
        for (Student s : students) {
            if (s.getId() == x) {
                return s.getName();
            }
        }
        return "-1";
    }

    public static int wither(int id) {
        for (Teacher s : teachers) {
            if (s.getId() == id) {
                return s.getSalary();
            }
        }
        System.out.println("Fail Verified, Try Again!");
        return -1;
    }
}
