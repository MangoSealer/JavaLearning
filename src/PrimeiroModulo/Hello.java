package PrimeiroModulo;

public class Hello {
    public static void main(String[] args) {

        boolean isAlien = false;
        //noinspection PointlessBooleanExpression
        if (isAlien == false) { // sem ;
            System.out.println("it is not an Alien");
            System.out.println("and i'm scared of aliens");
        }
        System.out.println("--------------------------");


        {
            int topScore = 100;
            if (topScore == 100) { // aqui ta perguntando se tops
                System.out.println("You got the high score!");
            }
        }

        {
            int topScore = 100;
            if (topScore != 100) { // aqui o ! tá perguntando o oposto, se topScore não é igual a 100
                System.out.println("You got the high score!");
            }
        }

        {
            int topScore = 100;
            if (topScore > 100) { // auto explicativo
                System.out.println("You got the high score!");
            }
        }

        {
            int topScore = 100;
            if (topScore >= 100) { // sintaxe >=, oposto não é aceito
                System.out.println("You got the high score!");
            }
        }

        {
            int topScore = 80;
            if (topScore < 100) {
                System.out.println("You got the high score!");
            }
        }

        {
            int topScore = 100;
            if (topScore <= 100) { // sintaxe <=, oposto não é aceito
                System.out.println("You got the high score!");
            }
        }
        System.out.println("--------------------------");

        {
            int topScore = 80;
            int secondTopScore = 60;
            if ((topScore > secondTopScore) && (topScore < 100)) { // pode usar () pras condições ficarem mais claras
                /// logical AND operator, pede pra que AS DUAS condições sejam true
                System.out.println("Greater than second top score and less than 100");
            }
        }

        {
            int topScore = 80;
            int secondTopScore = 81;
            if ((topScore > secondTopScore) && (topScore < 100)) {
                /// não vai ter output pq a primeira condição não foi atendida
                System.out.println("Greater than second top score and less than 100");
            }
        }

        {
            int topScore = 80;
            int secondTopScore = 81;
            if ((topScore > 90) || (secondTopScore <= 90)) {
                /// logical OR operator, pede pra que UMA DAS DUAS condições sejam true
                System.out.println("Either OR both of the conditions are true");
            }
        }

        {
            int topScore = 80;
            int secondTopScore = 90;
            if ((topScore > 90) || (secondTopScore <= 90)) {
                /// nenhuma foi true, logo, nenhum output
                System.out.println("Either OR both of the conditions are true");
            }
        }

        System.out.println("--------------------------");


        {
            int newValue = 50;
            if (newValue == 50) { // erro seria se usasse o operador = de atribuição
                System.out.println("This is an error");
            }
        }

        {
            boolean isCar = false;
            if (isCar == true) {
                System.out.println("This is not supposed to happen");
            }
        }

        {
            boolean isCar = false;
            if (isCar == false) {
                System.out.println("This is supposed to happen");
            }
        }

        {
            boolean isCar = false;
            if (isCar) { // pergunta se é true
                System.out.println("This is not supposed to happen");
            }
        }

        {
            boolean isCar = false;
            if (!isCar) { // pergunta se é false com ! antes
                System.out.println("This is not supposed to happen");
            }
        }

        System.out.println("--------------------------");

        {
            String makeOfCar = "Volkswagen";
            boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

            /// aqui temos uma operação dentro da declaração do boolean, operador ternario
            /// primeiro, foi declarada a variável string com seu valor "Volkswagen" na primeira linha
            /// em seguida, vou criar o boolean "isDomestic" e definir o valor dele com o operador ternario, começo
            /// a operação com a variavel (makeOfCar) que quero comparar, em seguida o operador de comparação (==)
            /// após, a literal que vai ser comparada com a variável, se a variável foi declarada com a literal
            /// informada, vai retornar o valor do primeiro operando após o sinal de ?, caso contrário, a
            /// variável boolean vai ser criada com o segundo valor boolean informado nessa operação.

            /// operador ternario pode ser usado em outros casos, exemplo abaixo

            if (isDomestic) { // no caso, deu negativo o boolean, e aqui o bloco ta perguntando se é positivo
                System.out.println("This car is domestic to our country");
                // vai da em nada  kkkkk
            }
        }

        {
            int ageOfClient = 20;
            String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a Kid";
            System.out.println("Our Client is " + ageText);
        }

        {
            String makeOfCar = "Volkswagen";
            boolean isDomestic = makeOfCar != "Volkswagen"; // outra forma de escrever a operação
            if (isDomestic) {
                System.out.println("This car is domestic to our country");
            }
        }

        {
            String makeOfCar = "Volkswagen";
            boolean isDomestic = makeOfCar != "Volkswagen"; // outra forma de escrever a operação
            if (isDomestic) {
                System.out.println("This car is domestic to our country");
            }

            String s = (isDomestic) ? "This car  is domestic" : "This car is not domestic";
            System.out.println(s);
        }
        /// no caso, to criando a string s e o valor dela vai ser definido pelo operador ternario
        /// como a variavel isDomestic é um valor boolean, testamos ela colocando entre (), basicamente perguntando
        /// se é um valor positivo, e como não é, retorna o segundo valor, que seria considerado o falso (?)
        System.out.println("--------------------------");


    }
}
