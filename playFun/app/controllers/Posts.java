package controllers;

import javax.persistence.Entity;
import play.*;
import play.mvc.*;

@Check("admin")
@With(Secure.class)
public class Posts extends CRUD {

}
