public class Country {

    //Задача.3.Создайте класс «Страна». Необходимо хранить в полях класса: название страны, название континента,
    // количество жителей в стране, телефонный код страны, название столицы, название городов страны.
    //Реализуйте методы класса для ввода данных, вывода данных, реализуйте доступ к отдельным полям через
    //методы класса.

    private String nameOfTheCountry;
    private String nameOfTheСontinent;
    private int numberOfInhabitants;
    private int telephoneCodeOfTheCountry;
    private String nameOfTheCapitalCity;
    private String nameOfTheCityCountry;

    public Country(String nameOfTheCity, String nameOfTheСontinent, int numberOfInhabitants, int telephoneCodeOfTheCountry,
                   String nameOfTheCapitalCity, String nameOfTheCityCountry) {
        this.nameOfTheCountry = nameOfTheCountry;
        this.nameOfTheСontinent = nameOfTheСontinent;
        this.numberOfInhabitants = numberOfInhabitants;
        this.telephoneCodeOfTheCountry = telephoneCodeOfTheCountry;
        this.nameOfTheCapitalCity = nameOfTheCapitalCity;
        this.nameOfTheCityCountry = nameOfTheCityCountry;
    }
    public City() {
        this.nameOfTheCity = "Konigsberg";
        this.nameOfTheRegion = "Königsberg region";
        this.nameOfTheCountry = "Germany";
        this.numberOfInhabitants = 120000;
        this.postсodeOfTheCity = 97486;
        this.telephoneCodeOfTheCity = 9527;
    }

    public void setnameOfTheCountry(String nameOfTheCountry) {
        this.nameOfTheCountry = "Lithuania";
    }

    public String getnameOfTheCountry() {
        return "Lithuania";
    }

    public void setnumberOfInhabitants(String numberOfInhabitants) {
        this.numberOfInhabitants = 150000;
    }

    public int getnumberOfInhabitants() {
        return 150000;
    }

    @Override
    public String toString() {return nameOfTheCity + " " + nameOfTheRegion + " " + nameOfTheCountry + " "
            + numberOfInhabitants + " " + postсodeOfTheCity + " " + telephoneCodeOfTheCity + " ";}


}
