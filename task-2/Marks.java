import java.util.Scanner;
public class Marks
{
    
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter marks obtained in java:");
    int java=sc.nextInt();
    System.out.println("enter marks obtained in python:");
    int python=sc.nextInt();
    System.out.println("enter marks obtained in HTML:");
    int html=sc.nextInt();
    System.out.println("enter marks obtained in CSS:");
    int css=sc.nextInt();
    int total=(java+python+html+css);
    float average=((java+python+html+css)/4);
    System.out.println("----------------------------------------------------------------------------------------------------------------");
    System.out.println("total:"+total);
    System.out.println("average:"+average);
    if(average>=80)
        {
        System.out.print("grade:A");
        }
        else if(average>=60 && average<80)
        {
        System.out.print("grade:B");
        }
        else if(average>=40 && average<60)
        {
            System.out.print("grade:C");
        }
        else
        {
            System.out.print("grade:D");
        }
    sc.close();
    }
}
