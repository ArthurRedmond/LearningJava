import java.util.*;
import javax.swing.*;
public class VerifyCode
{
  public static void main(String[] args)
  {
    char[] codes = {'B', 'E', 'K', 'M', 'P', 'T'};
    String entry;
    char userCode;
    int position;
    entry = JOptionPane.showInputDialog(null, "Enter a product code");
    userCode = entry.charAt(0);
    position = Arrays.binarySearch(codes, userCode);
    if(position >= 0)
      JOptionPane.showMessageDialog(null, "Position of " +
        userCode + " is " + position);
    else 
      JOptionPane.showMessageDialog(null, userCode + 
        " is an invalid code");
  }
}