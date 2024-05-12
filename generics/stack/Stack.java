package generics.stack;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack <T>{
    private List<T> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public void push(T item){
        stack.add(item);
    }

    public T pop(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public T peek(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.getLast();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }


    public static void main (String[] args){
        // Passing integers
        Stack<Integer> intStack = new Stack<Integer>();
        intStack.push(100);
        intStack.push(200);
        intStack.push(300);

        System.out.println("Top of stack: "  + intStack.peek());
        System.out.println("Size of stack: " + intStack.size());
        System.out.println("Pop element: " + intStack.pop());
        System.out.println("Size of stack after popping: " + intStack.size());
        System.out.println();

        // Passing strings
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Top of stack: "  + stringStack.peek());
        System.out.println("Size of stack: " + stringStack.size());
        System.out.println("Pop element: " + stringStack.pop());
        System.out.println("Size of stack after popping: " + stringStack.size());

    }

}
