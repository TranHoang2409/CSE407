package thanhtoan;

public class Main {
    public static void main(String[] args) {
        IThanhToan thanhToanTienMat = new ThanhToanTienMat();
        thanhToanTienMat.ThanhToan(500000);

        IThanhToan thanhToanTheTinDung = new ThanhToanTheTinDung();
        thanhToanTheTinDung.ThanhToan(1000000);
    }
}
