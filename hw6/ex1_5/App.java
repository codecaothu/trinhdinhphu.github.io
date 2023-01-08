package hw6.ex1_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        testOriginalData();
        testFilterAfricaCountry();
        testFilterAsiaCountry();
        testFilterEuropeCountry();
        testFilterOceaniaCountry();
        testFilterNorthAmericaCountry();
        testFilterSouthAmericaCountry();
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();
        testSortIncreasingByArea();
        testSortDecreasingByArea();
        testSortIncreasingByGdp();
        testSortDecreasingByGdp();
        testFilterHighestGdpCountries(4);
        testFilterLowestGdpCountries(4);
        testFilterLargestAreaCountries(4);
        testFilterSmallestAreaCountries(4);
        testFilterMostPopulousCountries(4);
        testFilterLeastPopulousCountries(4);


        /* TODO: write code to test program */
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            ArrayList<Country> countries = new ArrayList<>();
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                String countryCode = dataList.get(0);
                String countryLabel = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5);
                Country country = new Country(countryCode, countryLabel);
                if (continent.equals("Oceania")) {
                    country = new OceaniaCountry(countryCode, countryLabel, population, area, gdp);
                } else if (continent.equals("Africa")) {
                    country = new AfricaCountry(countryCode, countryLabel, population, area, gdp);
                } else if (continent.equals("Europe")) {
                    country = new EuropeCountry(countryCode, countryLabel, population, area, gdp);
                } else if (continent.equals("North America")) {
                    country = new NorthAmericaCountry(countryCode, countryLabel, population, area, gdp);
                } else if (continent.equals("South America")) {
                    country = new SouthAmericaCountry(countryCode, countryLabel, population, area, gdp);
                } else if (continent.equals("Asia")) {
                    country = new AsiaCountry(countryCode, countryLabel, population, area, gdp);
                }
                countryManager.append(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "C:\\Users\\Dell\\IdeaProjects\\BTVNOOP\\src\\hw6\\data1_5\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
//        System.out.print(codesString);
        System.out.println("Test original data: " + codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test sort increasing by population: " + codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test sort decreasing by population: " + codesString);
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test sort increasing by area: " + codesString);
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test sort decreasing by area: " + codesString);
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test sort increasing by GDP: " + codesString);
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test sort decreasing by GDP: " + codesString);
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test filter Africa country: " + codesString);
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test fitler Asia country: " + codesString);
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test filter Europe country: " + codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Test filter North America country: " + codesString);
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Test filter Oceania country: " + codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.println("Test filter South America country: " + codesString);
    }

    public static void testFilterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(howMany);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test filter most populous countries: " + codesString);
    }

    public static void testFilterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(howMany);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test filter least populous countries: " + codesString);
    }

    public static void testFilterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(howMany);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test filter largest area countries: " + codesString);
    }

    public static void testFilterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(howMany);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test filter smallest area countries: " + codesString);
    }

    public static void testFilterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(howMany);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test filter highest GDP countries: " + codesString);
    }

    public static void testFilterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(howMany);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
//        System.out.print(codesString);
        System.out.println("Test filter lowest GDP countries: " + codesString);
    }
}
