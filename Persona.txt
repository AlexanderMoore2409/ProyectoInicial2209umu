//Persona.java
public class Persona{
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private int edad;
    private String curp;
    
    public Persona(){
        this.nombre="No se sabe"; 
}
    public void setNombre(String nom ){
         this.nombre = nom;
}

     public String getNombre(){
           return this.nombre;
}
}
