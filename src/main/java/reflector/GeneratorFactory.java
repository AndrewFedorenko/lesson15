package reflector;

import org.reflections.Reflections;
import org.reflections.scanners.Scanners;
import random.Generator;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Set;

public class GeneratorFactory {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections ref = new Reflections("random", Scanners.SubTypes);
        Set<Class<? extends Generator>> classSet = ref.getSubTypesOf(Generator.class);
        Class<? extends Generator>[] genType = new Class[0];
        Class[]classArray = classSet.toArray(genType);

        for (int i = 0; i < 5; i++) {
            Class currentClass = getGenerator(classArray);
            Generator newObj  = (Generator) currentClass.getDeclaredConstructor().newInstance();
            System.out.println(currentClass.toString() + ", value is " + newObj.getNextRand());
        }
    }
    static Class<? extends Generator> getGenerator(Class[] classArray){
        return classArray[new Random().nextInt(3)];
    }
}
