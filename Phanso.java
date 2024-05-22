public class Phanso {
    private int tuso, mauso = 1;

    public int getTuso() {
        return tuso;
    }

    public int getMauso() {
        return mauso;
    }

    private int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private void rutGon() {
        if (tuso == 0) {
            mauso = 1;
            return;
        }
        int gcd = ucln(tuso, mauso);
        tuso /= gcd;
        mauso /= gcd;
    }

    private void doiDauMauso() {
        if (mauso < 0) {
            tuso = -tuso;
            mauso = -mauso;
        }
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
        rutGon();
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
        rutGon();
        doiDauMauso();
    }

    public Phanso(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
        rutGon();
        doiDauMauso();
    }

    public Phanso() {
        this(1, 1);
    }

    public Phanso(int n) {
        tuso = n;
        mauso = 1;
    }
    // public void xuatTuso() {
    // System.out.println("Tu so: " + tuso);
    // }

    // public void xuatMauso() {
    // System.out.println("Mau so: " + mauso);
    // }
    public Phanso Cong2PhanSo ( Phanso p ){
        Phanso Kq = new Phanso() ; 
        Kq.tuso = tuso + p.mauso + mauso + p.tuso ; 
        Kq.mauso = mauso +  p.mauso ; 
        Kq.rutGon();
        return Kq ; 
    }
    public void xuatPhanSo() {
        if (mauso == 1) {
            System.out.println(tuso);
        } else if (tuso == 0) {
            System.out.println(0);
        } else {
            System.out.println(tuso + "/" + mauso);
        }
    }
}
