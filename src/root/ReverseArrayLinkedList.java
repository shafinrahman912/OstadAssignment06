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

		System.out.println("\n\nUpdated ArrayList:");
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
