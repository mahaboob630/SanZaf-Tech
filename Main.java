import java.util.Random;
import java .util.Scanner;
class TemperatureGenerator{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("TemperatureGenerator");
        System.out.print("Enter minimum temperature(celsius");
        double minTemp = scan.nextDouble();
        System.out.println("Enter maximum temperature(celsius");
        double maxTemp = scan.nextDouble();
        System.out.print("Enter number of locations: ");
        int numLocations= scan.nextInt();
        System.out.println("Generated Temperatures:");
        for(int i=0;i<numLocations;i++){
            double temperature = generateTemperature(minTemp,maxTemp,random);
            System.out.println("Location"+(i+1)+":"+temperature+"C");
        }
        scan.close();
    }
    private static double generateTemperature(double minTemp,double maxTemp,Random random){
        return minTemp+(maxTemp-minTemp)*random.nextDouble();
    }
    private static void printTemperatue(double temperature,String unit){
        System.out.printf("%.2f%s%n",temperature,unit);
    }
}

