public class Main {

    public static void main(String[] args){

        /*int[] numbers = {10,20,30,40,50};

        String[] fruits = new String[3];
        System.out.println(numbers[2] + " & " + fruits[2]);*/
        
        PetManager petManager = new PetManager(5);

        Pet pet1 = new Pet("Peluso", "Conejo");
        Pet pet2 = new Pet("Oreoooooo", "Conejaaaaa");
        Pet pet3 = new Pet("Patacón", "Perro");
        
        Person person = new Person("Diego", 19, petManager);

        person.addPet(pet1);
        person.addPet(pet2);
        person.addPet(pet3);

        if (person.addPet(new Pet("Goldie","Fish"))) {
            IOManager.printMessage("Pet added successfully");
        }else{
            IOManager.printMessage("Failed to add pet");
        }

        IOManager.writeMessage("Escriba");



        if (person.removePet(pet3)) {
            IOManager.printMessage("Pet removed successfully");
        }else{
            IOManager.printMessage("Failed to remove pet");
        }



        if(person.getPets().length == 0){
            IOManager.printMessage("No pets found");
        }else{
            for(Pet pet: person.getPets()){
                IOManager.printMessage(pet.getPetName());
            }
        }

        pet2 = new Pet("Oreo", "Coneja");

        if (person.updatePet(pet2, 1)) {
            IOManager.printMessage("Pet modified successfully");
        }else{
            IOManager.printMessage("Failed to modify pet");
        }

        if(person.getPets().length == 0){
            IOManager.printMessage("No pets found");
        }else{
            for(Pet pet: person.getPets()){
                IOManager.printMessage(pet.getPetName());
            }
        }


        //System.out.println();

        //Mucho texto XDXDDXDXDXD
        

    }

}
