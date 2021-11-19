package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {


        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите имя: ");
                String name = scanner.next();
                if (!name.matches("[a-zA-Za-яА-Я]*")  ) {
                    throw new MyException("Имя вводится буквами.");

                }
                System.out.println("Введите фамилию:");
                String surname = scanner.next();
                if (!surname.matches("[a-zA-Za-яА-Я]*")) {
                    throw new MyException("Фамилия вводится бкувами.");
                }
                System.out.println("Год рождения");
                int yearOfBirth = scanner.nextInt();

                System.out.println("Год принятия на работу");
                int startWork= scanner.nextInt();
                LocalDate data=LocalDate.now();

                if (( startWork- yearOfBirth) > 18) {
                    System.out.println("Стаж работы: " + ( data.getYear()- startWork));
                } else {
                    System.out.println("Возраст не позволяет работать.");
                }
                SurnameAndName(name, surname);
                Year(yearOfBirth, startWork);
                break;

            } catch (InputMismatchException e) {
                System.err.println("Дату нужно ввести цифрами");


            } catch (Exception e) {

                System.err.println(e.getMessage());

            }
        }
    }
    public static void SurnameAndName(String name,String surname){
        System.out.println("Имя: "+name+"\n"+"Фамилия: "+surname);
    }
    public static void Year(int yearOfBirth,int startWork){
        System.out.println("Год рождения: "+yearOfBirth+"\n"+"Год принятия на работу: "+startWork);
    }
}
