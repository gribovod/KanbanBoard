package org.itstep;

/**
 *
 * @author Vadim
 */
public class User {

    public User(String UserName) {
        this.userID = idCouner;
        this.idCouner++;
        this.UserName = UserName;
    }
    
    static Integer idCouner=0;
    private Integer userID;
    private String UserName;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
}


