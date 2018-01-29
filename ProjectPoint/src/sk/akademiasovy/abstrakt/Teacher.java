package sk.akademiasovy.abstrakt;

public class Teacher extends Person {
@Override
public void info(){
    System.out.println("I am a teacher.");
}
private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
