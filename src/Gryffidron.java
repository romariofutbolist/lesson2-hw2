public class Gryffidron extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffidron(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public int getTotalPowerFaculty() {
        return getBravery()+getHonor()+getNobility();
    }

    @Override
    public String toString() {
        return "Gryffidron{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                "} " + super.toString();
    }
}
