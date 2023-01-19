import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int [] arr = new int [5];
        for(int i=0; i< 5; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }

//        System.out.printf("%d",n);
    }
}