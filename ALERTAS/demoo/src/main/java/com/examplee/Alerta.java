package com.examplee;

public sealed interface Alerta permits Email, Sms {
    
    void enviarAlerta(String mensaje);

    default void VerificarConexion() {
        System.out.println("Verificando conexión...");
    }


}
