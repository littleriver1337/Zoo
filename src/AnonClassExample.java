/**
 * Created by MattBrown on 10/26/15.
 */
public class AnonClassExample {
    public static void main(String[] args) {
        //Create alligator fromm separate class (step #2)
        Alligator a1 = new Alligator();
        System.out.println(a1);

        //Creates alligator from annon class
        Reptile a2 = new Reptile(){
            @Override
            public String toString(){
                return "Alligator";
            }
        };
        System.out.println(a2);

    }
}

class Alligator extends Reptile{//Create alligator from separate class (step #1)
    @Override
    public String toString(){
        return "Alligator";
    }
}
