package test.skypro;

public class Main {
    public static final int MAX_MAGIC = 10;
    public static final int MAX_TRANSGRESS = 1000;
    public static final int MAX_ALL_POINTS = 100;

    public static int generateFromToRandom (int min, int max) {
        java.util.Random random = new java.util.Random();
        int elem;
        elem = random.nextInt(max-min+1) + min;
        return elem;
    }

    public static void main(String[] args) {
        Hogwarts [] students = new Hogwarts[]{new Gryffindor("Harry Potter", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),
                new Gryffindor("Hermione Granger", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),
                new Gryffindor("Ron Weasley", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),

                new Slytherin("Draco Malfoy", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),
                new Slytherin("Graham Montagu", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),
                new Slytherin("Gregory Goyle", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),

                new Hufflepuff("Zacharias Smith", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),
                new Hufflepuff("Cedric Diggory", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),
                new Hufflepuff("Justin Finch-Fletchley", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),

                new Ravenclaw("Zhou Chang", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),
                new Ravenclaw("Padma Patil", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS)),
                new Ravenclaw("Marcus Belby", generateFromToRandom(0, MAX_MAGIC), generateFromToRandom(0, MAX_TRANSGRESS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS), generateFromToRandom(0, MAX_ALL_POINTS))
        };

        for (Hogwarts student : students) {
            System.out.println(student.toString() + ".");
        }

        // сравнение общее
        System.out.println();
        System.out.println("Сравнение в целом по Хогвартсу. ");;
        for (int i=0; i<students.length; i++) {
            for (int j=i+1; j<students.length; j++) {
                students[i].betterThen(students[j]);
            }
        }

        // сравнение внутри факультетов
        System.out.println();
        System.out.println("Сравнение по факультетам. ");;
        for (int i=0; i<students.length; i++) {
            for (int j=i+1; j<students.length; j++) {
                students[i].betterLocalThen(students[j]);
            }
        }
    }
}
