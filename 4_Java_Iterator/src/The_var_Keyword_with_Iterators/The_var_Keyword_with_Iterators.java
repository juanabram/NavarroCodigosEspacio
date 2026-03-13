package The_var_Keyword_with_Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class The_var_Keyword_with_Iterators {
  public static void main(String[] args) {
	          // Crear un ArrayList
	          ArrayList<String> cars = new ArrayList<String>();
	          cars.add("Volvo");
	          cars.add("BMW");
	          cars.add("Ford");
	          cars.add("Mazda");

	          // Iterador sin var
	          Iterator<String> it = cars.iterator();
	          System.out.println("Iterating without var:");
	          while (it.hasNext()) {
	              System.out.println(it.next());
	          }

	          // Iterador con var (Java 10+)
	          var it2 = cars.iterator();
	          System.out.println("\nIterating with var:");
	          while (it2.hasNext()) {
	              System.out.println(it2.next());
	         }
	     }
  }