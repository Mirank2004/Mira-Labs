package Default;



import java.util.*;

public class App {

	public static void main(String[] args) {

		

		//// 1

		

		String[] words = {"Java", "Generics", "Lab"};

        PrintableList<String> stringList = new PrintableList<>(words);

        stringList.printItems();



        Integer[] numbers = {1, 2, 3, 4};

        PrintableList<Integer> intList = new PrintableList<>(numbers);

        intList.printItems();

        

        

        ////  2

       

        NumberBox<Integer> intBox = new NumberBox<>();

        intBox.setItem(10);



        NumberBox<Double> doubleBox = new NumberBox<>();

        doubleBox.setItem(7.5);



        System.out.println("intBox item: " + intBox.getItem());

        System.out.println("doubleBox item: " + doubleBox.getItem());



        System.out.println("Sum (method): " + intBox.add(doubleBox));

        System.out.println("Sum (static): " + NumberBox.sum(intBox, doubleBox));

        

        ////  3

        

        List<String> names = Arrays.asList("A", "B", "C");

        printList(names);



        List<Integer> nums1 = Arrays.asList(1, 2, 3);

        System.out.println("Sum int list: " + sumNumbers(nums1));



        List<Double> nums2 = Arrays.asList(1.5, 2.5, 3.0);

        System.out.println("Sum double list: " + sumNumbers(nums2));

	}





		public static void printList(List<?> list) {

		    for (Object item : list) {

		        System.out.println(item);

		    }

		}

		

		public static double sumNumbers(List<? extends Number> list) {

		    double sum = 0.0;

		    for (Number n : list) {

		        sum += n.doubleValue();

		    }

		    return sum;

		}

}

