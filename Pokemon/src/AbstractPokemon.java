import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemanInterface {

    static ArrayList<Pokemon> pokemon = new ArrayList<>();

    public Pokemon createPokemon(String name, int health, String type) {

        Pokemon newPokemon = new Pokemon(name, health, type);
        pokemon.add(newPokemon);

        return newPokemon;
    }


    public String pokemonInfo(Pokemon pokemon) {
        return pokemon.getName() + pokemon.getHealth() + pokemon.getType();
    }

}
