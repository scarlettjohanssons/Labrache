package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Cars {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> id_num = new ArrayList<String>();
    private static ArrayList<String> mark = new ArrayList<String>();
    private static ArrayList<String> model = new ArrayList<String>();
    private static ArrayList<String> year = new ArrayList<String>();
    private static ArrayList<String> color = new ArrayList<String>();
    private static ArrayList<String> num = new ArrayList<String>();
    private static ArrayList<String> price = new ArrayList<String>();


    public static void main(String[] args) {
        int k = 0;
        int t = 0;
        System.out.print("Крицький Ілля Юрійович ІПЗ-33 ");
        System.out.print("\nКількість автомобілів: ");
        k = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<k; i++) {
            System.out.print("Введіть індентифікаційний номер автомобіля: ");
            getId_num();
            System.out.print("Введіть марку автомобіля: ");
            getMark();
            System.out.print("Введіть модель автомобіля: ");
            getModel();
            System.out.print("Введіть рік випуску автомобіля: ");
            getYear();
            System.out.print("Введіть колір автомобіля: ");
            getColor();
            System.out.print("Введіть реєстраційний номер автомобіля: ");
            getNum();
            System.out.print("Введіть ціну автомобіля: ");
            getPrice();
            System.out.println();
        }
        for (int i = 0; i<k; i++) {
            System.out.println(id_num.get(i)+"  "+ mark.get(i)+ "  "+ model.get(i) + "  "+ year.get(i)+"  "+ color.get(i)+"  "+ num.get(i)+"  "+ price.get(i));
        }
        System.out.println();
        System.out.println("1. Отримати список автомобілів заданої марки.");
        System.out.println("2. Отримати список автомобілів заданої моделі та які знаходяться в експлуатації більше N років.");
        System.out.println("3. Отримати список автомобілів заданого року випуску, ціна яких більше заданої");
        System.out.println();
        System.out.print("Введіть число 1-3: ");
        t = sc.nextInt();
        String s1 = "";
        String s2 = "";
        boolean f = false;
        switch (t) {
            case 1:
                System.out.print("Введіть марку: ");
                s1 = sc.nextLine();
                s1 = sc.nextLine();
                for (int i = 0; i<k; i++) {
                    if (mark.get(i).equals(s1)) {System.out.println(id_num.get(i)+"  "+ mark.get(i)+ "  "+ model.get(i) + "  "+ year.get(i)+"  "+ color.get(i)+"  "+ num.get(i)+"  "+ price.get(i)); f = true;}

                }
                if (!f) System.out.println("Нічого не знайдено");
                break;
            case 2:
                System.out.print("Введіть модель: ");
                s1 = sc.nextLine();
                s1 = sc.nextLine();
                System.out.print("Введіть кількість років: ");
                s2 = sc.nextLine();
                for (int i = 0; i<k; i++) {
                    if (model.get(i).equals(s1) && (2018-Integer.parseInt(year.get(i))) > Integer.parseInt(s2)) {System.out.println(id_num.get(i)+"  "+ mark.get(i)+ "  "+ model.get(i) + "  "+ year.get(i)+"  "+ color.get(i)+"  "+ num.get(i)+"  "+ price.get(i)); f = true;}

                }
                if (!f) System.out.println("Нічого не знайдено");
                break;
            case 3:
                System.out.print("Введіть рік: ");
                s1 = sc.nextLine();
                s1 = sc.nextLine();
                System.out.print("Введіть ціну: ");
                s2  = sc.nextLine();
                for (int i = 0; i<k; i++) {
                    if (Integer.parseInt(year.get(i)) == Integer.parseInt(s1) && Integer.parseInt(price.get(i)) > Integer.parseInt(s2)) {System.out.println(id_num.get(i)+"  "+ mark.get(i)+ "  "+ model.get(i) + "  "+ year.get(i)+"  "+ color.get(i)+"  "+ num.get(i)+"  "+ price.get(i)); f = true;}

                }
                if (!f) System.out.println("Нічого не знайдено");
                break;
        }
    }

    public static ArrayList<String> getColor() {
        color.add(sc.nextLine());
        return color;
    }

    public static ArrayList<String> getId_num() {
        id_num.add(sc.nextLine());
        return id_num;
    }

    public static ArrayList<String> getMark() {
        mark.add(sc.nextLine());
        return mark;
    }

    public static ArrayList<String> getPrice() {
        price.add(sc.nextLine());
        return price;
    }

    public static ArrayList<String> getModel() {
        model.add(sc.nextLine());
        return model;
    }

    public static ArrayList<String> getNum() {
        num.add(sc.nextLine());
        return num;
    }

    public static ArrayList<String> getYear() {
        year.add(sc.nextLine());
        return year;
    }
}
