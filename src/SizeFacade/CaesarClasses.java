package SizeFacade;

class LargeSize implements Size {
    @Override
    public void findSize() {
        System.out.println("Looking for a Large size");
    }
}

class MediumSize implements Size {
    @Override
    public void findSize() {
        System.out.println("Looking for a Medium size");
    }
}

class SmallSize implements Size {
    @Override
    public void findSize() {
        System.out.println("Looking for a Small size");
    }
}