public class Die implements Lockable {
    private int key;
    private boolean locked;
    private int face;

    // die

    public Die(int key){
        this.key = key;
        locked = false;

    }

    //make key or make it so there is a new key-void

    public void setKey(int bestKey, int newKey){
        if(bestKey == key);
            key = newKey;
    }


    // boolean locked
    public boolean locked(){
        return locked;
    }

    // lock is true

    public void lock(int bestKey){
        if(bestKey == key);
        locked = true;
    }

    //unlock is false

    public void unlock(int bestKey){
        if(bestKey == key);
        locked = false;
    }
}
