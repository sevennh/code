import java.util.Scanner;

class date {
    int ngay;
    int thang;
    int nam;
    public date(){
        ngay = 1;
        thang = 1;
        nam = 1990;
    }
    public date(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
   
    public int getNgay() {
        return ngay;
    }
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    public void nhapdate(){
       Scanner ip = new Scanner(System.in);
            do{
            System.out.println("nhap ngay:");
            ngay = ip.nextInt();
            System.out.println("nhap thang:");
            thang=ip.nextInt();
            System.out.println("nhap nam:");
            nam=ip.nextInt();
            }while(ktdate()==false);
        }
    public boolean ktdate(){
        if(ngay<1 || ngay> 31){
            return false;
        }
        if(thang<1||thang>12){
            return false;
        }
        if(nam<2020){
            return false;
        }
        return true;
    }
    public void xuatdate(){
        System.out.println(+ngay + "/ "+thang+"/ "+nam);
    }
}
