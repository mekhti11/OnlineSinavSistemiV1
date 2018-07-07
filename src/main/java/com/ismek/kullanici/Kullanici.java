
package com.ismek.kullanici;


import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.Size;

import com.ismek.Role.Role;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="tbl_Kullanici")
public class Kullanici implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="kullanici_id")
    private int kullaniciId;



    @Column(name="tc_no",nullable=false,unique=true)
    @Size(max =11 ,message = "Tc no 11 haneli olmalıdır. ")
    private String tcNo;

    @Column(name="adi",nullable=false)
    @Size(min = 2,max =20 ,message = "2 arası 20 karakterden fazla giremezsiniz ")
    private String ad;

    @Column(name="soyadi",nullable=false)
    @Size(min = 2,max =25 ,message = "2 arası 25 karakterden fazla giremezsiniz ")
    private String soyAdi;

    @Column(name="telefon")
    @Size(max =15 ,message = "15 karakterden fazla giremezsiniz ")
    private String telefon;

    @Column(name="mail")
    @Size(max =50 ,message = "50 karakterden fazla giremezsiniz ")
    private String mail;

    @CreationTimestamp
    @Column(name="dogum_tarihi")
    private Date dogumTarihi;

    @Column(name="cinsiyet")
    @Size(max =1 ,message = "1 karakterden fazla giremezsiniz ")
    private String cinsiyet;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tbl_KullaniciToRole", joinColumns = @JoinColumn(name = "kullanici_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;


    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAdi() {
        return soyAdi;
    }

    public void setSoyAdi(String soyAdi) {
        this.soyAdi = soyAdi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

}