package newpackage;

public class Arr_large {

	public static void main(String[] args) {
		int arr[]= {50,25,75,100,125};
		int large=arr[0];
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		int len=arr.length;
		System.out.println(len);
		for(int i=1;i<len;i++) {
			//System.out.println(arr[i]);
			if(large<arr[i])
				large=arr[i];
			
		}
		System.out.println("largest value in arrray   "+ large);
	}
}
