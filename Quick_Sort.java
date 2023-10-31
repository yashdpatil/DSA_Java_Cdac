import java.util.*;
class QSort{
	
public static void QuickSort(int arr[],int low,int high){
    if(low<high){
        int pi= Party(arr,low,high);
        QuickSort(arr,low,pi-1);
         QuickSort(arr,pi+1,high);
    }
    
}
public static int Party(int arr[],int low,int high){
   int pivot= arr[high];
   int i = low-1;
   for(int j = low;j<high;j++){
       if(arr[j]<pivot){
           i++;
           swap(arr,i,j);
       }
   }
   swap(arr,i+1,high);
   return (i+1);
    
}


	
	static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);	
	int[] arr = new int[5];
	for(int i =0;i<5;i++){
	    int s = sc.nextInt();
	    arr[i]=s;
	}
	QuickSort(arr,0,arr.length-1);
	display(arr);
		
	}
}
