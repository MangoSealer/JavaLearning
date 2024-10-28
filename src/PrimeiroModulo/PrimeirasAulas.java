package PrimeiroModulo;

@SuppressWarnings("ReassignedVariable")
public class PrimeirasAulas {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello, Dan");

        int myFirstNumber = 5;
        System.out.println(myFirstNumber);
        myFirstNumber = 10;
        System.out.println(myFirstNumber);
        myFirstNumber = 1000;
        System.out.println(myFirstNumber);
        /// int myFirstNumber = 72; não poderia, já que já foi declarada uma variável em int com esse nome
        /// as demais linhas de código estão alterando, e não declarando / criando novas variáveis
        myFirstNumber = 10 + 5;
        System.out.println(myFirstNumber);
        myFirstNumber = (10 + 5) + (2 * 10);
        System.out.println(myFirstNumber);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        myThirdNumber = myFirstNumber * 2;
        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        /// exercicio
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);



    }
}
