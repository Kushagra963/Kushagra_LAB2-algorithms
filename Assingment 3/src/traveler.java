import java.util.*;
public class traveler {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the size of currency denominations");
		 int k = sc.nextInt();
		 
		 System.out.println("Enter the currency denominations value");
		 
		 int array[]=new int[k];
		 
		 for(int i = 0 ; i < k ; i++) {
			 
			 array[i]=sc.nextInt();
			 
		 }
		 
		 System.out.println("Enter the amount you want to pay");
		 
		 int amount =sc.nextInt();
		 
		 CurrencyCount(amount,array);
		 
		 
		}


	
	public static void CurrencyCount(int newamount,int array1[]) {
		
		int m = array1.length;
		
		int noteCounter[]=new int[m];
		
		for(int i = 0 ; i< m ;i++) {
			if(newamount >= array1[i]) {
				noteCounter[i]=newamount/array1[i];
				 newamount = newamount % array1[i];
			}
		}
				
			
		 for(int j = 0 ; j <m ;j++) {
			 
			 if(noteCounter[j]!=0) {
				 System.out.println(array1[j]+ " : " +noteCounter[j]);
			 }
		 }
		}
	
}


