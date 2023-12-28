// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1.hmn();
        task2.cty();
    }
    class task1 {
        public static void hmn() {
            Human one = new Human();
            System.out.println(one);
            System.out.println("Новый номер телефона: " + one.getContactNumber());
            one.setCity("New York");
            System.out.println("Новый город: " + one.getCity());
        }
    }
        class task2{
            public static void cty() {
                City two = new City();
                System.out.println(two);
                System.out.println("Новое название региона: " + two.getnameOfTheCountry());
                two.setnumberOfInhabitants("New York");
                System.out.println("Новая численность населения: " + two.getnumberOfInhabitants());
            }
        }
    }

