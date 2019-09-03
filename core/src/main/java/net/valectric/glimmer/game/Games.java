package net.valectric.glimmer.game;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

import java.io.IOException;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Games {

    public static Collection<Class<?>> scanPackageRecursive(String namespace) throws IOException {
        var classPath = ClassPath.from(ClassLoader.getSystemClassLoader());
        return scanClassInfoSet(classPath.getTopLevelClassesRecursive(namespace));
    }

    public static Collection<Class<?>> scanPackage(String namespace) throws IOException {
        var classPath = ClassPath.from(ClassLoader.getSystemClassLoader());
        return scanClassInfoSet(classPath.getTopLevelClasses(namespace));
    }

    public static Collection<Class<?>> scanClassPath(ClassPath classPath) {
        return Games.scanClassInfoSet(classPath.getAllClasses());
    }

    private static boolean scan(Class<?> clazz) {
        return clazz.isAnnotationPresent(Game.class);
    }

    private static Collection<Class<?>> scanClassInfoSet(ImmutableSet<ClassInfo> classInfoSet) {
        return classInfoSet.stream()
            .map((Function<ClassInfo, Class<?>>) ClassInfo::load)
            .filter(Games::scan)
            .collect(Collectors.toList());
    }

    private Games() {
        throw new AssertionError("Private constructor initialization call");
    }

}
