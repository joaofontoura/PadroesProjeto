package com.manoelcampos.message;

public class MessageServiceEmail implements MessageService{
    @Override
    public void send(String destination, String msg) throws MessageSendException {
        System.out.printf("Enviando E-mail para %s: %s%n", destination, msg);
    }
}
