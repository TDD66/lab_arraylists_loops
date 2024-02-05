import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");

//        3. Add "Islay" after "Jura" and before "Mull"
        String jura = "Jura";
        String mull = "Mull";
        // I want to first find "Jura" in the list using a for loop
        for(int i = 0; i < scottishIslands.size(); i++){
//          If "Mull" is in the list before "Jura"
//          break the loop because it wouldn't
//          be possible to add "Islay" after "Jura"
            if(scottishIslands.get(i).equals(mull)){
                break;
            }
            if(scottishIslands.get(i).equals(jura)){
                scottishIslands.add(i + 1, "Islay");
            }
        }

//        4. Print out the index position of "Skye"
        String skye = "Skye";
        for(int i = 0; i < scottishIslands.size(); i++){
            if(scottishIslands.get(i).equals(skye)){
                System.out.println(i);
            }
        }

//        5. Remove "Tresco" from the list by name
        String tresco = "Tresco";
        scottishIslands.remove(tresco);

//        6. Remove "Arran" from the list by index
        String arran = "Arran";
        for(int i = 0; i < scottishIslands.size(); i++){
            if(scottishIslands.get(i).equals(arran)){
                scottishIslands.remove(i);
            }
        }

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop
        for(String island : scottishIslands){
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for(int number : numbers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }

//        2. Print the difference between the largest and smallest value
        Integer maximum_value = numbers.get(0);
        Integer minimum_value = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(numbers.get(i) > maximum_value){
                maximum_value = numbers.get(i);
            }
            if(numbers.get(i) < minimum_value){
                minimum_value = numbers.get(i);
            }
        }
        System.out.println(maximum_value - minimum_value);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        String one_next_to_one = "False";
        for(int i = 0; i < numbers.size() - 1; i++){
            if(numbers.get(i) == 1 && numbers.get(i + 1) == 1){
                one_next_to_one = "True";
                break;
            }
        }
        System.out.println(one_next_to_one);

//        4. Print the sum of the numbers,
        int sum_of_numbers = 0;
        for(int number : numbers){
            sum_of_numbers += number;
        }
        System.out.println(sum_of_numbers);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        sum_of_numbers = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == 13){
                i++;
                continue;
            }
            sum_of_numbers += numbers.get(i);
        }
        System.out.println(sum_of_numbers);
    }

}
