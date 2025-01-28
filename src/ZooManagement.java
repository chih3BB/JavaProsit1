import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages=20;
        String zooName="my zoo";
        System.out.println(zooName+" comporte"+nbrCages+" cages");
        Scanner input = new Scanner(System.in);
        System.out.println("donner le nom du zoo");
        zooName = input.nextLine();
        System.out.println("donner le nombre du cages");
        while(!input.hasNextInt()) {
            System.out.println("donner un nombre du cages valide");

            input.next();
        }
        nbrCages = input.nextInt();

        System.out.println(zooName+" comporte "+nbrCages+" cages");
        input.close();
       
    }


}
