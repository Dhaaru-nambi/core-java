package pkg;

public class integersearch extends Abstractsearch {
    @Override
    public boolean search(Object[] objList, Object obj) {
        for (Object o : objList) {
            if (o instanceof Integer && o.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}