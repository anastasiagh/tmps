package IteratorPattern;

public class CaesarTypeRepository implements Sector {
    public String[] salads = {"caesarWithChicken", "caesarWithShrimps", "veganCaesar"};

    @Override
    public Iterator getIterator() {
        return new CaesarTypeIterator();
    }

    private class CaesarTypeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < salads.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return salads[index++];
            }
            return null;
        }
    }
}
