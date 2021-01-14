package aardvark;

public class AardvarkException extends RuntimeException {

    public AardvarkException(String s) {
        super(s);
    }

    public AardvarkException(String s, Object... format) {
        super(String.format(s, format));
    }

    public static class ReturnException extends Exception {
        private Object value;

        public ReturnException(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }
    }
}
