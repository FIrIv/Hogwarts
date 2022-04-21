package test.skypro;

public class Hogwarts {
    private String nameOfStudent;
    private int pointsOfMagic;
    private int distanceOfTransgress;

    public Hogwarts (String nameOfStudent, int pointsOfMagic, int distanceOfTransgress) {
        this.nameOfStudent = nameOfStudent;
        this.pointsOfMagic = pointsOfMagic;
        this.distanceOfTransgress = distanceOfTransgress;
    }

    public String getNameOfStudent () {
        return nameOfStudent;
    }

    @Override
    public String toString () {
        return this.nameOfStudent + " : студент Griffindor, сила волшебства " + this.pointsOfMagic + ", расстояние трансгрессии " + this.distanceOfTransgress;
    }

    public int getLocalSumOfQualities () {
        return 0;
    }

    public int getSumOfQualities () {
        return this.pointsOfMagic + this.distanceOfTransgress;
    }

    public void betterLocalThen (Hogwarts otherStudent) {
    }

    public void betterThen (Hogwarts otherStudent) {
        int sum1 = this.getSumOfQualities();
        int sum2 = otherStudent.getSumOfQualities();
        System.out.print("Сравнение общее : ");
        if (sum1 > sum2) {
            System.out.println(this.nameOfStudent + " (" + sum1 + ") обладает бОльшей мощью магии, чем " + otherStudent.nameOfStudent + " (" + sum2 + "). ");
        } else if (sum1 == sum2) {
            System.out.println(this.nameOfStudent + " (" + sum1 + ") и " + otherStudent.nameOfStudent + " (" + sum2 + ") обладают одинаковой мощью магии" + ". ");
        } else {
            System.out.println(otherStudent.nameOfStudent + " (" + sum2 + ") обладает бОльшей мощью магии, чем " + this.nameOfStudent + " (" + sum1 + "). ");
        }
    }
}
