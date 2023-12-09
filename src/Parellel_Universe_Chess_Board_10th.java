public class Parellel_Universe_Chess_Board_10th
{
    public static int maxBishopSquares(int H, int W)
    {
        return Math.min(H, W) + 1;
    }
    public static void main(String[] args)
    {
        int H = 5;
        int W = 8;
        int result = maxBishopSquares(H, W);
        System.out.println(result);
    }
}
