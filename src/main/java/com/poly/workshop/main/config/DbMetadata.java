/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.workshop.main.config;

/**
 *
 * @author HangNT169
 */
public final class DbMetadata {

    /// Phần có thể sửa 
    // =======>
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "Password.1";
    private static final String SERVER = "localhost";
    private static final String PORT = "1433";
    private static final String DATABASE_NAME = "PRO1041_WORKSHOP_DEMO";
    // Trường hợp báo lỗi SSL thì để là true
    private static final boolean USING_SSL = true;
    // <=========
    /// Hết phần có thể sửa

    /// Không sửa những phần dưới này
    private static final String CONNECT_STRING;

    static {
        StringBuilder connectStringBuilder = new StringBuilder();
        connectStringBuilder.append("jdbc:sqlserver://")
                .append(SERVER).append(":").append(PORT).append(";")
                .append("databaseName=").append(DATABASE_NAME).append(";")
                .append("user=").append(USERNAME).append(";")
                .append("password=").append(PASSWORD).append(";");
        if (USING_SSL) {
            connectStringBuilder.append("encrypt=true;trustServerCertificate=true;");
        }
        CONNECT_STRING = connectStringBuilder.toString();
    }

    public static String getConnectString() {
        System.out.println(CONNECT_STRING);
        return CONNECT_STRING;
    }
}
