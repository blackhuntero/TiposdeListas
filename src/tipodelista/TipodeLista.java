/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodelista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mega_
 */
public class TipodeLista {

    /**
     * @param args the command line arguments
     */
    public  TipodeLista(){
        
        principal();
    }
    
    public void principal(){
    
        List<Datos> lista = new ArrayList<>();
        Datos datos = new Datos();
        
        datos.setNombre("Miguel");
        datos.setEdad(20);
        
        lista.add(datos);
        
        datos = new Datos();
        
        datos.setNombre("Adol");
        datos.setEdad(18);
        
        lista.add(datos);
        datos = new Datos();
        
        datos.setNombre("Joshua");
        datos.setEdad(25);
        lista.add(datos);
        datos = new Datos();
        
        lista.forEach(elementos ->{
            
            System.out.println("Nombre"+ elementos.getNombre());
            System.out.println("Edad"+ elementos.getEdad());
            
        });
        
        System.out.println("\n\nOtra forma de recorrer los datos");
        
        for(Datos contenido : lista){
            System.out.println("Nombre" + contenido.getNombre());
            System.out.println("Edad"+ contenido.getEdad());
        }
        
        datos = new Datos();
        datos.setNombre("Jonatan");
        datos.setEdad(15);
        
        lista.add(datos);
        
        System.out.println("\n\nTercera forma de ordenar");
        lista.stream().forEach(valores -> {
            System.out.println("Nombre "+ valores.getNombre() );
            System.out.println("Edad" + valores.getEdad());;
            
            if(valores.getNombre().equals("Adol")){
                System.out.println("Se encontro el dato");
            }
        });
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new TipodeLista();
    }
    
}
