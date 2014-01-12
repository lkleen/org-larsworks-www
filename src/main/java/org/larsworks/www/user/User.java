package org.larsworks.www.user;

import lombok.Data;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * @author Lars Kleen
 * @since ?version
 *        Date: 12.01.14
 *        Time: 17:21
 */
@Data
@ManagedBean
@SessionScoped
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

}
