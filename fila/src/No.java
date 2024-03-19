public class No<T> {
    private T object;
    private No<T> refNo;

    public No(){
    }

    public No(T object){
        this.refNo = null;
        this.object = object;
    }

    public java.lang.Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @java.lang.Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }

}
