package top150.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListNumberingInMap {

    public static void main(String[] args) {
        List<String> list = List.of("Nasser", "Balakishna", "Mohit", "Akshay");
        Map<Integer, String> collect = list.stream()
                .collect(Collectors.toMap(
                        name-> list.indexOf(name)+1,
                        name-> name
                ));

        System.out.println(collect);

        list.stream().collect(
                Collectors.toMap(
                        e-> list.indexOf(e)+1,
                        e->e
                )
        );
    }
}
