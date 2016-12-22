package com.idea4j.jvm.methodeara;

import com.idea4j.jvm.bingfa.nochange.Product;
import com.idea4j.jvm.heap.HeapXmx;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

import static sun.java2d.cmm.ColorTransform.In;

/**
 * 设置持久代
 * -XX:PermSize=8M -XX:MaxPermSize=8M
 * Created by markee on 2016/12/19.
 */
public class XXPerm {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException {
        int j = 0;
        try {
            for (int i = 0; i <= Integer.MAX_VALUE; i++) {
                CtClass c = ClassPool.getDefault().makeClass("Geym" + i);
                c.setSuperclass(ClassPool.getDefault().get("com.idea4j.jvm.heap.HeapXmx"));
                Class clz = c.toClass();
                HeapXmx p = (HeapXmx) clz.newInstance();
                j = i;
            }
        }catch(Throwable e){
            System.out.println("Create New Classes count is "+j);
            e.printStackTrace();
        }
    }

}
