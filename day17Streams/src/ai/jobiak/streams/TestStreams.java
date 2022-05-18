package ai.jobiak.streams;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestStreams {

	public static void main(String[] args) 
	{
		 ArrayList<String> list=new ArrayList<String>();
		 
	      list.add("apple");
	      list.add("mango");
	      list.add("a pineapple");
	      list.add("grapes");
	     
	      list.stream().forEach(System.out::println);
	      //predefined interfaces .............  consumer,supplier,predicate,Functional...
	      Consumer<String> consumer=(String s)->{System.out.println(s);};
	      
	      Predicate<String> testA=(String s)->{return(s.charAt(0)=='a');};
	      
          List<String> letterAList=list.stream().filter(testA).collect(Collectors.toList());
          
          System.out.println(letterAList);
          
          list.stream().map(e->e.toUpperCase()).forEach(System.out::println);
          list.stream().map(e->e.toUpperCase()).forEach(consumer);
          
          Function<String,String> first3Letters=(s)->{return s.substring(0,3);};         
          list.stream().map(first3Letters).forEach(System.out::println);
	}

}

