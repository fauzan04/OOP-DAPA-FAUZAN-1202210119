public class Kapal extends TransportasiAir {
    protected String mesin;
     
    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    
    public int jumlahKursi() {
        return super.jumlahKursi();
    }
    
    public int biaya() {
        return super.biaya();
    }
    
    public int mesin() {
        return this.mesin;
    }
    
    
    public void informasi(){

    }

    public void berlayar(){

    }

    public void berlayar(int kecepatan){

    }
    
    public void berlabuh(){

    }
    
    }

