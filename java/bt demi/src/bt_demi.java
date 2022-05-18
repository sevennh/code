/**
 * @(#)bt_demi.java
 *
 * bt_demi application
 *
 * @author 
 * @version 1.00 2022/5/16
 */
 import java.util.Scanner;
public class bt_demi {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	int a,b,c,n;
    	int []d = new int[100];
    	Scanner sc = new Scanner(System.in);
    	System.out.print("nhap a:");
    	a = sc.nextInt();
    	System.out.print("nhap b:");
    	b = sc.nextInt();
    	System.out.print("nhap c:");
    	c = sc.nextInt();
    	System.out.print("nhap n:");
    	n = sc.nextInt();
    	tinhab(a,b);
    	tinhtong(n);
    	tinhnhan(n);
    	ptbat2(a,b,c);
    	
    	
    }
    public static void tinhab(int a,int b){
    	int tong1 = 0;
    	tong1 = a+b;
    	System.out.print("tong a va b :"+tong1);
    }
    //tong s=1+2+3...n
     public static void tinhtong(int n){
        int tong = 0 ;
        for(int i = 1 ; i <= n ; i++)
        {
            tong += i;
        }
        System.out.println("\nS to 1.."+n+": "+tong);
    }//tinh p=1*2*3...n
     public static void tinhnhan(int n){
        int nhan = 1 ;
        for(int i = 1 ; i <= n ; i++)
        {
            nhan *= i;
        }
        System.out.println("\np to 1.."+n+": "+nhan);
     }
      public static void ptbat2(float a, float b, float c)
    {
        // kiem tra vo nghiem , 1 nghiem
        if(a==0){
            if(b==0)
                System.out.println("pt vo so nghiem");
            else{
                System.out.println("pt co 1 nghiem" + "x="+(-c/b));
            }
            return;
            }
            //
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            // tinh delta
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("pt co 2 nghiem: "
                        + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("pt co nghiem kep: " + "x1 = x2 = " + x1);
            } 
            else {
                System.out.println("pt vo nghiem");
            }
    }
}
