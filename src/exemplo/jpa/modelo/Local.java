/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Local {
    @Id
    private Long id;
    private String predio;
    private String sala;
    private int capacidade;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the predio
     */
    public String getPredio() {
        return predio;
    }

    /**
     * @param predio the predio to set
     */
    public void setPredio(String predio) {
        this.predio = predio;
    }

    /**
     * @return the sala
     */
    public String getSala() {
        return sala;
    }

    /**
     * @param sala the sala to set
     */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
