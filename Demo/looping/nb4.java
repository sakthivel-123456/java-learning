import java.util.Scanner;
public class nb4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int product=1;
        while (temp!=0&&product!=0){
            int a=temp%10;
            product*=a;
            temp=temp/10;
        }System.out.println(product);   
        }
    }