package org.thembaxaba157;

import org.thembaxaba157.Game.AbstractGame;
import org.thembaxaba157.Game.Game;
import org.thembaxaba157.Game.GameInput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
            GameInput.openScanner();
            Game game = AbstractGame.createGame();
            game.run();
        }
    }
