
public class main {
    public static void main(String[] args) {
        Phanso ps2 = new Phanso(5,2);
        Phanso ps1 = new Phanso (3,9); 
        Phanso ps3 = ps1.Cong2PhanSo(ps2) ; 
        // ps.xuatTuso();  // Output: Tu so: 3
        // ps.xuatMauso(); // Output: Mau so: 4
        ps3.xuatPhanSo();
    }
}
