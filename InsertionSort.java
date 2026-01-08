public class InsertionSort{
       void sort(int arr[]){
       int n = arr.length;
       for(int i = 1; i < n; ++i){
       	       int key = arr[i];
	       int j = i - 1; 

	       //Insert A[j] into sorted sequence A[1...j-1]
	       while(j >= 0 && arr[j] > key) {
		   arr[j + 1] = arr[j]; //set value of j to key
		   j = j - 1; //new decrement value
	       	       }
		       arr[j + 1] = key;
       	       }
       }

       static void printArray(int arr[]){
       int n = arr.length;
       for(int i = 0; i < n; ++i){
       	       System.out.println(arr[i] + " " );
	      
		}
       }

	public static void main(String[] args){

	int arr[] = {12, 8, 2, 15,20};

	InsertionSort obj = new InsertionSort();
	obj.sort(arr);

	printArray(arr);
	}


}
