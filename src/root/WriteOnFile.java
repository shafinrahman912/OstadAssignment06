package root;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteOnFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("myFile.txt");
			BufferedWriter buffer = new BufferedWriter(writer);
			
			Scanner sc = new Scanner(System.in);
			String str;
			int cnt = 0;

			System.out.println("Enter text to write in the file and type 'exit' to stop writing and closing the file:\n");
			while (!(str = sc.nextLine()).equalsIgnoreCase("exit")) {
				String[] word = str.split(" ");
				for (int i = 0; i < word.length; i++) {
					if (word[i].equalsIgnoreCase("exit")) {
						cnt = 1;
						break;
					} else {
						buffer.write(word[i] + " ");
					}
				}
				buffer.newLine();
				if (cnt == 1)
					break;
			}

			buffer.close();
			writer.close();
			sc.close();
			System.out.println("\nSuccessfully write");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
