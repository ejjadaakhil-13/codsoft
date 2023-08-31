import java.util.Random;
import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        
        Random ran=new Random();
        int ran1=ran.nextInt(100);
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("hey welcome to the game you have 4 chances to guess the number");
        
        for(int i=1;i<=4;i++)
        {
            System.out.println("------------------------------------------------------------------------------------------------------");
            //System.out.println(ran1);
            System.out.print("hey enter the number:");
            int n = sc.nextInt();
    
            //System.out.println("the system  generated number is:"+ran1);
            if (n==ran1)
            {
                System.out.println("your guess was right");
                System.out.println("your score is:"+(100/i));
                System.out.println("-------------------------------------------------------------------------------------------------");
                break;
            }
            else if (n>ran1)
            {
                System.out.println("your guess is to high");
            }
            else if(n<ran1)
            {
                System.out.println("your guess is to low");
            }
            
        }
        System.out.println("system generated number:  " +ran1);

sc.close( );
    }

}