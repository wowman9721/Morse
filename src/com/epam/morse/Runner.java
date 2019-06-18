package com.epam.morse;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {
        EncryptService service = new EncryptService();
        service.encrypt();
        DecryptService decryptService = new DecryptService();
        decryptService.decrypt();
    }
}
