import java.util.Scanner;
public class SpecialSeries4th
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int N = sc.nextInt();
        System.out.println("The " + N + "th number in the special series is: " + findNthNumber(N));
    }
    public static int findNthNumber(int N)
    {
        if (N == 0 || N == 1)
        {
            return 1;
        }
        int[] series = new int[N + 1];
        series[0] = series[1] = 1;
        for(int i = 2; i <= N; i++)
        {
            series[i] = (series[i - 1] * series[i - 1] + series[i - 2] * series[i - 2]) % 47;
        }
        return series[N];
    }
}