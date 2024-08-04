package io.pragra.learning.July30;

public class GameMain {
    public static void main(String[] args) {

        Playstation ps5 = new Playstation();
        ps5.display();
        ps5.play();
        ps5.work();

        IGame.playing();
    }
}
