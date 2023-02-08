package ru.school;

public class Main {

    public static void main(String[] args) {
        School newSchool = new School(3400, School.Season.SUMMER);
        School.Season currentSeason = newSchool.season;
        if (currentSeason != School.Season.SUMMER) {
            System.out.printf(
                    "Школа No888, учащихся %d, сейчас %s и мы учимся",
                    newSchool.amount,
                    currentSeason
                    );
        } else {
            System.out.printf(
                    "Школа No888, учащихся %d, сейчас мы отдыхаем",
                    newSchool.amount
            );
        }


    }
}
