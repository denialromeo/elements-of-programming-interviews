import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class _1202CanConstructAnonymousMessage {
    public static HashMap<Character, Integer> characterFrequencies(String s) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (Character c: s.toCharArray()) {
            if (!Character.isLetter(c)) {
                continue;
            }
            if (!frequencies.containsKey(c)) {
                frequencies.put(c, 0);
            }
            frequencies.put(c, frequencies.get(c) + 1);
        }
        return frequencies;
    }

    public static boolean canConstructAnonymousMessage(String message, String magazine) {
        HashMap<Character, Integer> messageCharacterFrequencies = characterFrequencies(message);
        HashMap<Character, Integer> magazineCharacterFrequencies = characterFrequencies(magazine);
        for (HashMap.Entry<Character, Integer> messageEntry: messageCharacterFrequencies.entrySet()) {
            Integer timesCharacterAppearsInMagazine = magazineCharacterFrequencies.get(messageEntry.getKey());
            if (timesCharacterAppearsInMagazine == null || timesCharacterAppearsInMagazine < messageEntry.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static void printResult(String message, String magazine) {
        boolean success = canConstructAnonymousMessage(message, magazine);
        String result = success ? "Message \"" + message + "\" can be constructed from magazine \"" + magazine + "\"."
                                : "Message \"" + message + "\" cannot be constructed from magazine \"" + magazine + "\".";
        System.out.println(result);
    }

    public static void main(String[] args) {
        String message = "the quick brown fox jumps over the lazy dog.";
        String magazine = "abcdefghijklmnopqrstuvwxyz";
        printResult(message, magazine);
        magazine = "abcdefghijklmnopqrstuvwxyzeehooortu";
        printResult(message, magazine);
    }
}