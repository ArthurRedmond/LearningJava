import java.util.Scanner;
public class Enteringintegers
{
  public static void main(String[] args) {
    int[] numberlist = {0, 0, 0, 0, 0, 0};
    int x;
    var input = new Scanner(System.in);
    for(x = 0; x < numberlist.length; ++x)
    {
      try
      {
        System.out.print("Enter an integer >> ");
        numberlist[x] = input.nextInt();
      }
      catch (Exception e)
      {
        System.out.println("Exception occurred");
      }
      input.nextLine();
    }
    System.out.print("The numbers are : ");
    for(x = 0; x < numberlist.length; ++x)
      System.out.print(numberlist[x] + " ");
    System.out.println();
  }
}