package org.example;

public enum TreadmillLength {
    LOW("Короткая дистанция", 100), MEDIUM("Средняя дистанция", 500), HIGH("Длинная дистанция", 1000);
    private String title;
    private  int lenght;
    TreadmillLength(String title, int lenght) {
        this.title = title;
        this.lenght = lenght;
    }

    public String getTitle() {
        return title;
    }

    public int getLenght() {
        return lenght;
    }
}
