Import java.util.*;
Class CPN making {
	Public static void main(String[] args) {
	Scanner ob= new Scanner(System.in);
			System.out.println(“Entet the mtric  Marks”);
			Double a=ob.nextDouble();
			System.out.println(“Enter the Intermediate Marks”);
			Double b=ob.nextDouble();
			System.out.println(“Enter the test Marks”);
			Double c=ob.nextDouble();
			Double total=(a/850*100)*0.1+(b/1100*100)*0.3+(c/100*100)*0.6;
			System.out.println(“your CPN is :”);
			System.out.println(total);
		
	}
}
