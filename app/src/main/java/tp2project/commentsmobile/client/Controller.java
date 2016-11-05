package tp2project.commentsmobile.client;

import java.util.List;

/**
 * Created by Quest on 2016/11/05.
 */

public interface Controller<A,ID> {

    A get(ID id);
    String post(A entity);
    String put(A entity);
    String delete(A entity);
    List<A> getAll();

}
