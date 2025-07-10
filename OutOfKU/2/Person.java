import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    String getName(){
        return name;
    }
}

class Student extends Person {
    private int math;
    private int science;
    private int english;

    public Student(String name, int age){
        super(name, age);
    }

    public double getAverage(){
        return (math + science + english) / 3.0;
    }

    public char displayGrade(int grade) {
        if (grade >= 90) return 'A';
        else if (grade >= 80) return 'B';
        else if (grade >= 70) return 'C';
        else if (grade >= 60) return 'D';
        else return 'F';
    }

    public void studentInput(Scanner in) {
        System.out.print("Math: ");
        math = in.nextInt();
        System.out.print("Science: ");
        science = in.nextInt();
        System.out.print("English: ");
        english = in.nextInt();
    }

    public void showSummary() {
        System.out.println("Name: " + getName());
        System.out.println("Math Grade: " + displayGrade(math));
        System.out.println("Science Grade: " + displayGrade(science));
        System.out.println("English Grade: " + displayGrade(english));
        System.out.printf("Average Score: %.2f\n", getAverage());
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.print("Number of students: ");
        int studentCount = in.nextInt();
        in.nextLine();

        for (int i = 1; i <= studentCount; i++) {
            System.out.println("\nStudent " + i);
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Age: ");
            int age = in.nextInt();

            Student s = new Student(name, age);
            s.studentInput(in);
            studentList.add(s);
            in.nextLine();
        }

        System.out.println("\n=== Student Summary ===");
        for (Student s : studentList) {
            s.showSummary();
        }
    }
}
