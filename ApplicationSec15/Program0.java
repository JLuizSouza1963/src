package ApplicationSec15;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program0 {

	public static void main(String[] args) {

		File file = new File("c:\\zpl\\QUERY_INBRANDS.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Erro : " + e.getMessage());
		}
		finally {
			if (sc != null) {
			sc.close();
			}
		}
	}
}