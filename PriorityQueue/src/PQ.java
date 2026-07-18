
import java.util.Comparator;
import java.util.PriorityQueue;


public class PQ {

    static class Student implements Comparable<Student>{
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student o) {
            return this.marks - o.marks;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        Student s1 = new Student("Abhishek", 89);
        Student s2 = new Student("Rahul", 98);
        Student s3 = new Student("Mansi", 69);

        pq.add(s1);
        pq.add(s2);
        pq.add(s3);


        while(!pq.isEmpty()){
            System.out.print(pq.peek().name + " ");
            pq.remove();
        }
    }
}
