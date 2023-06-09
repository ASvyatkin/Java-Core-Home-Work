package lesson4;
//Created by: Andrey Svyatkin
import java.util.*;

public class ArrayOperation {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Mercedes", "BMW", "Audi", "Toyota", "Vokswagen",
                "Opel", "Subaru", "Range Rover", "Toyota", "Vokswagen"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
