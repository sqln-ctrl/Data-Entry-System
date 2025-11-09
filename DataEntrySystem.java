import java.util.Scanner;
class Person {
    String name;
    int age;
    Address address;
    static int count;

    static{
       count =0;
    }
    Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
        count++;
    }


    void displayInfo() {
        System.out.println("--------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        address.displayAddress();
        System.out.println("--------------");
    }
}

    class Address {
        String city;
        String country;
        static int count = 0;

        Address(String city, String country) {
            this.city = city;
            this.country = country;
            count++;
        }

        public void displayAddress() {
            System.out.println("City: " + city);
            System.out.println("Country: " + country);
        }
    }


class main {
    public static void displayArray(Person[] array) {
        int i = 0;
        for (Person e : array) {
            System.out.println("Person "+(i+1)+" Details:");
            e.displayInfo();
            i++;
        }
    }

    public static Person[] AssignData(String names[], int ages[], Address[] addresses, int size) {
        Person[] persons = new Person[size];
        for (int l = 0; l < size; l++) {
            persons[l] = new Person(names[l], ages[l], addresses[l]);
        }
        return persons;
    }

    public static Address[] AssignAddresses(String[] cities , String[] countries, int size){
        Address[] addresses = new Address[size];
        for(int k=0; k<size; k++){
            addresses[k] = new Address(cities[k] , countries[k]);
        }
        return addresses;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of Persons: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String[] names = new String[size];
        int[] ages = new int[size];
        String[] cities = new String[size];
        String[] countries = new String[size];

        System.out.println("Data Entry System: ");
        for(int i = 0 ; i < size; i++){
            System.out.println("Person "+(i+1)+" Details Entry: ");
            System.out.println("Enter the name: ");
            names[i] = scanner.next();
            System.out.println("Enter the Age: ");
            ages[i] = scanner.nextInt();
            System.out.println("Enter the city: ");
            cities[i] = scanner.next();
            System.out.println("Enter the country: ");
            countries[i] = scanner.next();
            System.out.println();
        }
        System.out.println();

        Address[] addresses = AssignAddresses(cities , countries , size);
        Person[] persons =  AssignData(names, ages, addresses , size );

        System.out.println("Do you want to print the details: (Yes/No)");
        String choice = scanner.next();
        if(choice.equals("Yes")){
            displayArray(persons);
            System.out.println("Total Persons: "+Person.count);
        }
        else{
            System.out.println("Program Exits!");
        }


    }

}


