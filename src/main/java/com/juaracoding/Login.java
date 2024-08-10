package com.juaracoding;

public class Login {

    public boolean isLogin(String username, String password) {
        if (username.equals("admin") && password.equals("p4ssword")) {
            return true;
        } else {
            return false;
        }
    }

    //return value String
    //buatkan fungsi pesan berhasil login jika true, invalid login jika false
    public String messageLogin(boolean isLogin){
        return isLogin ? "Berhasil login" : "Invalid login";
    }
}