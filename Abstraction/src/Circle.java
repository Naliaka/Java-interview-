// concrete class

public class Circle extends Shape {

    double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    public double getArea(){
        //3.14 *r^2
        return Math.P1 * Math.pow(radius,2);
    }

    public String draw(){
        return "A" + color + "circle with" +
                radius + "inch radius is drawn";
    }
}
