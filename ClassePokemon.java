package atvmt;

public class ClassePokemon {
	private String pokemonNome;
	private String[] habilidades;
	private Integer[] atributos;
	private float felicidade;
	private boolean atributoNeg;
	
	public ClassePokemon(String pokemonName, String[] habilidades, Integer[] atributos, float felicidade, boolean atributoNeg){
		this.pokemonNome = pokemonName;
		this.habilidades = habilidades;
		this.atributos = atributos;
		this.felicidade = felicidade;
		this.atributoNeg = atributoNeg;
		
	}
	
	public Object[] getAtributosPokemon(){
		Object[] pokemonAtributos = {pokemonNome, habilidades, atributos, felicidade, atributoNeg};
		
		return pokemonAtributos;
		
	}
	
}
