package game;
import java.util.Scanner;

class Character {
    long healthChar;
    long damageChar;

    Character(long healthChar, long damageChar){
        this.damageChar = damageChar;
        this.healthChar = healthChar;
    }
}

class Monster {
    long healthMonster;
    long damageMonster;

    Monster(long healthMonster, long damageMonster){
        this.damageMonster = damageMonster;
        this.healthMonster = healthMonster;
    }
}

public class Main {
    public static void main(String[] args) {
        Character character;
        Monster monster;
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt(); in.nextLine();
        for (int i = 0; i < testCase; i++) {
            character = new Character(in.nextLong(), in.nextInt());
            monster = new Monster(in.nextLong(), in.nextInt());
            long coin = in.nextLong();
            long dmgUp = in.nextLong();
            long armor = in.nextLong();

            character.healthChar += (armor*coin);
            character.damageChar += (dmgUp*coin);

            long b = monster.healthMonster/character.damageChar;
            long c = character.healthChar/ monster.damageMonster;

            long ba = monster.healthMonster%character.damageChar;
            long ca = character.healthChar% monster.damageMonster;

            if (b > c || (b == c && ba > ca)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        in.close();
    }
}
