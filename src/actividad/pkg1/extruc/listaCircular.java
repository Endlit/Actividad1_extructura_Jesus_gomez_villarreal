
package actividad.pkg1.extruc;


public class listaCircular {
        
        nodoc primeri;
        nodoc ultima;
        
            public listaCircular(){
              
                primeri = null;
                ultima = null;
            }
            public void ingresarN(int x){
                nodoc nuevo = new nodoc();
                nuevo.dat = x;
                
                if(primeri == null){
                    primeri = nuevo;
                    ultima = primeri;
                    primeri.siguient = ultima;
                }else{
                    ultima.siguient = nuevo;
                    nuevo.siguient = primeri;
                    ultima = nuevo;
                }
            }
            
            public void mostrarlis(){
            nodoc recorrido = new nodoc();
            recorrido = primeri;
            do{
                System.out.println(recorrido.dat);
                recorrido = recorrido.siguient;
            }while(recorrido != primeri);
        }
            
            
            
    
}
