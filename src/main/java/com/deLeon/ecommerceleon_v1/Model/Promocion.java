/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deLeon.ecommerceleon_v1.Model;

import java.util.Date;
import lombok.Data;

/**
 * @author Dario
 * @author Luciano
 * @author Gaston
 */
@Data
public class Promocion {
    private int id_promo;
    private String nombre;
    private double descuento;
    private Date fechadesde;
    private Date fechahasta;
}
