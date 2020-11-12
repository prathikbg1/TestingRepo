import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write_read {
	
	public static void main(String[] args) throws IOException {
		
	

/*	FileWriter fw = new FileWriter("/home/prathik.g/Desktop/dem.txt");
	BufferedWriter bf = new BufferedWriter(fw);
	bf.write("clarity");
	bf.close(); */
		
		FileReader fr = new FileReader("/home/prathik.g/Desktop/dem.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str = br.readLine())!=null) {
			System.out.println(str);
		}
	br.close();
	
}
}