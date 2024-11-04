package PrimeiroModulo;

public class IfKeywordAndCodeBlocks {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        }

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        }

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }

        if (score <= 5000) {
            System.out.println("Your score was equal or less than 5000");
        } else {
            System.out.println("Got here");
        }

        /// sintaxe pra blocos de if, else if e else
        ///
        /// if (primeira condição) {
        /// -> ação a ser executada se a condição do if for verdadeira
        ///
        /// } else if { (segunda condição) {
        /// -> ação a ser executada se o if for false, não tem limite pra quantos else if podem ser utilizados
        ///
        /// } else {
        /// }
        /// -> ação a ser executada se nenhum dos blocos acima for true
        /// esse bloco pode ser usado como captura pra caso nada dê certo, logo, precisa estar em ultimo, e é opcional usa-lo

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }


        int score1 = 4000;
        if (score1 < 5000 && score1 > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score1 < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        int score2 = 800;
        if (score2 < 5000 && score2 > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score2 < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }


    }
}
