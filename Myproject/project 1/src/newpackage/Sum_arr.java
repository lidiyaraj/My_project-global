package newpackage;

public class Sum_arr {

	public static void main(String[] args) {
		int arr[]= {20,30,40,10};
		int sum=0;
		int len=arr.length;
		for(int i=0;i<len;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("sum of the numbers in the array:"+sum);
		float avg=sum/len;
		System.out.println("avearage of the numbers in the array:"+avg);
		
		
		
		

	}

}

