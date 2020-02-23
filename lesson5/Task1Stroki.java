package itacademy.lesson5;
// Подсчет знаков препинания
public class Task1Stroki {
    public static void main(String[] args) {
        String str = "   Каждая. строка!, создаваемая с: помощью оператора new.    является экземпляром, класса String!   ";
        int n = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ',' | str.charAt(i) == '.' | str.charAt(i) == '!' | str.charAt(i) == ':'){
                n++;
            }
        }
        System.out.println(n);
    }
}
