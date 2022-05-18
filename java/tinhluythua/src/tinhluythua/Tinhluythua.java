/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhluythua;
import java.util.Scanner;
/**
 *
 * @author lamngocthanh
 */
public class Tinhluythua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int coso=1;
        int somu=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap co so: ");
        coso = sc.nextInt();
        System.out.print("Nhap so mu: ");
        somu = sc.nextInt();
        luythua(coso, somu);
    }
    public static void luythua(int coso, int somu)
    {
        int lt = 1;
        for(int i = 1; i<=somu; i++)
        {
            lt=lt*coso;
        }
        System.out.print(coso + "^" + somu + " = " + lt);
    }
    
}
