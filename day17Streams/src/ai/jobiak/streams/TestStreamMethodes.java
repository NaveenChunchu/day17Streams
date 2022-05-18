package ai.jobiak.streams;
import java.util.*;

public class TestStreamMethodes {

	public static void main(String[] args) 
	{
		List<String> numbers=Arrays.asList("20","10","40","30");
		List<String> fruits=Arrays.asList("apple","grapes","banana","papaya");
		List<Integer> list=Arrays.asList(20,10,40,30);
		
		numbers.stream().mapToInt(e->Integer.parseInt(e)).forEach(System.out::println);
		System.out.println();
		
		numbers.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		Comparator<Integer> intComparator=(a,b)->{return Integer.compare(a,b);};
		Comparator<String> stringComparator=(a,b)->{return a.compareTo(b);};
		
		int max= list.stream().max(intComparator).get();
		System.out.println("Max "+max);
		
		int min= list.stream().min(intComparator).get();
		System.out.println("Min "+min);
		
		fruits.stream().sorted().forEach(System.out::println);
		
		String max1= fruits.stream().max(stringComparator).get();
		System.out.println("Max "+max1);
		
		String min2= fruits.stream().min(stringComparator).get();
		System.out.println("Min "+min2);
		
		
		System.out.println(list.stream().count());
		
		int sum=numbers.stream().mapToInt(e->Integer.parseInt(e)).sum();
		System.out.println(sum); 
		  
		OptionalDouble avg=numbers.stream().mapToInt(e->Integer.parseInt(e)).average();
		System.out.println(avg.getAsDouble());
		  
		Optional<Integer> s=list.stream().reduce((a,b)->a+b);
		System.out.println(s.get());
		 
		 
	}
}
