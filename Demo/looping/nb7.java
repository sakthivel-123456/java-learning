import java.util.Scanner;
public class nb7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while (temp!=0){
            int a=temp%10;
            sum=a*a*a;
            temp=temp/10;
        }
        if(sum==n)
        System.out.println(n+"Amstrong");
        else
        System.out.println(n+"Not Amstrong");   
        }
    }