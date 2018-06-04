package tictactoe;

import java.awt.*;

public class Main {

    public static void main(String[]agrs){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TicTacToe();
            }
        });
    }
}



