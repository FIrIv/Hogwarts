package test.skypro;

public class Slytherin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int thirstForOower; // жажда власти

    public Slytherin (String nameOfStudent, int pointsOfMagic, int distanceOfTransgress, int cunning, int determination, int ambition, int resourcefulness, int thirstForOower) {
        super (nameOfStudent, pointsOfMagic, distanceOfTransgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForOower = thirstForOower;
    }

    @Override
    public String toString () {
        return super.toString() + ", хитрость " + this.cunning + ", решительность " + this.determination + ", амбициозность " + this.ambition + ", находчивость " + this.resourcefulness + ", жажда власти " + this.thirstForOower;
    }

    @Override
    public int getLocalSumOfQualities () {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForOower;
    }

    @Override
    public void betterLocalThen (Hogwarts otherStudent) {
        if (this.getClass() == otherStudent.getClass()) {
            int sum1 = this.getLocalSumOfQualities();
            int sum2 = otherStudent.getLocalSumOfQualities();
            System.out.print("Сравнение по факультету Slytherin : ");
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
