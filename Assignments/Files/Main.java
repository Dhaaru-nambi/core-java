package pkg;
import java.util.Map;
 
public class main{
	   public static void main (String[] args) {
	       String filePath = "D:\\country.csv"; 
	       Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
	       for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	           System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
	       }
	   }
}
