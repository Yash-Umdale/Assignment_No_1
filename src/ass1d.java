
import java.util.Scanner;

public class ass1d {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int sum=0,max,min,i,j;
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

        System.out.println("3x3 Matrix");
        int[][] mat = new int[3][3];
        System.out.println("Enter the 3x3 Matrix:-");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Orginal Matrix:-");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpose of the Matrix:-");
        int[][] temp = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                temp[j][i] = mat[i][j];
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("Sorting");
        //Bubble Sort
        for (i = 0; i < 10-1; i++) {
            for (j = 0; j < 10-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tempera = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempera;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        //Binary Search
        System.out.print("Enter number to search: ");
        int key = sc.nextInt();
        int low = 0, high = 10 - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Number found at index: " + mid);
                found = true;
                break;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Number not found in the array.");
        }
    }
}