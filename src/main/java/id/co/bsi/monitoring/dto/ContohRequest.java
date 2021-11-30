/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.bsi.monitoring.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author uing
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContohRequest {
    @JsonProperty("nama_depan")
    public String namaDepan;
    
    @JsonProperty("nama_belakang")
    public String namaBelakang;
    
}
