public class Dosen extends Karyawan{
    protected double total;

    @Override
    public double gajiPokok() {
        return super.gajiPokok();
    }
    public double gajiTotal()
    {
        return super.gajiPokok();
    }
    public double TambahSKS(int sks)
    {
        total = 100000 * sks;
        return total;
    }
    public double gajiTotal(int sks)
    {
        return Gaji+total;
    }

}
