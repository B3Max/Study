package work_19;

public class Chair extends Furniture {
    private boolean isSpin;

    Chair(int leg, String mat, boolean isSpin) {
        this.numberOfLegs = leg;
        this.material = mat;
        this.isSpin = isSpin;
    }

    public void setSpin(boolean spin) {
        this.isSpin = spin;
    }

    public boolean getSpin() {
        return isSpin;
    }

    public String spin() {
        if (isSpin)
            return ("SPIIEEEEIEIIEIN");
        else return ("Me sad, chair can't spin");
    }

    @Override
    public String toString() {
        return "Chair{" +
                "isSpin=" + isSpin +
                ", numberOfLegs=" + numberOfLegs +
                ", material='" + material + '\'' +
                '}';
    }
}
