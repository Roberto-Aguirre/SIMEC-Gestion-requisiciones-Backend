package com.simec.requisiciones.utils;

import org.springframework.stereotype.Component;

@Component
public class IsActiveUtil {

    public String isActive(Integer valor) {
        String retorno = "";
        switch (valor) {
            case 0:
                retorno = "No activo";
                break;
            case 1:
                retorno = "Activo";
                break;
            default:
                retorno = "Valor no valido";
                break;
        }
        return retorno;
    }
}
