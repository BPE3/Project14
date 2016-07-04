/**
 * Created by Петя on 01.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        Device i = new Device("Samsung", 120, "AB1234567CD");
        Monitor j = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1024);
      i.toString();
      j.toString();
        System.out.println(i);
        System.out.println(j);
    }
}
