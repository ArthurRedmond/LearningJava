public class DivideEvenly2
{
    public static void main(String[] args)
    {
        final int LIMIT = 100;
        int var, number;

       for(number = 1; number <= LIMIT; ++number)
       {
           System.out.print(number + " is evely divisible by ");
           for(var = 1; var <= number; ++var)
             if(number % var == 0)
               System.out.print(var + " ");
            System.out.println();
       }   
    }
}
