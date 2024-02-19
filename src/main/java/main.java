import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        // Generic class example - Homework 1.Question
        GenericClassExample<Integer> obje1 = new GenericClassExample<>(10);
        obje1.printDeger();

        GenericClassExample<String> stringObje = new GenericClassExample<>("Generic class example!");
        stringObje.printDeger();


        // Stream API example - Homework 2.Question

        List<String> sportList = new ArrayList<String>();
        sportList.add("Futbol");
        sportList.add("Basketbol");
        sportList.add("Hentbol");
        sportList.add("Snooker");

        System.out.println("Spor Tum Listesi: " + sportList);

        final String field1 = "Hentbol";
        final String field2 = "XXXX";

        String searchResult1 = sportList.stream()
                .filter(value -> value.equals(field1))
                .findAny()
                .orElse("-1");

        String searchResult2 = sportList.stream()
                .filter(value -> value.equals(field2))
                .findAny()
                .orElse("-1");

        System.out.println("Deger 1 Listede Bulunma Sonucu: "+ searchResult1);
        System.out.println("Deger 2 Listede Bulunma Sonucu: " + searchResult2);

    }

}