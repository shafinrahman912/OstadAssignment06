# OstadAssignment06-Shafin Rahman
- #### Write a Java program that takes user input to create a new text file named "myFile.txt" and writes the user's input to the file. The program should keep accepting lines of text until the user enters "exit".
  -  Input: When a user enters input data into the console, the program stores input data in the "myFile.txt" file. This program will terminate when the user types 'exit' in the console.
  -  Code
 <pre>
   <code>
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
 </code>
 </pre> 


- #### Write a Java program that creates an ArrayList of integers and a LinkedList of strings. The program should add some elements to both collections and then display the elements in reverse order.
  -  Code
 <pre>
   <code>
package root;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseArrayLinkedList {
	public static void main(String[] args) {

		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(10);
		arrList.add(15);
		arrList.add(20);
		arrList.add(25);
		arrList.add(30);

		LinkedList<String> lnkdList = new LinkedList<>();
		lnkdList.add("red");
		lnkdList.add("green");
		lnkdList.add("yellow");
		lnkdList.add("pink");
		lnkdList.add("black");

//		Demonstration of ArrayList and LinkedList and their properties

//		ArrayList

		System.out.println("\nArrayList:");
		for (int i : arrList) {
			System.out.print(i + " ");
		}

		arrList.add(0, 100);
		arrList.add(1, 150);

		System.out.println("\n\nUpdated ArrayList After Adding Elements:");
		for (int i : arrList) {
			System.out.print(i + " ");
		}
		System.out.println("\n\nReversed Arraylist: ");
		for (int i = arrList.size() - 1; i >= 0; i--) {
			System.out.print(arrList.get(i) + " ");

		}

//		LinkedList

		System.out.println("\n\nLinkedList:");
		for (String str : lnkdList) {
			System.out.print(str + " ");
		}

		lnkdList.push("white");
		System.out.println("\n\nUpdated LinkedList After Push:");
		for (String str : lnkdList) {
			System.out.print(str + " ");
		}
		lnkdList.pop();
		System.out.println("\n\nUpdated LinkedList After Pop:");
		for (String str : lnkdList) {
			System.out.print(str + " ");
		}

		System.out.println("\n\nReversed LinkedList: ");
		for (int i = lnkdList.size() - 1; i >= 0; i--) {
			System.out.print(lnkdList.get(i) + " ");

		}

	}
}

 </code>
 </pre> 
  -  Output:</br></br>
   ArrayList:</br>
   10 15 20 25 30</br>
    Updated ArrayList After Adding Elements:</br>
    100 150 10 15 20 25 30</br>
    Reversed Arraylist:</br>
    30 25 20 15 10 150 100</br>
    LinkedList:</br>
   red green yellow pink black</br>
   Updated LinkedList After Push:</br>
   white red green yellow pink black</br>
    Updated LinkedList After Pop:</br>
   red green yellow pink black</br>
    Reversed LinkedList:</br>
    black pink yellow green red</br>
 
