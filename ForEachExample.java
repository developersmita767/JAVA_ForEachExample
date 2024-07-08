package Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		//Consumer<Integer> cons=System.out::println;
		list.forEach((a)->System.out.println("Number is"+a));
		
		

	}

}
