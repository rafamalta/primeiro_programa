import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		//teste
		System.out.print("Teste 1! ");
		System.out.println("Teste 2!");
		System.out.println("Olá mundo!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("Teste %.4f \"%d\" de programacao %n", x, y);
		System.out.printf("Resultado = " + x + " METROS %n");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
} 
