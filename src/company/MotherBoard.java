package company;

import java.util.Arrays;

public class MotherBoard {

    private SataDrive[] sataDrives;


    public MotherBoard() {
        this.sataDrives = new SataDrive[4];
    }

    public void addSataDrive() {
        boolean addedSata = false;
        for (int i = 0; i < sataDrives.length; i++) {
            if ((addedSata == false) && (sataDrives[i] == null)) {
                SataDrive currentSata = new SataDrive(i+1);
                sataDrives[i] = currentSata;
                addedSata = true;
                System.out.println("SataBoard added!");
            }
        }
        if (addedSata == false) {
            System.out.println("MotherBoard is full");
        }
    }

    public String toString() {
        return Arrays.toString(sataDrives);
    }
}
