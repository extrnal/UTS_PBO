public class Karyawan {
    protected String NIP;
    protected String nama;

    protected String Alamat;

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    protected String TTL;
    protected String JK;
    protected String TahunMasuk;
    protected double Gaji;
    protected String NIDN;
    protected String Jurusan;



    public double gajiPokok(){
        setGaji(2000000);
        return Gaji;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getJK() {
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public String getTahunMasuk() {
        return TahunMasuk;
    }

    public void setTahunMasuk(String tahunMasuk) {
        TahunMasuk = tahunMasuk;
    }

    public double getGaji() {
        return Gaji;
    }

    public void setGaji(double gaji) {
        Gaji = gaji;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }
}
