package pkg;
import java.util.Map;
 
public class main1 {
    public static void main(String[] args) {
        String filePath = "D:\\country.csv"; 
        Map<String, String> countryCapitalMap = Countrymap1.loadCsvFileToMap(filePath);
        char startsWith = 'M';
        String outputFile = "D:\\Fileread\\filtered_countries";
        Countrymap1.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
        System.out.println("Filtered countries have been written to the file.");
    }
}
 