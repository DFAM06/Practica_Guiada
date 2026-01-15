public class PetManager {

    private int petCount;

    private Pet[] pets;

    public PetManager(int totalPetCount){
        pets = new Pet[totalPetCount];
        this.petCount = 0;
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

    public boolean removePet(Pet pet){

        for(int i = 0; i < pets.length; i++){
            if(pets[i] != null & pets[i].equals(pet)){
                
                for(int j = i; j < pets.length - 1; j++){
                    pets[j] = pets[j+1];
                }

                pets[pets.length - 1] = null;

                petCount--;

                return true;
                
            }

        }

        return false;
    }

    public Pet[] getPets(){
        Pet[] pets = new Pet[this.petCount];

        for(int i = 0; i < this.petCount; i++){

            pets[i] = this.pets[i];
        }
        return pets;
    }

    public boolean updatePets(Pet pet, int index){

        if(pet == null & index > this.petCount) return false;

        for(int i = 0; i < this.petCount; i++){
            if(index == i){
                this.pets[i] = pet;
                return true;
            }
        }

        return false;

    }

    /*public void duplicateArray(){
        
    }*/

}
