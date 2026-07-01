package com.examplee;

public non-sealed class Sms implements Alerta {
    
    @Override
    public void enviarAlerta(String mensaje) {
    System.out.println
    ("Enviando alerta por SMS: " + mensaje);
    }
    
    @Override
    public void VerificarConexion() {
        System.out.println("Verificando conexión al servidor de SMS...");
    }
}
