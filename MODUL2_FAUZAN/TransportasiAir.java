public class TransportasiAir {
    protected int jumlahKursi, biaya;

    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public int jumlahKursi() {
        return jumlahKursi;
    }

    public int biaya() {
        return biaya;
    }

    public void informasi() {
        System.out.print("Transportasi Air jenis tidak diketahui dengan kursi berjumlah " + jumlahKursi());
        System.out.print(" ditetapkan dengan biaya sebesar Rp. " + biaya());
        System.out.println();
    }

    public void berlayar(){
        System.out.print("Transportasi Air dengan jenis tidak diketahui sedang berlayar");
        System.out.println();
    }

    public void berlabuh(){
        System.out.print("Transportasi Air dengan jenis tidak diketahui berlabuh di pantai");
        System.out.println();
    }
}