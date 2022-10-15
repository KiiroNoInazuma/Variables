public class Exercise_5 {
    public static void main(String[] args) {

        int salaryM = 67_760, salaryD = 83_690, salaryK = 76_230;
        double per = 10.0 / 100.0;
        double totalM, totalD, totalK;
        double diffM, diffD, diffK;


        diffM = salaryM*per;
        diffD = salaryD*per;
        diffK = salaryK*per;

        totalM = salaryM+diffM;
        totalD = salaryD+diffD;
        totalK = salaryK+diffK;


        System.out.println("Маша теперь получает "+totalM+" рублей. Годовой доход вырос на "+diffM+" рублей");
        System.out.println("Маша теперь получает "+totalD+" рублей. Годовой доход вырос на "+diffD+" рублей");
        System.out.println("Маша теперь получает "+totalK+" рублей. Годовой доход вырос на "+diffK+" рублей");

    }
}
