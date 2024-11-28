package de.tum.cit.fop;

public class PinguzonWarehouse {
    static public <T> Package<T> packPackage(T item) {
        return new Package<T>(item);
    }

    static public <T> T unpackPackage(Package<T> returnedPackage) {
        return returnedPackage.getItem();
    }
}
