package com.game.HauntedVillage;

import com.games.hauntedvillage2.Menu;

import java.util.ArrayList;

class EventHandler {

    public static void eventHandler(String input) {
        TextParser parser= new TextParser();
        ArrayList<String> result =  parser.textParser(input);

        if ("help".equals(result.get(0))){
            Menu.help();
        }
        if ("quit".equals(result.get(0))){
            Menu.quit();
        }
    }
}