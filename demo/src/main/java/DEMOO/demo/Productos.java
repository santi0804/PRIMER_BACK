package DEMOO.demo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Productos implements Serializable {

    // aqui un nuevo producto con la cedula

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_producto")
    private Integer id_producto;

    @Column(name="cedula_p")
    private Integer cedula_p;

    @Column(name= "nombre_p")
    private String nombre_p;

    @Column(name= "referencia_p")
    private String referencia_p;

    @Column(name= "valor_p")
    private double valor_p;

    @Column(name="mes_de_consumo")
    private String Mes_De_Consumo;

    @Column(name="fecha_p")
    private Date fecha_p;




//constructor


    public Productos() {   //este es el constructor
    }

    public Productos(Integer cedula_p, String nombre_p, String referencia_p, double valor_p, String mes_De_Consumo, Date fecha_p) {
        this.cedula_p = cedula_p;
        this.nombre_p = nombre_p;
        this.referencia_p = referencia_p;
        this.valor_p = valor_p;
        Mes_De_Consumo = mes_De_Consumo;
        this.fecha_p = fecha_p;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public Integer getCedula_p() {
        return cedula_p;
    }

    public void setCedula_p(Integer cedula_p) {
        this.cedula_p = cedula_p;
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

    public Date getFecha_p() {
        return fecha_p;
    }

    public void setFecha_p(Date fecha_p) {
        this.fecha_p = fecha_p;
    }


    // Getters y setters


}


