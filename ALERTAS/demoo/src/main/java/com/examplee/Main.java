package com.examplee;

public class Main {
    public static void main(String[] args) {

        Alerta alertaEmail = new Email();
        Alerta alertaSms = new Sms();
        

        Alerta[]  alertas = {alertaEmail, alertaSms};

        ManejorEnvios notificador = new ManejorEnvios();
        notificador.agregarNotificacion(alertaEmail);
        notificador.agregarNotificacion(alertaSms);

        notificador.enviarNotificaciones();
            
    }
}