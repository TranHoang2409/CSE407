package thanhtoan;

public class ThanhToanTienMat implements IThanhToan {

    @Override
    public void ThanhToan(double soTien) {
        System.out.println("Thanh toán " + soTien + " VNĐ bằng tiền mặt.");
    }
}
