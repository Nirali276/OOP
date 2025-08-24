public class pr2_7{
public static void main(String[] args){

if(args.length==0){
	System.out.println("Please provide the number of terms as a command line argument");
   return;
}
int n = Integer.parseInt(args[0]);
double sum = 0.0;
System.out.println("Harmonic series up to"+ n +"terms:");

for(int i=1; i<=n; i++){
    sum +=1.0/i;
	System.out.println("1/"+i);
	if(i<n){
		System.out.println("+");
	}
}
System.out.println("\n sum of harmonic series="+sum);
}
}
