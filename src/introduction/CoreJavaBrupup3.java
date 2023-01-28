package introduction;

public class CoreJavaBrupup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Strings in Java
		//String s= "geeta Chelliah"; //String literal
		String s1 = "geeta Chelliah"; //String literal
		
		String s2= new String ("geeta Chelliah"); // it will create mrmy allocation as new keyword is used
		String s3 =new String ( "geeta Chelliah"); //
		
		//Spilt the string
		String s= "geeta Chelliah baby";
		String[] Splittedstring =s.split(" ");
		System.out.println(Splittedstring[0]);
		
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
		
		//print the letters in reverse
		for(int i=s.length()-1; i>0; i--) {
			System.out.println(s.charAt(i));
			
		}
		
		
				
	}

}
