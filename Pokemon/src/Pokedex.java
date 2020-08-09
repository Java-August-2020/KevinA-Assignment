public class Pokedex extends AbstractPokemon {
    public void listPokemon() {
        for (int i = 0; i < pokemon.size(); i++) {
            System.out.println(AbstractPokemon.pokemon.get(i).getName());
            System.out.println(AbstractPokemon.pokemon.get(i).getHealth());
            System.out.println(AbstractPokemon.pokemon.get(i).getType());
        }


    }
}
