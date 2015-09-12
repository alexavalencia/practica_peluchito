
package practica_peluchito;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contabilidad {
    Scanner scanf = new Scanner(System.in);
     private String producto; // nombre del producto
     private int cantidad;    // cantidad del producto
     private int precio;    // precio por unidad del producto
     private int venta;
     private double total_venta;

    public double getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(double total_venta) {
        this.total_venta = total_venta;
    }

    public Scanner getScanf() {
        return scanf;
    }

    public void setScanf(Scanner scanf) {
        this.scanf = scanf;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    
     
     public void Agregar_P(){ // agrega los productos a la lista
        boolean auxi;
        System.out.print("Nombre del producto:    ");
        producto=scanf.nextLine();
        Pattern patron = Pattern.compile("[^A-Za-z ]");
        Matcher cadena = patron.matcher(producto);
        while(cadena.find()){
            System.out.println("Palabra invalida...");
            System.out.print("Nombre del producto:    ");
            producto=scanf.nextLine();
            cadena = patron.matcher(producto);
        }
        System.out.print("Cantidad de producto que ingresa:    ");
        cantidad=scanf.nextInt();
        
        System.out.print("Valor individual del producto:    ");
        precio=scanf.nextInt();
     
     }
     
     public void Buscar_P(){
        System.out.println("PRODUCTO:               "+producto);
        System.out.println("CANTIDAD DISPONIBLE:    "+cantidad);
        System.out.println("VALOR POR UNIDAD:       "+precio);
       
       
     }
     
     public void Eliminar(){
         producto=" ";
         cantidad=0;
         precio=0;
         venta=0;
         total_venta=0;
     }
     
     public void RealizarVentas(){
         int auxi=0;
         System.out.println("Cantidad de "+producto+" que se va a vender: ");
         auxi=scanf.nextInt();
            if(cantidad==0){
              System.out.println("Este producto esta agotado");  
            }else
                if(cantidad<auxi){
                    System.out.println("No hay las suficientes unidades");
                }else{
                    venta=venta+auxi;
                    cantidad=cantidad-auxi;
                    }
         
         
     }
     
     public void MostrarGanancia(){
         
         System.out.println("La cantidad de ventas de "+producto+" es: "+ venta);
         total_venta=venta*precio;
         System.out.println("El total de la venta de "+ producto +" es: "+total_venta);
         
     
     }
    
}
