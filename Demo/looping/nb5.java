import java.util.Scanner;
public class nb5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        while (temp!=0){
            int a=temp%10;
            rev=rev*10+a;
            temp=temp/10;

        }System.out.println(rev);  
        }
    }