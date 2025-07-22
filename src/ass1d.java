
import java.util.Scanner;

public class ass1d {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int sum=0,max,min,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Numbers: ");
        for(i=0;i<10;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        max=0;
        i=1;
        while(i<10){
            if (arr[i]>max){
                max=arr[i];
            }
            i++;
        }
        min=Integer.MAX_VALUE;
        i=0;
        while(i<10){
            if (arr[i]<min){
                min=arr[i];
            }
            i++;
        }
        System.out.println("Avarage: "+sum/10);
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}