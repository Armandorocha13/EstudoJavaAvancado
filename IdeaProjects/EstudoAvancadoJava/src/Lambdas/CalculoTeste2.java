public class CalculoTeste2 {
	public static void main(String[] args) {
		// usando expressoes lambdas
		Calculo calc = (a, b) -> a + b;

		IO.println(calc.executar(2, 3));
	}

}
