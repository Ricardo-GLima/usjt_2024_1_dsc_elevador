/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.elevador;

/**
 * @author Ricardo Gonçalves Lima RA:824145766
 */
public class Elevador {

    private int pessoas;
    private boolean subindo;
    private boolean descendo;

    public Elevador() {
        pessoas = 0;
        subindo = false;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        if (pessoas <= 10 && pessoas >= 0) {
            this.pessoas = pessoas;
        }
    }

    public boolean getSubindo() {
        return subindo;
    }

    public void setSubindo() {
        subindo = !subindo; //Se for true muda para false e vice-versa
    }

    public void sobe() {
        if (!getSubindo()) {
            subindo = true;
        }
    }

    public void desce() {
        if (getSubindo()) {
            subindo = false;
        }
    }

    public void entrarGente(int pessoas) {
        int ocupacao = getPessoas() + pessoas;
        if (ocupacao >= 0 && ocupacao <= 10) {
            setPessoas(ocupacao);
        }
    }

    public void subirPessoa() {
        int ocupacao = getPessoas() + 1;
        if (ocupacao >= 0 && ocupacao <= 10) {
            setPessoas(ocupacao);
        }
    }

    public void descerPessoa() {
        int ocupacao = getPessoas() - 1;
        if (ocupacao >= 0 && ocupacao <= 10) {
            setPessoas(ocupacao);
        }
    } 
}
