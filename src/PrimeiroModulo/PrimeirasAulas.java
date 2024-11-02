package PrimeiroModulo;

@SuppressWarnings("ALL")
public class PrimeirasAulas {
    public static void main(String[] args) {
        System.out.println("PrimeiroModulo.Hello World");
        System.out.println("PrimeiroModulo.Hello, Dan");

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


        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
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
        System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
        System.out.println("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
        System.out.println("A Long has a width of " + Long.SIZE + " bits");
        System.out.println("______________________");

        short myMinShortValue = Short.MIN_VALUE;
        int MyMinIntValue = Integer.MIN_VALUE;
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

        double doublevalue = Double.MAX_VALUE;
        System.out.println(doublevalue);


        System.out.println("Float Value Range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");

        System.out.println("Double Value Range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        int mySecondIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        /// exercicio
        float myOtherFloatValue = (float) 5.25;
        System.out.println(myOtherFloatValue);

        /// exercicio
        /// convertion ratio = 0.45359237
        double myPoundValue = 200;
        double ConvertionRatio = 0.45359237;
        double Total = (myPoundValue * ConvertionRatio);
        System.out.println(Total);
        System.out.println("______________________");

        /// char se usa ', não ". Quem usa " é String
        char myChar = 'D';

        String myString = "This is a String";

        {
            String numberString = "250.55";
            numberString = numberString + "49,45";
            System.out.println(numberString);
            System.out.println("______________________");
        }
        /// ta errado, burro

        char firstChar = 'A';
        char secondChar = 'B';
        System.out.println(firstChar + secondChar);  // 131
        System.out.println("" + firstChar + secondChar); // AB

        /// char não faz concatenação, output é a soma do valor decimal de cada caractere
        /// pra fazer o output certo e concatenar o valor dos dois é necessario usar "" que seria considerado
        /// uma "empty string", transformando o char em string e fazendo o output certo

        int result_ = 5;
        result_ = result_ % 3;
        System.out.println(result_);
        /// operador REMAINDER %%%%%

        System.out.println("______________________");

        {
            int result = 1;
            result = result + 1;
            System.out.println("result = " + result);
        }

        {
            int result = 1;
            result++; // não precisa declarar novamente, aqui é basicamente "bota mais um na result"
            System.out.println("result = " + result);
        }

        {
            int result = 1;
            result--;
            System.out.println("result = " + result);
        }

        {
            int result = 1;
            result -= 2; // parecido com o acima, mas de uma forma levente diferente e dá pra definir a quantidade
            System.out.println("result = " + result);
        }

        {
            int result = 1;
            result += 5;
            System.out.println("result = " + result);
        }

        { /// exercicio
            int result = 10;
            result -= 5.5;
            System.out.println("result deu = " + result);
        }
        // vai dar 4, pq a expressão (variavel) -= (literal) dá um output de (variavel) = (int, no caso) (variavel - literal);
        // ou seja, vai dar um cast no tipo da variavel que foi criada inicialmente

        {
            double result = 10;
            result *= 1.5;
            System.out.println("result = " + result);
        }

        {
            double result = 10;
            result /= 1.5;
            System.out.println("result = " + result);
        }








    }
}
