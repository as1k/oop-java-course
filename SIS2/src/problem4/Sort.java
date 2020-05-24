package problem4;

import problem3.Employee;

class Sort {
	 static void swap(Object[] arr, int i, int j) {
		Object tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	 }
	 
	 public static void bubbleSort(Object[] arr) {
		 
		 if(arr.getClass() == Chocolate[].class) {
			 Chocolate[] tmp = (Chocolate[])arr;
			 for(int i = tmp.length-1; i >= 1; i--) {
				 for(int j = 0; j < i; j++) {
					 if(tmp[j].compareTo(tmp[j+1]) == 1) swap(tmp, j, j+1);
				 }
			 }
			 arr = tmp;
		 }
		 else if(arr.getClass() == Time[].class) {
			 Time[] tmp = (Time[])arr;
			 for(int i = tmp.length-1; i >= 1; i--) {
				 for(int j = 0; j < i; j++) {
					 if(tmp[j].compareTo(tmp[j+1]) == 1) swap(tmp, j, j+1);
				 }
			 }
			 arr = tmp;
		 }
		 else {
			 Employee[] tmp = (Employee[])arr;
			 for(int i = tmp.length-1; i >= 1; i--) {
				 for(int j = 0; j < i; j++) {
					 if(tmp[j].compareTo(tmp[j+1]) == 1) swap(tmp, j, j+1);
				 }
			 }
			 arr = tmp;
		 } 
	 }
	 
	 public static <E extends Comparable<E>> void quickSort(E [] array, int low, int high) {
		 if(array == null || array.length == 0) return;
		 
		 int i = low;
		 int j = high;
		 E pivot = array[low + (high-low)/2];
		    
		 while(i <= j) {
			 while(array[i].compareTo(pivot) == -1) i++;
			 while(array[j].compareTo(pivot) == 1) j--;
			 if(i <= j) {
				 swap(array, i, j);
				 i++;
				 j--;
				 }
			 }
		 if(low < j) quickSort(array, low, j);
		 if(i < high) quickSort(array, i, high);
	}
}