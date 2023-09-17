public class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public int getTotalPowerFaculty() {
        return getHonesty()+getLoyalty()+getHardWork();
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                "} " + super.toString();
    }
}
