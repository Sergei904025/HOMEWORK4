package Triangle;

public class Triangle {
    public static void main( String[] args )
    {
        double a;

        a = triangleArea(3, 4, 5);
        System.out.println("Треугольник со сторонами 3,4,5 имеет площадь:" + a);

    }

    public static double triangleArea( int a, int b, int c )
    {
        double pp = (a + b + c) / 2.0;  // полупериметр
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}
