package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] arr;
	public ArrayList() {
		arr = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return arr[loc];
	}
	
	public void add(T val) {

		//A. create and initialize a new int array to be one 
		//   element longer than the member array
		T[] arr1 = (T[]) new Object[arr.length+1];
		//B. set the last element of your new array to 
		//   the value passed into the method
		arr1[arr1.length-1]= val;
		//C. iterate through the member array and 
		//   copy every element from the member array 
		//   to the new array
		for (int i = 0; i < arr.length; i++) {
			arr1[i]=(T) arr[i];
		}
		//D. set the member array equal to the new array.
		arr=arr1;
	
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr2;
		//A. create and initialize a new int array to be one 
		//   element longer than the member array
		arr2 = (T[]) new Object[arr.length+1];
		//B. Make a for loop that iterates through the new array
for (int i = 0; i < arr2.length; i++) {
	

			//C. if i is less than location:
		    //		set the element at i of the new array to the element at i of the member array
			if(i<loc) {
				arr2[i]= arr[i];
			}else if(i>loc){
			//D. else if i is greater than location:
		    //		set the element at i of the new array to the i - 1 element of the member array
				arr2[i]=arr[i-1];
			}else {
			//E. else, set the element at i of the new array to the value v
				arr2[i]=val;
				
}
}
			
		//F. set the member array equal to the new array
		arr=arr2;

	
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		arr[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arr3;
		//A. create a new array that is one element smaller than the member array
		arr3 = (T[]) new Object[arr.length-1];
		//B. make a for loop to iterate through the member array
		for (int i = 0; i < arr.length; i++) {
			//C. if i  is less than location
			//		set the element at i of the new array to the element at i of the member array
			if(i<loc) {
				arr3[i]=arr[i];
			}else if(i>loc) {
			//D. else if i  is greater than location
			//		set the element at i - 1 of the new array to the element at i of the member array
			arr3[i-1]=arr[i];
			}else {
			//E. else, continue;
			continue;
			}
		}
		//F. set the member array equal to the new array
		arr=arr3;
	
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==val) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return arr.length;
	}
}