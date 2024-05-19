import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Digite o nome do corredor: ");
String nome = input.nextLine();
Corredor c1 = new Corredor(nome);
c1.aumentaTrofeus(7);
c1.aumentaTrofeus(3);

System.out.println("Digite 100 notas de desempenho:");
int nota;
int nota_desempenho = 0;
for (int i = 0; i < 100; i++) {
System.out.print("Nota " + (i + 1) + ": ");
nota = input.nextInt();
nota_desempenho = nota_desempenho + nota;
}
c1.setNota(nota_desempenho);
c1.mostrarDados(); 
}
}
