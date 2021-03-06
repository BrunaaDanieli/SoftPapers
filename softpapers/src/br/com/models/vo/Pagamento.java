package br.com.models.vo;
// Generated 25/08/2015 02:48:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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
 * Pagamento generated by hbm2java
 */
@Entity
@Table(name="pagamento"
    ,catalog="dbloja"
)
public class Pagamento  implements java.io.Serializable {


     private Long idPagamento;
     private Compra compra;
     private Funcionario funcionario;
     private Lancamento lancamento;
     private String descricaoPagamento;
     private BigDecimal valorPagamento;
     private Date dataPagamento;
     private Boolean statusPagamento;
     private Date criacaoPagamento;
     private Date atualizacaoPagamento;

    public Pagamento() {
    }

    public Pagamento(Compra compra, Funcionario funcionario, Lancamento lancamento, String descricaoPagamento, BigDecimal valorPagamento, Date dataPagamento, Boolean statusPagamento, Date criacaoPagamento, Date atualizacaoPagamento) {
       this.compra = compra;
       this.funcionario = funcionario;
       this.lancamento = lancamento;
       this.descricaoPagamento = descricaoPagamento;
       this.valorPagamento = valorPagamento;
       this.dataPagamento = dataPagamento;
       this.statusPagamento = statusPagamento;
       this.criacaoPagamento = criacaoPagamento;
       this.atualizacaoPagamento = atualizacaoPagamento;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idPagamento", unique=true, nullable=false)
    public Long getIdPagamento() {
        return this.idPagamento;
    }
    
    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="compraPagamento")
    public Compra getCompra() {
        return this.compra;
    }
    
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="funcionarioPagamento")
    public Funcionario getFuncionario() {
        return this.funcionario;
    }
    
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="lancamentoPagamento")
    public Lancamento getLancamento() {
        return this.lancamento;
    }
    
    public void setLancamento(Lancamento lancamento) {
        this.lancamento = lancamento;
    }

    
    @Column(name="descricaoPagamento", length=50)
    public String getDescricaoPagamento() {
        return this.descricaoPagamento;
    }
    
    public void setDescricaoPagamento(String descricaoPagamento) {
        this.descricaoPagamento = descricaoPagamento;
    }

    
    @Column(name="valorPagamento", precision=10)
    public BigDecimal getValorPagamento() {
        return this.valorPagamento;
    }
    
    public void setValorPagamento(BigDecimal valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataPagamento", length=10)
    public Date getDataPagamento() {
        return this.dataPagamento;
    }
    
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    
    @Column(name="statusPagamento")
    public Boolean getStatusPagamento() {
        return this.statusPagamento;
    }
    
    public void setStatusPagamento(Boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="criacaoPagamento", length=19)
    public Date getCriacaoPagamento() {
        return this.criacaoPagamento;
    }
    
    public void setCriacaoPagamento(Date criacaoPagamento) {
        this.criacaoPagamento = criacaoPagamento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="atualizacaoPagamento", length=19)
    public Date getAtualizacaoPagamento() {
        return this.atualizacaoPagamento;
    }
    
    public void setAtualizacaoPagamento(Date atualizacaoPagamento) {
        this.atualizacaoPagamento = atualizacaoPagamento;
    }




}


