/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package fr.theo.projettp2app.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author theo
 */
@Named(value = "bean")
@RequestScoped
public class Bean {

    private int nombre;
    /**
     * Creates a new instance of Bean
     */
    public Bean() {
    }
    
    public int getNombre() {
        return nombre;
    }
    
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
     /**
     * Renvoie une liste de nombres suivants, à partir du nombre actuel.
     * Cette méthode crée une liste de nombres incrémentés à partir du nombre actuel jusqu'au nombre actuel + nb,
     * où nb est un nombre donné.
     *
     * @return Une liste d'entiers représentant les nombres suivants.
     */
    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }
}
