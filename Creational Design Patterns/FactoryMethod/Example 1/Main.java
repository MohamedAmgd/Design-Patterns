package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        PetFactory petFactory = new PetFactory();
        FishFactory fishFactory = new FishFactory();
        Animal catAnimal = petFactory.create(PetFactory.CAT_PET);
        Animal dogAnimal = petFactory.create(PetFactory.DOG_PET);
        Animal tunaAnimal = fishFactory.create(FishFactory.TUNA_FISH);
        Animal sharkAnimal = fishFactory.create(FishFactory.SHARK_FISH);
        System.out.println(catAnimal.getType());
        System.out.println(dogAnimal.getType());
        System.out.println(tunaAnimal.getType());
        System.out.println(sharkAnimal.getType());
    }
}
