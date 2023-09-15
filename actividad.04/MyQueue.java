package main;

/**
 * my implementation of the queue data structure
 */
public class MyQueue {

    private char[] queue;
    // tail is the first index to an empty element
    private int tail = 0;
    private int head = 0;
    private static int MAX = 100;


    public MyQueue(){

        queue = new char[100];

    }

    public void insert(char data){

        if(tail == MAX){
            System.out.println("Queue is full!");
            return;
        }
        queue[tail] = data;
        tail++;

    }

    /**
     * returns and deletes first element of queue
     * @return first element
     */
    public char delete(){

        char c = queue[head];

        if(tail == 0){
            System.out.println("QUEUE is empty.");
            return '#';
        }

        for(int i = 0; i < tail -1; i++){
            queue[i] = queue[i+1];
        }
        queue[tail-1] = 0;
        tail--;

        return c;

    }

   public char deleteRecursive(){
        return 'x';

   }

    public String toString(){
        String out = "Queue:\n";
        for(int i = 0; i < tail; i ++){
           out = out + "[" + i + "]\t\t" + queue[i] + "\n";
        }
       return out;
    }
}
