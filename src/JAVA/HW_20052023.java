package JAVA;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class HW_20052023 {
    public static void main(String[] args) {
        String[] company = {"MAIB","Google","MIcrosoft","Orange","Moldtelecom"};
        //посчитать сколько элементов имеет масив сompany (что б не с 0 считал а с 1)
        int count = company.length; // тут есть вопрос по поводу количества. По сути я должен использовать -1 но почемуто подсчитанно правильно.
        System.out.println("Elementele masivului Company: " + count);

        //вывести последний, первый и второй элемент
        String lastElement = company[company.length -1];
        System.out.println("Ultimul element: " + lastElement);
        String firstElement = company[0];
        System.out.println("Primul element: " + firstElement);
        String secondElement = company[1];
        System.out.println("Al doilea element: " + secondElement);

        //Вывести размер масива
        int size = company.length;
        System.out.println("Afisarea dimensiunii masivului: " + size);
    }
}
