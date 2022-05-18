package ai.jobiak.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class peek_Streams {

	public static void main(String[] args) {

		Stream.of("Naveen","Lokesh","Chaitu","Harsha")
		.filter(e -> e.length() >3)
		.peek(e -> System.out.println("original string: "+e))
		.map(String::toUpperCase)
		.peek(e -> System.out.println("Upper Case: "+e))
		.collect(Collectors.toList());
	}

}
