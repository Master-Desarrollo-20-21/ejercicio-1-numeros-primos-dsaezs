public class Ejercicio_1 {

	/**
	 * La suma de los 50 primeros numeros primos
	 * @param args
	 */
	public static void main(String[] args) {

        listarNumerosPrimos(50);
		listarSumarPrimos(50);
	}
	
	public static int[] listarNumerosPrimos(int cantidadMaxima)
	{
		int[] listaNumerosPrimos = new int[cantidadMaxima];
        int numero = 1;
		for (int i = 0; i < cantidadMaxima; ) {
			if (esNumeroPrimo(numero))
			{
				System.out.println(numero);
				listaNumerosPrimos[i] = numero;
				i++;
			}
			numero++;
		}
		return listaNumerosPrimos;
	}
	
	public static int listarSumarPrimos(int cantidad)
	{
		int suma = 0;
		for (int i = 1; i <= cantidad; i++) {
			if (esNumeroPrimo(i))
			{
				suma += i;
			}
		}
		System.out.println("Suma de los primos: " + suma);
		return suma;
	}
	
	public static boolean esNumeroPrimo(int numero){
		boolean resultado = false;
		int divisor = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
			{
				divisor++;
			}
		}
		if (divisor == 2)
		{
			return true;
		}
	    return resultado;
	}

}
