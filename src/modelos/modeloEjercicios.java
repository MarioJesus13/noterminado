package modelos;

import include.ejercicios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloEjercicios extends conexion {
    public boolean insertEjercicio(ejercicios ejer) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO ejercicios (id_ejercicio, nombre_ejercicio, puntaje, id_temas) VALUES (?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, ejer.getId_ejercicio());
            pst.setString(2, ejer.getNombre_ejercicio());
            pst.setInt(3, ejer.getPuntaje());
            pst.setInt(4, ejer.getId_temas());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (getConection() != null) {
                    getConection().close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }

    public ArrayList<ejercicios> obtenerEjercicios() {
        ArrayList<ejercicios> ejer = new ArrayList<ejercicios>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_ejercicio,nombre_ejercicio,puntaje, id_temas FROM ejercicios";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                ejer.add(new ejercicios(rs.getInt("id_ejercicio"),
                        rs.getString("nombre_ejercicio"),
                        rs.getInt("puntaje"),
                        rs.getInt("id_temas")));

            }
        } catch (Exception e) {
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
            }
        }
        return ejer;
    }

    public ArrayList<ejercicios> obtenerEjercicios(int clave) {
        ArrayList<ejercicios> Ejercicios = new ArrayList<ejercicios>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_ejercicio,nombre_ejercicio,puntaje,id_temas FROM ejercicios";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Ejercicios.add(new ejercicios(rs.getInt("id_ejercicio"),
                        rs.getString("nombre_ejercicio"),
                        rs.getInt("puntaje"),
                        rs.getInt("id_temas")));

            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
            }
        }
        return Ejercicios;
    }

    public ArrayList<ejercicios> obtenerejercicios(int id_ejercicio) {
        ArrayList<ejercicios> Ejercicios = new ArrayList<ejercicios>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_ejercicio,nombre_ejercicio,puntaje,id_temas FROM ejercicios WHERE id_ejercicio = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, id_ejercicio);
            rs = pst.executeQuery();
            while (rs.next()) {
                Ejercicios.add(new ejercicios(rs.getInt("id_ejercicio"),
                        rs.getString("nombre_ejercicio"),
                        rs.getInt("puntaje"),
                        rs.getInt("id_temas")));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        return Ejercicios;
    }

    public boolean actualizarejercicios(ejercicios Ejercicios) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "UPDATE ejercicios SET id_ejercicio = ?, nombre_ejercicio = ?, puntaje = ? WHERE id_ejercicio = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, Ejercicios.getId_ejercicio());
            pst.setString(2, Ejercicios.getNombre_ejercicio());
            pst.setInt(3, Ejercicios.getPuntaje());
            pst.setInt(4, Ejercicios.getId_temas());

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception a) {
                System.out.println(a.getMessage());

            }
        }
        return flag;
    }

    public boolean borrarejercicios(int id_ejercicio) {
        PreparedStatement pst = null;
        boolean flag = false;
        String consulta = "DELETE FROM ejercicios WHERE id_ejercicio = ?";
        try {
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, id_ejercicio);

            if (pst.executeUpdate() == 1) {
                flag = true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return flag;
        }
    }

}