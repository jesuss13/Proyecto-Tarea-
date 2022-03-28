/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones;
import clases.TareaClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fer
 */
public class TareaAcciones {
    
    static boolean editable = false;
    
    public static void guardarTarea(TareaClass tareaClass) throws SQLException{
        long id = insertarTarea(tareaClass);
        tareaClass.setId(id);
    }
    
    private static long insertarTarea(TareaClass tareaClass)throws SQLException{
        String sql = "insert into tareas (nombre_tarea, descripcion,fecha_entrega, duracion, avance)"
                + "values (?,?,?,?,?);";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setString(1, tareaClass.nombreTarea);
        ps.setString(2, tareaClass.descripcion);
        ps.setLong(3, tareaClass.fechaEntrega);
        ps.setLong(4, tareaClass.duracion);
        ps.setLong(5, tareaClass.avance);
        int id = 0;
        ps.execute();
        sql = "select last_insert_rowid();";
        ps = Conexion.PreparedStatement(sql, true);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            id = rs.getInt(1);
        }
        return id;
    }

    public static ArrayList<TareaClass> obtenerTareas() throws SQLException {
        String sql = "select tarea_id, nombre_tarea, descripcion, fecha_entrega, duracion, avance from tareas order by fecha_entrega";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ArrayList<TareaClass> list = new ArrayList<>();
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                long id = rs.getLong("tarea_id");
                String tarea_name = rs.getString("nombre_tarea");
                String descripcion = rs.getString("descripcion");
                long fecha_entrega = rs.getLong("fecha_entrega");
                long duracion = rs.getLong("duracion");
                long avance = rs.getLong("avance");
                TareaClass tareaClass = new TareaClass(id, tarea_name,descripcion,fecha_entrega,duracion,avance);
                list.add(tareaClass);
            }
        }
        return list;
    }

    public static void eliminarTarea(TareaClass tareaClass) throws SQLException {
        String sql = "delete from tareas where tarea_id=?";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setLong(1, tareaClass.getId());
        ps.execute();
    }

    public static void finalizarTarea(TareaClass tareaClass) throws SQLException {
        insertarTareaHistorial(tareaClass);
        eliminarTarea(tareaClass);
    }

    private static void insertarTareaHistorial(TareaClass tareaClass) throws SQLException {
        String sql = "insert into historial (tarea_id, nombre_tarea, descripcion,fecha_entrega, duracion, avance)"
                + "values (?,?,?,?,?,?);";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setLong(1, tareaClass.getId());
        ps.setString(2, tareaClass.nombreTarea);
        ps.setString(3, tareaClass.descripcion);
        ps.setLong(4, tareaClass.fechaEntrega);
        ps.setLong(5, tareaClass.duracion);
        ps.setLong(6, tareaClass.avance);
        int id = 0;
        ps.execute();
    }

    public static ArrayList<TareaClass> obtenerTareasHistorial() throws SQLException {
        String sql = "select tarea_id, nombre_tarea, descripcion, fecha_entrega, duracion, avance from historial order by fecha_entrega desc";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ArrayList<TareaClass> list = new ArrayList<>();
        try(ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                long id = rs.getLong("tarea_id");
                String tarea_name = rs.getString("nombre_tarea");
                String descripcion = rs.getString("descripcion");
                long fecha_entrega = rs.getLong("fecha_entrega");
                long duracion = rs.getLong("duracion");
                long avance = rs.getLong("avance");
                TareaClass tareaClass = new TareaClass(id, tarea_name,descripcion,fecha_entrega,duracion,avance);
                list.add(tareaClass);
            }
        }
        return list;
    }

    public static void reactivarTarea(TareaClass tareaClass) throws SQLException {
        long id = insertarTarea(tareaClass);
        eliminarTareaHistorial(tareaClass);
        tareaClass.setId(id);
    }

    private static void eliminarTareaHistorial(TareaClass tareaClass) throws SQLException {
        String sql = "delete from historial where tarea_id=?";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setLong(1, tareaClass.getId());
        ps.execute();
    }

    public static void editarTarea(TareaClass tareaClass) throws SQLException {
       String sql = "UPDATE tareas SET nombre_tarea = ? , "
                + "descripcion = ?, " + "fecha_entrega = ?," + "duracion = ?," + "avance = ?"
                + "WHERE tarea_id = ?";
       PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setString(1, tareaClass.nombreTarea);
        ps.setString(2, tareaClass.descripcion);
        ps.setLong(3, tareaClass.fechaEntrega);
        ps.setLong(4, tareaClass.duracion);
        ps.setLong(5, tareaClass.avance);
        ps.setLong(6, tareaClass.getId());
        int id = 0;
        ps.execute();
    }
}
