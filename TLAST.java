//Mikhael  Jordania Harianja - 12S25053

import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int totaldata;
        String command;
        String[] deskripsi = new String[10], kode = new String[10], matkul = new String[10], dosen = new String[10], deadline = new String[10], ketID = new String[10], status = new String[10];
        double[] prioritas = new double[10];
        int[] kesulitan = new int[10], hari = new int[10];

        totaldata = 0;
        while (!command.equals("---")) {
            command = input.nextLine();
            if (command.equals("Add task")) {
            }
            if (totaldata < 10) {
                deskripsi[totaldata] = input.nextLine();
                matkul[totaldata] = input.nextLine();
                dosen[totaldata] = input.nextLine();
                deadline[totaldata] = input.nextLine();
                ketID[totaldata] = input.nextLine();
                kesulitan[totaldata] = Integer.parseInt(input.nextLine());
                hari[totaldata] = Integer.parseInt(input.nextLine());
                status[totaldata] = input.nextLine();
                // Name = Expression;
            }
        }
    }
    
    public static String addtask() {
        
        return ;
    }
}
