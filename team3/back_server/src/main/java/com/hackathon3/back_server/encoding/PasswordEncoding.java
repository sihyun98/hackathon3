package com.hackathon3.back_server.encoding;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class PasswordEncoding {

	public static String getSha512(String pwd) {
        String encPwd = "";

        try {
            // SHA-512 내장 메소드 사용
            // 어떤식으로 암호화 처리 되는지는 알 수 없음
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] bytes = pwd.getBytes(Charset.forName("UTF-8"));
            md.update(bytes); // 암호화 처리된 게 bytes 안에 있음

            // 암호화 처리 된것을 문자열로 바꾸기
            encPwd = Base64.getEncoder().encodeToString(md.digest());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return encPwd;
    }
	
}
