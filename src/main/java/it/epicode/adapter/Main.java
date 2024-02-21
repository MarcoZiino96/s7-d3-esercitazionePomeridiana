package it.epicode.adapter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Info info = new Info("Marco", "Ziino", LocalDate.of(1996,7,16));

        AdapterInfo adapterInfo = new AdapterInfo(info);

        UserData userData = new UserData(adapterInfo);

        System.out.println(userData);
    }
}
