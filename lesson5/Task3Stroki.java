package itacademy.lesson5;

public class Task3Stroki {
    public static void main(String[] args) {
        String str = "   Каждая. строка!, создаваемая с: помощью оператора new.    является экземпляром, класса String!   ";
        String str2 = str.trim().replaceAll("[.,!?:;]","");
        System.out.println(str2);
        for(int i = 0; i<str2.length()-1; i++){
            if(str2.charAt(i) != ' ' & str2.charAt(i+1) == ' '){
                System.out.print(str2.charAt(i));
            }
        }
            System.out.print(str2.charAt(str2.length()-1));
    }
}
