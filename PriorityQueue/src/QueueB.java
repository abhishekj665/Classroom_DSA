
import java.util.LinkedList;
import java.util.Queue;
public class QueueB {

    static class Student implements Comparable<Student>{

        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override

        public int compareTo(Student o){
            return this.marks - o.marks;
        }
    }

    public static void main(String[] args) {
        Queue<Student> q = new LinkedList<>();

        Student s1 = new Student("Abhishek", 67);
        Student s2 = new Student("Mansi", 89);

        q.add(s1);
        q.add(s2);

        while(!q.isEmpty()){
            System.out.println(q.remove().marks);
        }
    }
}
