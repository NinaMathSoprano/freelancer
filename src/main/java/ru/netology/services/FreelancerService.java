package ru.netology.services;

public class FreelancerService {
// создаём метод
    public int calculate(int income, int expense, int threshold ) {
        int money = 0; // количество денег на счету
        int counter = 0; // количество отпусков
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдыхаем
                money -= expense;
                money /= 3;
                // потом количество денег уменьшается ещё на 3
                counter++;
            } else {
                // работаем
                money += income;
                // в переменнную запишется новое значение -количество денег с учётом пополнения
                money -= expense;
                  }

                }
             return counter;
            
        }

    }

