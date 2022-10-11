package com.escuela.Clases;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Alumno extends Persona{
    private int legajo;
    private List<Materia> materias = new ArrayList<Materia>();

    private List<Profesor> profesores = new ArrayList<Profesor>();
    private Director director;
    private Profesor padrino;
    public String ProfesorDeLaMateria(String materia,List<Profesor> profesores){
        String retorno = "";
        if(!(this.materias.contains(materia))){
            retorno = "Nadie da esa materia";

        }else if(this.materias.contains(materia)){
            for(Profesor profesor : profesores){
                for (Materia materiaaa : profesor.getMaterias()){
                    if(materiaaa.getNombre() == materia){

                        retorno= profesor.getNombre();
                    }
                }
            }
        }
        return retorno;
    }

    public boolean EsPadrino(Profesor padrino){
        if(this.padrino == padrino){
            return true;
        }else{
            return false;
        }
    }
}
