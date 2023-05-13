package class21polymorphism;

public class Student {
    void study(){
        System.out.println("Student should study 10 hours");
    }
    void doingHomework(){
        System.out.println("10 Homework assignments a week");
    }
    void nap(){
        System.out.println("Nap for a hour a day");
    }
}
class SyntaxStudent extends Student{
    @Override
    void doingHomework() {
        System.out.println("15 Homework assignments a week");
    }
    @Override
    void nap(){
        System.out.println("No naps");
    }
    void skipsClass(){
        System.out.println("Student not here");
    }
}
class CollegeStudent extends Student{
    @Override
    void doingHomework() {
        System.out.println("9 Homework assignments a week");
    }

    @Override
    void study() {
        System.out.println("Study 20 hours");
    }
}
class SchoolStudent extends Student {
    void study() {
        System.out.println("Student should study 2 hours");
    }

    @Override
    void doingHomework() {
        System.out.println("5 Homework assignments a week");
    }

    void nap() {
        System.out.println("Nap for a 3 hours a day");

    }
    void fighting(){
        System.out.println("Students are fighting");
    }
}
class StudentTester {
    public static void main(String[] args) {
        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student stud : students) {
            if (stud instanceof SyntaxStudent) {
                ((SyntaxStudent) stud).skipsClass();}
            else if (stud instanceof SchoolStudent) {
                ((SchoolStudent)stud).fighting();
            }
                stud.doingHomework();
                stud.nap();
                stud.study();
                System.out.println();
            }


            Student syntax = new SyntaxStudent();
            ((SyntaxStudent) syntax).skipsClass();


            Student school = new SchoolStudent();
            ((SchoolStudent) school).fighting();
        }
    }

