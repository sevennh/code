/**
 * @(#)buoi2mang.java
 *
 * buoi2mang application
 *
 * @author 
 * @version 1.00 2021/6/8
 */
 /*
 * 1.Nhap mang, xuat mang.
 * 2.sap xep mang
 * 3.Tim 1 phan tu
 * 4.Tinh tong cac phan tu
 * 5.Tinh tong cac phan tu chan le
 * 6.Tinh tong cac phan tu duong
 * 7.Xoa 1 phan tu trong mang
*/
 import java.util.Scanner;
public class buoi2mang {
int n;
	int a[];
	Scanner sc;
	public  buoi2mang()
	{
		n=0;
		a = new int[100];
		sc= new Scanner(System.in);
	
	}
	//Nhap mang
    void nhapmang()
    {
    	try{
    		System.out.printf("Nhap so phan tu: ");
	    	n = sc.nextInt();
	    	for(int i=0;i<n ; i++)
			{
				System.out.printf("Nhap phan tu thu %d : ",i+1);
				a[i]= sc.nextInt();
			}
    	}
    	catch(Exception ex)
    	{
    		System.out.println("Loi nay nhe: "+ex);
    		
    	}
    	
    }
    //Xuat mang
    void xuatmang()
    {
		for(int i=0;i<n ; i++)
		{
			System.out.printf(" %d ", a[i]);
			n = sc.nextInt();
		}
    }
    //Sap xep mang
    void sxmangtang()
	{
		int temp=0;
		for (int i = 0; i < n; i++) {
       		for (int j = i+1; j <= n - 1; j++) {
            	if (a[j] < a[i]) {
                	temp = a[i];
                	a[i] = a[j];
                	a[j] = temp;
           		}
        	}
    	}
    		System.out.println("\nMang sap xep tang dan la: ");
    		for (int i = 0; i < n; i++) {
        		System.out.print(a[i] + "\t");
   			}
	}
	
	void sxmanggiam()
	{
		int temp=0;
		for (int i = 0; i < n; i++) {
       		for (int j = i+1; j <= n - 1; j++) {
            	if (a[j] > a[i]) {
                	temp = a[i];
                	a[i] = a[j];
                	a[j] = temp;
           		}
        	}
    	}
    		System.out.println("\nMang sap xep giam dan la: ");
    		for (int i = 0; i < n; i++) {
        		System.out.print(a[i] + "\t");
   			}
	}
    //Tinh tong cac phan 
    void tongmang()
    {
    	int tong =0;
    	for (int i = 0; i < n; i++)
		{
			tong +=a[i];
		}
		System.out.println("\nTong mang la: " +tong);
    }
    //Tinh tong cac phan tu le
    void tongmangle()
    {
    	int tongle=0;
    	for (int i = 0; i < n; i++)
		{
			if(a[i]%2!=0)
			{
				tongle +=a[i];
			}
		}
		System.out.printf("\nTong le la: "+tongle);
    }
    //Tinh tong cac phan tu chan
    void tongmangchan()
    {
    	int tongchan=0;
    	for(int i=0; i<=n; i++)
    	{
    		if(a[i]%2==0)
    		{
    			tongchan+=a[i];
    		}
    	}
    	System.out.printf("\nTong chan la: "+tongchan);
    }
     //Tinh tong cac phan tu duong
    void tongphantuduong()
    {
    	int tongduong=0;
    	for(int i=0; i<n; i++)
    	{
    		if(a[i]>0)
    		{
    			tongduong+=a[i];
    		}
    	}
    	System.out.printf("\nTong phan tu duong la: "+tongduong);
    }
   //Tim 1 phan tu
   	boolean tim(int x)
	{
		for(int i=1; i<n; i++)
		{
			if(x==a[i])
				return true;
		}
			return false;
	}
	int timvt(int x)
	{
		int vt = -1;
		for(int i = 0; i<n;i++)
		{
			if(a[i]==x)
				return i;
		}
		return -1;
	}
   //Xoa mot phan tu trong mang
   void xoaphantu(){
   		int k;
		System.out.println("\nNhap so can xoa: ");
		k= sc.nextInt();
		int c = 0;
    	for (int i= 0; i < n; i++) {
        	if (a[i] != k) {
            	a[c] = a[i];
            		c++;
        	}
    	}
    	n = c;
	}
    public static void main(String[] args) {
    	
    	// TODO, add your application code
   Scanner nhapne = new Scanner(System.in);
    	buoi2mang t = new  buoi2mang();
    	t.nhapmang();
    	System.out.printf("\nMang vua nhap : ");
    	t.xuatmang();
    	t.sxmangtang();
    	t.sxmanggiam();
    	t.tongmang();
    	t.tongmangle();
    	t.tongmangchan();
    	t.tongphantuduong();
    	//Tim x
    	int x;
    	System.out.printf("\nNhap x can tim: ");
    	x = nhapne.nextInt();
    	int vt=t.timvt(x);
    	if(vt==-1)
    	{
    		System.out.printf("Khong thay x trong mang");
    	}
    	else
    	{
    		System.out.printf("x co trong mang o vi tri %d ",vt);
    	}
    	t.xoaphantu();
    	System.out.println("\nMang khi xoa k la: ");
    	t.xuatmang();
    }
}
