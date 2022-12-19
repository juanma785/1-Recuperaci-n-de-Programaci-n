package org.ieslosremedios.daw1.prog.ut3.examen;

public class Equipo {
    private String nombre;
    private Color color;
    private Integer partidosGanados;
    private Integer partidosPerdidos;
    private Integer partidosEmpatados;
    private Integer calidad;
    private String campeonato = "Mundial";

    public Equipo () {
      
    }

    public Equipo(String nombre, Color color, Integer ganados, Integer empatados, Integer perdidos){
        this(nombre, color);
        partidosGanados = ganados;
        partidosEmpatados = empatados;
        partidosPerdidos = perdidos;
     public void  actualizarCalidad();
    }

  
    public void actualizarCalidad() {
        calidad = partidosGanados * 2 + partidosEmpatados - partidosPerdidos;
       
        }


}