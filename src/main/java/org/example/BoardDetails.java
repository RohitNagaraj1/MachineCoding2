package org.example;
import java.util.*;

public class BoardDetails {
    public HashMap<Integer, Integer> Snakes;
    public HashMap<Integer, Integer> Ladders;
    public HashMap<Integer, Player> Players;
    Scanner sc = new Scanner(System.in);
    public void getSnakesDetails()
    {
        Snakes = new HashMap<>();
        System.out.println("Enter Number of snakes");
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < number; i++)
        {
            String[] startAndEndPoints = sc.nextLine().split(" ");
            int start = Integer.parseInt(startAndEndPoints[0]);
            int end = Integer.parseInt(startAndEndPoints[1]);
            Snakes.put(start, end);
        }
    }
    public void getLadderDetails()
    {
        Ladders = new HashMap<>();
        System.out.println("Enter Number of Ladders");
        int number = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < number; i++)
        {
            String[] startAndEndPoints = sc.nextLine().split(" ");
            int start = Integer.parseInt(startAndEndPoints[0]);
            int end = Integer.parseInt(startAndEndPoints[1]);
            Ladders.put(start, end);
        }
    }
    public void getPlayerDetails(int number)
    {
        Players = new HashMap<>();

        for (int i = 0; i < number; i++)
        {
            System.out.println("Enter player name");
            String name = sc.nextLine();
            Player current = new Player();
            current.setCurrentPosition(1);
            current.setId(i);
            current.setName(name);
            Players.put(i, current);
        }
    }
}
