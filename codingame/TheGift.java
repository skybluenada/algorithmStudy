package codingame;


import java.util.*;
import java.io.*;
import java.math.*;

/**
* Auto-generated code below aims at helping you parse
* the standard input according to the problem statement.
**/

public class TheGift {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int C = in.nextInt();
        int[] budgetList = new int[N];
        int[] resultCost = new int[N];        
        for (int i = 0; i < N; i++) {
            int B = in.nextInt();
            budgetList[i] = B;
        }
        Arrays.sort(budgetList);
        for(int i = 0; i < budgetList.length; i++){
            if(budgetList[i] < C/N){
                C -= budgetList[i];
                N -= 1;
                resultCost[i] = budgetList[i];
            }
            else{
                C -= C/N;
                N -= 1;
                resultCost[i] = C/N;                
            }
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        if(C > 0){
            System.out.println("IMPOSSIBLE"); 
        }
        else{
            for(int i = 0; i < resultCost.length; i++){
                System.out.println(resultCost[i]);
            }
        }
    }
}