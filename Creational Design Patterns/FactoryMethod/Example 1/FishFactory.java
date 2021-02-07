package FactoryMethod;

public class FishFactory implements AnimalFactory {
    public static final int TUNA_FISH = 0;
    public static final int SHARK_FISH = 1;

    @Override
    public Animal create(int AnimalType) {
        if (AnimalType == TUNA_FISH) {
            return new Tuna();
        } else if (AnimalType == SHARK_FISH) {
            return new Shark();
        }
        return null;
    }
}
