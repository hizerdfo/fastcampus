package org.example;

public class User {
    private String password;

    //패스워드 초기화
    public void initPassword(PasswordGenerator passwordGenerator){
         String Password = passwordGenerator.generatePassword();

        if(Password.length() >= 8 && Password.length() <= 12){
            this.password = Password;
        }
    }

    public String getPassword() {
        return password;
    }

}
