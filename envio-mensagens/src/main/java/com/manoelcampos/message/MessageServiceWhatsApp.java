package com.manoelcampos.message;

public class MessageServiceWhatsApp implements MessageService{

    @Override
    public void send(String destination, String msg) throws MessageSendException {
        System.out.printf("Enviando msg WhatsApp para %s: %s%n", destination, msg);
    }
}
