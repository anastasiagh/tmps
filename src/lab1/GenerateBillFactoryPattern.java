package lab1;

import java.io.*;
class GenerateBillFactoryPattern {
    public static void main(String args[])throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("What type of caesar do you want? ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String caesarTypeInput = br.readLine();

        CaesarBuilderPattern.Caesar caesarType = new CaesarBuilderPattern.Caesar.Builder(caesarTypeInput).sauce(true).lettuce(false).chicken(true).shrimp(false).parmesan(true).croutons(true).size("Medium").build();
        System.out.print("Where do you want to eat it? ");
        String place = br.readLine();

        System.out.print("How many salads do you want? ");
        int units = Integer.parseInt(br.readLine());
        CaesarPrice price = planFactory.getCaesarPrice(place);

        System.out.print("Bill for " + units + " salads served at " + place + " is: ");
        price.getCaesarPrice();
        price.calculateBill(units);
    }
}
