package newpackage;

public class Small_arr {

	public static void main(String[] args) {
		int arr[]= {3,11,9,7,4};
		int small=arr[0];
		int len=arr.length;
		System.out.println(len);
		for(int j=1;j<len;j++) {
			if( small>arr[j])
				small=arr[j];
			
			
		}
		System.out.println("Smallest number is:"+small);

	}

}
