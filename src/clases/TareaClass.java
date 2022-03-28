/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Fer
 */
public class TareaClass {
    long tareaId;
    public final String nombreTarea;    
    public final String descripcion;
    public final long fechaEntrega;
    public final long duracion;
    public final long avance;

    public TareaClass(String nombreTarea, String descripcion, long fechaEntrega, long duracion, long avance) {
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.duracion = duracion;
        this.avance = avance;
    }

    public TareaClass(long tareaId, String nombreTarea, String descripcion, long fechaEntrega, long duracion, long avance) {
        this.tareaId = tareaId;
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
        this.duracion = duracion;
        this.avance = avance;
    }
    
    public void setId(long id){
        this.tareaId = id;
    }
    
    public long getId(){
        return tareaId;
    }
}
