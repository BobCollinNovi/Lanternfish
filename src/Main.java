package com.company;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> allFish = new ArrayList<Integer>();
        allFish.add(3);
        allFish.add(4);
        allFish.add(3);
        allFish.add(1);
        allFish.add(2);


        for  (int i = 0; i < 80; i++)
        {
            int curSize = allFish.size();
            for (int j = 0; j < curSize; j++)
            {
                int curFish = allFish.get(j);
                if (curFish - 1 < 0)
                {
                    allFish.set(j, 6);
                    allFish.add(8);
                }
                else
                {
                    allFish.set(j, curFish - 1);
                }
            }
           for (Integer k : allFish) {
                System.out.print(k + " ");
            }
           System.out.println();
        }

        System.out.println("TotalFish: " + allFish.size());

    }
}
