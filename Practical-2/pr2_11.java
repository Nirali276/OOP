public class pr2_10{
    public static void main(String[] args) {
	
        int intVal = 100;               
        float floatVal = intVal;        
        double doubleVal = floatVal;    

        System.out.println("Widening Typecasting:");
        System.out.println("int value: " + intVal);
        System.out.println("float value (from int): " + floatVal);
        System.out.println("double value (from float): " + doubleVal);

        doubleVal = 123.456;           
        floatVal = (float) doubleVal;  
        intVal = (int) floatVal;      

        System.out.println("\nNarrowing Typecasting:");
        System.out.println("double value: " + doubleVal);
        System.out.println("float value (from double): " + floatVal);
        System.out.println("int value (from float): " + intVal);
    }
}
