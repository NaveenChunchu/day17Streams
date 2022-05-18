package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamSorted {

	public static void main(String[] args) {
		
		Stream.of("rose", "lilly", "lotus", "marigold")
		.sorted()
		.forEach(System.out::println);
		
		
		
		
	}
}
