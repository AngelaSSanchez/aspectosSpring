package aspectTarget;

import org.springframework.stereotype.Service;

import aspect.GenericAnnotation;
import aspect.MethodAnnotation;
import aspect.TimeAnnotation;

@Service
@GenericAnnotation
public class ServiceOne {

    public void method() {
        System.out.println("-----------------> ServiceOne:method");
    }

    public void argOneString(String name) {
        System.out.println("-----------------> ServiceOne:argOneString(name=" + name + ")");
    }

    @TimeAnnotation
    public int returnInt() {
        int result = 666;
        System.out.println("-----------------> ServiceOne:returnInt return= " + result);
        return result;
    }

    public void exception() throws Exception {
        System.out.println("-----------------> ServiceOne:exception");
        throw new Exception(">:o(");
    }

    @MethodAnnotation
    public void annotation() {
        System.out.println("-----------------> ServiceOne:annotation");
    }

}
