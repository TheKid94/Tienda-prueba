/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_EDA;

/**
 *
 * @author Natt
 */
public class Ventas {
    private String articulo;
    private String proveedor;
    private String tienda;
    private String cliente;
    private String vendedor;
    private int nroVentas;
    private int cantidad; 
 
    
    // Este constructor nos permite crear una venta sin ningún atributo.
    public Ventas(){}
        
    // Este constructor nos permite crear una venta el cual va a contener inmediatamente
    // todas sus variables asignadas.
    public Ventas(String articulo, String cliente, int Nventas, int cant){
        this.articulo = articulo;
        this.cliente = cliente;
        nroVentas = Nventas;      
        cantidad = cant; 
       
    }

    // Cabe mencionar que aunque creemos una venta sin atributos, siempre podemos
    // Asignarselos más adelante en el código utilizando los getters y setters.
    // (En la clase main hay un ejemplo de esto).
   public int getCant()
   {
       return this.cantidad;
   }
   public void setCant(int canti)
   {
       this.cantidad = canti; 
   }
   public int getNroV()
   {
       return this.nroVentas;
   }
   public void setNroV(int nro)
   {
       this.nroVentas = nro;
   }
     public String getCliente(){
        return this.cliente;
    }
    public void setCliente(String cte){
        this.cliente = cte;
    }
    
    
    public String getArticulo(){
        return this.articulo;
    }
    
    public void setArticulo(String art) {
        this.articulo = art;
    } 
    
}
