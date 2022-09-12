import java.util.Scanner;
public class PatternOne
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size ");
    int size=sc.nextInt();
    for(int i=1;i<=size;i++)
    {
      for(int j=1;j<=size;j++)
      {
        System.out.print("x"+" ");
      }
      System.out.println();
    }
  }
}
/*Input format
Enter the size 
7
Output:-
x x x x x x x 
x x x x x x x 
x x x x x x x 
x x x x x x x 
x x x x x x x 
x x x x x x x 
x x x x x x x 




