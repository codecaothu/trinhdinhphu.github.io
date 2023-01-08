package hw6.ex1_5;

import java.util.Arrays;
import java.util.Comparator;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++){
            int min_index;
            for (int j = i + 1; j < newArray.length; j++){
                if (newArray[j].getPopulation() > newArray[i].getPopulation()){
                    min_index = j;
                    Country tmp = newArray[min_index];
                    newArray[min_index] = newArray[i];
                    newArray[i] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++){
            int min_index;
            for (int j = i + 1; j > newArray.length; j++){
                if (newArray[j].getPopulation() < newArray[i].getPopulation()){
                    min_index = j;
                    Country tmp = newArray[min_index];
                    newArray[min_index] = newArray[i];
                    newArray[i] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++){
            for (int j = 0; j < newArray.length - i - 1; j++){
                if (newArray[j].getArea() > newArray[j + 1].getArea()){
                    Country tmp = newArray[i];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++){
            for (int j = i + 1; j < newArray.length - i - 1; j++){
                if (newArray[j].getArea() < newArray[j + 1].getArea()){
                    Country tmp = newArray[i];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = tmp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; i++){
            Country temp = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getGdp() > temp.getGdp()){
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        for (int i = 1; i < newArray.length; i++){
            Country temp = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getGdp() < temp.getGdp()){
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }
            newArray[j + 1] = temp;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        AfricaCountry [] africaCountries = new AfricaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if(countries[i] instanceof AfricaCountry){
                africaCountries[count] = (AfricaCountry) countries[i];
                count++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        AsiaCountry [] asiaCountries = new AsiaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if(countries[i] instanceof AsiaCountry){
                asiaCountries[count] = (AsiaCountry) countries[i];
                count++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        EuropeCountry [] europeCountries = new EuropeCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if(countries[i] instanceof EuropeCountry){
                europeCountries[count] = (EuropeCountry) countries[i];
                count++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        NorthAmericaCountry [] northAmericaCountries = new NorthAmericaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if(countries[i] instanceof NorthAmericaCountry){
                northAmericaCountries[count] = (NorthAmericaCountry) countries[i];
                count++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        OceaniaCountry [] oceanCountries = new OceaniaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if(countries[i] instanceof OceaniaCountry){
                oceanCountries[count] = (OceaniaCountry) countries[i];
                count++;
            }
        }
        return oceanCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        SouthAmericaCountry [] southAmericaCountries = new SouthAmericaCountry[this.length];
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if(countries[i] instanceof SouthAmericaCountry){
                southAmericaCountries[count] = (SouthAmericaCountry) countries[i];
                count++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] country = new Country[howMany];
        sortByDecreasingPopulation();
        for (int i = 0; i < country.length; i++){
            country[i] = countries[i];
        }
        return country;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] country = new Country[howMany];
        sortByIncreasingPopulation();
        for (int i = 0; i < country.length; i++){
            country[i] = countries[i];
        }
        return country;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] country = new Country[howMany];
        sortByDecreasingArea();
        for (int i = 0; i < country.length; i++) {
            country[i] = countries[i];
        }
        return country;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] country = new Country[howMany];
        sortByIncreasingArea();
        for (int i = 0; i < country.length; i++) {
            country[i] = countries[i];
        }
        return country;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] country = new Country[howMany];
        sortByDecreasingGdp();
        for (int i = 0; i < country.length; i++) {
            country[i] = countries[i];
        }
        return country;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] country = new Country[howMany];
        sortByIncreasingGdp();
        for (int i = 0; i < country.length; i++) {
            country[i] = countries[i];
        }
        return country;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
