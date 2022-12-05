public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasiAir = new TransportasiAir(4,20000);
        transportasiAir.informasi();
        transportasiAir.berlayar();
        transportasiAir.berlabuh();
        System.out.println();

        Sampan sampan = new Sampan(4, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlayar();
        sampan.berlabuh();
        System.out.println();

        Kapal kapal = new Kapal(4, 100000, diesel);
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar();
        kapal.berlabuh();
    }
}
