
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int days = 256;
        //int[] input = new int[]{3,4,3,1,2};
        int[] input = new int[]{5,4,3,5,1,1,2,1,2,1,3,2,3,4,5,1,2,4,3,2,5,1,4,2,1,1,2,5,4,4,4,1,5,4,5,2,1,2,5,5,4,1,3,1,4,2,4,2,5,1,3,5,3,2,3,1,1,4,5,2,4,3,1,5,5,1,3,1,3,2,2,4,1,3,4,3,3,4,1,3,4,3,4,5,2,1,1,1,4,5,5,1,1,3,2,4,1,2,2,2,4,1,2,5,5,1,4,5,2,4,2,1,5,4,1,3,4,1,2,3,1,5,1,3,4,5,4,1,4,3,3,3,5,5,1,1,5,1,5,5,1,5,2,1,5,1,2,3,5,5,1,3,3,1,5,3,4,3,4,3,2,5,2,1,2,5,1,1,1,1,5,1,1,4,3,3,5,1,1,1,4,4,1,3,3,5,5,4,3,2,1,2,2,3,4,1,5,4,3,1,1,5,1,4,2,3,2,2,3,4,1,3,4,1,4,3,4,3,1,3,3,1,1,4,1,1,1,4,5,3,1,1,2,5,2,5,1,5,3,3,1,3,5,5,1,5,4,3,1,5,1,1,5,5,1,1,2,5,5,5,1,1,3,2,2,3,4,5,5,2,5,4,2,1,5,1,4,4,5,4,4,1,2,1,1,2,3,5,5,1,3,1,4,2,3,3,1,4,1,1};

        long[] fish = new long[] {0,0,0,0,0,0,0,0,0,0};
        for (int q : input) {
            for (int r = 0; r < fish.length; r++) {
                if (input[q] == r) { fish[r+1]++;}
            }
        }
        System.out.println(Arrays.toString(fish));
        for (int s =0; s<days;s++){
            for (int t=0;t<fish.length-1;t++){
                fish[t] = fish[t+1];
                if (t == 7) { fish[t] += fish[0];}
            }
            fish[fish.length -1] = fish[0];
            fish[0] = 0;
            System.out.println(Arrays.stream(fish).sum());
        }

//        long fish8 = 0;
//        long fish7 = 0;
//        long fish6 = 0;
//        long fish5 = 0;
//        long fish4 = 0;
//        long fish3 = 0;
//        long fish2 = 0;
//        long fish1 = 0;
//        long fish0 = 0;
//        long fishMin1 = 0;
//        for (int q =0; q < input.length; q++)
//        {
//            if (input[q] == 8) { fish8++;}
//            if (input[q] == 7) { fish7++;}
//            if (input[q] == 6) { fish6++;}
//            if (input[q] == 5) { fish5++;}
//            if (input[q] == 4) { fish4++;}
//            if (input[q] == 3) { fish3++;}
//            if (input[q] == 2) { fish2++;}
//            if (input[q] == 1) { fish1++;}
//            if (input[q] == 0) { fish0++;}
//        }
//
//        for (int i = 0; i < 256; i++)
//        {
//            fishMin1 = fish0;
//            fish0 = fish1;
//            fish1 = fish2;
//            fish2 = fish3;
//            fish3 = fish4;
//            fish4 = fish5;
//            fish5 = fish6;
//            fish6 = fish7 + fishMin1;
//            fish7 = fish8;
//            fish8 = fishMin1;
//            fishMin1 = 0;
//        }
//
//        System.out.println(fish0);
//        System.out.println(fish1);
//        System.out.println(fish2);
//        System.out.println(fish3);
//        System.out.println(fish4);
//        System.out.println(fish5);
//        System.out.println(fish6);
//        System.out.println(fish7);
//        System.out.println(fish8);
//
//        System.out.println(fish0 + fish1 + fish2 + fish3 + fish4 + fish5 + fish6 + fish7 + fish8);

    }
}
