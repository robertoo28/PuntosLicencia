package com.example.puntossri.controlador;

import com.example.puntossri.cliente.GobiernoAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")

public class PuntosControlador {

    @Autowired
    private GobiernoAPI Gobierno;


    @GetMapping ("/prueba")
    public String puntos (@RequestParam String ps_tipo_identificacion,
                         @RequestParam String ps_identificacion) {
        String p = Gobierno.puntos(ps_tipo_identificacion, ps_identificacion);
        String patternString = "href=\"javascript:consulta_puntos\\(\\);\" title=\"Información adicional de Puntos\">(\\d+)</a></td>";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(p);
        while (matcher.find()) {
            return matcher.group(1);

        }
        return "No se ha encontrado";




    }



}
