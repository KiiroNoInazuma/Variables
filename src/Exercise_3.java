public class Exercise_3 {
    public static void main(String[] args) {
        int banana, milk, iceCream, egg, sum;
        double resultPer;
        banana = 80;
        milk = 105;
        iceCream = 100;
        egg = 70;
        sum = banana + milk + iceCream + egg;
        resultPer = (double) sum / 1000;

        System.out.println("Вес спорт-завтрака " + resultPer + " кг");
    }
}