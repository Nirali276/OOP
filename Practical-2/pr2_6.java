public class pr2_6
{
public static void main(String args[])
{
int number = Integer.parseInt(args[0]); 
int sum = 0;

for (int i = 1; i <= number / 2; i++) {
if (number % i == 0) {
sum += i;
}
}
if (sum == number) {
System.out.println(number + " is a Perfect Number.");
}
else {
System.out.println(number + " is NOT a Perfect Number.");
}
}
}
