import java.util.ArrayList;
import java.util.Scanner;

public class OperacoesInteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		int entrada = 0;
		do{
		int  contPar =0, contImpar = 0, soma = 0, maior = 0, menor = 0;
		entrada = 0;
		while (entrada!=-1){
			entrada = scan.nextInt();
			if(entrada!=-1){ 
				if(vetor.size()<1)menor = entrada;
				vetor.add(entrada);
				soma = entrada + soma;
				if(maior<entrada){
					maior = entrada;
				}
				if(menor>entrada){
					menor = entrada;
				}
			}
		}
		
		float media = soma/vetor.size();
		for(Integer num : vetor){
			if(num %2 ==0){
				contPar = contPar+1;
			}
			else{
				contImpar = contImpar+1;
			}
		}
		ArrayList<Integer> vetorSize = new ArrayList<Integer>();
		vetorSize.add(vetor.size());
		
		ArrayList<Integer> Par = new ArrayList<Integer>();
		Par.add(contPar);
		
		ArrayList<Integer> Impar = new ArrayList<Integer>();
		Impar.add(contImpar);
		
		ArrayList<Integer> Sum = new ArrayList<Integer>();
		Sum.add(soma);
		
		ArrayList<Float> Med = new ArrayList<Float>();
		Med.add(media);
		
		ArrayList<Integer> Maior = new ArrayList<Integer>();
		Maior.add(maior);
		
		ArrayList<Integer> Menor = new ArrayList<Integer>();
		Menor.add(menor);
		
			
	}while(vetor.size()!=0);
		
		for()
}		

}
