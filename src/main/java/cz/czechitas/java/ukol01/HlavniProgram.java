package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

// Hlavni program
public class HlavniProgram {
    private Turtle zofka;

    public static void nakresliSlunce(Turtle zofka) {

        for (var i = 0; i < 126; i++) {


            if (i % 21 == 0) {
                zofka.turnLeft(90);
                zofka.move(20);
                zofka.turnLeft(180);
                zofka.move(20);
                zofka.turnLeft(90);
            } else {
                zofka.move(1);
                zofka.turnRight(3);
            }

        }

    }

    public static void nakresliDomecek(Turtle zofka) {


        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnRight(90);
        }

        zofka.move(100);
        zofka.turnRight(45);
        zofka.move(71);
        zofka.turnRight(90);
        zofka.move(71);
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(30);
        zofka.turnLeft(90);
        zofka.penDown();

    }

    public static void nakresliPrasatko(Turtle zofka) {
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnRight(45);
        zofka.move(25);
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnLeft(135);
        zofka.move(50);


        zofka.turnLeft(45);
        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(36);
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(25);
        zofka.turnLeft(135);
        zofka.move(75);

        zofka.turnLeft(135);
        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(36);
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(25);

        zofka.turnLeft(90);
        zofka.move(36);
        zofka.turnRight(90);
        zofka.move(36);

        zofka.turnRight(45);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(60);
        zofka.turnLeft(90);

    }


    public static void pismenoK(Turtle zofka) {


        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(140);
        zofka.move(65);
        zofka.turnRight(180);
        zofka.move(65);
        zofka.turnLeft(80);
        zofka.move(65);
        zofka.turnLeft(50);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);


    }

    public static void pismenoA(Turtle zofka) {


        zofka.turnRight(20);
        zofka.penDown();
        zofka.move(105);
        zofka.turnRight(140);
        zofka.move(60);
        zofka.turnRight(110);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(40);
        zofka.turnRight(70);
        zofka.penDown();
        zofka.move(45);
        zofka.turnLeft(70);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);


    }

    public static void pismenoM(Turtle zofka) {

        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(140);
        zofka.move(50);
        zofka.turnLeft(100);
        zofka.move(50);
        zofka.turnRight(140);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);

    }

    public static void pismenoI(Turtle zofka) {

        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);

    }


    public static void pismenoL(Turtle zofka) {

        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);

    }


    public void start() {
        zofka = new Turtle();

        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();

        nakresliSlunce(zofka);

        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();

        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);
        }

        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(650);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(140);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliPrasatko(zofka);

        zofka.turnRight(90);
        zofka.penUp();
        zofka.move(120);
        zofka.turnLeft(90);
        zofka.penDown();


        nakresliDomecek(zofka);

        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(550);
        zofka.turnRight(90);


        //jmenoKamila


        pismenoK(zofka);

        pismenoA(zofka);

        pismenoM(zofka);

        pismenoI(zofka);

        pismenoL(zofka);

        pismenoA(zofka);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

