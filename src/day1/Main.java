package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //variables
        Scanner in = new Scanner(new File("src/day1/Input.txt"));
        ArrayList<Integer> elves = new ArrayList<>();
        int calories = 0;
        //Input loop to count calories
        while (in.hasNext()) {
            String line = in.nextLine();
            if (line.trim().isBlank()) {
                elves.add(calories);
                calories = 0;
            } else {
                calories += Integer.parseInt(line);
            }
        }

        //determine max value
        int[] max = {0, 0, 0};
        for (int elf : elves) {
            if (elf > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = elf;
            } else if (elf > max[1]) {
                max[2] = max[1];
                max[1] = elf;
            } else if (elf > max[2]) {
                max[2] = elf;
            }
        }
        System.out.println(max[0] + max[1] + max[2]);


    }

}
