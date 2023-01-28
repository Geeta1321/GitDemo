package introduction;

import java.util.ArrayList;

public class CoreJavaBrupup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if else
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,0,11};
		//print the values multiply by2
		for(int i=0; i<arr2.length;i++)
			
		
		if(arr2[i]%2==0) {
			System.out.println(arr2[i]);
			
		}
		else {
			System.out.println(arr2[i] + "not multiply by 2");
		}
			
//check if the array is the multiple of 3
		for(int i=0; i<arr2.length;i++)
			
			
			if(arr2[i]%2==0) {
				System.out.println(arr2[i]);
				break;
		
	}
		
		//Arraylist
		ArrayList <String> a = new ArrayList <String>();
		a.add("Geeta");
		a.add("Dinesh");
		a.add("baby");
		//a.remove(1);
		System.out.println(a.get(2));
		
		
		

}
}
