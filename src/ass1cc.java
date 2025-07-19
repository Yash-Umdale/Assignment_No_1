import java.util.Scanner;

public class ass1cc {
    public static void main(String[] args) {
        int i,a,n,b,c,d,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        n=sc.nextInt();


        System.out.println("Multiplication: ");
        i=1;
        do{
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        }while(i<=10);

        System.out.println("Fibonacci Serise: ");
        a=0;
        b=1;
        i=1;
        do{
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            i++;
        }while(i<=n);
        System.out.println();

        temp=n;
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
