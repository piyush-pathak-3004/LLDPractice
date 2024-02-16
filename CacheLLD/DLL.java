package LLD.CacheLLD;

public class DLL {

    public String key,val;
    public DLL next,prev;
    

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public DLL getNext() {
        return next;
    }

    public void setNext(DLL next) {
        this.next = next;
    }

    public DLL getPrev() {
        return prev;
    }

    public void setPrev(DLL prev) {
        this.prev = prev;
    }
    

}
