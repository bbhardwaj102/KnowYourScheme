/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enggcell.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author parentsgift
 */
@Entity
@Table(name = "tempUser")
@SequenceGenerator(name = "tempUser_seq", sequenceName = "tempUser_seq", allocationSize = 1)
@NamedQueries({
    @NamedQuery(name = "TempUser.findAll", query = "SELECT r FROM TempUser r")})
public class TempUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tempUser_seq")
    @Column(name = "id")
    private Long id;
    
    @Size(max = 2147483647)
    @Column(name = "fullName") 
    private String fullName;
    
    @Size(max = 2147483647)
    @Column(name = "email")
    private String email;
    
    @Size(max = 2147483647)
    @Column(name = "username")
    private String username;
    
    @Size(max = 2147483647)
    @Column(name = "password")
    private String password;
    
    @Size(max = 2147483647)
    @Column(name = "uniqueRgistrationId")
    private String uniqueRgistrationId;
    
    @Size(max = 2147483647)
    @Column(name = "hashGeneratedUniqueRgistrationId")
    private String hashGeneratedUniqueRgistrationId;
    
    @Column(name = "addedDate")
    private Date addedDate;
    
    @Size(max = 2147483647)
    @Column(name = "mobileNumber")
    private String mobileNumber;
    
    @Size(max = 2147483647)
    @Column(name = "actualPassword")
    private String actualPassword;
    
    public String getActualPassword() {
		return actualPassword;
	}

	public void setActualPassword(String actualPassword) {
		this.actualPassword = actualPassword;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
    
    public TempUser() {
    }

    public TempUser(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getUniqueRgistrationId() {
		return uniqueRgistrationId;
	}

	public void setUniqueRgistrationId(String uniqueRgistrationId) {
		this.uniqueRgistrationId = uniqueRgistrationId;
	}

	public String getHashGeneratedUniqueRgistrationId() {
		return hashGeneratedUniqueRgistrationId;
	}

	public void setHashGeneratedUniqueRgistrationId(
			String hashGeneratedUniqueRgistrationId) {
		this.hashGeneratedUniqueRgistrationId = hashGeneratedUniqueRgistrationId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
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
        if (!(object instanceof TempUser)) {
            return false;
        }
        TempUser other = (TempUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.enggcell.entities.Registrations[ id=" + id + " ]";
    }
    
}
