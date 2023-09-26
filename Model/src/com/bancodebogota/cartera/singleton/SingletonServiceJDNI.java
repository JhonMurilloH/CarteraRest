package com.bancodebogota.cartera.singleton;

import com.bancodebogota.cartera.controlador.ControladorRs;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;


public class SingletonServiceJDNI {
    private static SingletonServiceJDNI singletonServiceJDNI = null;
    private ControladorRs controlador;
    
    public static synchronized SingletonServiceJDNI getInstance() throws Exception {
        if(singletonServiceJDNI == null){
            singletonServiceJDNI = new SingletonServiceJDNI();
        }
        return singletonServiceJDNI;
    }
    
    protected SingletonServiceJDNI() throws Exception {
        contextoControlador();
    }
    
    private void contextoControlador() throws Exception {
        try {
            Hashtable env = new Hashtable();
            final Context context = new InitialContext(env);
            controlador = (ControladorRs) context.lookup("controladorRest#com.bancodebogota.cartera.controlador.ControladorRs");
        } catch(Exception e){
            System.out.println("Error Técnico; Error contextualizando CONTROLADORrs ");
            e.printStackTrace();
        }
    }

    public ControladorRs getControlador() {
        return controlador;
    }
}
