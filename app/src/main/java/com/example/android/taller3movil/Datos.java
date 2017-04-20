package com.example.android.taller3movil;

import java.util.ArrayList;

/**
 * Created by Android on 21/04/2017.
 */

public class Datos {

    static ArrayList<Areas> area = new ArrayList<>();

    public static void guardar(Areas a){ area.add(a); }

    public static ArrayList<Areas> getArea() { return area; }
}
