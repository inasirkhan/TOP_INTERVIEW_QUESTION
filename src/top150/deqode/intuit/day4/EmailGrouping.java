package top150.deqode.intuit.day4;

import java.util.*;
import java.util.stream.Collectors;

public class EmailGrouping {

    public static Map<String,List<String>> groupEmails(List<String> emails){
        int n = emails.size();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String email : emails){
            String key = email.substring(email.indexOf("@") + 1, email.indexOf("."));
            map.computeIfAbsent(key, k->new ArrayList<>()).add(email);

        }
        return map;
    }

    public static void main(String[] args) {
//        input  abc@gmail.com,
//        def@yahoo.com,
//        ghi@gmail.com
//        output: gmail: abc@gmail.com, ghi@gmail.com Yahoo: def@yahoo.com

        List<String> emails = Arrays.asList("abc@gmail.com","def@yahoo.com","ghi@gmail.com","bcd@gmail.com");
        Map<String, List<String>> groupedEmails = groupEmails(emails);
        System.out.println(groupedEmails);

        Map<String, List<String>> emailGroups = emails.stream().collect(Collectors.groupingBy(
                email -> email.substring(email.indexOf("@") + 1, email.indexOf(".")),
                Collectors.toList()
        ));

        System.out.println(emailGroups);
    }
}
