/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tennismaven2;

/**
 *
 * @author mikromafia
 */
public class TennisMaven2 {

   public static void main(String[] args) {
    TennisGame game = new TennisGame("player1", "player2");

    System.out.println(game.getScore());

    game.wonPoint("player1");
    System.out.println(game.getScore());

    game.wonPoint("player1");
    System.out.println(game.getScore());

    game.wonPoint("player2");
    System.out.println(game.getScore());

    game.wonPoint("player1");
    System.out.println(game.getScore());

    game.wonPoint("player1");
    System.out.println(game.getScore());
}
    
}