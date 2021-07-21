package codingame;

import java.util.*;
import java.io.*;
import java.math.*;

class ShadowsOfTheKnight_1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        // game loop
        int minX = 0, minY = 0;
        int maxX = W - 1, maxY = H - 1;

        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            if(bombDir.equals("D")){
                minY = Y0 + 1; 
                minX = X0;
                maxX = X0;
            }
            if(bombDir.equals("DR")){
                minX = X0 + 1;
                minY = Y0 + 1;
            }
            if(bombDir.equals("R")){
                minX = X0 + 1;
                minY = Y0;                
                maxY = Y0;
            }
            if(bombDir.equals("UR")){
                minX = X0 + 1;
                maxY = Y0 - 1;
            }
            if(bombDir.equals("U")){
                minX = X0;
                maxX = X0;
                maxY = Y0 - 1;
            }
            if(bombDir.equals("UL")){
                maxX = X0 - 1;
                maxY = Y0 - 1;
            }
            if(bombDir.equals("L")){
                minY = Y0;                
                maxX = X0 - 1;
                maxY = Y0;
            }
            if(bombDir.equals("DL")){
                minY = Y0 + 1;
                maxX = X0 - 1;
            }
            X0 = (minX + maxX) / 2;
            Y0 = (minY + maxY) / 2;

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // the location of the next window Batman should jump to.
            System.out.println(X0 + " " + Y0);
        }
    }
}