package test.skypro;

public class Ravenclaw extends Hogwarts { // Когтевран
    private int smart; // умны
    private int wise; // мудры
    private int witty; // остроумны
    private int creativity; // творческие

    public Ravenclaw (String nameOfStudent, int pointsOfMagic, int distanceOfTransgress, int smart, int wise, int witty, int creativity) {
        super (nameOfStudent, pointsOfMagic, distanceOfTransgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    @Override
    public String toString () {
        return super.toString() + ", ум " + this.smart + ", мудрость " + this.wise + ", остроумие " + this.witty + ", творчество " + this.creativity;
    }

    @Override
    public int getLocalSumOfQualities () {
        return this.smart + this.wise + this.witty + this.creativity;
    }

    @Override
    public void betterLocalThen (Hogwarts otherStudent) {
        if (this.getClass() == otherStudent.getClass()) {
            int sum1 = this.getLocalSumOfQualities();
            int sum2 = otherStudent.getLocalSumOfQualities();
            System.out.print("Сравнение по факультету Ravenclaw : ");
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
