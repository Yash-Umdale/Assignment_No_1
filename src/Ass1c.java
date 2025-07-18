
import java.util.Scanner;

public class Ass1c {
    public static void main(String[] args) {
        int n,a,b,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n=sc.nextInt();
        System.out.println();
        System.out.println("Multiplication Table:");
        for(i=1;i<=10;i++){
            int mul=i*n;
            System.out.println(n+"*"+i+"="+mul);
        }

        System.out.println("Fibonacci series:");
        a=0;
        b=1;
        for(i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }

        System.out.println("Armstrong number:");
        //int arm = input.nextInt();
        int temp =n, sum = 0;
        int digits = String.valueOf(n).length();

        for (; temp != 0; temp /= 10) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
        }

        if (sum==n) {
            System.out.println("Armstrong number.");
        } else {
            System.out.println("Not Armstrong number.");
        }

    }
}
