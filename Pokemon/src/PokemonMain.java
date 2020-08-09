public class PokemonMain {
    public static void main(String[] args) {

        Pokedex pokedex = new Pokedex();
        pokedex.createPokemon("Tar", 50, "game");
        pokedex.createPokemon("Two", 20, "java");
        pokedex.listPokemon();

        Pokemon pokemon = new Pokemon("Charles", 60, "Coding Dojo");

        System.out.println(pokedex.pokemonInfo(pokemon));

        System.out.println(Pokemon.getCount());


    }
}
