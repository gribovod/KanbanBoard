package org.itstep;
enum State { PENDING, DONE, UNDONE }

/**
 *
 * @author Vadim
 */
public class Kanban {
    private static Integer idCouner=0;
    private State state;
    private Integer id;
    private String text;
    private String name; 
    private Boolean deleteMark;
    private User user;
    
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public static Integer getIdCouner() {
        return idCouner;
    }

    public static void setIdCouner(Integer idCouner) {
        Kanban.idCouner = idCouner;
    }

    public Boolean getDeleteMark() {
        return deleteMark;
    }

    public void setDeleteMark(Boolean deleteMark) {
        this.deleteMark = deleteMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public void setState(State state) {
        this.state = state;
    }

    public void setText(String text) {
        this.text = text;
    }

    public State getState() {
        return state;
    }

    public String getText() {
        return text;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Kanban(String name, String text, String userName) {
        this.id = idCouner;
        this.idCouner++;
        this.state = State.PENDING;
        this.name = name;
        this.text = text;
        this.deleteMark = false;
        this.user = new User(userName);
        
    }
    public Kanban(String name, String text) {
        this.id = idCouner;
        this.idCouner++;
        this.state = State.PENDING;
        this.name = name;
        this.text = text;
        this.deleteMark = false;
        this.user = new User("NoName");
    }

        public Kanban(String text) {
        this.id = idCouner;
        this.idCouner++;
        this.state = State.PENDING;
        this.name = text;
        this.text = text;
        this.deleteMark = false;
        this.user = new User("NoName");
    }
}
