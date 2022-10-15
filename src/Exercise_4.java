public class Exercise_4 {
    public static void main(String[] args) {

        double weightTotal = 7;
        double weightLoss = 250;
        double weightLossS = 500;
        double day, dayS, avg;

        day = (weightTotal * 1000) / weightLoss;
        dayS = (weightTotal * 1000) / weightLossS;
        avg = (day + dayS) / 2;

        System.out.println("При потери веса в " + weightLoss + " г. спортсмену понадобится " + day + " д.");
        System.out.println("При потери веса в " + weightLossS + " г. спортсмену понадобится " + dayS + " д.");
        System.out.println("В среднем потребуется " + avg + " д.");

    }
}
