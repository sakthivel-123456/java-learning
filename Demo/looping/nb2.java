import java.util.Scanner;
public class nb2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while (temp!=0){
            int a=temp%10;
            temp=temp/10;
            sum=sum+a;
        }System.out.println(sum);
            
        }
    }