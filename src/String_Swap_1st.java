public class String_Swap_1st
{
    public static String performOperations(String s, int[] A)
    {
        int n = s.length();
        for (int operation : A)
        {
            if (operation == 1)
            {
                s = s.charAt(n - 1) + s.substring(1, n - 1) + s.charAt(0);
            } else if (operation == 2)
            {
                int mid = n / 2;
                s = s.substring(mid) + s.substring(0, mid);
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        String initialString = "abcdefgh";
        int[] operationsSequence = {1, 2, 1};
        String result = performOperations(initialString, operationsSequence);
        System.out.println(result);
    }
}
