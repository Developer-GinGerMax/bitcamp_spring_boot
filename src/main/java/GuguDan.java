public class GuguDan
{
    public static void main(String[] args)
    {
        for(int i = 2; i < 10; i++)
        {
            for(int j = 1; j < 10; j++)
            {
                System.out.print( i +  " X " + j + " = " + ( i * j ) + '\t');
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        for(int ii = 1; ii < 10; ii++)
        {
            for(int jj = 2; jj < 10; jj++)
            {
                System.out.print( jj +  " X " + ii + " = " + ( jj * ii ) + '\t');
            }
            System.out.println(" ");
        }
    }
}
