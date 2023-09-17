public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public static void printPowerHogwarts(Hogwarts[] hogwarts) {
        Hogwarts hogwartsMaxPower = hogwarts[0];
        for (Hogwarts hogwartsStudent : hogwarts) {
            if (hogwartsStudent.getPowerHogwarts() > hogwartsMaxPower.getPowerHogwarts()) {
                hogwartsMaxPower = hogwartsStudent;
            }
        }
        System.out.println(hogwartsMaxPower + " лучший в Хогвартсе");
    }

    public int getPowerHogwarts() {
        return getPowerOfMagic()+getTransgressionDistance();
    }

    abstract public int getTotalPowerFaculty();

    public static void printPowerFaculty(Hogwarts[] hogwarts) {
        Hogwarts hogwartsMaxPower = hogwarts[0];
        for (Hogwarts hogwartsStudent : hogwarts) {
            if (hogwartsStudent.getTotalPowerFaculty() > hogwartsMaxPower.getTotalPowerFaculty()) {
                hogwartsMaxPower = hogwartsStudent;
            }
        }
        System.out.println(hogwartsMaxPower + " лучший на факультете");
    }


    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
