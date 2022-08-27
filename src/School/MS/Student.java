package School.MS;

/**
 * This Class is responsible for keeping track
 * of students Fees, name, grade and Fees paid
 */
public class Student {
    private String name;
    private int id;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing values constructor of Student Class
     * Fees for new student is initial equal to 30,000$ Excuse me is a pretty School😂.
     * Fees Paid at the same time is equal to 0$.
     *
     * @param id    for student : unique
     * @param name  for the student
     * @param grade for the student
     */
    public Student(int id, String name, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;
    }
    // Not able to Alter name or id of any student.

    /**
     * Used to Update the Grade of student
     *
     * @param grade this is new var of new grade
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * this Method for update Status Fees of student
     * Fees Total and Fee paid
     *
     * @param feesPaid var of fee paid (Funds) by student
     */
    public void setFeesPaid(int feesPaid) {
        this.feesPaid += feesPaid;
        this.feesTotal -= this.feesPaid;
        School.UpdateTotalMoneyEarned(feesPaid);
        System.out.println("The Process is completed Successfully!");
    }

    /**
     * 5 Method to return data of specific student
     *
     * @return id, grade, Fee paid, Fee Total and name
     */
    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public String getName() {
        return name;
    }

}
