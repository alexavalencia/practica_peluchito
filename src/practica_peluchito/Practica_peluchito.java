
package practica_peluchito;

import java.util.Scanner;


public class Practica_peluchito {

    
    public static void main(String[] args) {
        int op=0;
        int a=1,cont=0;
        String data;
        int flag,auxi2,flag1=0;
        double total=0;
        Scanner scanf= new Scanner(System.in);
        Contabilidad[] Producto;
        Producto= new Contabilidad[100];
         Contabilidad[] auxiliar;
        auxiliar= new Contabilidad[100];
        do{
            System.out.println("Ingrese la operacion que desea realizar");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Realizar venta");
            System.out.println("6. Mostrar ganancias totales");
            System.out.println("7. Salir");
            op=scanf.nextInt();
            switch(op){
                case 1:
                    while(a==1){
                        
                        if(cont==100){
                            System.out.println("No es posible ingresar mas productos");
                            a=2;
                            cont=0;
                        }else{
                            Producto[cont]=new Contabilidad();
                            Producto[cont].Agregar_P();
                            cont++;
                            System.out.println("Si desea ingresar mas productos digite 1 de lo contrario 2");
                            a=scanf.nextInt();
                        }
                      
                    }
                    
                    break;
                case 2:
                    a=1;
                    auxi2=0;
                    System.out.print("Nombre del producto: ");
                    data=scanf.next();
                    for(int i=0; i<cont; i++){
                        flag=data.compareTo(Producto[i].getProducto());
                        if(flag==0){
                            Producto[i].Buscar_P();
                            
                            auxi2=1;
                            
                        }
                        
                     }
                     
                     if(auxi2!=1){
                         System.out.println("El producto no existe ");
                     }
                    
                    
                    
                    break;
                case 3:
                    a=1;
                    auxi2=0;
                    System.out.print("Nombre del producto: ");
                    data=scanf.next();
                    for(int i=0; i<cont; i++){
                        flag=data.compareTo(Producto[i].getProducto());
                        if(flag==0){
                            Producto[i].Eliminar();
                            flag1=i;
                            auxi2=1;
                            
                        }
                        
                     }
                    if(flag1!=(cont-1)){
                        for(int u=flag1; u< cont-1; u++){
                            Producto[u]=Producto[u+1];
                        }
                       cont=cont-1; 
                     }else{
                        Producto[flag1]=null;
                        cont=cont-1;
                    }
                     if(auxi2!=1){
                         System.out.println("El producto no existe ");
                     }
                    break;
                case 4:
                    a=1;
                    for(int j=0; j<cont; j++){
                        Producto[j].Buscar_P();
                    }
                    break;
                case 5:
                    a=1;
                     auxi2=0;
                    System.out.print("Nombre del producto: ");
                    data=scanf.next();
                    for(int i=0; i<cont; i++){
                        flag=data.compareTo(Producto[i].getProducto());
                        if(flag==0){
                            Producto[i].RealizarVentas();
                            auxi2=1;
                            
                        }
                        
                     }
                     if(auxi2!=1){
                         System.out.println("El producto no existe ");
                     }
                    break;
                case 6:
                    a=1;
                    total=0;
                    for(int i=0; i<cont; i++){
                            Producto[i].Buscar_P();
                            Producto[i].MostrarGanancia();
                            total=Producto[i].getTotal_venta()+total;
                            
                          
                     }
                     System.out.println("El total  de ventas es: "+ total);
                    break;
            
            }
        
        }while(op!=7);
    }
    
}
