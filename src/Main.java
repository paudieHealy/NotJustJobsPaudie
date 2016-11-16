public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        sayHi();
        theTime();
    }
    public static void sayHi()
        {
            System.out.println("Hi");
        }

    public static void theTime()
        {
            String sec = "34";
            String min = "23";
            String hr = "10";
            String result = hr + ":" + min + ":" + sec;
            System.out.println(result);

        }
}
