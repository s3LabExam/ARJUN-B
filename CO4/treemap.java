import java.util.*;
public class treemap {
	public static void main(String args[]) {
		Map<Integer,String> hashmap = new HashMap<>();
		hashmap.put(2,"varun");
		hashmap.put(1,"thomas");
		hashmap.put(3,"Akhil");
		hashmap.put(5,"Manu");
		Set<Integer> keys = hashmap.keySet();
		System.out.println("Hash Map");
		for(Integer i:keys) {
			System.out.println(i+" : "+hashmap.get(i));
		}
		Map<Integer,String> treemap = new TreeMap<>();
		treemap.putAll(hashmap);
		Set<Integer> keys1 = treemap.keySet();
		System.out.println("\nTree Map");
		for(Integer i:keys1) {
			System.out.println(i+" : "+treemap.get(i));
		}
		
	}
}
