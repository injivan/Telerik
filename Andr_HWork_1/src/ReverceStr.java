
public class ReverceStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "123456789";
		System.out.println(reverceMe(a));
		System.out.println(reverceMeChar(a)); 
	}
	private static String reverceMe(String a){
		String b="";  
		for (int i = a.length()-1; i>=0; i--) {
			b = b + a.substring(i,i+1);
		}
		return b;
	}
	private static String reverceMeChar(String a){
		int j = a.length()-1;
		char[] b= new char[j+1];  
		for (int i = 0; i<=j; i++) {
			b[i] = a.charAt(j-i);
		}
		return String.valueOf(b);
	}
	 
}
