/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.bsi.monitoring;

import id.co.bsi.monitoring.db.ContohTabel;
import id.co.bsi.monitoring.dto.ContohRequest;
import id.co.bsi.monitoring.dto.ContohTabelRequest;
import java.util.List;
import javax.inject.Singleton;
import javax.transaction.Transactional;
import org.jboss.logging.Logger;

/**
 *
 * @author uing
 */
@Singleton
public class KumpulanQueryContohTabel {
     private static final Logger log = Logger.getLogger(KumpulanQueryContohTabel.class); // pakai jboss logging
    
    public void getListAll(){
       List<ContohTabel> ls = ContohTabel.listAll();
        log.info("AAAAAAAAAAAAAAAAAA");        
       for(ContohTabel o: ls){
           log.info("ID = "+o.id+" nama = "+o.nama+" alamat = "+o.alamat);
       }        
    }
    
    @Transactional
    public void insertDataCuy(ContohTabelRequest request){      
        log.info("AAAAA");
        ContohTabel tabel = new ContohTabel();
        tabel.id = Integer.parseInt(request.aidi);
        tabel.nama = request.name;
        tabel.alamat = request.addres;
        log.info("BBBB");
        tabel.persistAndFlush();        
        log.debug("CCCCCC");
    }
    
    
    @Transactional
    public void deleteData(ContohTabelRequest request){  
        log.info("ZZZZZZ");
        ContohTabel contoh = ContohTabel.findById(Integer.parseInt(request.aidi));
        contoh.delete();
        log.info("YYYYYY");
    }
    
    @Transactional
    public void updateData(ContohTabelRequest request){  
        log.info("HHHHH");
        ContohTabel contoh = ContohTabel.findById(Integer.parseInt(request.aidi));
        contoh.nama = request.name;
        contoh.alamat = request.addres;
        contoh.persistAndFlush();
        log.info("IIIII");
    }
    
    
    
    
    
}
