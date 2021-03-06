package com.ismek.sorular;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_Sorular")
public class Sorular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "soru_id")
    private int soruId;
    @Column(name = "soru")
    private String soru;
    @Column(name = "secenekler")
    private String secenekler;
    @Column(name = "secenek_sayisi")
    private String secenekSayisi;
    @Column(name = "cevap")
    private String cevap;
    @Temporal(TemporalType.DATE)
    @Column(name = "ekleme_tarihi")
    private Date eklemeTarihi;
    @Column(name = "soru_puan")
    private int soruPuan;
    @Column(name = "is_onay")
    private int isOnay;
    @Column(name = "is_aktif")
    private int isAktif;
    @Column(name = "zorluk_seviyesi")
    private String zorlukSeviyesi;
    @Column(name = "kullanici_id")
    private int kullaniciId;

    public int getSoruId() {
        return soruId;
    }

    public void setSoruId(int soruId) {
        this.soruId = soruId;
    }

    public String getSoru() {
        return soru;
    }

    public void setSoru(String soru) {
        this.soru = soru;
    }

    public String getSecenekler() {
        return secenekler;
    }

    public void setSecenekler(String secenekler) {
        this.secenekler = secenekler;
    }

    public String getSecenekSayisi() {
        return secenekSayisi;
    }

    public void setSecenekSayisi(String secenekSayisi) {
        this.secenekSayisi = secenekSayisi;
    }

    public String getCevap() {
        return cevap;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }

    public Date getEklemeTarihi() {
        return eklemeTarihi;
    }

    public void setEklemeTarihi(Date eklemeTarihi) {
        this.eklemeTarihi = eklemeTarihi;
    }

    public int getSoruPuan() {
        return soruPuan;
    }

    public void setSoruPuan(int soruPuan) {
        this.soruPuan = soruPuan;
    }

    public int getIsOnay() {
        return isOnay;
    }

    public void setIsOnay(int isOnay) {
        this.isOnay = isOnay;
    }

    public int getIsAktif() {
        return isAktif;
    }

    public void setIsAktif(int isAktif) {
        this.isAktif = isAktif;
    }

    public String getZorlukSeviyesi() {
        return zorlukSeviyesi;
    }

    public void setZorlukSeviyesi(String zorlukSeviyesi) {
        this.zorlukSeviyesi = zorlukSeviyesi;
    }

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }


}
