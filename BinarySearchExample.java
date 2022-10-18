
public class BinarySearchExample {
	
	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2; //Finds the middle of the array
		while(first <= last) {
			//While loop that goes through the array
			if(arr[mid] < key) {
				first = mid + 1;
				//This first if statement checks to see if the middle of the array is the number we are looking for. if not, it continues searching through he array
			}else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
				//This statement means that if the middle is actually the number we are looking for it prints a message saying item or number found
			}else {
				last = mid - 1;
			}
			//This starts at the mid if it is bigger than the key it goes backwards in the array looking for the key.
			mid = (first + last) / 2;
		}
		if(first > last) {
			System.out.println("Element is not found!");
		}
		//This statement is saying if the first item/element in the array is bigger than the key. Then don't bother going through the array and just print out "Element is not found"
	}
	

	public static void main(String[] args) {
			int arr[] = {10,20,30,40,50};
			int key = 30;
		int last = arr.length-1;
			binarySearch(arr,0,last,key);
		

	}

}
