package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Cars {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> id_num = new ArrayList<String>();
    private static ArrayList<String> mark = new ArrayList<String>();
    private static ArrayList<String> model = new ArrayList<String>();
    private static ArrayList<String> year = new ArrayList<String>();
    private static ArrayList<String> color = new ArrayList<String>();
    private static ArrayList<String> num = new ArrayList<String>();
    private static ArrayList<String> price = new ArrayList<String>();
    private static Logger log = Logger.getLogger(Cars.class.getSimpleName());


    public static void main(String[] args) {

        int k = 0;
        int t = 0;
        System.out.print("Крицький Ілля Юрійович ІПЗ-33 ");
        System.out.print("\nКількість автомобілів: ");
        try {
            k = sc.nextInt(); }catch (Exception e) {System.out.print(e+" Введіть ще раз: ");log.error(e); sc.next(); k = sc.nextInt();}
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
        try {
            t = sc.nextInt(); } catch (Exception e) {System.out.print(e+" Введіть ще раз: "); log.error(e);sc.next(); t = sc.nextInt();}
        String s1 = "";
        String s2 = "";
        boolean f = false;
        switch (t) {
            case 1:
                log.info("1");
                System.out.print("Введіть марку: ");
                try {
                    s1 = sc.nextLine();
                    s1 = sc.nextLine(); } catch (Exception e) {System.out.println(e); log.error(e);s1 = sc.nextLine();}
                for (int i = 0; i<k; i++) {
                    try {
                        if (mark.get(i).equals(s1)) {System.out.println(id_num.get(i)+"  "+ mark.get(i)+ "  "+ model.get(i) + "  "+ year.get(i)+"  "+ color.get(i)+"  "+ num.get(i)+"  "+ price.get(i)); f = true;} } catch (Exception e) {log.error(e);System.out.println(e);}

                }
                if (!f) System.out.println("Нічого не знайдено");
                break;
            case 2:
                log.info("2");
                System.out.print("Введіть модель: ");
                try {
                    s1 = sc.nextLine();
                    s1 = sc.nextLine(); } catch (Exception e) {System.out.print(" Введіть ще раз: ");log.error(e);}
                System.out.print("Введіть кількість років: ");
                s2 = sc.nextLine();
                for (int i = 0; i<k; i++) {
                    try {
                        if (model.get(i).equals(s1) && (2018-Integer.parseInt(year.get(i))) > Integer.parseInt(s2)) {System.out.println(id_num.get(i)+"  "+ mark.get(i)+ "  "+ model.get(i) + "  "+ year.get(i)+"  "+ color.get(i)+"  "+ num.get(i)+"  "+ price.get(i)); f = true;} } catch (Exception e) {log.error(e);System.out.println(e);}

                }
                if (!f) System.out.println("Нічого не знайдено");
                break;
            case 3:
                log.info("3");
                System.out.print("Введіть рік: ");
                try {
                    s1 = sc.nextLine();
                    s1 = sc.nextLine(); } catch (Exception e) {log.error(e);System.out.println(e);}
                System.out.print("Введіть ціну: ");
                s2  = sc.nextLine();
                for (int i = 0; i<k; i++) {
                    try {
                        if (Integer.parseInt(year.get(i)) == Integer.parseInt(s1) && Integer.parseInt(price.get(i)) > Integer.parseInt(s2)) {System.out.println(id_num.get(i)+"  "+ mark.get(i)+ "  "+ model.get(i) + "  "+ year.get(i)+"  "+ color.get(i)+"  "+ num.get(i)+"  "+ price.get(i)); f = true;}} catch (Exception e) {log.error(e);System.out.println(e);}

                }
                if (!f) System.out.println("Нічого не знайдено");
                break;
        }
    }

    public static ArrayList<String> getColor() {
        try {
            color.add(sc.nextLine()); } catch (Exception e) {System.out.println(e); System.out.print(e+" Введіть ще раз: "); sc.next();color.add(sc.nextLine());}
        log.info("GetColor"+ " "+color.size());
        return color;
    }

    public static ArrayList<String> getId_num() {
        try {
            id_num.add(sc.nextLine()); } catch (Exception e) {System.out.println(e); System.out.print(e+" Введіть ще раз: "); sc.next();id_num.add(sc.nextLine());}
        log.info("getId_num"+ " "+id_num.size());
        return id_num;
    }

    public static ArrayList<String> getMark() {
        try {
            mark.add(sc.nextLine()); } catch (Exception e) {System.out.println(e); System.out.print(e+" Введіть ще раз: "); sc.next();mark.add(sc.nextLine());}
        log.info("getMark"+ " "+mark.size());
        return mark;
    }

    public static ArrayList<String> getPrice() {
        try {
            price.add(sc.nextLine());} catch (Exception e) {System.out.println(e); System.out.print(e+" Введіть ще раз: "); sc.next();price.add(sc.nextLine());}
        log.info("getPrice"+ " "+price.size());
        return price;
    }

    public static ArrayList<String> getModel() {
        try {
            model.add(sc.nextLine());} catch (Exception e) {System.out.println(e); System.out.print(e+" Введіть ще раз: "); sc.next();model.add(sc.nextLine());}
        log.info("getModel"+ " "+model.size());
        return model;
    }

    public static ArrayList<String> getNum() {
        try {
            num.add(sc.nextLine());} catch (Exception e) {System.out.println(e); System.out.print(e+" Введіть ще раз: "); sc.next();num.add(sc.nextLine());}
        log.info("getNum"+ " "+num.size());
        return num;
    }

    public static ArrayList<String> getYear() {
        try {
            year.add(sc.nextLine());} catch (Exception e) {System.out.println(e); System.out.print(e+" Введіть ще раз: "); sc.next();year.add(sc.nextLine());}
        log.info("getYear" + " "+year.size());
        return year;
    }
}
