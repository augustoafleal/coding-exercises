package generics;

import java.util.TreeSet;

public class ComparableTeste {
	
	//Neste exemplo não utilizo o LinkedHashSet utilizado no Pares, mas o TreeSet,
	//mediante a implementação do comparable, para que ele possa definir quais dados
	//estão ou não presentes na collection 
	
	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<>();
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-13);
		
		for(Integer n : nums) {
			
			System.out.println(n);
		
		}
		
		//Neste caso os números são apresentados na ordem, porque o tipo INTEGER
		//automaticamente implementa o comparable
	}
	
}
