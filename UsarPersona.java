public class UsarPersona{


   public static void main(String [] args ){

     System.out.println("Clase que usa la otra clase Persona");
     Persona per1 = new Persona();
     Persona per2 = new Persona();


     System.out.println( per1.getNombre()  );
    
     per2.setNombre("Alexander umu");
     System.out.println( per2.getNombre()  );
  }
}
