/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deLeon.ecommerceleon_v1.Model;
import lombok.Data;

/**
 * @author Dario
 * @author Luciano
 * @author Gaston
 */
@Data
public class DetallePedido {
    private int id_pedido;
    private int id_producto;
    private int cantidad;
    private Double precio;
}