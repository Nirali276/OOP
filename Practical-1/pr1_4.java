public class pr1_4
{
public static void main(String[] args)
{
  //4.1
double distance = Double.parseDouble(args[0]);
double time = Double.parseDouble(args[1]);
double speed= distance/time;
System.out.println("Distance: " + distance);
System.out.println("Time: " + time);
System.out.println("Speed = " + speed);

  //4.2
double principal = Double.parseDouble(args[2]);
double rate = Double.parseDouble(args[3]);
double SimpleInterest = (principal * rate * time) / 100;
System.out.println("principal:" + principal);
System.out.println("rate:" + rate);
System.out.println("Simple Interest = " + SimpleInterest);

  //4.3
double radius = Double.parseDouble(args[4]);
double height = Double.parseDouble(args[5]);
double VolumeofCylinder = 3.14*radius*radius*height;
System.out.println("radius:" + radius);
System.out.println("height:" + height);
System.out.println("Volume of Cylinder = " + VolumeofCylinder);
}
}
