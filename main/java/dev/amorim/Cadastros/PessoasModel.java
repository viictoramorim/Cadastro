package dev.amorim.Cadastros;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cadastro")
public class PessoasModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private int years;


    public PessoasModel(){
    }

    public PessoasModel(String name, String email, int years){
        this.name = name;
        this.email = email;
        this.years = years;
    }

    public Long getId(){return id;}
    public void setId(Long Id){this.id = id;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public int getYears(){return years;}
    public void setYears(int years){this.years = years;}
}