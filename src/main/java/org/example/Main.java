package org.example;

public class Main {
    public static void main(String[] args) {
        Contestant[] contestant = {
                new Human(2, 300, "Человек"),
                new Robot(5, 1100, "Робот_1"),
                new Robot(7, 1000, "Робот_2"),
                new Cat(1, 150, "Кот"),
        };

        Challenge[] challenges = {
                new Wall(WallHeight.LOW),
                new Wall(WallHeight.LOW),
                new Wall(WallHeight.HIGH),
                new Treadmill(TreadmillLength.LOW),
                new Treadmill(TreadmillLength.MEDIUM),
                new Treadmill(TreadmillLength.HIGH),


        };

        for(Contestant p: contestant) {
            for (Challenge c: challenges) {
                if (!c.isCan(p)) break;
            }
        }
    }
}