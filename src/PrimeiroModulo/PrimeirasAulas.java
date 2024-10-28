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
        System.out.println("______________________");



        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("______________________");


        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE+ ")" );
        System.out.println(
                "Integer Value Range ("
                + Integer.MIN_VALUE +
                        " to "
                + Integer.MAX_VALUE +
                        ")"
        );
        System.out.println("______________________");


        /// overflow
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        /// (finge que eu criei o underflow logo abaixo)

        long myLongValue = Long.MAX_VALUE;
        System.out.println(myLongValue);
        System.out.println(myLongValue + 1);
        System.out.println("______________________");

        System.out.println("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")" );
        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")" );
        System.out.println("Long Value Range (" +Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")" );
        System.out.println("A Long has a width of " + Long.SIZE + " bits");
        System.out.println("______________________");

        short myMinShortValue = Short.MIN_VALUE; int MyMinIntValue = Integer.MIN_VALUE;
        /// é possivel declarar dois tipos diferentes de variáveis na mesma linha, só precisa separar com ;
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        /// também é possivel declarar mais do que uma variável do mesmo tipo de dado na mesma linha usando vírgula

        int myTotal2 = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        /// exercicio

        byte myByteValue = 50;
        short myShortValue = 500;
        int myIntValue = 5000;
        long myThirdTotal = 50000L + ((myByteValue + myShortValue + myIntValue) * 10);
        System.out.println(myThirdTotal);
        /// meu jeito, tudo errado provavelmente

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);
        System.out.println("______________________");






    }
}
