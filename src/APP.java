import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class APP {
    public static Scanner input = new Scanner(System.in);
    private static final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    private static final int CURRENT_YEAR = cal.get(Calendar.YEAR);
    private static final int CURRENT_MONTH = cal.get(Calendar.MONTH) + 1; //STARTS COUNTING ON 0 = JAN
    private static final String[] INTERVALS = {"year", "month", "week"};



    public static void main(String[] args) throws SQLException {
    }

    private static void optionsMenu() throws SQLException {
        displayMenuOptions();
        switch (getValInt()) {
            case 1 -> criarNovaCasaApostas();
            case 2 -> adicionarNovoJogadorNaCasaX();
            case 3 -> fazerApostaVerificandoSaldo();
            case 4 -> supenderJogador();
            case 5 -> numeroTotalJogadoresNaCasaDeApostas();
            case 6 -> resolucaoAposta();
            case 7 -> mostrarApostasEfetuadas();
            case 8 -> exit();
            default -> System.err.println("Opcao nao reconhecida");
        }
    }

    private static void criarNovaCasaApostas() {    }
    private static void adicionarNovoJogadorNaCasaX() {    }
    private static void fazerApostaVerificandoSaldo() {    }
    private static void supenderJogador() {    }
    private static void numeroTotalJogadoresNaCasaDeApostas() {    }
    private static void resolucaoAposta() {    }
    private static void mostrarApostasEfetuadas() {    }
    private static void exit() {    }

    private static void displayMenuOptions() {
        System.out.println();
        System.out.println("1. Criacao de Casa de Apostas. (a)");
        System.out.println("2. Registar um novo jogador, numa determinada casa de apostas. (b)");
        System.out.println("3. Opção para fazer uma aposta, garantindo que o jogador tem saldo. (c) ");
        System.out.println("4. Suspender um jogador. (d)");
        System.out.println("5. Calcular o numero total de jogadores por casa de apostas. (e)");
        System.out.println("6. Opção para introduzir a resolução de uma aposta, inserindo apenas o valor da resolução. (f)");
        System.out.println("7. Alterar qualquer parametro como no enunciado - 2.e da fase2. (g)");
        System.out.println("8. Sair");
    }

    //obter valores inseridos pelo utilizador
    private static int getValInt(){
        System.out.print("-> ");
        int val = input.nextInt();
        //consume rest of line
        input.nextLine();
        return val;
    }

}