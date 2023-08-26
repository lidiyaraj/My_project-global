package newpackage;

public class Copy_arr {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		int arr1[];
		int len=arr.length;
		System.out.println(" before copying");
		for (int i=0;i<len;i++) {
         System.out.println( "Array elements are:"+arr[i]);
	}
		arr1=arr;
		for(int j=0;j<arr1.length;j++) {
			System.out.println(" After coppying array:"+arr1[j]);
		}
		
	}
		
}
