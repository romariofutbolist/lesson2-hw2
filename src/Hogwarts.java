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

    public void printPowerHogwarts(Hogwarts hogwarts) {
        if(this.getPowerHogwarts() > hogwarts.getPowerHogwarts()) {
            System.out.println(this.getName() + " сильнее, чем " + hogwarts.getName());
        } else if (this.getPowerHogwarts() < hogwarts.getPowerHogwarts()) {
            System.out.println(hogwarts.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Оба равны по силе");
        }
    }

    public int getPowerHogwarts() {
        return getPowerOfMagic()+getTransgressionDistance();
    }

    abstract public int getTotalPowerFaculty();

    public void printPowerFaculty(Hogwarts hogwarts) {
        if(this.getTotalPowerFaculty() > hogwarts.getTotalPowerFaculty()) {
            System.out.println(this.getName() + " сильнее, чем " + hogwarts.getName());
        } else if (this.getTotalPowerFaculty() < hogwarts.getTotalPowerFaculty()) {
            System.out.println(hogwarts.getName() + " сильнее, чем " + this.getName());
        } else {
            System.out.println("Оба равны по силе");
        }
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
