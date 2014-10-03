import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;


public class CountWord {

	public static void main(String[] args) {
		 
		try {
			System.out.println(OpenFile());
		} catch (Exception e) {
			e.printStackTrace();
		} 		
	}
	private static int OpenFile() throws IOException {
		FileReader file= new FileReader("Words.txt");
		BufferedReader br = new BufferedReader(file);
		HashMap<String,Integer> words = new HashMap<String, Integer>();
		do {
			String line = br.readLine(); 
			if (line != null){
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					String word = st.nextToken().toLowerCase();
					if (words.get(word)== null) {
						words.put(word, 1);
					}
				}
			} else{
				break;
			}
		} while (true);
		file.close();
		return words.size();
	}
}
