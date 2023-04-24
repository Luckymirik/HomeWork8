import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[]a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        double[]b={ 1.57, 7.654, 9.986};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        int i =3;
        byte[]c=new byte[i];
        c[0]=3;
        c[1]=2;
        c[2]=1;
        System.out.println(c[0]);
        System.out.println(c[1]);
        System.out.println(c[2]);

    }
    public static void task2() {
        System.out.println("Задача 2");
        int[]a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        System.out.println(a[0]+","+a[1]+","+a[2]);

        double[]b={ 1.57, 7.654, 9.986};
        System.out.println(b[0]+","+b[1]+","+b[2]);
        int i =3;
        byte[]c=new byte[i];
        c[0]=3;
        c[1]=2;
        c[2]=1;
        System.out.println(c[0]+","+c[1]+","+c[2]);

    }
    public static void task3() {
        System.out.println("Задача 3");
        int[]a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        System.out.println(a[2]+","+a[1]+","+a[0]);

        double[]b={ 1.57, 7.654, 9.986};
        System.out.println(b[2]+","+b[1]+","+b[0]);
        int i =3;
        byte[]c=new byte[i];
        c[0]=3;
        c[1]=2;
        c[2]=1;
        System.out.println(c[2]+","+c[1]+","+c[0]);
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[]a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        for (int i = 0; i < a.length; i+=2) {
            a[i]++;

        }
        System.out.println(Arrays.toString(a));

    }
}