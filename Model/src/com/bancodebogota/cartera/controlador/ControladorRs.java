package com.bancodebogota.cartera.controlador;

import javax.ejb.Remote;

import salidas.Respuesta;

@Remote
public interface ControladorRs {
    Respuesta metodoPrueba(String uno, String dos);
}
