package org.example.practice1;

import org.example.practice1.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword(){
       return "ab";
    }
}
