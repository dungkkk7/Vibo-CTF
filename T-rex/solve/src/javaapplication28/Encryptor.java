/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;



import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encryptor {
    public static String initVector = "JoinSunCyberSec!";
    public static String key = "SunShellSunShell";

    public static String encrypt(String key, String initVector, String value) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(1, (Key)skeySpec, iv);
            byte[] encrypted = cipher.doFinal(value.getBytes());
            return Encryptor.r(Base64.getEncoder().encodeToString(encrypted), 13);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String key, String initVector, String encrypted) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, (Key)skeySpec, iv);
            byte[] original = cipher.doFinal(Base64.getDecoder().decode(encrypted));
            return new String(original);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static String r(String input, int r) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); ++i) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'm') {
                c = (char)(c + r);
            } else if (c >= 'A' && c <= 'M') {
                c = (char)(c + r);
            } else if (c >= 'n' && c <= 'z') {
                c = (char)(c - r);
            } else if (c >= 'N' && c <= 'Z') {
                c = (char)(c - r);
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
             byte[] b = new byte[]{76, 105, 76, 57, 82, 109, 55, 70, 90, 86, 104, 68, 114, 87, 68, 100, 121, 51, 66, 98, 122, 90, 57, 81, 43, 79, 120, 73, 75, 78, 98, 105, 55, 109, 47, 69, 87, 77, 70, 99, 117, 118, 86, 61};
             System.out.println(decrypt(key, initVector,r(new String(b), 13)));

    }
}

