import java.util.Scanner;

/**
 * Created by MattBrown on 10/13/15.
 */
public class Zoo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the name of an animal");
        String animalName = scanner.nextLine();
        Animal animal = createAnimal(animalName);
        System.out.println(String.format("Created %s!", animal));
    }

    static Animal createAnimal(String animalName) {
        Animal animal;
        switch (animalName) {
            case "snake":
                animal = new Snake();
                break;
            case "lion":
                animal = new Lion();
                break;
            case "condor":
                animal = new Condor();
                break;
            case "alligator":
                animal = new Reptile(){//creates annon class within your code
                    @Override
                    public String toString(){//overrides toString();
                        return "Alligator";
                    }
                };
                break;
            default:
                animal = new Animal();
        }
        return animal;
    }
}
