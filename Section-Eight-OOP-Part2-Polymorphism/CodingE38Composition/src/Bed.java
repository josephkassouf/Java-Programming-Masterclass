public class Bed {
    private String stlye;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String stlye, int pillows, int height, int sheets, int quilt) {
        this.stlye = stlye;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getStlye() {
        return stlye;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make() {
        System.out.print("Bed -> Making | ");
    }
}
