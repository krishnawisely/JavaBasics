package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import collections.javacollections.JavaCollections;

public class JavaCollectionsImpl implements JavaCollections {
	// List
	/**
	 * ArrayList It is allow duplicate value It is maintain insertion order It is
	 * non-synchronized => It isn't wait for complete a task and it will moving to
	 * another task before complete task. It isn't thread safe Shifting
	 */
	public List<String> arrayList() {
		List<String> list = new ArrayList<String>();
		list.add("krishna");
		list.add("ram");
		list.add("ram");
		return list;
	}

	/**
	 * LinkedList It is allow duplicate value It is maintain insertion order It is
	 * non-synchronized => It isn't wait for complete a task and it will moving to
	 * another task before complete task. It isn't thread safe No shifting is
	 * required
	 */
	public List<String> linkedList() {
		List<String> list = new LinkedList<String>();
		list.add("apple");
		list.add("mango");
		list.add("apple");
		return list;
	}

	/**
	 * Vector It is allow duplicate value It is maintain insertion order It is
	 * synchronized => need to wait for complete task before moving to task. It is
	 * thread safe
	 */
	public List<String> vector() {
		List<String> cars = new Vector<String>();
		cars.add("TATA");
		cars.add("BMW");
		cars.add("jaguar");
		cars.add("TATA");
		return cars;
	}

	public static void main(String[] args) {
		JavaCollections obj = new JavaCollectionsImpl();
		// ArrayList
		System.out.println("=========");
		System.out.println("Name List");
		System.out.println("=========");
		List<String> names = obj.arrayList();
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(names.get(0) + "=>has bean removed from list!");
		names.remove(0);// It remove first element in list
		System.out.println("Remaining name list");
		for (String name : names) {
			System.out.println("|" + name + "|");
		}
		System.out.println("Clear name list");
		names.clear();// It removes all elements in the array
		//Check wether names array is empty or not
		if (names.isEmpty()) {
			System.out.println("Name list is empty!");
		}

		// Linked List
		System.out.println("==========");
		System.out.println("Fruit List");
		System.out.println("==========");
		List<String> fruits = new LinkedList<String>();
		fruits = obj.linkedList();
		for (String fruit : fruits) {
			System.out.println("|" + fruit + "|");
		}
		// Vector
		System.out.println("=========");
		System.out.println("Cars List");
		System.out.println("=========");
		List<String> cars = obj.vector();
		for (String car : cars) {
			System.out.println("|" + car + "|");
		}
	}
}
