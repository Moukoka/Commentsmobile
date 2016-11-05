package tp2project.commentsmobile.services;

import java.util.List;


/**
 * Created by Quest on 2016/11/05.
 */

public interface Service<A,ID> {

    public A findById(ID id);

    public String save(A entity);

    public String update(A entity);

    public String delete(A entity);

    public List<A> findAll();
}
