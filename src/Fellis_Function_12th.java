import java.util.HashMap;
import java.util.Map;
public class Fellis_Function_12th
{
    public static long fellisFunction(int N, Map<Integer, Long> memo)
    {
        if (N == 0 || N == 1)
        {
            return 1;
        }
        if (memo.containsKey(N))
        {
            return memo.get(N);
        }
        long result = fellisFunction(N - 1, memo) + 7 * fellisFunction(N - 2, memo) + (N / 4);
        memo.put(N, result % (1000000007));
        return memo.get(N);
    }
    public static void main(String[] args)
    {
        Map<Integer, Long> memo = new HashMap<>();
        long result = fellisFunction(3, memo);
        System.out.println(result);
    }
}
