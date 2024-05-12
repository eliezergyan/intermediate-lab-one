package innerclass;

public class OuterClass {
    static int data = 30;

    static class InnerClass {
        void msg(){
            System.out.println("Data is " + data);
        }
    }

    public static void main (String[] args){
        OuterClass.InnerClass obj = new OuterClass.InnerClass();
        obj.msg();
    }
}
