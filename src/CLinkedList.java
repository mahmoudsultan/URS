/**
 * Created by Tarek Alqaddy on 3/20/2016.
 */
public class CLinkedList {
    int size=0;
    CNode sentinel = new CNode();

    public CLinkedList() {
        sentinel.next = sentinel;
        sentinel.priv = sentinel;
    }

    public void add(String name, int id) {
        CNode newNode = new CNode(name, id, sentinel.next, sentinel);
        if (sentinel.priv == sentinel)
            sentinel.priv = newNode;
        sentinel.next = newNode;
        size++;
    }
    public CNode getNode(String name){
        CNode temp = sentinel.next;
        while (temp != sentinel){
            if(temp.name.equals(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }
    public CNode getNode(int id){
        CNode temp = sentinel.next;
        while (temp != sentinel){
            if(temp.id == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public void remove(String name){
        CNode temp = getNode(name);
        if(temp != null){
            temp.next.priv = temp.priv;
            temp.priv.next = temp.next;
            size--;
        }
    }
    public void remove(int id){
        CNode temp = getNode(id);
        if(temp != null){
            temp.next.priv = temp.priv;
            temp.priv.next = temp.next;
            size--;
        }

    }
}