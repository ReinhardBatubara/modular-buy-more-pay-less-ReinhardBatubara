// 12S22012 - Reinhard Batubara
// 12S22039 - Meilyna S.A. Hutajulu

import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn;
        double harga;
        int eksemplar;
        boolean exist;
        boolean indexFound;
        int y;
        double harga1;
        int nBuku;
        
        nBuku = 3;
        String[] arrayIsbn = new String[nBuku];
        double[] arrayharga = new double[nBuku];
        int[] arrayeksemplar = new int[nBuku];
        int x;
        int arrayeksemplar1;
        double arrayharga1;
        
        decleare(arrayharga, arrayeksemplar, arrayIsbn);
        double totalharga;
        
        totalharga = 0;
        boolean var_continue;
        
        var_continue = true;
        while (var_continue) {
            isbn = input.nextLine();
            if (!isbn.equals("---")) {
                harga = Double.parseDouble(input.nextLine());
                eksemplar = Integer.parseInt(input.nextLine());
                exist = false;
                x = 0;
                do {
                    if (arrayIsbn[x].equals(isbn)) {
                        arrayeksemplar[x] = arrayeksemplar[x] + eksemplar;
                        exist = true;
                    } else {
                        x = x + 1;
                    }
                } while (!exist && x < nBuku);
                if (!exist) {
                    indexFound = false;
                    y = 0;
                    do {
                        if (arrayeksemplar[y] == 0) {
                            indexFound = true;
                        } else {
                            y = y + 1;
                        }
                    } while (!indexFound && y < nBuku);
                    arrayIsbn[y] = isbn;
                    arrayharga[y] = harga;
                    arrayeksemplar[y] = eksemplar;
                    y = y + 1;
                }
            } else {
                var_continue = false;
            }
        }
        for (x = 0; x <= nBuku - 1; x++) {
            harga1 = arrayharga[x];
            arrayharga1 = arrayharga[x];
            arrayeksemplar1 = arrayeksemplar[x];
            harga(harga1, arrayharga1, arrayeksemplar1);
            double harga2;
            
            harga2 = harga(harga1, arrayharga1, arrayeksemplar1);
            arrayharga1 = arrayharga[x];
            arrayeksemplar1 = arrayeksemplar[x];
            totalharga = totalharga + harga2;
        }
        keluaran(totalharga);
    }
    
    public static void decleare(double[] arrayharga, int[] arrayeksemplar, String[] arrayIsbn) {
        int nBuku, x;
        
        nBuku = 3;
        for (x = 0; x <= nBuku - 1; x++) {
            arrayIsbn[x] = "0";
            arrayharga[x] = 0.0;
            arrayeksemplar[x] = 0;
        }
    }
    
    public static double harga(double harga2, double arrayharga1, int arrayeksemplar1) {
        double harga;
        
        if (arrayeksemplar1 >= 20) {
            harga2 = arrayharga1 * arrayeksemplar1 - arrayharga1 * arrayeksemplar1 * 0.12;
        } else {
            if (arrayeksemplar1 >= 10) {
                harga2 = arrayharga1 * arrayeksemplar1 - arrayharga1 * arrayeksemplar1 * 0.05;
            } else {
                if (arrayeksemplar1 >= 5) {
                    harga2 = arrayharga1 * arrayeksemplar1 - arrayharga1 * arrayeksemplar1 * 0.02;
                } else {
                    harga2 = arrayharga1 * arrayeksemplar1;
                }
            }
        }
        
        return harga2;
    }
    
    public static void keluaran(double totalharga) {
        System.out.println(toFixed(totalharga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
