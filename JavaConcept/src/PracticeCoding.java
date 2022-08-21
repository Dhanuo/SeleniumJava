import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeCoding {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Duplicate number in the list
		List<Integer> arr = Arrays.asList(1,2,3,4,2,1,6);
	
		int arrSize = arr.size();
		System.out.println("size of array "+arrSize);
		arr.stream()
        // Creates a map {4:1, 5:2, 7:2, 8:2, 9:1}
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        // Convert back to stream to filter
        .stream()
        .filter(element -> element.getValue() > 1)
        // Collect elements to List and print out the values
        .collect(Collectors.toList())
        .forEach(System.out::println);
		
		// Duplicate string and its count
		System.out.println("Finding duplicate names");
		List<String> stringNames = Arrays.asList("dhanu", "gautu","Amol","gautu");
		
		int arrStringSize = stringNames.size();
		System.out.println("size of array "+arrStringSize);
		stringNames.stream()
        // Creates a map {4:1, 5:2, 7:2, 8:2, 9:1}
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        // Convert back to stream to filter
        .stream()
        .filter(element -> element.getValue() > 1)
        // Collect elements to List and print out the values
        .collect(Collectors.toList())
        .forEach(System.out::println);
		
		//
		System.out.println("Program to format Right-angle triangle pattern");
		int size = 5;
		for (int i = 1; i < size; i++) {
			for (int j = i; j >i; j++) {
				System.out.print(j);
			}
			
		System.out.println();
		}
	}
	    
}
