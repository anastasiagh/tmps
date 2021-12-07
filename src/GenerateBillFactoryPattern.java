
import CaesarMaker.CaesarMaker;
import CaesarStatus.CaesarMakerProxy;
import IteratorPattern.Iterator;
import MediatorPattern.User;
import OrderHistory.CaesarOrderHistory;
import OrderHistory.CaesarType;
import IteratorPattern.CaesarTypeRepository;
import SizeFacade.SizeKeeper;

import java.io.*;
class GenerateBillFactoryPattern {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome! :)");

        System.out.print("What type of Caesar Salad do you want? We have: \n" );

        // Iterator Pattern
        CaesarTypeRepository employeeRepository = new CaesarTypeRepository();

        for(Iterator iterator = employeeRepository.getIterator();
            iterator.hasNext();) {
            String caesar = (String)iterator.next();
            System.out.println("- " + caesar);
        }

        GetPlanFactory planFactory = new GetPlanFactory();

        String caesarTypeInput = br.readLine();

        //Flyweight
        CaesarType caesarItem = (CaesarType) CaesarOrderHistory.addSaladToHistory(caesarTypeInput);

        System.out.print("Choose salad size: Small, Medium, Large? \n");
        String caesarSize = br.readLine();

        CaesarBuilderPattern.Caesar caesarType = new CaesarBuilderPattern.Caesar.Builder(caesarTypeInput).sauce(true).lettuce(true).chicken(true).shrimp(false).parmesan(true).croutons(true).size("Medium").build();

        System.out.print("Where do you want to eat it from? ");
        String place = br.readLine();

        System.out.print("How many salads do you want? ");
        int units = Integer.parseInt(br.readLine());
        CaesarPrice price = planFactory.getCaesarPrice(place);

        System.out.print("Bill for " + units + " salads served at " + place + " is: ");
        price.getCaesarPrice();
        price.calculateBill(units);

        //Facade
        SizeKeeper caesarMaker = new SizeKeeper();

        switch (caesarSize.toLowerCase()) {
            case "large":
                caesarMaker.findLargeSize();
                break;
            case "medium":
                caesarMaker.findMediumSize();
                break;
            default:
                caesarMaker.findSmallSize();
        }

        //Proxy
        switch (caesarTypeInput.toLowerCase()) {
            case "caesarwithchicken":
                CaesarMaker caesarWithChicken = new CaesarMakerProxy("caesarWithChicken");
                caesarWithChicken.prepareCaesar();
//                caesarMaker.prepareCaesarWithChicken();
            case "caesarwithshrimps":
                CaesarMaker caesarWithShrimps = new CaesarMakerProxy("caesarWithShrimps");
                caesarWithShrimps.prepareCaesar();
            case "vegancaesar":
                CaesarMaker veganCaesar = new CaesarMakerProxy("veganCaesar");
                veganCaesar.prepareCaesar();
            default:
                System.out.println("We don't have such type of salad, we can make a classical one:)!");
                CaesarMaker caesar = new CaesarMakerProxy("caesarWithChicken");
                caesar.prepareCaesar();
        }

        System.out.print("Do you want to get some interesting facts? Type 'yes' if you do  \n");

        // Mediator Pattern
        String clientAnswer = br.readLine();
        if (clientAnswer.equals("yes")) {
            User caesarBot = new User("CaesarBot");

            caesarBot.sendMessage("Many people think the Caesar salad was named after Julius Caesar -- it's not. \nThe Caesar salad was invented by an Italian man named Caesar Cardini. \nItalians can rest assured that there was Italian influence behind its creation.\n");

            User helper = new User("Helper");
            helper.sendMessage("Something else?");
        }



        System.out.print("Want to order something more? If yes, write the type of salad you want");
        String caesarTypeInput2 = br.readLine();
        CaesarType caesarItem2 = (CaesarType) CaesarOrderHistory.addSaladToHistory(caesarTypeInput2);
    }
}