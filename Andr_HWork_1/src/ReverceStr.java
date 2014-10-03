
public class ReverceStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "123456789";
		System.out.println(reverceMe(a));
		 
	}
	private static String reverceMe(String a){
		String b="";  
		for (int i = a.length()-1; i>=0; i--) {
			b = b + a.substring(i,i+1);
		}
		return b;
	}
	 
}
