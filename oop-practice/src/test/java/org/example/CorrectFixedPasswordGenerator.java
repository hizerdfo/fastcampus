package org.example;

public class CorrectFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword(){
       return "abcdefgh"; //8글자를 생성해주는(올바른) 패스워드 생성
    }
}
