public class OneTen
{
    public static void main(String[] args)
    {
        int sum = 0;
        int sum2 = 0;
        int i = 0;
        while(i <= 100)
        {
            sum += i;
            i++;
        }
        System.out.println(sum);

        for(int j = 0; j <= 100; j++)
        {
            sum2 += j;
        }
        System.out.println(sum2);
    }
}