import java.util.Scanner;

public class Ass1cb {
    public static void main(String[] args) {
        int i,n,a,b,c,d,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        n=sc.nextInt();
        System.out.println("Multiplication");
        for (i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }

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
        System.out.println(" ");

        //System.out.println("Armstrong Number");
        int temp=n;
        int digit=String.valueOf(n).length();

        while(temp!=0){
            d=temp%10;
            sum+=Math.pow(d,digit);
            temp/=10;
        }
        if (sum==n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
