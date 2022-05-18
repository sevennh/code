/**
 * @(#)mangdemo.java
 *
 * mangdemo application
 *
 * @author 
 * @version 1.00 2022/5/16
 */
 import java.util.Scanner;
 
public class mangdemo {
	
    public static void main(String[] args) {
    int n, sum = 0, tempSort;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nh?p v�o s? ph?n t? c?a m?ng: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    // kh?i t?o v� c?p ph�t b? nh? cho m?ng
    int array[] = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Nh?p ph?n t? th? " + i + ": ");
        array[i] = scanner.nextInt();
    }
         
    // Hi?n th? m?ng v?a nh?p
    System.out.println("\nM?ng ban d?u: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
         
    // t�nh t?ng c�c ph?n t? c� trong m?ng
    for (int i = 0; i < n; i++) {
        sum += array[i];
    }
    System.out.println("\nT?ng c�c ph?n t? c� trong m?ng = " + sum);
         
    // s?p x?p theo th? t? gi?m d?n
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
            if (array[i] < array[j]) {
                tempSort = array[i];
                array[i] = array[j];
                array[j] = tempSort;
            }
        }
    }
    System.out.println("M?ng sau khi s?p x?p l�: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
         
    // t�m ph?n t? nh? nh?t
    // sau khi s?p x?p theo th? t? gi?m d?n 
    // th� ph?n t? nh? nh?t l� ph?n t? cu?i c�ng trong m?ng
    System.out.println("\nPh?n t? nh? nh?t trong m?ng l� " + array[n - 1]);
}
}
