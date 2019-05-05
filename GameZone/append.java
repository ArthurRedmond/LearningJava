import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class append
{
  public static void main(String[] args) {
    

    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = keyboard.nextLine();
    
    System.out.print("Enter score: ");
    int tally = Integer.parseInt(keyboard.nextLine());
    //keyboard.nextLine();    

    CreateHighScores();
    DispalyHighScores();
    WriteToFile(name, tally);

  }
  public static void CreateHighScores(){
    File checkFile = new File("HighScores.txt");
    if(!(checkFile.exists()))
    {
      Path file = Paths.get("HighScores.txt");
      String s = "00,  " + System.getProperty("line.separator");
      final int NUMRECS = 10;
      try
      {
        OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
        for(int count = 0; count < NUMRECS; ++count)
          writer.write(s, 0, s.length());
        writer.close();
      }
      catch(Exception e)
      {
        System.out.println("Error message: " + e);
      }
    }
  }

  public static void DispalyHighScores(){
    Path file = Paths.get("HighScores.txt");
    String[] array = new String[1];
    String s = "";
    String delimiter = ",";
    int HighScore;
    String StringHighScore;
    String name;
    try
    {
      InputStream input = new BufferedInputStream(Files.newInputStream(file));
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      System.out.println();
      s = reader.readLine();
      System.out.println("*** HIGH SCORES ***");
      while(s != null)
      {
        array = s.split(delimiter);
        StringHighScore = array[0];
        HighScore = Integer.parseInt(array[0]);
        if(HighScore != 0)
        {
          name = array[1];
          System.out.println("Score: " + HighScore + " " + name);
        }
        s = reader.readLine();
      }
      reader.close();
    }
    catch(Exception e)
    {
      System.out.println("Error messageA: " + e);
    }
  }

  public static void WriteToFile(String nam, int tall)
  {
    Path file = Paths.get("HighScores.txt");
    String s = "00,  " + System.getProperty("line.separator");
    final int RECSIZE = s.length();
    FileChannel fc = null;
    String delimiter = ",";
    String tallyString;
    int tally = tall;
    String name = nam;

    try
    {
      
      fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
      tallyString = Integer.toString(tally);
      s = tallyString + delimiter + name + System.getProperty("line.separator");
      byte[] data = s.getBytes();
      ByteBuffer buffer = ByteBuffer.wrap(data);
      fc.position(tally * RECSIZE);
      fc.write(buffer);
      fc.close();
    }
    catch(Exception e)
    {
      System.out.println("Error message: " + e);
    }
  }
}
