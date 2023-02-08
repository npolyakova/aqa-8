package ru.school;

///Создайте класс Школа. Поместите в этот класс информацию о количестве учащихся, а также текущее время года (используя перечисление).
//Каждое время года должно иметь название на русском языке (используйте конструктор).
//В зависимости от времени года, выведите информацию о школе следующим образом:
    //Школа No888, учащихся 666, сейчас зима и мы учимся // или если лето
    //Школа No888, учащихся 666, сейчас мы отдыхаем

public class School {

    int amount;
    Season season;

    public enum Season {
        WINTER("Зима", "Winter"),
        SPRING("Весна", "Spring"),
        SUMMER("Лето", "Summer"),
        AUTUMN("Осень", "Autumn");

        private String name;
        private String engName;

        Season(String name, String engName) {
            this.name = name;
            this.engName = engName;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public School(int amount, Season s) {
        this.amount = amount;
        this.season = s;
    }
}
