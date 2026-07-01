package com.examplee;

public class ManejorEnvios {
    
    private Alerta[] alertas = new Alerta[2];
    private int contador = 0;

    void agregarNotificacion(Alerta alerta) {
        for (int i = 0; i < alertas.length; i++) {
            if (contador < alertas.length) {
            alertas[contador] = alerta;
            contador++;
            } else {
                Alerta radioAlerta = new Email() {
                    @Override
                    public void enviarAlerta(String mensaje) {
                     VerificarConexion();
                     System.out.println
                     ("Arreglo saturado, no se puede enviar el siguiente mensaje: " + mensaje);                    }
                };
                radioAlerta.enviarAlerta("Alerta de radio!");
            }  
        }    
    }
    
    

    void enviarNotificaciones(){
        for (Alerta alerta : alertas) {
            alerta.enviarAlerta("Alerta de prueba!");
            }
     }

}

