import java.util.*;

public class Headquarter {
    ArrayList<Warrior> warriorsProduced = new ArrayList<Warrior>();
    int initialStrength;


    public void produceWarrior(Warrior[] warriors, int initialStrength) {

        Warrior[] redWarriors = {warriors[2], warriors[3], warriors[4], warriors[1], warriors[0]};
        Warrior[] blueWarriors = {warriors[3], warriors[0], warriors[1], warriors[2], warriors[4]};
        Warrior[] producedInOrder = zip(redWarriors, blueWarriors);

        for(int i = 0; initialStrength >0; i++){
            if(producedInOrder[i].strength <initialStrength) {
                initialStrength -= producedInOrder[i].strength;
                warriorsProduced.add(producedInOrder[i]);
                System.out.println("red " + producedInOrder[i].name + " born with strength " + producedInOrder[i].strength);
            }
            else{
                System.out.println("red headquarters stops making warriors");
            }
            if(producedInOrder[i+1].strength < initialStrength){
                initialStrength -= producedInOrder[i+1].strength;
                warriorsProduced.add(producedInOrder[i+1]);
                System.out.println("blue " + producedInOrder[i+1].name + " born with strength " + blueWarriors[i].strength);

            }
            else{
                System.out.println("blue headquarters stops making warriors");
            }

        }
    }

    public void stopProducing(){

    }


    public static Warrior[] zip(Warrior[] firstArray, Warrior[] secondArray){
        Warrior[] zippedArray = new Warrior[firstArray.length+secondArray.length];

        for(int i = 0; i < zippedArray.length; i++){
            zippedArray[i] = firstArray[i];
            zippedArray[i+1] = secondArray[i];
            i += 2;
        }
        return zippedArray;
    }

}

