package DEMOO.demo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Productos implements Serializable {


    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_producto")
    private Long id_producto;

    @Column(name= "nombre_p")
    private String nombre_p;

    @Column(name= "referencia_p")
    private String referencia_p;

    @Column(name= "valor_p")
    private double valor_p;

    @Column(name="mes_de_consumo")
    private String Mes_De_Consumo;



    //constructor

    public Productos() {
    }


    // Getters y setters

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getReferencia_p() {
        return referencia_p;
    }

    public void setReferencia_p(String referencia_p) {
        this.referencia_p = referencia_p;
    }

    public double getValor_p() {
        return valor_p;
    }

    public void setValor_p(double valor_p) {
        this.valor_p = valor_p;
    }

    public String getMes_De_Consumo() {
        return Mes_De_Consumo;
    }

    public void setMes_De_Consumo(String mes_De_Consumo) {
        Mes_De_Consumo = mes_De_Consumo;
    }
}

