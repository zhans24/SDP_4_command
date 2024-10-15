package org.example;

public class User {
    private Command save;
    private Command select;
    private Command del;
    private Command upd;

    public User(Command save, Command select, Command del, Command upd) {
        this.save = save;
        this.select = select;
        this.del = del;
        this.upd = upd;
    }

    public void save(){
        save.execute();
    }
    public void select(){
        select.execute();
    }
    public void delete(){
        del.execute();
    }
    public void update(){
        upd.execute();
    }


}
