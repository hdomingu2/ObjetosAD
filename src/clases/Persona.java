/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author hdomingu2
 */
public class Persona {
  private long indetificacion;
  private String primer_nombre;
  private String primer_apellido;
  private String sexo;
    
   public Persona(long identificacion,String primer_nombre,String primer_apellido,String sexo){
       this.indetificacion = identificacion;
       this.primer_nombre = primer_nombre;
       this.primer_apellido = primer_apellido;
       this.sexo= sexo;
       
   } 

    public long getIndetificacion() {
        return indetificacion;
        
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIndetificacion(long indetificacion) {
        this.indetificacion = indetificacion;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }
    
   
   
}
