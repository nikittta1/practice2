package org.example;

public class Treadmill implements Challenge{
    String name;

    public Treadmill(TreadmillLength roadLenght) {
        this.name=roadLenght.getTitle();
        this.roadLength = roadLenght.getLenght();
    }
    int roadLength;
    @Override
    public boolean isCan(Contestant contestant) {
        if(contestant.run(roadLength)) return true;
        else return false;
    }
}
