package pkg;

public class stringsearch extends Abstractsearch {
    @Override
    public boolean search(Object[] objList, Object obj) {
        for (Object o : objList) {
            if (o instanceof String && o.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
