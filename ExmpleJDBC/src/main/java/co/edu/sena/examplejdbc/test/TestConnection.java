/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejdbc.test;

import co.edu.sena.examplejdbc.bd.BDConnection;

/**
 *
 * @author Nicol
 */
public class TestConnection {
    public static void main(String[] args) {
        BDConnection connection = new BDConnection();
        connection.connect();
        connection.disconnect();
    }
}
