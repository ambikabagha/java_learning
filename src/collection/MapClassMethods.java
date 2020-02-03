package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClassMethods {
	public static void main(String[] args) {
		Map ma = new HashMap();
		// Adding elements to map
		ma.put(1, "apple");
		ma.put(5, "banana");
		ma.put(2, "jackfruit");
		ma.put(6, "orange");
		ma.put(10, "mango");
		System.out.println(ma);

		ma.putIfAbsent(3, "watermellon");
		System.out.println(ma);

		ma.remove(6);
		System.out.println(ma);

		Object letter = ma.get(3);
		System.out.println(letter);

		boolean print1 = ma.containsKey(10);
		System.out.println(print1);

		boolean print2 = ma.containsValue("banana");
		System.out.println(print2);

		Set keys = ma.keySet();
		for (Object k : keys) {
			System.out.println(k + "---->" + ma.get(k));
		}
	}

}
