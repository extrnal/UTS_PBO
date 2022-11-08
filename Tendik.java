public class Tendik extends Karyawan{
    protected double total;
    @Override
    public double gajiPokok() {
        return super.gajiPokok();
    }
    public double gajiTotal()
    {
        return super.gajiPokok();
    }

    public double Lembur(int jam)
    {
        total = 50000*jam;
        return total;
    }

    public double gajiTotal(int jam)
    {
        return Gaji + total;
    }

}
