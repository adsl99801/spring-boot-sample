package funs.puppys.web.model;

import java.io.Serializable;

public class Account implements Serializable {

    public Long id;
    public Long getId() {
        return this.id;
      }
    
      public void setId(Long id) {
        this.id = id;
      }

}