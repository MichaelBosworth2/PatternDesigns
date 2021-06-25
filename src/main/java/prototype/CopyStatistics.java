package prototype;

import java.util.ArrayList;
import java.util.List;

public class CopyStatistics {
    public static void main(String[] args) {
        List<Character> listCharacter = new ArrayList<>();
        Elf aegnor = new Elf();
        aegnor.name = "Aegnor";
        aegnor.health = 200;
        aegnor.attack = 50;
        aegnor.element ="Light";
        aegnor.skill = "teleportation";

        //Cloning the character
        Elf algar = (Elf) aegnor.clone();

        //editing some attributes of an object
        algar.name = "Algar";
        algar.skill = "creation";
        algar.element = "Dark";


        //Instancing a new Orc
        Orc sherk = new Orc();
        sherk.name = "Sherk";
        sherk.health = 420;
        sherk.attack = 100;
        sherk.skill = "resistance";

        //Cloning
        Orc fiona = (Orc) sherk.clone();
        //Editing some attributes of an object
        fiona.name = "Fiona";
        fiona.skill = "dirt";


        //Instancing a ner Goblin
        Goblin batty = new Goblin();
        batty.name = "Batty";
        batty.health = 65;
        batty.attack = 70;
        batty.skill = "speed";
        batty.multiplyBuilding = 4;

        //Cloning
        Goblin creepy = (Goblin) batty.clone();
        //Editing some attributes of an object
        creepy.name = "Creepy";
        creepy.multiplyBuilding = 6;
        creepy.health = 100;


        //Adding to the list of characters
        listCharacter.add(aegnor);
        listCharacter.add(algar);
        listCharacter.add(sherk);
        listCharacter.add(fiona);
        listCharacter.add(batty);
        listCharacter.add(creepy);


        for (Character a: listCharacter){
            System.out.println(a.toString());
            System.out.println();
        }

    }
}
