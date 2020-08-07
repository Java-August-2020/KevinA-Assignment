public class GorillaMain {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla(100);
        gorilla.displayEnergyLevel();
        gorilla.throwThings();

        gorilla.displayEnergyLevel();
        gorilla.eatBananas();
        gorilla.displayEnergyLevel();
        gorilla.climb();
        gorilla.displayEnergyLevel();

    }
}
