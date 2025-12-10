public class CalculoTeste1 {
	public static void main(String[] args) {

		Somar soma = new Somar();
		Multiplicar multiplicar = new Multiplicar();

		IO.println(soma.executar(3, 34));
		IO.println(multiplicar.executar(3, 21));

		
	}
}
