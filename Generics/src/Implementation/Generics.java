package Implementation;

public class Generics {

    static class Student{

        int roll;
        String name;


        Student(int roll, String name){
            this.roll = roll;
            this.name = name;
        }
    }

     static class Exam <E,M> extends Student{

        E subject;
        M marks;

        Exam(E exam, M marks, int roll, String name){

            super(roll , name);
            this.subject = exam;
            this.marks = marks;
        }

    }

    public static void main(String[] args) {

        Student s = new Student(4, "Abhishek");

       Exam<String, Integer> e = new Exam<>("Maths",78,s.roll, s.name );

        System.out.println(e.name);
        System.out.println(e.roll);
        System.out.println(e.subject);
        System.out.println(e.marks);


        Exam<String, String> e1 = new Exam<>("Science","56",s.roll, s.name );

        System.out.println(e1.name);
        System.out.println(e1.roll);
        System.out.println(e1.subject);
        System.out.println(e1.marks);
    }
}
