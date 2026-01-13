public class PetManager {

    private int petCount;

    private Pet[] pets;

    public PetManager(int petCount){
        pets = new Pet[petCount];
    }

    public boolean addPet(Pet pet){

        for(int i = 0; i < pets.length; i++){
            if(pets[i] == null){
                pets[i] = pet;
                petCount++;
                return true;
            }

        }
        return false;
    }

    public Pet[] getPet(){
        return this.pets;
    }

}
