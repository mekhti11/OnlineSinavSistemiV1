package com.ismek.Role;


import com.ismek.kullanici.*;

import javax.persistence.*;
import java.util.Set;


@Entity(name = "tbl_Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;

    @Column(name = "roles")
    private String roles;


    @ManyToMany(mappedBy = "roles")
    private Set<Kullanici> kullanicilar;


    public Set<Kullanici> getKullanicilar() {
        return kullanicilar;
    }

    public void setKullanicilar(Set<Kullanici> kullanicilar) {
        this.kullanicilar = kullanicilar;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
