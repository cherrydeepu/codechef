import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int X = s.nextInt();
        int Y = s.nextInt();

        int cakesPerVehicle = Y / X;
        int vehicles = (N + cakesPerVehicle - 1) / cakesPerVehicle;

        System.out.println(vehicles);
    }
}s