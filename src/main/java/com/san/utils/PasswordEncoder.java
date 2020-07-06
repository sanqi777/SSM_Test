package com.san.utils;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by 三七 on 2020/6/19.
 */
public class PasswordEncoder {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    public static  String  PasswordEncoder(String password){
        return bCryptPasswordEncoder.encode(password);

    }
    public static void main(String[] args) {
        String password = "123";
        String pwd = PasswordEncoder(password);
        //$2a$10$J9G/NwgO46y3vfLkyjp2F.OeMDrpVlhBTCkLJSS16kX5qclZVL91G

        ///$2a$10$Fokdn96JgvDEYMa7bJRjk.zQ8cwZZieEtB7lE/7E.Tc2.a3nXsR2i
       // $2a$10$f.EJIP//L7gxeytd.fn2K.Uf7CICMsXxIc3PCYYL86O.9jhLnEfRm
        //$2a$10$ew9MbrEg50ldUZVhbnKLXunrLL0bkt/Xkoc/INd6Detx6mKLnkNYu
        String pwt = BCrypt.hashpw(password,BCrypt.gensalt());
        boolean cs = BCrypt.checkpw(password,"$2a$10$XGt9P1aWgRnYRn3cOqP0uOAolydyeGzZp4GIZOfBwYxAhNhzahJle");

        // bCryptPasswordEncoder.matches(pwd,"$2a$10$XGt9P1aWgRnYRn3cOqP0uOAolydyeGzZp4GIZOfBwYxAhNhzahJle");
        System.out.println(cs);
        System.out.println(pwd);
    }
}
