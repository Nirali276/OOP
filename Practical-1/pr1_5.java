public class pr1_5
{
public static void main(String[] args)
{
String rollNumber = args[0];
String name = args[1];
String course=args[2];
String semester=args[3];

System.out.println("(a) on a single line:");
System.out.println("rollNumber:" + rollNumber + ", name:" + name +", course:" + course + ", semester:" + semester);

System.out.println("\n(b) Each on a separate line:");
System.out.println("roll Number: " + rollNumber);
System.out.println("name: " + name);
System.out.println("course: " + course);
System.out.println("semester: " + semester);
}
}
