
package com.company.dao.inter;

import com.company.entity.Tourism;
import java.util.List;

public interface TourismDaoInter {
    
   public List<Tourism> getAll(); 
    
   public Tourism getById(int id);
   
   public boolean addTourism(Tourism t);
   
   public boolean updateTourism(Tourism t);
   
   public boolean removeTourism(int id);
    
}
