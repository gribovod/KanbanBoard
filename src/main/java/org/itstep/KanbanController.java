package org.itstep;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vadim
 */

@RestController
public class KanbanController {
    private ArrayList<Kanban> kanbanList = new ArrayList<Kanban>();
    
    @RequestMapping("/kanban/new/{text}")
    public Kanban newKanban (@PathVariable("text") String text){
        Kanban kanban = new Kanban(text);
        kanbanList.add(kanban);
        return kanban;
    }
    @RequestMapping("/kanban/new/{text}/{name}")
    public Kanban newKanban (@PathVariable("name") String name, @PathVariable("text") String text){
        Kanban kanban = new Kanban(name, text);
        kanbanList.add(kanban);
        return kanban;
    }
    
    @RequestMapping("/kanban/new/{text}/{name}/{userName}")
        public Kanban newKanban (@PathVariable("name") String name, @PathVariable("text") String text, @PathVariable("userName") String userName){
        Kanban kanban = new Kanban(name, text, userName);
        kanbanList.add(kanban);
        return kanban;
    }
    
    @RequestMapping("/kanban")
    public ArrayList getKanbanList (){
         return kanbanList;
    }
    @RequestMapping("/kanban/chstate/{id}/{state}")
    public Kanban changeState(@PathVariable("id") int id, @PathVariable("state") int state){
        /*
        1 - PENDING, 
        2 - DONE
        3 - UNDONE
        */
        Kanban kanban = kanbanList.get(id);
        if (state == 1) {
            kanban.setState(State.PENDING);
        }else{
            if (state == 2) {
                kanban.setState(State.DONE);
            }else{
                kanban.setState(State.UNDONE);
            }
        }
        return this.kanbanList.get(id);
    }
    @RequestMapping("/kanban/remove/{id}")
    public Kanban removeKanban(@PathVariable("id") int id){
        Kanban kanban = kanbanList.get(id);
        kanban.setDeleteMark(true);
        rebildKanbanList();
        return kanban;
    }
    
    private void rebildKanbanList(){};
}
