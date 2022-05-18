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
         
    // khai b�o v� c?p ph�t b? nh? cho m?ng A
    int A[] = new int[max];
         
    // nh?p s? ph?n t? c?a m?ng
    // ki?m tra n?u n <= 2 ho?c n > max - 1
    // th� ph?i nh?p l?i
    do {
        System.out.println("Nh?p s? ph?n t? c?a m?ng: ");
        n = scanner.nextInt();
    } while (n <= 2 || n > max-1);
         
    System.out.println("Nh?p gi� tr? cho c�c ph?n t? c?a m?ng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("A[" + i + "] = ");
        A[i] = scanner.nextInt();
    }
         
    // in ra m�n h�nh m?ng s? ban d?u
    System.out.println("M?ng ban d?u: ");
    for (int i = 0; i < n; i++) {
        // in c�c ph?n t? tr�n c�ng 1 d�ng
        System.out.print(A[i] + "\t");
    }
         
    // s?p x?p c�c ph?n t? trong m?ng
    // v�ng l?p for s? duy?t i v� j
    // i ch?y t? 0 d?n n - 2, j chay t? i + 1 d?n n - 1
    // n?u ph?n t? t?i ch? s? j nh? hon ph?n t? t?i i
    // th� s? ho�n d?i v? tr� 2 ph?n t? n�y cho nhau
    for (int i = 0; i < n - 1; i++) {
        for (int j = i+1; j <= n - 1; j++) {
            if (A[j] < A[i]) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
         
    // in ra m�n h�nh m?ng s? sau khi s?p x?p
    System.out.println("\nM?ng sau khi s?p x?p: ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }
    }
}
    
