package day3.custom;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author : zhousy
 * @date : 2022/10/24 10:40
 * @version : 1.0
 */


public class CustomClassLoader {
    public static void main(String[] args) throws Exception {
        MyClassLoader myClassLoader = new MyClassLoader();
        Class<?> c = myClassLoader.loadClass("MyClass");
        Class<?> c1 = myClassLoader.loadClass("MyClass");
        System.out.println(c == c1);

        //类加载器直接存在隔离，所以不同的类加载器加载同一个对象结果不是同一个对象。
        MyClassLoader myClassLoader1 = new MyClassLoader();
        Class<?> c2 = myClassLoader1.loadClass("MyClass");
        System.out.println(c==c2);

    }
}

class MyClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String classUrl = "C:\\Git\\" + name + ".class";
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Files.copy(Paths.get(classUrl), os);
            byte[] bytes = os.toByteArray();
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ClassNotFoundException("文件未找到");
        }
    }
}
