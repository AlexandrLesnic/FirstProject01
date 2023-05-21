package JAVA;

import java.sql.SQLOutput;

public class HW_ {
    public static void main(String[] args) {
        /* 1.Есть стринг I love java */
        String text="I LOVE JAVA";
        System.out.println(text);
        /* а)Посчитать суколько букв в этой фразе */
        System.out.println(text.length());
        /* б)Вывести букву под индексом 4 */
        System.out.println(text.charAt(4));
        /* в)Вывсти индекс буквы j */
        System.out.println(text.indexOf("J"));
        /* г) добавть в эту фразу and QA Automation (должно вывексти I love java nd QA Automation) */
        System.out.println(text+" and QA Automation"); /* варьант 1 */
        System.out.println(text.concat(" and QA Automation")); /* варьант 2 */
        /* 2)Проверить через boolean что фраза I love java типа String */
        boolean isString = text instanceof String;
        System.out.println(isString);
    }
}
