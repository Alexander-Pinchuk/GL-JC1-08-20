package itacademy.lesson5;
// Количество слов в предложении
public class Task2Stroki {
    public static void main(String[] args) {
        String str = "   Каждая. строка!, создаваемая с: помощью оператора new.    является экземпляром, класса String!   ";
        String str2 = str.trim();
        String str3 = str2.replaceAll("[.,!:]", "");
        int n = 1;
        for(int i = 0; i<str3.length()-1; i++){
            if(str3.charAt(i) != ' ' & str3.charAt(i+1) == ' '){
                n++;
            }
        }
        System.out.println(n);
    }
}
