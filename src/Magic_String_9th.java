import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Magic_String_9th
{
    public static int calculateMagicString(String s)
    {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray())
        {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        int maxCount = counts.values().stream().mapToInt(Integer::intValue).max().orElse(0);
        int minCount = counts.values().stream().mapToInt(Integer::intValue).min().orElse(0);
        return maxCount - minCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println(calculateMagicString(s));
    }
}
