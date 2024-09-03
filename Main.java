import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    public static List<String> convertToUppercaseAndSort(List<String> inputList) {
        List<String> upperCaseList = inputList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        Collections.sort(upperCaseList, Collections.reverseOrder());

        return upperCaseList;
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("cherry");
        inputList.add("date");

        List<String> result = convertToUppercaseAndSort(inputList);
        System.out.println(result);
    }
}
