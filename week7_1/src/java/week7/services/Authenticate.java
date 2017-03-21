/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.services;

import week7.models.*;
import week7.services.*;

/**
 *
 * @author Jose JUlio Mancha Hernandez 007 1727375
 */
public class Authenticate {

    public static boolean isValid(String username, String password) {
        User user = new User();

        //username.equals(userDataBase) realiza una comparación entre las cadenas username y userDataBase
        //Si son iguales devuelve true. Si son diferentes devuelve false.
        if (username.equals(Database.getUsername()) && password.equals(Database.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}
