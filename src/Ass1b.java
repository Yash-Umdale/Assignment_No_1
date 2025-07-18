import java.util.Scanner;

public class Ass1b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number: ");
        n=sc.nextInt();

        if(n%2==0){
            System.out.println("Even Number");
        }
        else if(n%2!=0) {
            System.out.println("Odd Number");
        }


        if(n<=1){
            System.out.println("No Prime");
        }
        else{
            int count=0;
            for(int i=2;i<=n/2;i++){
                if(n%2==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("No Prime");
            }
        }

        switch (n){
            case 1:
                if(n==1){
                    System.out.println("Weekday:Monday");
                }
                break;
            case 2:
                if(n==2){
                    System.out.println("Weekday:Tuesday");
                }
                break;
            case 3:
                if(n==3){
                    System.out.println("Weekday:Wednesday");
                }
                break;
            case 4:
                if(n==4){
                    System.out.println("Weekday:Thursday");
                }
                break;
            case 5:
                if(n==5){
                    System.out.println("Weekday:Friday");
                }
                break;
            case 6:
                if(n==6){
                    System.out.println("Weekday:Satursday");
                }
                break;
            case 7:
                if(n==7){
                    System.out.println("Weekday:Sunday");
                }
                break;
            default:
                System.out.println("Enter the Value Between 1-7");
                break;


        }

    }

}

