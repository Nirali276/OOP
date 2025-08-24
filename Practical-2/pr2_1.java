public class pr2_1 {
    public static void main(String[] args) {
		
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int max = num1;
		
        if (num2 > max) {
            max = num2;
        }
        else{
            max = num3;
        }

        System.out.println("Maximum number is:"+max);
    }
    
}
