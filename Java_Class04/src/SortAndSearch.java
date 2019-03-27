import java.util.Scanner;


public class SortAndSearch {
	
	
	
	static void bubbleSort(int[] arr) {  
		       int n = arr.length;  
		        int temp = 0;  
		         for(int i=0; i < n; i++){  
		                 for(int j=1; j < (n-i); j++){  
		                          if(arr[j-1] > arr[j]){  
		                                 
		                                 temp = arr[j-1];  
		                                 arr[j-1] = arr[j];  
		                                 arr[j] = temp;  
		                         }  
		                          
		                 }  
		         }  
		  
		    }  
		    public static void main(String[] args) {  
//		                int arr[] ={3,60,35,2,45,320,5};  
		    	Scanner arr = new Scanner(System.in); 
		    	System.out.println("Please enter length of String array");
		    	int length = arr.nextInt(); 
		    	String[] input = new String[length];
	            
		                System.out.println("Array After Bubble Sort");  
		                for(int i=0; i < arr.length; i++){  
		                        System.out.print(arr[i] + " ");  
		                }  
		   
		        }  

	
	
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubblesort algorithm
	//If you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search

}













