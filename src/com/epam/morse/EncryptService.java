package com.epam.morse;

import java.io.*;
import java.util.HashMap;

public class EncryptService {
    private static final HashMap<Character, String> map = new HashMap<Character, String>();

    {
        map.put('A', ".-");
        map.put('B', "-...");
        map.put('C', "-.-.");
        map.put('D', "-..");
        map.put('E', ".");
        map.put('F', "..-.");
        map.put('G', "--.");
        map.put('H', "....");
        map.put('I', "..");
        map.put('J', ".---");
        map.put('K', "-.-");
        map.put('L', ".-..");
        map.put('M', "--");
        map.put('N', "-.");
        map.put('O', "---");
        map.put('P', ".--.");
        map.put('Q', "--.-");
        map.put('R', ".-.");
        map.put('S', "...");
        map.put('T', "-");
        map.put('U', "..-");
        map.put('V', "...-");
        map.put('W', ".--");
        map.put('X', "-..-");
        map.put('Y', "-.--");
        map.put('Z', "--..");
        map.put('0', "-----");
        map.put('1', ".----");
        map.put('2', "..---");
        map.put('3', "...--");
        map.put('4', "....-");
        map.put('5', ".....");
        map.put('6', "-....");
        map.put('7', "--...");
        map.put('8', "---..");
        map.put('9', "----.");
        map.put('.', ".-.-.-");
        map.put(',', "--..--");
        map.put(':', "---...");
        map.put('?', "..--..");
        map.put('\'', ".----.");
        map.put('-', "-....-");
        map.put('/', "-..-.");
        map.put('(', "-.--.-");
        map.put(')', "-.--.-");
        map.put('"', ".-..-.");
        map.put('@', ".--.-.");
        map.put('=', "-...-");
        map.put(' ', " ");
    }

    public void encrypt() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input_english.txt"));
        String message = new String();
        String result = new String();
        while ((message = reader.readLine()) != null) {
            for (char chars : message.toUpperCase().toCharArray()) {
                if (map.containsKey(chars)) {
                    result += map.get(chars).concat(";");
                }
            }
        }
        reader.close();
        BufferedWriter writer = new BufferedWriter(new FileWriter("output_morse_encrypted.txt"));
        writer.write(result);
        writer.close();
        System.out.println("Result has been written!");


    }

}
