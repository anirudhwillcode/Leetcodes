class Shape{
    String Name;
    int sides;
    int perimeter;
}

class Triangle extends Shape{
    String Name="BaiduTRIANGLE";
    int sides=3;
    int perimeter=40;

}

class Rectangle extends Shape{
    String Name="SamdiRECTANGLE";
    int sides=3;
    int perimeter=40;

}
class Circle extends Shape{
    String Name="CIrcleee";
    int sides=0;
    

}



public class OOPSinheritence{
    public static void main(String args[]){
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        
        System.out.println("Triangle");
        System.out.println(triangle.Name);
        System.out.println(triangle.sides);
        System.out.println(triangle.perimeter);

    }
}