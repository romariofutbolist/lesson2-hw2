import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Gryffidron[] gryffidrons = {
                new Gryffidron("Harry Potter", 90, 90, 90, 90, 90),
                new Gryffidron("Germiona Granger", 9, 8, 9, 8, 7),
                new Gryffidron("Ron Wesley", 50, 50, 50, 50, 50),
        };

        Hufflepuff[] hufflepuff = {
                new Hufflepuff("Zakharia Smith", 9, 7, 4, 8, 9),
                new Hufflepuff("Sedrick Digory", 99, 99, 99, 99, 99),
                new Hufflepuff("Justin Finch", 50,50,50,50,50)
        };

        Hogwarts[] hogwartsStudent = {
                new Gryffidron("Harry Potter", 90, 90, 90, 90, 90),
                new Gryffidron("Germiona Granger", 9, 8, 9, 8, 7),
                new Gryffidron("Ron Wesley", 50, 50, 50, 50, 50),
                new Hufflepuff("Zakharia Smith", 9, 7, 4, 8, 9),
                new Hufflepuff("Sedrick Digory", 99, 99, 99, 99, 99),
                new Hufflepuff("Justin Finch", 50,50,50,50,50)
        };


        Hogwarts.printPowerHogwarts(hogwartsStudent);
        //Gryffidron.printPowerFaculty(gryffidrons);

    }
    }
