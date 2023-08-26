package project2;

import java.util.ArrayList;

public class GFG {

	public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	for(int i=1;i<=5;i++)
		a1.add(i);
	System.out.println(a1);
	a1.remove(3);
	System.out.println(a1);
	for(int i=0;i<a1.size();i++)
		System.out.println(a1.get(i)+" ");

	}

}
