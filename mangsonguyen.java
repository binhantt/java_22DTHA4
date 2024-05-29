import java.util.Random;
import java.util.Scanner;

public class mangsonguyen {

    public static void nhapmang(int a[], int n) {
        Random x = new Random();
        System.out.printf("nhap mang : \n  ");
        for (int i = 0; i < n; i++) {
            a[i] = x.nextInt(-20,50);
            System.out.print("\n a[" + i + "]:" + a[i] + " ");
        }
        System.out.println();
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void hienmang(int a[], int n) {
        System.out.print("Mang vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.print("\t" + a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("nhap n phần tư trong mang  :");
        Scanner c = new Scanner(System.in);
        int n = c.nextInt(); 
        int[] a = new int[n];

        nhapmang(a, n);

        hienmang(a, n);
        System.out.print("Cac so nguyen to trong mang: ");
        for (int i = 0; i < n; i++) {
            if (isPrime(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        
        System.out.println();
    }
}
