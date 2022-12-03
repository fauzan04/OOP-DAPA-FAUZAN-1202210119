public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public String getDrive() {
        return super.getDrive();
    }

    public int getRam() {
        return super.getRam();
    }

    public float getProcessor() {
        return super.getProcessor();
    }


    public boolean getFingerprint() {
        return this.fingerprint;
    }

    public void informasi() {
        System.out.print("Handphone ini diketahui memiliki drive bertipe " + getDrive());
        System.out.print(" dengan ram sebesar " + getRam() + " GB");
        System.out.print(" dan dilengkapi dengan processor berkecepatan " + getProcessor() + " GHz.");

        if (getFingerprint()) {
            System.out.print(" Selain itu, handphone ini juga memiliki Fingerprint.");
            System.out.println();
        } else {
            System.out.print(" Namun sangat disayangkan, handphone ini tidak memiliki Fingerprint.");
            System.out.println();
        }
    }

    public void telfon(int no_hp) {
        System.out.println("Handphone berhasil menyambungkan telfon ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + no_hp1 + " dan ke nomor " + no_hp2);
    }

}