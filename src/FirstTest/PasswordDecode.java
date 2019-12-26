package FirstTest;

public class PasswordDecode {

	public static void main(String[] args) {
		
		
	
		String psw="XXXXXXXXXXXX9998";
		String Encoded=java.util.Base64.getEncoder().encodeToString(psw.getBytes());
		
	System.out.println("Encoded Password"+Encoded);
	    String decode=new String(java.util.Base64.getDecoder().decode(psw));
		System.out.println("Decoded Password"+decode);
		
		
		

		
		
	}

}
