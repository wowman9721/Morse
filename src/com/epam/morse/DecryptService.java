package com.epam.morse;

import java.io.*;
import java.util.HashMap;

public class DecryptService {
    private static final HashMap<String, String> decryptMap = new HashMap<String, String>();

    {
        decryptMap.put(".-", "A");
        decryptMap.put("-...", "B");
        decryptMap.put("-.-.", "C");
        decryptMap.put("-..", "D");
        decryptMap.put(".", "E");
        decryptMap.put("..-.", "F");
        decryptMap.put("--.", "G");
        decryptMap.put("....", "H");
        decryptMap.put("..", "I");
        decryptMap.put(".---", "J");
        decryptMap.put("-.-", "K");
        decryptMap.put(".-..", "L");
        decryptMap.put("--", "M");
        decryptMap.put("-.", "N");
        decryptMap.put("---", "O");
        decryptMap.put(".--.", "P");
        decryptMap.put("--.-", "Q");
        decryptMap.put(".-.", "R");
        decryptMap.put("...", "S");
        decryptMap.put("-", "T");
        decryptMap.put("..-", "U");
        decryptMap.put("...-", "V");
        decryptMap.put(".--", "W");
        decryptMap.put("-..-", "X");
        decryptMap.put("-.--", "Y");
        decryptMap.put("--..", "Z");
        decryptMap.put("-----", "0");
        decryptMap.put(".----", "1");
        decryptMap.put("..---", "2");
        decryptMap.put("...--", "3");
        decryptMap.put("....-", "4");
        decryptMap.put(".....", "5");
        decryptMap.put("-....", "6");
        decryptMap.put("--...", "7");
        decryptMap.put("---..", "8");
        decryptMap.put("----.", "9");
        decryptMap.put(".-.-.-", ".");
        decryptMap.put("--..--", ",");
        decryptMap.put("---...", ":");
        decryptMap.put("..--..", "?");
        decryptMap.put(".----.", "\'");
        decryptMap.put("-....-", "-");
        decryptMap.put("-..-.", "/");
        decryptMap.put("-.--.-", "(");
        decryptMap.put("-.--.-", ")");
        decryptMap.put(".--.-.", "@");
        decryptMap.put("-...-", "=");
        decryptMap.put(" ", " ");

    }

    public void decrypt() throws IOException {
        BufferedReader encryptedReader = new BufferedReader(new FileReader("output_morse_encrypted.txt"));
        String encryptedMessage = new String();
        String decryptedMessage = new String();
        while ((encryptedMessage = encryptedReader.readLine()) != null) {
            String splitted[] = encryptedMessage.split(";");


            for (int i = 0; i < splitted.length; i++) {
                if (decryptMap.containsKey(splitted[i])) {
                    decryptedMessage += decryptMap.get(splitted[i]);
                }
            }
        }
        encryptedReader.close();
        BufferedWriter decryptWriter = new BufferedWriter(new FileWriter("output_english_decrypted.txt"));
        decryptWriter.write(decryptedMessage.toLowerCase());
        decryptWriter.close();
        System.out.println("Decrypted message has been written successfully!");
    }

}
