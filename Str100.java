import java.io.*;

public class Str100 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("Test.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readUTF());
		
		
	
		
		
	}

}
