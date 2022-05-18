package ai.jobiak.streams;

import java.util.*;
import java.util.function.*;

public class ChocolateStream {

	public static void main(String[] args) 
	{
		ArrayList<CreateChocolate> chocolates=new ArrayList<CreateChocolate>();
		chocolates.add(new CreateChocolate("kitkat",50.00,100,"cover",false));
		chocolates.add(new CreateChocolate("milkyway",45.00,50,"cover",false));
		chocolates.add(new CreateChocolate("Twix",60.00,45,"wrapper",false));
		chocolates.add(new CreateChocolate("Lion",30.00,55,"cover",true));
		chocolates.add(new CreateChocolate("Bounty",75.00,105,"cover",false));
		chocolates.add(new CreateChocolate("Snickers",227.00,240,"PlasticBox",true));
		chocolates.add(new CreateChocolate("Mars",51.00,45,"cover",true));
		chocolates.add(new CreateChocolate("lindt",300.00,895,"PaperBox",false));
		chocolates.add(new CreateChocolate("Dlite",50.00,500,"PlasticBox",true));
		chocolates.add(new CreateChocolate("Dairymilk",100.00,399,"PaperBox",true));
		
		Predicate<CreateChocolate> noSugar=(O)->
		{
			return O.isSugarFree();
		};
		
		Predicate<CreateChocolate> coverPacking=(o)->{
			return o.getPacking().equals("cover");
		};
		
		Comparator<CreateChocolate> sortByName=(o1,o2)->{return o1.getDescription().compareTo(o2.getDescription());};
		Comparator<CreateChocolate> priceComparator=(o1,o2)->{return Double.compare(o1.getPrice(),o2.getPrice());};
		Comparator<CreateChocolate> weightComparator=(o1,o2)->{return Double.compare(o1.getWeight(),o2.getWeight());};
			
		Consumer<CreateChocolate> chocolateConsumer=(o)->{System.out.println(o);};
		
		chocolates.stream().filter(coverPacking).filter(noSugar).forEach(chocolateConsumer);
		System.out.println();
		
		chocolates.stream().sorted(sortByName).forEach(chocolateConsumer);
        System.out.println();
        
        CreateChocolate expensive=chocolates.stream().max(priceComparator).get();
        System.out.println(expensive);
        CreateChocolate lessWeight=chocolates.stream().min(weightComparator).get();
        System.out.println(lessWeight);
		

	}

}