package com.company;

public class Main {

    public static void main(String[] args) {

         Computer[] computers = new Computer[5] ; //объявляем массив из 5 элементов
        for (int i = 0; i < computers.length; i++) { //перебираем каждый элемент массива
           computers[i]= new Computer(); //каждому элементу присваиваем новый объект
           computers[i].setPrice(100); //каждому объекту присваиваем цену 100
        }
        double z; // объявляем переменную, к-рая временно содержит в себе текущую цену
        double price = 1.1; //объявляем и инициализиоуем переменную с коэффициентом 1,1(10%)
        for (int i = 0; i < computers.length; i++) { //перебираем каждый элемент массива
            z = computers[i].getPrice(); //переменной z присваиваем текущую цену объекта
            computers[i].setPrice(price*z); //каждому объекту устанавливаем цену * коэффициент(10%)

            computers[i].view();
        }

    }

}
