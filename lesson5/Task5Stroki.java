package itacademy.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5Stroki {
    public static void main(String[] args) {
        String str = "   Каждая. строка!, создаваемая с: помощью оператора new.    является экземпляром, класса String!   ";
        String str2 = str.toLowerCase();
        System.out.println(str2.length());
        for (char i = 'а'; i<='я'; i++) {
            int n = 0;
            for (int j = 0; j<str2.length(); j++){
                if(str2.charAt(j)==i) {
                    Pattern p = Pattern.compile(String.valueOf(j));
                    Matcher m = p.matcher(str2);
                    n++;
                }
        }
            System.out.printf("Букв %s - %d\n", i,n);
        }
    }
}
