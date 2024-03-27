package pkg;
public class main {
    public static void main(String[] args) {
        Object[] objects = {1, 2, 3, 4, 5, "diya", "dhaarani", "priya"};
 
        Abstractsearch integerSearch = new integersearch();
        Abstractsearch stringSearch = new stringsearch();
        System.out.println("Searching for integer 3:");
        boolean integerFound = integerSearch.search(objects, 3);
        if (integerFound) {
            System.out.println("Integer 3 found.");
        } else {
            System.out.println("Integer 3 not found.");
        }
        System.out.println("\nSearching for string 'banana':");
        boolean stringFound = stringSearch.search(objects, "banana");
        if (stringFound) {
            System.out.println("String 'banana' found.");
        } else {
            System.out.println("String 'banana' not found.");
        }
    }
}
 