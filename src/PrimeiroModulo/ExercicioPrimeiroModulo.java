package PrimeiroModulo;

public class ExercicioPrimeiroModulo {
    public static void main(String[] args) {


        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double sumValue = (firstValue + secondValue) * 100.00d;
        System.out.println("sumValue = " + sumValue);
        double remainingFromRemainder = sumValue % 40.00d;
        System.out.println("The Remainder = " + remainingFromRemainder);
        boolean valorTernario = (remainingFromRemainder == 0.00) ? true : false;
        System.out.println(valorTernario);
        if (!valorTernario) {
            System.out.println("got some remainder");
        }

        /// não esquece de escrever os comentários

    }
}
