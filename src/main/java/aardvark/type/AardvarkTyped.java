package aardvark.type;

import aardvark.local.AardvarkStackFrame;
import aardvark.local.AardvarkTrait;

import java.util.List;

public interface AardvarkTyped {
    public boolean canBe(Object value);
    public default boolean isAlgebraic() {
        return false;
    }

    final class LongType implements AardvarkTyped {
        private static LongType singleton;

        public static LongType getInstance() {
            if(singleton == null) {
                singleton = new LongType();
            }
            return singleton;
        }

        @Override
        public String toString() {
            return "l64";
        }

        @Override
        public boolean canBe(Object value) {
          Class klazz = value.getClass();
          return klazz.equals(Long.class);
        }
    }

    final class I32Type implements AardvarkTyped {
        private static I32Type singleton;

        public static I32Type getInstance() {
            if(singleton == null) {
                singleton = new I32Type();
            }
            return singleton;
        }

        @Override
        public String toString() {
            return "i32";
        }

        @Override
        public boolean canBe(Object value) {
            Class klazz = value.getClass();
            return klazz.equals(getClass()) || klazz.equals(Integer.class) || klazz.equals(LongType.class) || klazz.equals(AardvarkStackFrame.builtinFrame.accessTrait("eq").getClass());
        }
    }

    final class BooleanType implements AardvarkTyped {
        private static BooleanType singleton;

        public static BooleanType getInstance() {
            if(singleton == null) {
                singleton = new BooleanType();
            }
            return singleton;
        }

        @Override
        public String toString() {
            return "boolean";
        }

        @Override
        public boolean canBe(Object value) {
            return false;
        }
    }

    final class AnyType implements AardvarkTyped {
        private static AnyType singleton;

        public static AnyType getInstance() {
            if(singleton == null) {
                singleton = new AnyType();
            }
            return singleton;
        }

        @Override
        public boolean canBe(Object value) {
            return true;
        }
    }


}
