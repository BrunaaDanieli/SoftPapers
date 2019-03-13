package br.com.models.vo;
// Generated 25/08/2015 02:48:09 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pessoajuridica generated by hbm2java
 */
@Entity
@Table(name="pessoajuridica"
    ,catalog="dbloja"
)
public class Pessoajuridica  implements java.io.Serializable {


     private Long idPessoaJuridica;
     private Pessoa pessoa;
     private String razaoSocialPessoaJuridica;
     private String nomeFantasiaPessoaJuridica;
     private String cnpjPessoaJuridica;
     private String estadualPessoaJuridica;
     private String municipalPessoaJuridica;
     private String suframaPessoaJuridica;
     private Boolean tributoSimplesPessoaJuridica;
     private Boolean importacaoPessoaJuridica;
     private Boolean icmsPessoaJuridica;
     private Date fundacaoPessoaJuridica;
     private Date criacaoPessoaJuridica;
     private Date atualizacaoPessoaJuridica;

    public Pessoajuridica() {
    }

    public Pessoajuridica(Pessoa pessoa, String razaoSocialPessoaJuridica, String nomeFantasiaPessoaJuridica, String cnpjPessoaJuridica, String estadualPessoaJuridica, String municipalPessoaJuridica, String suframaPessoaJuridica, Boolean tributoSimplesPessoaJuridica, Boolean importacaoPessoaJuridica, Boolean icmsPessoaJuridica, Date fundacaoPessoaJuridica, Date criacaoPessoaJuridica, Date atualizacaoPessoaJuridica) {
       this.pessoa = pessoa;
       this.razaoSocialPessoaJuridica = razaoSocialPessoaJuridica;
       this.nomeFantasiaPessoaJuridica = nomeFantasiaPessoaJuridica;
       this.cnpjPessoaJuridica = cnpjPessoaJuridica;
       this.estadualPessoaJuridica = estadualPessoaJuridica;
       this.municipalPessoaJuridica = municipalPessoaJuridica;
       this.suframaPessoaJuridica = suframaPessoaJuridica;
       this.tributoSimplesPessoaJuridica = tributoSimplesPessoaJuridica;
       this.importacaoPessoaJuridica = importacaoPessoaJuridica;
       this.icmsPessoaJuridica = icmsPessoaJuridica;
       this.fundacaoPessoaJuridica = fundacaoPessoaJuridica;
       this.criacaoPessoaJuridica = criacaoPessoaJuridica;
       this.atualizacaoPessoaJuridica = atualizacaoPessoaJuridica;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idPessoaJuridica", unique=true, nullable=false)
    public Long getIdPessoaJuridica() {
        return this.idPessoaJuridica;
    }
    
    public void setIdPessoaJuridica(Long idPessoaJuridica) {
        this.idPessoaJuridica = idPessoaJuridica;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pessoaPessoaJuridica")
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    @Column(name="razaoSocialPessoaJuridica", length=50)
    public String getRazaoSocialPessoaJuridica() {
        return this.razaoSocialPessoaJuridica;
    }
    
    public void setRazaoSocialPessoaJuridica(String razaoSocialPessoaJuridica) {
        this.razaoSocialPessoaJuridica = razaoSocialPessoaJuridica;
    }

    
    @Column(name="nomeFantasiaPessoaJuridica", length=50)
    public String getNomeFantasiaPessoaJuridica() {
        return this.nomeFantasiaPessoaJuridica;
    }
    
    public void setNomeFantasiaPessoaJuridica(String nomeFantasiaPessoaJuridica) {
        this.nomeFantasiaPessoaJuridica = nomeFantasiaPessoaJuridica;
    }

    
    @Column(name="cnpjPessoaJuridica", length=20)
    public String getCnpjPessoaJuridica() {
        return this.cnpjPessoaJuridica;
    }
    
    public void setCnpjPessoaJuridica(String cnpjPessoaJuridica) {
        this.cnpjPessoaJuridica = cnpjPessoaJuridica;
    }

    
    @Column(name="estadualPessoaJuridica", length=20)
    public String getEstadualPessoaJuridica() {
        return this.estadualPessoaJuridica;
    }
    
    public void setEstadualPessoaJuridica(String estadualPessoaJuridica) {
        this.estadualPessoaJuridica = estadualPessoaJuridica;
    }

    
    @Column(name="municipalPessoaJuridica", length=20)
    public String getMunicipalPessoaJuridica() {
        return this.municipalPessoaJuridica;
    }
    
    public void setMunicipalPessoaJuridica(String municipalPessoaJuridica) {
        this.municipalPessoaJuridica = municipalPessoaJuridica;
    }

    
    @Column(name="suframaPessoaJuridica", length=20)
    public String getSuframaPessoaJuridica() {
        return this.suframaPessoaJuridica;
    }
    
    public void setSuframaPessoaJuridica(String suframaPessoaJuridica) {
        this.suframaPessoaJuridica = suframaPessoaJuridica;
    }

    
    @Column(name="tributoSimplesPessoaJuridica")
    public Boolean getTributoSimplesPessoaJuridica() {
        return this.tributoSimplesPessoaJuridica;
    }
    
    public void setTributoSimplesPessoaJuridica(Boolean tributoSimplesPessoaJuridica) {
        this.tributoSimplesPessoaJuridica = tributoSimplesPessoaJuridica;
    }

    
    @Column(name="importacaoPessoaJuridica")
    public Boolean getImportacaoPessoaJuridica() {
        return this.importacaoPessoaJuridica;
    }
    
    public void setImportacaoPessoaJuridica(Boolean importacaoPessoaJuridica) {
        this.importacaoPessoaJuridica = importacaoPessoaJuridica;
    }

    
    @Column(name="icmsPessoaJuridica")
    public Boolean getIcmsPessoaJuridica() {
        return this.icmsPessoaJuridica;
    }
    
    public void setIcmsPessoaJuridica(Boolean icmsPessoaJuridica) {
        this.icmsPessoaJuridica = icmsPessoaJuridica;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="fundacaoPessoaJuridica", length=10)
    public Date getFundacaoPessoaJuridica() {
        return this.fundacaoPessoaJuridica;
    }
    
    public void setFundacaoPessoaJuridica(Date fundacaoPessoaJuridica) {
        this.fundacaoPessoaJuridica = fundacaoPessoaJuridica;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="criacaoPessoaJuridica", length=19)
    public Date getCriacaoPessoaJuridica() {
        return this.criacaoPessoaJuridica;
    }
    
    public void setCriacaoPessoaJuridica(Date criacaoPessoaJuridica) {
        this.criacaoPessoaJuridica = criacaoPessoaJuridica;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="atualizacaoPessoaJuridica", length=19)
    public Date getAtualizacaoPessoaJuridica() {
        return this.atualizacaoPessoaJuridica;
    }
    
    public void setAtualizacaoPessoaJuridica(Date atualizacaoPessoaJuridica) {
        this.atualizacaoPessoaJuridica = atualizacaoPessoaJuridica;
    }




}

