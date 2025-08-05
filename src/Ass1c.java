
import java.util.Scanner;

public class Ass1c {
    public static void main(String[] args) {
        int n,a,b,i,c,d,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n=sc.nextInt();
        System.out.println();
        System.out.println("For Loop");
        System.out.println("Multiplication Table:");
        for(i=1;i<=10;i++){
            int mul=i*n;
            System.out.println(n+"*"+i+"="+mul);
        }

        //While Loop
        System.out.println("While Loop");
        System.out.print("Fibonacci Serise: ");
        a=0;
        b=1;
        i=1;
        while(i<=n){
            System.out.format("%d ",a);
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.println();

        //do-while Loop
        System.out.println("do-while Loop");
        int temp=n;
        int digit=String.valueOf(n).length();
        do {
            d=temp%10;
            sum+=Math.pow(d,digit);
            temp/=10;
        }while(temp!=0);
        if(sum==n){
            System.out.println("Armsttrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }

    }
}
