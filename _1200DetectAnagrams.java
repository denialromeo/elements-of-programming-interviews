import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class _1200DetectAnagrams {
    public static HashMap<Integer, List<String>> detectAnagrams(List<String> words) {
        HashMap<Integer, List<String>> anagrams = new HashMap<>();
        for (String s: words) {
            int hash = 0;
            for (Character c: s.toCharArray()) {
                hash += c.hashCode();
            }
            if (!anagrams.containsKey(hash)) {
                anagrams.put(hash, new ArrayList<String>());
            }
            anagrams.get(hash).add(s);
        }
        return anagrams;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(new String[]{"debitcard", "elvis", "listen", "silent", "lives", "badcredit"});
        HashMap<Integer, List<String>> anagrams = detectAnagrams(words);
        for (HashMap.Entry<Integer, List<String>> group: anagrams.entrySet()) {
            List<String> entries = group.getValue();
            if (entries.size() > 1) {
                String output = "[" + entries.get(0);
                for (int i = 1; i < entries.size(); i++) {
                    output += (", " + entries.get(i));
                }
                output += "]";
                System.out.println(output);
            }
        }
    }
}