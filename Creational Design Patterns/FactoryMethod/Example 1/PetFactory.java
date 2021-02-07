package FactoryMethod;

public class PetFactory implements AnimalFactory {

    public static final int CAT_PET = 0;
    public static final int DOG_PET = 1;

    @Override
    public Animal create(int AnimalType) {
        if (AnimalType == CAT_PET) {
            return new Cat();
        } else if (AnimalType == DOG_PET) {
            return new Dog();
        }
        return null;
    }

}
