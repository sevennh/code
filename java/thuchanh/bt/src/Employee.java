import java.util.Scanner;

class Employee {
    String ho;
    String ten;
    date ngaysinh;
    date ngayvaolam;
    public Employee() {
    }
    public Employee(String ho, String ten, date ngaysinh, date ngayvaolam) {
        this.ho = ho;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.ngayvaolam = ngayvaolam;
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
    public date getNgaysinh() {
        return ngaysinh;
    }
    public void setNgaysinh(date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    public date getNgayvaolam() {
        return ngayvaolam;
    }
    public void setNgayvaolam(date ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }
    public void nhapNhanVien() {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap ho: ");
        ho = ip.next();

        System.out.print("Nhap ten: ");
        ten = ip.next();
        
        ngaysinh = new date();
        ngayvaolam = new date();
        System.out.println("nhap ngay thang nam sinh: ");
        ngaysinh.nhapdate();
        System.out.println("nhap ngay vao lam: ");
        ngayvaolam.nhapdate();
    }
    public void xuatNhanVien() {
        System.out.println("----------");
        System.out.println("Thong tin nhan vien vua nhap");
        System.out.println("Ho va ten: " + ho + " " + ten);
        System.out.println("Ngay thang nam sinh: ");
        ngaysinh.xuatdate();
        System.out.println("Ngay vao lam: ");
        ngayvaolam.xuatdate();

    }
    
}
