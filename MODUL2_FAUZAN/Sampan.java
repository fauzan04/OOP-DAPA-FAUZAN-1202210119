public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    public int jumlahKursi() {
        return super.jumlahKursi();
    }

    public int biaya() {
        return super.biaya();
    }

    public int layar() {
        return this.layar;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah " + jumlahKursi);
        System.out.println(" dengan biaya sebesar Rp. " + biaya);
    }

    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan berlayar menggunakan " + layar, layar);
        
    }

    public void berlabuh(){
        System.out.println("");

    }

    public void berlabuh(int jangkar){


    }
}

