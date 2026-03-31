package Implementation;

public class  QueueB {

    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front;

        public Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //Add
        public static void add(int data){
            if(full()){
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }

            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public static boolean full(){
            return (rear + 1) % size == front;
        }


        // Remove -
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;

            return front;
        }

        // Peek -
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(5);
        q.add(3);
        q.add(8);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println(Queue.isEmpty());


    }
}
