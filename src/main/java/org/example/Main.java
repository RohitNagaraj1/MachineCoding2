package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        BoardDetails bd = new BoardDetails();
        bd.getSnakesDetails();
        bd.getLadderDetails();
        System.out.println("Enter number of players");
        Scanner sc = new Scanner(System.in);
        int totalPlayers = Integer.parseInt(sc.nextLine());
        bd.getPlayerDetails(totalPlayers);
        int currentPlayers = totalPlayers;

        while (currentPlayers > 1)
        {
            for (int i = 0; i < totalPlayers; i++)
            {
                if (bd.Players.get(i).getCurrentPosition() != 100)
                {
                    Player currentPlayer = bd.Players.get(i);
                    int currentPosition = currentPlayer.getCurrentPosition();
                    if (Play.isWinner(currentPlayer, bd))
                    {
                        System.out.println(currentPlayer.getName() + " wins the game");
                        currentPlayers--;
                    }
                }
            }
        }
    }
}