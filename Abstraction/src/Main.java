import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;


public class Main {
    public static void main (String[] args){
        Rectangle r = new Rectangle( "purple", length:5, width:2);
        Circle c = new Circle ("blue" radius:4);
        //shape s= new shape ("red");
        Shape s = new Rectangle ( color: "red", lenth:9, width:8);
        System.out.println{"shape Area:" + s.getArea());
        System.out.println(s.draw());

        System.out.println{"Rectangle Area:" + r.getArea());
        System.out.println{"Circle Area:" + c.getArea());

        System.out.println(r.draw());
        System.out.println(c.draw());
    }
}
