public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Adata", 16, 3.20F);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("Seagate", 16, 9.5F, true);
        laptop.informasi();
        laptop.bukaGame("Forza Horizon 4");
        laptop.kirimEmail("blablablaball@gmail.com");
        laptop.kirimEmail("pboasik@gmail.com", "pbokece@gmail.com");
        System.out.println();

        Handphone handphone = new Handphone("Sandisk", 8, 8.2F, false);
        handphone.informasi();
        handphone.telfon(628763419);
        handphone.kirimSMS(62138425);
        handphone.kirimSMS(621456724, 623142567);
    }
}
