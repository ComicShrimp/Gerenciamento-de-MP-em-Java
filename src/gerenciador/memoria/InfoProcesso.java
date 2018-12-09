/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciador.memoria;

/**
 *
 * @author mario
 */
public class InfoProcesso {
    
    private int ID;
    private int Tamanho;

    public InfoProcesso() {
    }

    public InfoProcesso(int ID, int Tamanho) {
        this.ID = ID;
        this.Tamanho = Tamanho;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }
    
    
}
