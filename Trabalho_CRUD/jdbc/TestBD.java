package com.poo.jdbc;

import java.sql.Connection;

public class TestBD {

    public static void main(String[] args) {
        Connection con = new ConnectionFactory().getConnection();
        System.out.println("BD conectado.");

    }

}
