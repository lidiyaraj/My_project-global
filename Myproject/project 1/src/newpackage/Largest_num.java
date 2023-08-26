package newpackage;

public class Largest_num {

	public static void main(String[] args) {
		int num1=50, num2=100, num3 = 25;
		if(num1>=num2&&num1>=num3) {
			System.out.println("the largest number is"+num1);
		}
			else if(num2>=num1&&num2>=num3) {
				System.out.println("the largest number is"+num2);
			}
			else if(num3>=num1&&num3>=num2) {
				System.out.println("the largest number is"+num3);
			}
				else
				{
					System.out.println("the number is not a largest number");
				}
		}

	}



