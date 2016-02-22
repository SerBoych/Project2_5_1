package edu.boychuk;

/**
 * Created by Sergey on 22-Feb-16.
 */
public class MyInitText {
    static {
        System.out.println("static initialization bloc 1");
    }
    static {
        System.out.println("static initialization bloc 2");
    }
    {
        System.out.println("non-static initialization bloc 1");
    }
    {
        System.out.println("non-static initialization bloc 2");
    }
    public MyInitText() {
     this(0);
        System.out.println("constructor 2");
    }
    public MyInitText(int i){
        System.out.println("constructor 1");

    }



}
