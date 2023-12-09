import java.util.ArrayList;
import java.util.List;

public class Surprise_Debate7th
{
    public static int findDivisiblePair(int N, int K)
    {
        List<Integer> rollNumbers = new ArrayList<>();
        for (int i = 1; i <= N; i++)
        {
            rollNumbers.add(i);
        }
        while (rollNumbers.size() > 1)
        {
            List<int[]> pairs = new ArrayList<>();
            for (int i = 0; i < rollNumbers.size() / 2; i++)
            {
                pairs.add(new int[]{rollNumbers.get(i), rollNumbers.get(rollNumbers.size() - i - 1)});
            }
            rollNumbers.subList(0, rollNumbers.size() / 2).clear();
            for (int[] pair : pairs)
            {
                if ((pair[0] + pair[1]) % K == 0)
                {
                    return pair[0];
                }
            }
        }
        if (rollNumbers.size() == 1)
        {
            return rollNumbers.get(0);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int N = 5;
        int K = 3;
        System.out.println(findDivisiblePair(N, K));
    }
}