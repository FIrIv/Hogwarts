package test.skypro;

public class Gryffindor extends Hogwarts {
    private int nobility; // благородство
    private int honor; // честь
    private int courage; // храбрость

    public Gryffindor (String nameOfStudent, int pointsOfMagic, int distanceOfTransgress, int nobility, int honor, int courage) {
        super (nameOfStudent, pointsOfMagic, distanceOfTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString () {
        return super.toString() + ", благородство " + this.nobility + ", честь " + this.honor + ", храбрость " + this.courage;
    }

    @Override
    public int getLocalSumOfQualities () {
        return this.nobility + this.honor + this.courage;
    }

    @Override
    public void betterLocalThen (Hogwarts otherStudent) {
        if (this.getClass() == otherStudent.getClass()) {
            int sum1 = this.getLocalSumOfQualities();
            int sum2 = otherStudent.getLocalSumOfQualities();
            System.out.print("Сравнение по факультету Griffindor : ");
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
