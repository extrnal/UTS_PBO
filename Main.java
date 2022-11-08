public class Main {
    public static void main(String[] args) {

        Dosen dosen1 =new Dosen();
        Tendik tendik1=new Tendik();

        dosen1.setNIDN("11119999");
        dosen1.setNIP("210009999");
        dosen1.setNama("Udin Purworejo");
        dosen1.setAlamat("Jalan Purnomo, Nomor 8");
        dosen1.setTTL("8 Juli 1899");
        dosen1.setJK("Perempuan");
        dosen1.setJurusan("Teknik Informatika");
        dosen1.setTahunMasuk("1 Mei 1998");


        System.out.println("NIP               : "+ dosen1.getNIP());
        System.out.println("NIDN              : "+ dosen1.getNIDN());
        System.out.println("Nama              : " +dosen1.getNama());
        System.out.println("Alamat            : "+ dosen1.getAlamat());
        System.out.println("Tanggal Lahir     : "+ dosen1.getTTL());
        System.out.println("Jenis Kelamin     : "+ dosen1.getJK());
        System.out.println("Jursan            : "+ dosen1.getJurusan());
        System.out.println("Tahun Masuk       : "+ dosen1.getTahunMasuk());
        System.out.println("Gaji pokok        : "+ dosen1.gajiTotal());
        System.out.println("SKS Lebih (6 SKS) : "+ dosen1.TambahSKS(6));
        System.out.println("Total Gaji        : "+ dosen1.gajiTotal(6));


        System.out.println("===================================================================================================================");

        tendik1.setNIP("2100002000");
        tendik1.setNama("Nurlaeli Simnanjuntak");
        tendik1.setAlamat("Jalan Sari Nomor 1");
        tendik1.setTTL("5 Januari 2000");
        tendik1.setJK("Perempuan");
        tendik1.setTahunMasuk("3 Mei 2011");


        System.out.println("NIP             : "+ tendik1.getNIP());
        System.out.println("Nama            : "+ tendik1.getNama());
        System.out.println("Alamat          : "+ tendik1.getAlamat());
        System.out.println("Tanggal Lahir   : "+ tendik1.getTTL());
        System.out.println("Jenis Kelamin   : "+ tendik1.getJK());
        System.out.println("Tahun Masuk     : "+ tendik1.getTahunMasuk());
        System.out.println("Gaji Pokok      : "+ tendik1.gajiPokok());
        System.out.println("Lembur (20 jam) : "+ tendik1.Lembur(20));
        System.out.println("Total Gaji      : "+ tendik1.gajiTotal(20));




    }
}