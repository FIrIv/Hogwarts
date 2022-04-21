package test.skypro;

public class Hufflepuff extends Hogwarts {
    private int hardworking; // трудолюбивы
    private int loyal; // верны
    private int honest; // честны

    public Hufflepuff (String nameOfStudent, int pointsOfMagic, int distanceOfTransgress, int hardworking, int loyal, int honest) {
        super (nameOfStudent, pointsOfMagic, distanceOfTransgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString () {
        return super.toString() + ", трудолюбие " + this.hardworking + ", верность " + this.loyal + ", честь " + this.honest;
    }

    @Override
    public int getLocalSumOfQualities () {
        return this.hardworking + this.loyal + this.honest;
    }

    @Override
    public void betterLocalThen (Hogwarts otherStudent) {
        if (this.getClass() == otherStudent.getClass()) {
            int sum1 = this.getLocalSumOfQualities();
            int sum2 = otherStudent.getLocalSumOfQualities();
            System.out.print("Сравнение по факультету Hufflepuff : ");
            if (sum1 > sum2) {
                System.out.println(this.getNameOfStudent() + " (" + sum1 + ") обладает бОльшей мощью магии, чем " + otherStudent.getNameOfStudent() + " (" + sum2 + "). ");
            } else if (sum1 == sum2) {
                System.out.println(this.getNameOfStudent() + " (" + sum1 + ") и " + otherStudent.getNameOfStudent() + " (" + sum2 + ") обладают одинаковой мощью магии" + ". ");
            } else {
                System.out.println(otherStudent.getNameOfStudent() + " (" + sum2 + ") обладает бОльшей мощью магии, чем " + this.getNameOfStudent() + " (" + sum1 + "). ");
            }
        }
    }
}
