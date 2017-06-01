package jproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ross.moug on 01/06/2017.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private final PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().startsWith("setHotOrNotRating")) {
                return method.invoke(person, args);
            } else if (method.getName().startsWith("get")){
                return method.invoke(person, args);
            } else if(method.getName().startsWith("set")) {
                throw new IllegalArgumentException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }
}
