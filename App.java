import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    Scanner entrada = new Scanner(System.in);

    int n;
    System.out.println("Informe um número: ");
    n = entrada.nextInt();

    if (n >= 0) {
      if (n % 2 == 0) {
        System.out.println("PAR");
      } else {
        System.out.println("IMPAR");
      }
    } else {
      System.out.println("NUMERO INVÁLIDO");
    }
    entrada.close();
  }
}
