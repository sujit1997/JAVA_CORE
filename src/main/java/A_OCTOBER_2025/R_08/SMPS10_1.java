package A_OCTOBER_2025.R_08;
class circle {
    int radius;
    int diameter;

    public static double area(int radius){
        return Math.PI*radius * radius;
    }
}
class cylinder extends circle{

}
public class SMPS10_1 {
    public static void main(String[] args) {
     circle c1 = new circle();
     c1.radius = 6;
    double result =  circle.area(c1.radius);
        System.out.println(result);
    }
}
