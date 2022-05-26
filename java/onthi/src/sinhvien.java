import java.util.Scanner;

/*
Câu 2: Viết lớp sinh viên bao gồm: Họ tên, giới tính, ngày sinh, 
điểm ba môn và số tín chỉ từng môn. 
Viết lớp Date định dạng ngày sinh và kiểm tra tính hợp lệ. 
Viết lớp điểm tính điểm trung bình học kỳ ba môn học và kiểm tra tính hợp lệ. 
*/
class sinhvien {
    String ho;
    String ten;
    String gioitinh;
    date ngaysinh;
    double diem1;
    double diem2;
    double diem3;
    int tinhchi1;
    int tinhchi2;
    int tinhchi3;
    public sinhvien(){}
    public sinhvien(String ho, String ten, String gioitinh, date ngaysinh, double diem1, double diem2, double diem3,
            int tinhchi1, int tinhchi2, int tinhchi3) {
        this.ho = ho;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tinhchi1 = tinhchi1;
        this.tinhchi2 = tinhchi2;
        this.tinhchi3 = tinhchi3;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public double getDiem1() {
        return diem1;
    }

    public void setDiem1(double diem1) {
        this.diem1 = diem1;
    }

    public double getDiem2() {
        return diem2;
    }

    public void setDiem2(double diem2) {
        this.diem2 = diem2;
    }

    public double getDiem3() {
        return diem3;
    }

    public void setDiem3(double diem3) {
        this.diem3 = diem3;
    }

    public int getTinhchi1() {
        return tinhchi1;
    }

    public void setTinhchi1(int tinhchi1) {
        this.tinhchi1 = tinhchi1;
    }

    public int getTinhchi2() {
        return tinhchi2;
    }

    public void setTinhchi2(int tinhchi2) {
        this.tinhchi2 = tinhchi2;
    }

    public int getTinhchi3() {
        return tinhchi3;
    }

    public void setTinhchi3(int tinhchi3) {
        this.tinhchi3 = tinhchi3;
    }

    public void nhap(){
        Scanner ip = new Scanner(System.in);
        System.out.println("nhap ho: ");
        ho = ip.next();
        System.out.println("nhap ten: ");
        ten = ip.next();
        System.out.println("nhap gioi tinh: ");
        gioitinh = ip.next();
        ngaysinh = new date();
        System.out.print("nhap ngay thang nam sinh");
        ngaysinh.nhapdate();
        do{
            System.out.println("nhap diem mon 1: ");
            diem1 = ip.nextDouble();
            System.out.println("nhap tinh chi 1: ");
            tinhchi1= ip.nextInt();
        }while(diem1<0||diem1>10&& tinhchi1<0);
        do{
            System.out.println("nhap diem mon 2: ");
            diem2 = ip.nextDouble();
            System.out.println("nhap tinh chi 2: ");
            tinhchi2= ip.nextInt();
        }while(diem2<0||diem2>10&& tinhchi2<0);
        do {
            System.out.println("nhap diem mon 3: ");
            diem3 = ip.nextDouble();
            System.out.println("nhap tinh chi 3: ");
            tinhchi3= ip.nextInt();
        } while (diem3<0||diem3>10&& tinhchi3<0);
    }
    public void xuat(){
        System.out.println("***********************************");
        System.out.println(ho+" "+ten);
        System.out.println("Gioi tinh la: "+gioitinh);
        System.out.printf("ngay thang nam sinh la: ");
        ngaysinh.xuatdate();
        System.out.printf("diem trung binh 3 mon la: %.3f",tinhdiem());
    }
    public double tinhdiem(){
        double tongdiem=(diem1*tinhchi1)+(diem2*tinhchi2)+(diem3*tinhchi3);
        int tongtinhchi = tinhchi1+tinhchi2+tinhchi3;
        return tongdiem/tongtinhchi;
    }
}
