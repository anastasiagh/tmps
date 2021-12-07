package SizeFacade;

public class SizeKeeper {
    private Size smallCup;
    private Size mediumCup;
    private Size largeCup;

    public SizeKeeper() {
        smallCup = new SmallSize();
        mediumCup = new MediumSize();
        largeCup = new LargeSize();
    }

    public void findLargeSize() {
        largeCup.findSize();
    }

    public void findMediumSize() {
        mediumCup.findSize();
    }

    public void findSmallSize() {
        smallCup.findSize();
    }
}
