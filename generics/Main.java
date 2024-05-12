package generics;

public class Main {
    public static void main(String[] args){
        // Passing an Integer
        MyGen<Integer> genInt = new MyGen<Integer>();
        genInt.set(2);
        System.out.println(genInt.get());

        // Passing a String
        MyGen<String> genStr = new MyGen<String>();
        genStr.set("Hello world");
        System.out.println(genStr.get());
    }
}
