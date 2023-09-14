package org.example;

public class Wall implements Challenge{
    int height;
    String title;
//    private int wallHeight;
    public Wall(WallHeight wallHeight) {
        this.height = wallHeight.getHeight();
        this.title = wallHeight.getTitle();

    }

    @Override
    public boolean isCan(Contestant contestant) {
        if (contestant.jump(height)) {
            return true;
        }
        else return false;
    }
}
