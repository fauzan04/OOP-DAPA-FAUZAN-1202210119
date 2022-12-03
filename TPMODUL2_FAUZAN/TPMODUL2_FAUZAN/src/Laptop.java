public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public String getDrive(){
        return super.getDrive();
    }

    public float getProcessor(){
        return super.getProcessor();
    }

    public int getRam(){
        return super.getRam();
    }

    public boolean getWebcam(){
        return this.webcam;
    }

    public void informasi() {
        System.out.print("Laptop ini diketahui memiliki drive bertipe " + getDrive());
        System.out.print(" dengan ram sebesar " + getRam() + " GB");
        System.out.print(" dan dilengkapi dengan processor berkecepatan " + getProcessor() + " GHz. ");

        if (getWebcam()) {
            System.out.print("Selain itu, laptop ini juga memiliki webcam.");
            System.out.println();
        } else {
            System.out.print("Namun sangat disayangkan, laptop ini tidak memilki webcam.");
            System.out.println();
        }
    }

    public void bukaGame(String nama_game) {
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email) {
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan ke " + email2);
    }

}
