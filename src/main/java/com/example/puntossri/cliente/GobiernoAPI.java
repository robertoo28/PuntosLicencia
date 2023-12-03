package com.example.puntossri.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "Gobierno", url="https://consultaweb.ant.gob.ec/PortalWEB/paginas/clientes" )
public interface GobiernoAPI {


    @GetMapping("/clp_grid_citaciones.jsp")
    String puntos(
            @RequestParam(value = "ps_tipo_identificacion") String tipo,
                  @RequestParam(value = "ps_identificacion") String cedula);
}
