package boletin_15;

import personal.Personal;

/**
 *
 * @author cfigueirasvalverde
 */
class Academica {
    int numreferencia=2020;
    String nome;
    int nota;
    Personal alumno;

    public Academica(int numreferencia, String nome, int nota, Personal alumno) {
        this.nome = nome;
        this.nota = analizarNota(nota);
        this.alumno = alumno;
        this.numreferencia= numreferencia;
    }


    public int getNumreferencia() {
        return numreferencia;
    }

    public void setNumreferencia(int numreferencia) {
        this.numreferencia = numreferencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Personal getAlumno() {
        return alumno;
    }

    public void setAlumno(Personal alumno) {
        this.alumno = alumno;
    }


    private int analizarNota(int nota) {
        if(nota <1 || nota>10){
            System.out.println("Nota superior a 10 o inferior a 1");
            return 0;
        }
        else{
            return nota;
        }
    }
}