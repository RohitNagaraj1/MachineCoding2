package org.example;
import java.util.*;
public class Play {
    public static boolean isWinner(Player player, BoardDetails bd)
    {
        int initialValue = player.getCurrentPosition();
        int totalValue = 0;
        int presentValue = 0;
        Random random = new Random();
        String position = "";

        do
        {
            presentValue = random.nextInt(0, 6);
            presentValue++;
            totalValue += presentValue;

            if (player.getCurrentPosition() + presentValue <= 100)
            {
                int beforeUpdating = player.getCurrentPosition();
                int temp = player.getCurrentPosition() + presentValue;
                if (bd.Snakes.containsKey(temp))
                {
                    temp = bd.Snakes.get(temp);
                }

                if (bd.Ladders.containsKey(temp))
                {
                    temp = bd.Snakes.get(temp);
                }

                if (bd.Snakes.containsKey(temp))
                {
                    temp = bd.Snakes.get(temp);
                }

                if (bd.Ladders.containsKey(temp))
                {
                    temp = bd.Snakes.get(temp);
                }

                position += player.getName() + " rolled a " + presentValue + " and moved from " + beforeUpdating + " to " + temp + "\n";
                player.setCurrentPosition(temp);
            }
        } while (presentValue == 6 && totalValue != 18);

        if (totalValue == 18)
        {
            player.setCurrentPosition(initialValue);
            return false;
        }

        System.out.println(position);
        if (player.getCurrentPosition() == 100)
            return true;

        return false;
    }
}
