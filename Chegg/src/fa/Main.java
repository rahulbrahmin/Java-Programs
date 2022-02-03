package fa;

//{ Driver Code Starts
import java.util.*;
public class Main
{
	static void printArray(int arr[])
 {
     int n = arr.length;
     for (int i=0; i<n; ++i)
         System.out.print(arr[i]+" ");
     System.out.println();
 }
 
 // Driver program
 public static void main(String args[])
 {
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter elements:  ");
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			printArray(arr);
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		
} }// } Driver Code Ends


class Solution
{
 static void quickSort(int arr[], int low, int high)
 {
     if(low<high)
     {
         int pivet= partition(arr,low,high);
         quickSort(arr,low,pivet-1);
         quickSort(arr,pivet+1,high);
     }
 }
 static int partition(int arr[], int low, int high)
 {
     int pivet=arr[low];
    int i=low;
    int j=high;
     
     while(i<j){
     while(arr[i]<pivet){
         i++;
     }
     while(arr[j]>pivet){
         j--;
     }
     
     if(arr[i]>pivet && arr[j]<pivet){
         swap(arr,i,j);
     }
    
     }
     swap(arr,low,i);
     return i;
 } 
 
 static int[] swap(int arr[],int n,int m)
 {
     int temp=arr[n];
     arr[n]=arr[m];
     arr[m]=temp;
     return arr;
 }
}
