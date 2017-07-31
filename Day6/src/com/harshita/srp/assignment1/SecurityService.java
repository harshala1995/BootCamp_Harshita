package com.harshita.srp.assignment1;

public class SecurityService {
    static boolean checkPermission(String user) {
        //20 loc to check in DB
        if (user.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}