import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Gryffidron harryPotter = new Gryffidron("Harry Potter", 90, 90, 90, 90, 90);
        Gryffidron germionaGranger = new Gryffidron("Germiona Granger", 9, 8, 9, 8, 7);
        Gryffidron ronWesley = new Gryffidron("Ron Wesley", 50, 50, 50, 50, 50);

        Hufflepuff zakhariaSmith = new Hufflepuff("Zakharia Smith", 9, 7, 4, 8, 9);
        Hufflepuff sedrickDigory = new Hufflepuff("Sedrick Digory", 99, 99, 99, 99, 99);
        Hufflepuff justinFinch= new Hufflepuff("Justin Finch", 50,50,50,50,50);

        harryPotter.printPowerHogwarts(ronWesley);
        harryPotter.printPowerFaculty(sedrickDigory);

    }
    }
