public class Main {

    public static void main(String[] args){

        /*int[] numbers = {10,20,30,40,50};

        String[] fruits = new String[3];
        System.out.println(numbers[2] + " & " + fruits[2]);*/
        
        PetManager petManager = new PetManager(3);

        Pet pet1 = new Pet("Peluso", "Conejo");
        Pet pet2 = new Pet("Oreo", "Coneja");
        Pet pet3 = new Pet("Patacón", "Perro");
        
        Person person = new Person("Diego", 19,petManager);

        person.addPet(pet1);
        person.addPet(pet2);
        person.addPet(pet3);

        System.out.println();


        

    }

}
