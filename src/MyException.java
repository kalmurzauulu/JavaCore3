public class MyException extends RuntimeException{
    public MyException(String args){
        super(args);
    }

    public MyException() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
