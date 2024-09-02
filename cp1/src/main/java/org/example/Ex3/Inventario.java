package org.example.Ex3;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    public static Object criarInventario(){
        HashMap<String, Integer> inventario = new HashMap<>();
        inventario.put("maçã", 3);
        inventario.put("banana", 2);
        inventario.put("laranja", 5);

        return inventario;
    }

    public static void main(String[] args) {
        Object inventario = criarInventario();
        if (inventario instanceof Map){
            Map<?, ?>mapaInventario = (Map<?, ?>) inventario;
            for (Map.Entry<?, ?> entry : mapaInventario.entrySet()) {
                System.out.println("Produto: " + entry.getKey() + ", Quantidade: " + entry.getValue());
            }
            
        }

    }
}
