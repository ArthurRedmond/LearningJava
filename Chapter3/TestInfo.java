// Filename TestInfo.java
// Written by Arthur Redmond
// Written on 2019-03-21

// call method from a method within a different class

public class TestInfo
{
    public static void main(String[] args)
    {
        System.out.println("Calling method from another class:");
        ParadiseInfo.displayInfo();
    }
}