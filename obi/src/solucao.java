import java.util.Arrays;
import java.util.Scanner;
public class solucao {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		
		int precos[] = new int[n];
		int grupos[][] = new int[n/3][3]; //matriz com os grupos, e os grupos são representados por linha
		int menores[] = new int[n/3]; //os menores preços que vão ser divididos nos grupos
		int sobra = 0; //os valores que sobram pq os grupos são divisíveis por 3, então se tiver sobra vai aqui
		int soma = 0;
		
		for(int i = 0; i < n; i++) {
			precos[i] = in.nextInt();
		}
		
		Arrays.sort(precos); //arruma os numeros do menor para o maior
		
		if(n % 3 != 0) {
			for(int j = (n - (n % 3)); j < n; j++) {
				sobra += precos[j]; //determina o valor dos valores que sobraram (n~so entraram nos grupos)
			}
		}
		
		
		for(int i = 0; i < (n/3); i++) {
			menores[i] = precos[i]; //como ja ta ordenado ele ja vai pegar os num
			grupos[i][0] = menores[i]; //coloca cada menor na coluna 0
		}
		
		//determina os valores do meio, tirando os que sobraram e os menores
		int s = n/3;
		int f = (n - (n % 3));
		int valores[] = new int[f - s];
		for(int i = 0; i < valores.length; i++, s++) {
			valores[i] = precos[s]; 
		}
		
		//aqui tem que arrumar, tem que colocar os valores do meio na matriz mas tava dando meio rui
		for(int x = 0, i = 2; x < (n/3); x++, i++) {
			for(int y = 1; y < 3; y++) {
				if(y == 1) {
					grupos[x][y] = valores[x];
				}else {
					//grupos[x][y] = valores[i];
				}
				
				soma += grupos[x][y];
			}
		}
		
		  //impressão da matriz p tu visualizar melhor
		for(int x = 0; x < (n/3); x++) {
			for(int y = 0; y < 3; y++) {
				System.out.print(grupos[x][y]+" ");
			}
			System.out.println(" ");
		}
		
		soma += sobra;
		System.out.println(soma);
	}
}