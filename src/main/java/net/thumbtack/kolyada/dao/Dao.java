package net.thumbtack.kolyada.dao;

import java.util.List;
import java.util.Map;

import static java.lang.System.*;


public class Dao {
    public static int[] parseIntArray(String[] args) {
        int[] result = new int[args.length];

        for (int i = 0; i < args.length; i++)
            try {
                result[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                out.println(e.getMessage());
            }

        return result;
    }

    public static double[] parseDoubleArray(String[] args) {
        double[] result = new double[args.length];

        for (int i = 0; i < args.length; i++)
            try {
                result[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                out.println(e.getMessage());
            }

        return result;
    }
}
