public class pr1_7
{
public static void main(String[] args)
{
double base= Double.parseDouble(args[0]);
double height = Double.parseDouble(args[1]);
double AreaofaTriangle =0.5*base*height;
System.out.println("base:" + base);
System.out.println("height:" + height);
System.out.println(" AreaofaTriangle = " + AreaofaTriangle);

double length = Double.parseDouble(args[2]);
double breadth = Double.parseDouble(args[3]);
double PerimeterofaRectangle = 2*(length + breadth); 
System.out.println("length:" + length);
System.out.println("breadth:" + breadth);
System.out.println("PerimeterofaRectangle = " + PerimeterofaRectangle);
}
}
