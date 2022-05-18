/**
 * @(#)manglancuoi.java
 *
 * manglancuoi application
 *
 * @author 
 * @version 1.00 2022/5/16
 */
 import java.util.Scanner;
public class manglancuoi {
	//khai baos bien
private Integer a[];
private  int spt;
   public static void main(String[] args)
		{
			manglancuoi b = new manglancuoi();
			int tam,n;
			b.nhapMang();
			b.xuatMang();
			b.tinhtong();
			b.sapxep();
		}
	public void nhapMang()
		{
		Scanner nhap=new Scanner(System.in);
		System.out.print("Nhap so phan tu: ");

		this.spt=nhap.nextInt();
		this.a=new Integer[this.spt];
		for(int i=0;i<this.spt;i++)
			{
				System.out.print("Nhap phan tu thu " + i + ": ");
				this.a[i]=new Integer(nhap.nextInt());
			}
		}
		public void xuatMang()
		{
		System.out.print("Mang vua tao: ");
		for(int i=0;i<this.spt;i++)
			{
			System.out.print(" " + this.a[i] + " ");
			}
		}
		public void tinhtong(){
		int sum = 0;
		for (int i = 0; i <this.spt; i++) {
        sum += this.a[i];
    	}
    	System.out.println("\nT?ng các ph?n t? có trong m?ng = " + sum);
		}
		public void sapxep(){
			int tam =0;
		for (int i = 0; i < this.spt - 1; i++) {
        for (int j = i + 1; j <= this.spt - 1; j++) {
           /*doi dau de tang hay giam*/ if (this.a[i] > this.a[j]) {
                tam = a[i];
                a[i] = a[j];
                a[j] = tam;
            }
        }
    }
    System.out.println("M?ng sau khi s?p x?p là: ");
    for (int i = 0; i < this.spt ; i++) {
        System.out.print(this.a[i] + "\t");
    }
		}
}
