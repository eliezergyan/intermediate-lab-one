package generics;

public class MyGen <T>{
    T obj;

    void set (T obj) {
        this.obj = obj;
    }

    T get(){
        return obj;
    }
}
