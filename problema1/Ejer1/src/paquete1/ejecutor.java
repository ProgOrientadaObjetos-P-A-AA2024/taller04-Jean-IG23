package paquete1;

import problema1.libretaNotas;

public class ejecutor {
    public static void main(String[] args) {
        libretaNotas libreta1= new libretaNotas("Jean", 10, 10, 9);
        libreta1.calcularPromedio();
        libretaNotas libreta2= new libretaNotas("Carlos", 5, 5);
        libreta2.calcularPromedio();

        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
    }
}
