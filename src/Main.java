import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of cases");
        int numberCases = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < numberCases; j++) {
            System.out.println("Please input the initial strength of the headquarters for case " + j);
            int initialStrength = sc.nextInt();
            sc.nextLine();

            System.out.println("Please input the strength of the warriors in this order: \ndragon, ninja, iceman, lion, wolf");
            int[] warriorStrength = new int[5];
            for (int i = 0; i < warriorStrength.length; i++) {
                warriorStrength[i] = sc.nextInt();

            }
            String[] order = {"dragon", "ninja", "iceman", "lion", "wolf"};
            int[] ID = {1, 1, 1, 1, 1};


            Warrior[] warriorsInOrder = new Warrior[5];
            for(int i = 0; i <5; i++){
                warriorsInOrder[i] = new Warrior(order[i], warriorStrength[i], ID[i]);
            }

            Headquarter headquarter = new Headquarter();
            headquarter.produceWarrior(warriorsInOrder, initialStrength);


            }
        }
    }