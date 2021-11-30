/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.bsi.monitoring.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author uing
 */
public class ContohTabelResponse {
     @JsonProperty("id")
    public String aidi;
    
    @JsonProperty("name")
    public String name;
    
    @JsonProperty("address")
    public String addres;
}
