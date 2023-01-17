package com.sardeni;

import java.util.*;

public class SetExample {

    Set<String> set = new HashSet<>();

    public void addToSet(int amount) {
        int i = 0;
        do {
            set.add("Элемент "+ i);
            i++;

        }  while(i < amount);
        System.out.println("Добавлено в Set элементов: " + amount);
    }

    public  void searcSetItem(int number) {
        if(!(set.contains("Элемент " + number))) {
            System.out.println("Элемент с номером " + number + " отсутствует");
        } else {
            System.out.println("Элемент c введенным номером: " + number +  " найден");
        }
    }
    public  void deleteSetItem(int number) {

        if(!(set.contains("Элемент " + number))) {
            System.out.println("Элемент с номером " + number + " отсутствует");
        } else {
            System.out.println("Элемент: " + set.contains("Элемент " +number) + " удален");
            set.remove("Элемент " +number);

        }
    }
}