
import CaesarMaker.CaesarMaker;
import CaesarMaker.CaesarMakerFacade;
import CaesarStatus.CaesarMakerProxy;
import OrderHistory.CaesarOrderHistory;
import OrderHistory.CaesarType;

import java.io.*;
class GenerateBillFactoryPattern {
    public static void main(String args[])throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.print("What type of salad do you want? (Expected values: caesarWithChicken, caesarWithShrimps, veganCaesar)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String caesarTypeInput = br.readLine();
        CaesarType caesarItem = (CaesarType) CaesarOrderHistory.addSaladToHistory(caesarTypeInput);

        CaesarBuilderPattern.Caesar caesarType = new CaesarBuilderPattern.Caesar.Builder(caesarTypeInput).sauce(true).lettuce(true).chicken(true).shrimp(false).parmesan(true).croutons(true).size("Medium").build();

        System.out.print("Where do you want to eat it from? ");
        String place = br.readLine();

        System.out.print("How many salads do you want? ");
        int units = Integer.parseInt(br.readLine());
        CaesarPrice price = planFactory.getCaesarPrice(place);

        System.out.print("Bill for " + units + " salads served at " + place + " is: ");
        price.getCaesarPrice();
        price.calculateBill(units);

        CaesarMakerFacade caesarMaker = new CaesarMakerFacade();

        switch (caesarTypeInput.toLowerCase()) {
            case "caesarWithChicken":
                CaesarMaker caesarWithChicken = new CaesarMakerProxy("caesarWithChicken");
                caesarWithChicken.prepareCaesar();
                caesarMaker.prepareCaesarWithChicken();
            case "caesarWithShrimps":
                CaesarMaker caesarWithShrimps = new CaesarMakerProxy("caesarWithShrimps");
                caesarWithShrimps.prepareCaesar();
                caesarMaker.prepareCaesarWithShrimps();
            case "veganCaesar":
                CaesarMaker veganCaesar = new CaesarMakerProxy("veganCaesar");
                veganCaesar.prepareCaesar();
                caesarMaker.prepareVeganCaesar();
            default:
                System.out.println("We don't have such type of salad, we can make a classical one:)!");
                CaesarMaker caesar = new CaesarMakerProxy("caesarWithChicken");
                caesar.prepareCaesar();
                caesarMaker.prepareCaesarWithChicken();
        }

        System.out.print("Want something more? If yes, write the type of salad you want");
        String caesarTypeInput2 = br.readLine();
        CaesarType caesarItem2 = (CaesarType) CaesarOrderHistory.addSaladToHistory(caesarTypeInput2);

    }
}