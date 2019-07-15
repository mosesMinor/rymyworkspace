import java.util.Random;
import java.util.Scanner;

public class FightSimulate {
    public static void main(String[] args) {
        Scanner attacker = new Scanner(System.in);
        //Mojojo
        //Samurai
        System.out.println("Attack points of Mojojo");
        int mojojoAttack = attacker.nextInt();
        System.out.println("Defence points of Mojojo");
        int mojojoDefence = attacker.nextInt();
        System.out.println("Damage of Mojojo:");
        int mojojoDamage = attacker.nextInt();
        System.out.println("Life points of Mojojo");
        int mojojoLife = attacker.nextInt();

        System.out.println("Samurai attack points:");
        int samuraiAttack = attacker.nextInt();
        System.out.println("Samurai defense points:");
        int samuraiDefense = attacker.nextInt();
        System.out.println("Samurai damage :");
        int samuraiDamage = attacker.nextInt();
        System.out.println("Samurai life :");
        int samuraiLife = attacker.nextInt();

        //randomly choose attacker between monster and hero

        Random generator = new Random();
        boolean heroAttacks = generator.nextBoolean();
        if (heroAttacks) {
            //samurai attacks
            System.out.println("Samurai attacks::");
            int dice = generator.nextInt(6) + generator.nextInt(6);
            System.out.println("Rolled dice value : " + dice);
            int attackValue = samuraiAttack + dice;
            System.out.println("Your attack value is :" + attackValue);
            if (attackValue > mojojoDefence) {
                System.out.println("Samurai attack successful");
                mojojoLife -= samuraiDamage;
                System.out.println("Mojojo's remaining life points : " + mojojoLife);
            } else {
                System.out.println("Samurai's attack is unsuccessful");
            }
        } else {
            //Mojojo attacks
            System.out.println("Mojojo attacks::");
            int dice = generator.nextInt(6) + generator.nextInt(6);
            System.out.println("Rolled dice value : " + dice);
            int attackValue = mojojoAttack + dice;
            System.out.println("Mojojo attack value is :" + attackValue);
            if (attackValue > mojojoDefence) {
                System.out.println("Samurai attack successful");
                samuraiLife -= mojojoDamage;
                System.out.println("Samurai's remaining life points : " + samuraiLife);
            } else {
                System.out.println("Mojojo's attack is unsuccessful");
            }


        }
    }
}
