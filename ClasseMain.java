package atvmt;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasseMain {
	public static ClassePokemon createPokemon(){
		Scanner scanner = new Scanner(System.in);
		
        String[] habilidades = new String[4];
        Integer[] atributos = new Integer[6];
        String[] atributosNomes = {"hp", "spDef", "spAtk", "defense", "attack", "speed"};
		
		System.out.println("Hora de montar seu pokemon!!");
		System.out.println("Qual o nome dele?");
		String nomePokemon = scanner.nextLine();
		
		System.out.println("Muito legal, agora poderia dizer seus quatro ataques?");
		
		for(int i = habilidades.length-1; i > -1; i--){
			System.out.println("Nome da habilidade "+(i+1)+": ");
			habilidades[i] = scanner.nextLine();
			
		}
		
		System.out.println("Que demais, agora poderia dizer seus quatro atributos?");
		
		for(int i = atributos.length-1; i > -1; i--){
			try{
				System.out.println("Qual "+atributosNomes[i]+" dele: ");
				atributos[i] = scanner.nextInt();
				
			} catch (InputMismatchException e){
				System.out.println("Entrada inválida! Por favor, tente novamente.");
                scanner.nextLine();
                i++;
				
			}
			
		}
		
		System.out.println("O nivel de felicidade dele? ");
		float felicidadePokemon = scanner.nextFloat();
		
		boolean atributoNegPokemon = false;
		
		System.out.println("Ele possui status negativos (s/n)? ");
		String opicao = scanner.nextLine();
		
		if(opicao == "s"){
			atributoNegPokemon = true;
			
		}
		

        scanner.close();
        
		return new ClassePokemon(nomePokemon, habilidades, atributos, felicidadePokemon, atributoNegPokemon);
	
	}

	public static void main(String[] args){
		ClassePokemon pokemon = createPokemon();
		
		if(pokemon != null){
			Object[] atributosPokemon = pokemon.getAtributosPokemon();
			
			System.out.println("Detalhes do Pokemon fornecido: ");
			System.out.println("Pokémon Name: " + atributosPokemon[0]);
	        System.out.println("Habilidades: " + Arrays.toString((String[]) atributosPokemon[1]));
	        System.out.println("Atributos: " + Arrays.toString((Integer[]) atributosPokemon[2]));
	        System.out.println("Felicidade: " + atributosPokemon[3]);
	        System.out.println("atributoNeg: " + atributosPokemon[4]);
				
		}
		        
	}

}
