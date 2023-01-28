package introduction;

public class CoreJavaBrupup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mynum = 5;
		String s="geeta";
		char c ='c';
		double decimal = 123.77;
		boolean b = true;
		
		System.out.println(mynum);
		System.out.println(s);
		System.out.println(c);
		System.out.println(decimal);
		System.out.println(mynum + "is an integer");
		
		//Arrays
		
		int[] arr = new int[5];
		arr[0]=1;
		arr[0]=2;
		arr[0]=3;
		arr[0]=4;
		arr[0]=5;
		
		//other method of assigning array
		int[] arr2= {1,2,3,4,5,6,7,8,9,0,11};
		System.out.println(arr2[5]);
		
		// For loop
		for(int i=0; i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
			
		}
		
		//String array
		
		String[] name= {"geeta", "chelliah", "Dinesh", "Sumati"};
		
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i]);
			}
		
		//Enhanced for loop
		
		for ( String s1: name)
			System.out.println(s1);
		{
			
		}
		
		
		
		
		
		

	}

}
