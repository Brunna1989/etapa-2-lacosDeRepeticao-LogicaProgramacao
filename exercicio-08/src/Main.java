import service.LeituraNumeroService;

public class Main {
    public static void main(String[] args) {
        LeituraNumeroService leituraService = new LeituraNumeroService();
        int numero = leituraService.lerNumero();
        System.out.println("Você digitou o número: " + numero);
    }
}
