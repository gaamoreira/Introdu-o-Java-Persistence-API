/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.jpa.teste;

import exemplo.jpa.dao.LocalDAO;
import exemplo.jpa.modelo.Local;


public class TesteLocal {
    public static void main(String[] args){
        Local l  = new Local();
        l.setPredio("Lambda");
        l.setSala("L330");
        l.setCapacidade(80);
        l.setId(1L);
        
        LocalDAO dao = new LocalDAO();
        l = dao.salvar(l);
        
        System.out.println("Local salvo" +l.getId() + "" + l.getPredio()
                +  " " + l.getSala() + " " + l.getCapacidade());
        
        
    }
}
