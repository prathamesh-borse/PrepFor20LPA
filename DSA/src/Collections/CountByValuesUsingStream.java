package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountByValuesUsingStream {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ojas");
        map.put(2, "Prathamesh");
        map.put(3, "Swapnil");
        map.put(4, "Ram");
        map.put(5, "Ram");
        map.put(6, "Ram");

        LinkedHashMap<String, Long> collect = map.values().stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

    }
}
