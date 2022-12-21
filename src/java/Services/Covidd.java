/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "COVIDD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Covidd.findAll", query = "SELECT c FROM Covidd c"),
    @NamedQuery(name = "Covidd.findById", query = "SELECT c FROM Covidd c WHERE c.id = :id"),
    @NamedQuery(name = "Covidd.findByYears", query = "SELECT c FROM Covidd c WHERE c.years = :years"),
    @NamedQuery(name = "Covidd.findByWeeknum", query = "SELECT c FROM Covidd c WHERE c.weeknum = :weeknum"),
    @NamedQuery(name = "Covidd.findByNewCase", query = "SELECT c FROM Covidd c WHERE c.newCase = :newCase"),
    @NamedQuery(name = "Covidd.findByTotalCase", query = "SELECT c FROM Covidd c WHERE c.totalCase = :totalCase"),
    @NamedQuery(name = "Covidd.findByNewCaseExcludeabroad", query = "SELECT c FROM Covidd c WHERE c.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Covidd.findByTotalCaseExcludeabroad", query = "SELECT c FROM Covidd c WHERE c.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Covidd.findByNewRecovered", query = "SELECT c FROM Covidd c WHERE c.newRecovered = :newRecovered"),
    @NamedQuery(name = "Covidd.findByTotalRecovered", query = "SELECT c FROM Covidd c WHERE c.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Covidd.findByNewDeath", query = "SELECT c FROM Covidd c WHERE c.newDeath = :newDeath"),
    @NamedQuery(name = "Covidd.findByTotalDeath", query = "SELECT c FROM Covidd c WHERE c.totalDeath = :totalDeath"),
    @NamedQuery(name = "Covidd.findByCaseForeign", query = "SELECT c FROM Covidd c WHERE c.caseForeign = :caseForeign"),
    @NamedQuery(name = "Covidd.findByCasePrison", query = "SELECT c FROM Covidd c WHERE c.casePrison = :casePrison"),
    @NamedQuery(name = "Covidd.findByCaseWalkin", query = "SELECT c FROM Covidd c WHERE c.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Covidd.findByCaseNewPrev", query = "SELECT c FROM Covidd c WHERE c.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Covidd.findByCaseNewDiff", query = "SELECT c FROM Covidd c WHERE c.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Covidd.findByDeathNewPrev", query = "SELECT c FROM Covidd c WHERE c.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Covidd.findByDeathNewDiff", query = "SELECT c FROM Covidd c WHERE c.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Covidd.findByUpdateDate", query = "SELECT c FROM Covidd c WHERE c.updateDate = :updateDate")})
public class Covidd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "YEARS")
    private String years;
    @Size(max = 255)
    @Column(name = "WEEKNUM")
    private String weeknum;
    @Size(max = 255)
    @Column(name = "NEW_CASE")
    private String newCase;
    @Size(max = 255)
    @Column(name = "TOTAL_CASE")
    private String totalCase;
    @Size(max = 255)
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private String newCaseExcludeabroad;
    @Size(max = 255)
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private String totalCaseExcludeabroad;
    @Size(max = 255)
    @Column(name = "NEW_RECOVERED")
    private String newRecovered;
    @Size(max = 255)
    @Column(name = "TOTAL_RECOVERED")
    private String totalRecovered;
    @Size(max = 255)
    @Column(name = "NEW_DEATH")
    private String newDeath;
    @Size(max = 255)
    @Column(name = "TOTAL_DEATH")
    private String totalDeath;
    @Size(max = 255)
    @Column(name = "CASE_FOREIGN")
    private String caseForeign;
    @Size(max = 255)
    @Column(name = "CASE_PRISON")
    private String casePrison;
    @Size(max = 255)
    @Column(name = "CASE_WALKIN")
    private String caseWalkin;
    @Size(max = 255)
    @Column(name = "CASE_NEW_PREV")
    private String caseNewPrev;
    @Size(max = 255)
    @Column(name = "CASE_NEW_DIFF")
    private String caseNewDiff;
    @Size(max = 255)
    @Column(name = "DEATH_NEW_PREV")
    private String deathNewPrev;
    @Size(max = 255)
    @Column(name = "DEATH_NEW_DIFF")
    private String deathNewDiff;
    @Size(max = 255)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Covidd() {
    }

    public Covidd(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(String weeknum) {
        this.weeknum = weeknum;
    }

    public String getNewCase() {
        return newCase;
    }

    public void setNewCase(String newCase) {
        this.newCase = newCase;
    }

    public String getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(String totalCase) {
        this.totalCase = totalCase;
    }

    public String getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(String newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public String getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(String totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public String getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(String newRecovered) {
        this.newRecovered = newRecovered;
    }

    public String getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public String getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(String newDeath) {
        this.newDeath = newDeath;
    }

    public String getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(String totalDeath) {
        this.totalDeath = totalDeath;
    }

    public String getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(String caseForeign) {
        this.caseForeign = caseForeign;
    }

    public String getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(String casePrison) {
        this.casePrison = casePrison;
    }

    public String getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(String caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public String getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(String caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public String getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(String caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public String getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(String deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public String getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(String deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Covidd)) {
            return false;
        }
        Covidd other = (Covidd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Services.Covidd[ id=" + id + " ]";
    }
    
}
