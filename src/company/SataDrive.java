package company;

public class SataDrive {
    private int nummer;

    public SataDrive(int nummer){
        this.nummer=nummer;
    }

    @Override
    public String toString() {
        return Integer.toString(nummer);
    }
}
