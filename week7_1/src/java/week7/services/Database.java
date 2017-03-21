/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.services;

import week7.models.*;
import java.io.FileReader;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;

/**
 *
 * @author Jose Julio Mancha Hernandez 007 1727375
 */
public class Database {

    private static JSONObject getJsonObject() {

        try {
            String rutaJson = getPathDatabase();
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(rutaJson));

            JSONObject jsonObject = (JSONObject) obj;

            return jsonObject;
        } catch (IOException ioext) {
            return null;
        } catch (ParseException pext) {
            return null;
        }
    }

    private static boolean setJsonObject(String nameDB, String lastNameDB, String usernameDB, String passwordDB) {
        JSONObject obj = new JSONObject();

        //Solo guarda un valor
        obj.put("Name", nameDB);
        obj.put("LastName", lastNameDB);
        obj.put("Username", usernameDB);
        obj.put("Password", passwordDB);
        String rutaJson1 = getPathDatabase(); //llamada a método anterior

        try (FileWriter file = new FileWriter(rutaJson1)) {
            file.write(obj.toJSONString());

            return true;
        } catch (IOException ioext) {
            return false;
        }
    }

    private static String getPathDatabase() {
        return "C:\\Users\\moust\\OneDrive\\Documentos\\NetBeansProjects\\week7_1\\src\\java\\Source Packages\\json.json";
    }

    public static boolean setUser(String name, String lastName, String username, String password) {

        boolean isSetup = setJsonObject(name, lastName, username, password);

        return isSetup;
    }

    public static User getUserByUsernamePassword(String username, String password) {
        User user;

        JSONObject jsonObject = getJsonObject(); //Llamáda a método

        if (jsonObject != null) {
            String usernameDB = (String) jsonObject.get("Username");
            String passwordDB = (String) jsonObject.get("Paswword");
            String nameDB = (String) jsonObject.get("Name");
            String lastNameDB = (String) jsonObject.get("LastName");
            //Validar password y usuario
            //passwordDb no existe en este contexto. Usar el ejemplo de propiedadDb
            if (username.equals(usernameDB) && password.equals(passwordDB)) {
                user = new User(nameDB, lastNameDB, usernameDB, passwordDB); //Completar con propiedades para construir objeto

            } else {
                user = null;
            }

            return user;
        } else {
            return null;
        }
    }

    public static User getUserByUsername(String username) {
        User user;

        JSONObject jsonObject = getJsonObject(); //llama a método anterior

        if (jsonObject != null) {
            String usernameDB = (String) jsonObject.get("Username");
            String passwordDB = (String) jsonObject.get("Password");
            String nameDB = (String) jsonObject.get("Name");
            String lastNameDB = (String) jsonObject.get("LastName");

            //Valida si el usuario que se pide es igual al que se encuentra
            //en el archivo JSON
            if (username.equals(nameDB)) {
                user = new User(nameDB, lastNameDB, usernameDB, passwordDB); //Completar con todas las propiedades del usuario
            } else {
                user = null;
            }

            return user;
        } else {
            return null;
        }
    }

    public static String getUsername() {
        JSONObject jsonObject = getJsonObject();
        String usernameDB = (String) jsonObject.get("Username");
        return usernameDB;
    }

    public static String getPassword() {
        JSONObject jsonObject = getJsonObject();
        String passwordDB = (String) jsonObject.get("Password");
        return passwordDB;
    }

    public static String getName() {
        JSONObject jsonObject = getJsonObject();
        String nameDB = (String) jsonObject.get("Name");
        return nameDB;
    }

    public static String getLastName() {
        JSONObject jsonObject = getJsonObject();
        String lastNameDB = (String) jsonObject.get("LastName");
        return lastNameDB;
    }
}
