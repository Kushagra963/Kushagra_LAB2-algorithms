import java.util.*;
public class PayMoney {
	
	public static void main(String[]args) {
	
	System.out.println("Enter the size of transaction array");
	
	Scanner sc = new Scanner(System.in);
	
     int k  = sc.nextInt();
     
   System.out.println("Enter the values of array"); 
   
   int array1[]=new int[k];
   
   for(int i = 0 ; i < k ; i++) {
	   
	   array1[i]=sc.nextInt();
	   
	    }
   
   System.out.println("Enter total number of targets that are needed to be achieved");
   
   int totaltarget = sc.nextInt();
   
   
   int target=0;
   
   for(int j = 0 ; j < totaltarget ; j++) {
	   
	   System.out.println("Enter the value of target");
	   
	   
	    target = sc.nextInt();
	    
	    Result(target,array1);
	   
	   
   }
   
    
   
   
	}
	
	public static void Result(int newtarget , int array2[]) {
		
		
		System.out.println(newtarget);
		
		int m = array2.length; 
		int sum = 0 ;
		
		
		for(int i  = 0 ; i < m ; i ++) {
			
			sum = sum + array2[i];
			
			if(sum>newtarget) {
				
				
				
				System.out.println("Target achieved after " + (i + 1 )+  " transactions");
				break;
			}else
				
				System.out.println("Given target is not achieved");
			
			
			
		}	
	}

}
