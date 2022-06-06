package com.manoelcampos.message;

public class MessageServiceSms implements MessageService{
    @Override
    public void send(String destination, String msg) throws MessageSendException {
        System.out.printf("Enviando mensagem por SMS para %s: %s%n", destination, msg);
    }
}
