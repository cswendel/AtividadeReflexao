import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

    public void Analisar(Object obj) {
        Class<?> cls = obj.getClass();
        ListarAtributosHierarquia(cls);
        ListarMetodosHierarquia(cls);
    }

    private void ListarAtributosHierarquia(Class<?> cls) {
        while (cls != null && cls != Object.class) {
            listarAtributosDaClasse(cls);
            cls = cls.getSuperclass();
        }
    }

    private void listarAtributosDaClasse(Class<?> cls) {
        Field[] fields = cls.getDeclaredFields();
        if (fields.length > 0) {
            System.out.println("Atributos da classe " + cls.getName() + ":");
            for (Field f : fields) {
                System.out.println("  - " + f.getName() + " : " + f.getType().getSimpleName());
            }
        }
    }

    private void ListarMetodosHierarquia(Class<?> cls) {
        while (cls != null && cls != Object.class) {
            ListarMetodosDaClasse(cls);
            cls = cls.getSuperclass();
        }
    }

    private void ListarMetodosDaClasse(Class<?> cls) {
        Method[] methods = cls.getDeclaredMethods();
        if (methods.length > 0) {
            System.out.println("Métodos da classe " + cls.getName() + ":");
            for (Method m : methods) {
                System.out.println("  - " + m.getName());
            }
        }
    }
}