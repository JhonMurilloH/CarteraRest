package com.bancodebogota.cartera.controlador;

import javax.ejb.Stateless;

import javax.ws.rs.core.Response;

import salidas.Respuesta;

@Stateless(name = "ControladorRsBean", mappedName = "controladorRest")
public class ControladorRsBean implements ControladorRs {
    public ControladorRsBean() {
        super();
    }


    @Override
    public Respuesta metodoPrueba(String uno, String dos) {
        Respuesta resp = new Respuesta();
        resp.setCodigo("1");
        resp.setDescripcion("hola prueba - " + uno + " - " + dos);
        System.out.println("hola desde CONTROLADOR - " + resp.getDescripcion());
        return resp;
    }
}
