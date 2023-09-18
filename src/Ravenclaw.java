public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creation) {
        super(name, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }


    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public int getTotalPowerFaculty() {
        return getCreation()+getWit()+getWisdom()+getMind();
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                "} " + super.toString();
    }
}
