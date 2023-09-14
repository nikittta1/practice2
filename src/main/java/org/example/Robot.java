package org.example;

public class Robot implements Contestant {
    private int maxHeight;
    private int maxLenght;
    String name;
    private int superJumpCount = 1;

    public Robot(int maxHeight, int maxLenght, String name) {
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxLenght() {
        return maxLenght;
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxLenght) {
            System.out.println(this.name + " пробежал " + dist + "м");
            return true;
        } else {
            System.out.println(this.name + " не смог пробежать " + dist + "м и выбывает");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= maxHeight) {
            System.out.println(this.name + " перепрыгнул " + height + "м");
            return true;
        }
        else if (superJumpCount != 0) {
            return superJump();
        }
        else {
            System.out.println(this.name + " не смог перепрыгнуть " + height + "м и выбывает");
            return false;
        }
    }

    public boolean superJump() {
        System.out.println(this.name+ " перепрыгнул препятствие с помощью экстра прыжка");
        superJumpCount--;
        return true;

    }
}