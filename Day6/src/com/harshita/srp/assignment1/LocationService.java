package com.harshita.srp.assignment1;

/**
 * Created by marwahh on 7/25/2017.
 */
public class LocationService {
    static String retrieveLocation(String email){
        //20 loc to check with Webservice
        if(email.endsWith("@yahoo.com")) {
            return "USA";
        }else{
            return "Pakistan";
        }
    }

    static boolean checkLocation(String location){
        //20 loc to check in DB
        if(location.equals("USA")) {
            return true;
        }else{
            return false;
        }
    }
}
