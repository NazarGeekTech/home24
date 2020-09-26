package com.company;

public class Main {

    public static void main(String[] args) {
        Runner runner1 = new Runner("Runner1");
        Runner runner2 = new Runner("Runner2");
        Runner runner3 = new Runner("Runner3");
        Runner runner4 = new Runner("Runner4");
        Runner runner5 = new Runner("Runner5");


        runner1.setRunnerFS(runner5, runner2);
        runner2.setRunnerFS(runner1, runner3);
        runner3.setRunnerFS(runner2, runner4);
        runner4.setRunnerFS(runner3, runner5);
        runner5.setRunnerFS(runner4, runner1);


        runner1.start();



    }
}
/* (Дэдлайн 24.09.2020 18:59)
a)  Написать многопоточное приложение передачи эстафетной палочки бегунами друг другу. Всего должно быть 5 бегунов.
b)  Каждый бегун является самостоятельным потоком, созданным на основе вашего класса Runner. Всего должен быть только 1 класс поток не более.
c)  Потоки запускаются по цепной реакции. То есть с Main класса запустили поток под названием “Runner 1”, в раннер 1 запускается поток “Runner 2” и т.д.
d)  Вывод программы в консоле должен выглядеть именно так (примечание симулируете бег задержкой потока в 5 секунд):
Runner 1 берет палочку
*/
