package Access_an_Element;

import java.util.ArrayList;

public class Access_an_Element {
	  public static void main(String[] args) {
		    ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    System.out.println(cars);
		    System.out.println(cars.get(0)); // Get the first element
	  }
}