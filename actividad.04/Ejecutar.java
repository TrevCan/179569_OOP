package main;

import java.util.Scanner;

public class Ejecutar {

    public Ejecutar(){

    }

    public void iniciarPrograma(){
        MyQueue queue;
        queue = new MyQueue();

        queue.insert('a');
        queue.insert('x');
        queue.insert('y');
        queue.insert('f');
        queue.insert('g');
        System.out.println(queue);

        System.out.println(queue.delete());
        System.out.println(queue);

        MyStack stack;
        stack = new MyStack();

        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        Scanner in = new Scanner(System.in);

        MyQueue queue2 = new MyQueue();
        MyStack stack2 = new MyStack();

        System.out.println("STACKS and QUEUES");
        System.out.println("Add to STACK AND QUEUE\n\t> add a b c d e ...\n");
        System.out.println("Add to STACK \n\t> stack add a b c d e ...\n");
        System.out.println("Add to QUEUE \n\t> queue add a b c d e ...\n\n");

        System.out.println("Print STACK AND QUEUE \n\t> print\n");
        System.out.println("Print STACK \n\t> stack print\n");
        System.out.println("Print QUEUE \n\t> queue print\n");
        System.out.println("> ");

        while(in.hasNext()){
            String input = in.next();
            if(input.startsWith("add ")) {
                //remove string "add "
                input = input.replace("add ", "");
                String[] data = in.next().split(" ");
                for (int i = 0; i < data.length; i++) {
                    queue2.insert(data[i].charAt(0));
                    stack2.push(data[i].charAt(0));
                }
            }
            else if(input.startsWith("print")){
                System.out.println(queue2);
                System.out.println(stack2);
            }

        }

        System.out.println(queue2);
        System.out.println(stack2);

    }
}
