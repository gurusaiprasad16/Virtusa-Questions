import java.util.HashSet;
import java.util.Set;

public class UniqueMarblesCount_2nd
{
    public static int uniqueMarblesCount(int S, int R, int K)
    {
        Set<Integer> uniqueStates = new HashSet<>();
        dfs(uniqueStates, S, R, K);
        return uniqueStates.size();
    }
    // DFS function
    private static void dfs(Set<Integer> uniqueStates, int marbles, int R, int K) {
        uniqueStates.add(marbles);
        if (marbles >= R)
        {
            dfs(uniqueStates, marbles - R, R, K);
        }
        if (marbles >= K)
        {
            dfs(uniqueStates, marbles - K, R, K);
        }
    }
    public static void main(String[] args)
    {
        int S = 4;
        int R = 1;
        int K = 2;
        int result = uniqueMarblesCount(S, R, K);
        System.out.println(result);
    }
}

