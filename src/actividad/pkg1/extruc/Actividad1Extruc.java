
package actividad.pkg1.extruc;

import java.util.ArrayList;
import java.util.Deque; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;


public class Actividad1Extruc {

  
    public static void main(String[] args) {
        
        
             System.out.println("   ");
            System.out.println("-----------------Primer punto-----------------");
            
            
        System.out.println("   ");
        System.out.println("   ");
        System.out.println("////////DECLARACION DE ARREGLOS CON LAS DISTINTAS VARIABLES\\\\\\\\\\\\");
        
        System.out.println("Tipo Int------------------------------------------");
        
      int[] casillas = {1,5,3,1,7};
            for(int i = 0;i<5; i++){
                System.out.println(casillas[i]);
            }
            
            System.out.println("Tipo Byte---------------------------------------------");
            
            byte[] casi = {4,7,3,1,7};
            for(byte i = 0;i<5; i++){
                System.out.println(casi[i]);
            }
            
            System.out.println("Tipo Short----------------------------------------");
            
            short[] llas = {6,3,3,9,0};
            for(short i = 0;i<5; i++){
                System.out.println(llas[i]);
            }
            
            System.out.println("Tipo Long----------------------------------------");
            
            long[] las = {2,5,3,9,9};
            for(int i = 0;i<5; i++){
                System.out.println(las[i]);
            }
            
             System.out.println("Tipo Double----------------------------------------");
            
            double[] ca = {1.4,5.3,0.5,9.1,24.2};
            for(int i = 0;i<5; i++){
                System.out.println(ca[i]);
            }
            
             System.out.println("   ");
            System.out.println("///////ARREGLO DATASTRUCT CON LISTAS\\\\\\\\\\\\");
            
                List<dataStruct> lista = new ArrayList<dataStruct> ();
                lista.add(new dataStruct("-manolo"));
                lista.add(new dataStruct("-paco"));
                lista.add(new dataStruct("-martin"));
                lista.add(new dataStruct("-mani"));
                lista.add(new dataStruct("-goku"));
                
                for (int i =0; i<lista.size(); i++){
                    System.out.println(""+ lista.get(i).getNombres());
                }
                //String[] dataStruct = new String[5];
                
                
                System.out.println("   ");
            System.out.println("///////ARREGLO DATASTRUCT CON LISTAS enlazadas\\\\\\\\\\\\");
            
            Nodo primer = new Nodo("macaco");
            Nodo segundo = new Nodo("tulio");
            Nodo tercero = new Nodo("carrio");
            Nodo cuarto = new Nodo("paco");

            primer.enlazarSig(segundo);
            segundo.enlazarSig(tercero);
             tercero.enlazarSig(cuarto);
            
            System.out.println("[" + primer.getNombre() + ", " + segundo.getNombre() + ", " + tercero.getNombre() + ", " + cuarto.getNombre() + "]");

            
            System.out.println("   ");
            System.out.println("///////ARREGLO DATASTRUCT CON LISTAS circulares\\\\\\\\\\\\");
           
            listaCircular p = new listaCircular();
            
            p.ingresarN(22);
            p.ingresarN(33);
            p.ingresarN(15);
            p.ingresarN(55);
            p.ingresarN(59);
            
            p.mostrarlis();
            
 
                 System.out.println("   ");
                System.out.println("///////ARREGLO DATASTRUCT CON PILAS\\\\\\\\\\\\");
                
                Stack<dataStruct> pila = new Stack<>();
                System.out.println("pila vacia: " + pila.isEmpty());
                
                    dataStruct a = new dataStruct("-Maxi");
                    dataStruct b = new dataStruct("-Majin");
                    dataStruct c = new dataStruct("-Gohan");
                    dataStruct d = new dataStruct("-Morales");
                    dataStruct f = new dataStruct("-Dimadone");
                    
                    
                    pila.push(a);
                    pila.push(b);
                    pila.push(c);
                    pila.push(d);
                    pila.push(f);
                    
                        
                    System.out.println("Elementos de la pila: ");
                        for (dataStruct pil : pila){
                            System.out.println(pil.nombres);
                        }
                        
                        System.out.println("La pila esta vacia?: "+ pila.isEmpty());
                        System.out.println("Primer dato en entrar y ultimo en salir: " + pila.peek().toString());
                        
                        pila.pop();
                        System.out.println("Ultimo dato en entrar y primero en salir: " + (a));
                        
                        
                        System.out.println("   ");
               System.out.println("///////ARREGLO DATASTRUCT CON COLAS\\\\\\\\\\\\");
               
                
                Queue<dataStruct> cola = new LinkedList<>();
                System.out.println("Cola vacia: " + cola.isEmpty()); 
            
                dataStruct h = new dataStruct("-Dabura");
                dataStruct r = new dataStruct("-Babidi");
                dataStruct t = new dataStruct("-tato");
                dataStruct j = new dataStruct("-Lola");
                dataStruct y = new dataStruct("-Capo");
                     
                 cola.add(h);
                 cola.add(r);
                 cola.add(t);
                 cola.add(j);
                 cola.add(y);
                 
                 System.out.println("Elementos de la cola: ");
                    for (dataStruct col : cola) {
                    System.out.println(col.nombres);
                    }

                    System.out.println("La cola esta vacia?: " + cola.isEmpty());
                    dataStruct primeroEnEntrar = cola.poll();
                        System.out.println("Primero dato en entrar // Primero dato en salir: " + primeroEnEntrar.nombres);
                        
                        
                        
                System.out.println("   ");
               System.out.println("///////ARREGLO DATASTRUCT CON MAPAS\\\\\\\\\\\\");
               
               Map< Integer, String> dataStruct = new HashMap<>();
               System.out.println("El map esta vacio?: " + dataStruct.isEmpty());
               
               dataStruct.put(1, "maria");
               dataStruct.put(2, "paula");
               dataStruct.put(3, "carla");
               dataStruct.put(4, "nivea");
               dataStruct.put(5, "torta");
              
               dataStruct.forEach((k, v)-> System.out.println("Claves: " + k + " // Valores: "+ v));
               System.out.println("El map esta vacio?: " + dataStruct.isEmpty());
               
               
                       
                System.out.println("   ");
               System.out.println("///////ARREGLO DATASTRUCT CON CONJUNTOS\\\\\\\\\\\\");
               
               HashSet dataStruc = new HashSet();
               
               dataStruc.add("-hambre");
               dataStruc.add("-perro");
               dataStruc.add("-carne");
               dataStruc.add("-pollo");
               dataStruc.add("-comida");
               dataStruc.add("-perro");
               dataStruc.add("-comida");
               
               for (Object dataStrut : dataStruc){
                   System.out.println(dataStrut);
               }
               
               System.out.println("   ");
               System.out.println("///////DECLARACION DE ARREGLO STRING CON 5 ELEMENTOS\\\\\\\\\\\\");
               
               String[] caracteristicas;

                    caracteristicas = new String[5];
                    caracteristicas[0] = "La";
                    caracteristicas[1] = "Vaca";
                    caracteristicas[2] = "Lola";
                    caracteristicas[3] = "Tiene cabeza";
                    caracteristicas[4] = "Y tiene cola";
                    
                     for (int i = 0; i < caracteristicas.length; i++) {
                         System.out.println(caracteristicas[i]);
                        }       

    }
}

