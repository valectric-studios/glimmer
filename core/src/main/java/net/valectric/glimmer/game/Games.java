package net.valectric.glimmer.game;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

import java.io.IOException;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class Games {

    private static final ClassLoader DEFAULT_CLASS_LOADER = ClassLoader.getSystemClassLoader();

    public static Collection<Class<?>> scanPackageRecursive(String namespace) throws IOException {
        var classPath = ClassPath.from(DEFAULT_CLASS_LOADER);
        return scanClassInfoSet(classPath.getTopLevelClassesRecursive(namespace));
    }

    public static Collection<Class<?>> scanPackage(String namespace) throws IOException {
        var classPath = ClassPath.from(DEFAULT_CLASS_LOADER);
        return scanClassInfoSet(classPath.getTopLevelClasses(namespace));
    }

    public static Collection<Class<?>> scanClassPath(ClassPath classPath) {
        return Games.scanClassInfoSet(classPath.getAllClasses());
    }

    private static Collection<Class<?>> scanClassInfoSet(ImmutableSet<ClassInfo> classInfoSet) {
        return classInfoSet.stream()
            .map((Function<ClassInfo, Class<?>>) ClassInfo::load)
            .filter(Games::scan)
            .collect(Collectors.toList());
    }

    private static boolean scan(Class<?> clazz) {
        return clazz.isAnnotationPresent(Game.class);
    }

    private Games() {
        throw new AssertionError("Private constructor initialization call");
    }

}
