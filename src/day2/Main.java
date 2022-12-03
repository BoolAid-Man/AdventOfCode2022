package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("src/day2/Input.txt"));
        int[] scores = {0, 0};
        while (in.hasNext()) {
            String[] moves = in.nextLine().split(" ");
            System.out.printf("%s %s: ", moves);
            switch (moves[0]) {
                case "A":
                    scores[0] += 1;
                    switch (moves[1]) {
                        case "X":
                            scores[1] += 4;
                            scores[0] += 3;
                            System.out.println("TIE!");
                            break;
                        case "Y":
                            scores[1] += 8;
                            System.out.println("PLAYER WIN!");
                            break;
                        case "Z":
                            scores[1] += 3;
                            scores[0] += 6;
                            System.out.println("COMP WIN");
                            break;
                    }
                    break;
                case "B":
                    scores[0] += 2;
                    switch (moves[1]) {
                        case "X":
                            scores[1] += 1;
                            scores[0] += 6;
                            System.out.println("COMP WIN");
                            break;
                        case "Y":
                            scores[1] += 5;
                            scores[0] += 3;
                            System.out.println("TIE!");
                            break;
                        case "Z":
                            scores[1] += 9;
                            System.out.println("PLAYER WIN!");
                            break;
                    }
                    break;
                case "C":
                    scores[0] += 3;
                    switch (moves[1]) {
                        case "X":
                            scores[1] += 7;
                            System.out.println("PLAYER WIN!");
                            break;
                        case "Y":
                            scores[1] += 2;
                            scores[0] += 6;
                            System.out.println("COMP WIN");
                            break;
                        case "Z":
                            scores[1] += 6;
                            scores[0] += 3;
                            System.out.println("TIE!");
                            break;
                    }
            }
        }

        System.out.println("Player final score:" + scores[1]);
    }
}
