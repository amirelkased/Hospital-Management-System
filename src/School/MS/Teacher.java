package School.MS;

/**
 * This class for keep track teachers
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * This use to create a new attachment for new recruiter teacher
     *
     * @param id     Unique
     * @param name   Teacher name
     * @param salary Unique depend on seniority
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        School.UpdateTotalMoneySpent(this.salary);
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
