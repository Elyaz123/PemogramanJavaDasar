package chapter12_ExceptionHandlingAndTextIO.latihan;

public interface Listing12_9_ChainedExecptionDemo {
    public static void main(String[] args) {
        try {
            methode1();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void methode1() throws Exception {
        try {
            methode2();
        }
        catch (Exception ex) {
            throw new Exception("New info from methode1", ex);
        }
    }

    public static void methode2() throws Exception {
        throw new Exception("New info from methode2");
    }
}
