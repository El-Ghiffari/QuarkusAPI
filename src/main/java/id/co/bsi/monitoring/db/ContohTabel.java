/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.bsi.monitoring.db;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author uing
 */
@Entity(name = "tabel_contoh")
public class ContohTabel extends PanacheEntityBase{
    
    @Id
    @Column(name = "id")
    public Integer id;
    
    @Column(name = "name")
    public String nama;
    
    @Column(name = "address")
    public String alamat;
    
    
    
}
