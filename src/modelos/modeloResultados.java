package modelos;

import include.resultados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloResultados extends conexion {
    public boolean insertResultados(resultados resul) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "INSERT INTO resultados (id_resultados, respuestas_incorrectas, respuestas_correctas,id_ejercicio,id_usuario) VALUES (?,?,?,?,?)";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, resul.getId_resultados());
            pst.setInt(2, resul.getRespuestas_correctas());
            pst.setInt(3, resul.getRespuestas_incorrectas());
            pst.setInt(4, resul.getId_ejercicio());
            pst.setInt(5, resul.getId_usuario());

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
    public ArrayList<resultados> obtenerResultados() {
        ArrayList<resultados> resu = new ArrayList<resultados>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_resultados,respuestas_correctas,respuestas_incorrectas,id_ejercicio,id_usuario FROM resultados";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                resu.add(new resultados(rs.getInt("id_resultados"),
                        rs.getInt("respues_correctas"),
                        rs.getInt("respuestas_incorrectas"),
                        rs.getInt("id_ejercicio"),
                        rs.getInt("id_usuario")));

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
        return resu;
    }

    public ArrayList<resultados> obtenerResultados(int clave) {
        ArrayList<resultados> Resultados = new ArrayList<resultados>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_resultados,respuestas_correctas,respuestas_incorrectas,id_ejercicio,id_usuario FROM id_resultados";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {
                Resultados.add(new resultados(rs.getInt("id_resultados"),
                        rs.getInt("respuestas_correctas"),
                        rs.getInt("respuetas_incorrectas"),
                        rs.getInt("id_ejercicio"),
                        rs.getInt("id_usuario")));

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
        return Resultados;
    }

    public ArrayList<resultados> obtenerresultados(int id_resultados) {
        ArrayList<resultados> Resultados = new ArrayList<resultados>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT id_resultados,respuestas_correctas,respuestas_incorrectas,id_ejercicio,id_usuario FROM resultados WHERE id_resultados = ?";
            pst = getConection().prepareCall(consulta);
            pst.setInt(1, id_resultados);
            rs = pst.executeQuery();
            while (rs.next()) {
                Resultados.add(new resultados(rs.getInt("id_resultados"),
                        rs.getInt("respuestas_correctas"),
                        rs.getInt("respuestas_incorrectas"),
                        rs.getInt("id_ejercicio"),
                        rs.getInt("id_usuario")));

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
        return Resultados;
    }

    public boolean actualizarresultados(resultados Resultados) {
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String consulta = "UPDATE resultados SET id_resultados = ?, resultados = ?, WHERE id_resultados = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, Resultados.getId_resultados());
            pst.setInt(2, Resultados.getRespuestas_correctas());
            pst.setInt(3, Resultados.getRespuestas_incorrectas());
            pst.setInt(4, Resultados.getId_ejercicio());
            pst.setInt(5, Resultados.getId_usuario());
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

    public boolean borrarresultados(int id_resultados) {
        PreparedStatement pst = null;
        boolean flag = false;
        String consulta = "DELETE FROM resultados WHERE id_resultados= ?";
        try {
            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, id_resultados);

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
