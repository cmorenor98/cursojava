
public class Main {

	public static void pintaValores(int[] valores) {
		String inicial = "[";
		for (int i = 0; i < valores.length; i++) {
			inicial += valores[i] + ", ";
		}
		System.out.println(inicial += "]");
	}
	
	public static void calculaYAsigna() {
		
	}
	
	public static void main(String[] args) {
		
		int[] variablesOptimas = new int[12];
		double valorOptimo;
		
		int[] valores = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		
		int pos = 0;
		boolean continua = true;
		while (continua) {
			if (valores[pos] == 0) {
				valores[pos] = 1;
				for (int j = 0; j < pos; j++) {
					valores[j] = 0;
				}
				pos = 0;
				pintaValores(valores);
				calculaYAsigna();
			} else {
				pos++;
				if (pos == 12) {
					continua = false;
				}
			}
		}		
	}
}
