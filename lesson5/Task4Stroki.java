package itacademy.lesson5;

public class Task4Stroki {
    public static void main(String[] args) {
        String s1 = "Я программирую на";
        String s2 = "Java";

        StringBuilder s3 = new StringBuilder();
        s3.append("Я программирую на");
        StringBuilder s4 = new StringBuilder("Java");

        StringBuffer s5 = new StringBuffer();
        s5.append("Я программирую на");
        StringBuffer s6 = new StringBuffer("Java");

        System.out.printf("%s %s\n",s3,s4);
        long startStr = System.currentTimeMillis();
            for(int i = 0; i<1000000; i++){
            String s10 = s1+s2;
        }
        long finishStr = System.currentTimeMillis();

        long startBui = System.currentTimeMillis();
            for(int j = 0; j<1000000; j++){
            s3.append(s4);
        }
        long finishBui = System.currentTimeMillis();

        long startBuf = System.currentTimeMillis();
            for(int i = 0; i<1000000; i++){
            s5.append(s6);
        }
       long finishBuf = System.currentTimeMillis();
       long timeStr = finishStr-startStr;
       long timeBui = finishBui-startBui;
       long timeBuf = finishBuf-startBuf;

        System.out.println(timeStr + " String");
        System.out.println(timeBui + " Builder");
        System.out.println(timeBuf + " Buffer");
    }
}