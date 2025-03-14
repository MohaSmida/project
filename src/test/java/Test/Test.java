package test;

import Utiles.MyDB;
import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        // Récupération de l'instance de la base de données
        MyDB database = MyDB.getInstance();

        // Vérification de la connexion
        Connection conn = database.getConnection();

        if (conn != null) {
            System.out.println("Test de connexion réussi !");
        } else {
            System.out.println("Échec de la connexion à la base de données.");
        }
    }
}
