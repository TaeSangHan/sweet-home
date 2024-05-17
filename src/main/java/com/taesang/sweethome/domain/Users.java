package com.taesang.sweethome.domain;
import java.sql.Timestamp;

public class Users {
    private String userId; // Assuming VARCHAR2 translates to String
    private String password;
    private int phoneNo; // Assuming INTEGER translates to int
    private String email;
    private String address;
    private int point;
    private String userType;
    private Timestamp lastLogin;
    private Timestamp createdTime;
}
