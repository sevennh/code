/**
 * @(#)mang.java
 *
 * mang application
 *
 * @author 
 * @version 1.00 2022/5/16
 */
 import java.util.Scanner;
 	
 
public class mang {
    
    public static void main(String[] args) {
    int n, temp, max = 100;
    Scanner scanner = new Scanner(System.in);
         
    // khai báo và c?p phát b? nh? cho m?ng A
    int A[] = new int[max];
         
    // nh?p s? ph?n t? c?a m?ng
    // ki?m tra n?u n <= 2 ho?c n > max - 1
    // thì ph?i nh?p l?i
    do {
        System.out.println("Nh?p s? ph?n t? c?a m?ng: ");
        n = scanner.nextInt();
    } while (n <= 2 || n > max-1);
         
    System.out.println("Nh?p giá tr? cho các ph?n t? c?a m?ng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("A[" + i + "] = ");
        A[i] = scanner.nextInt();
    }
         
    // in ra màn hình m?ng s? ban d?u
    System.out.println("M?ng ban d?u: ");
    for (int i = 0; i < n; i++) {
        // in các ph?n t? trên cùng 1 dòng
        System.out.print(A[i] + "\t");
    }
         
    // s?p x?p các ph?n t? trong m?ng
    // vòng l?p for s? duy?t i và j
    // i ch?y t? 0 d?n n - 2, j chay t? i + 1 d?n n - 1
    // n?u ph?n t? t?i ch? s? j nh? hon ph?n t? t?i i
    // thì s? hoán d?i v? trí 2 ph?n t? này cho nhau
    for (int i = 0; i < n - 1; i++) {
        for (int j = i+1; j <= n - 1; j++) {
            if (A[j] < A[i]) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
         
    // in ra màn hình m?ng s? sau khi s?p x?p
    System.out.println("\nM?ng sau khi s?p x?p: ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }
    }
}
    
