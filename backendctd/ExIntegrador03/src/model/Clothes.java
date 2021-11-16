package model;


public class Clothes {
    private TypeSize typeSize;
    private TypeClothing typeClothing;
    private boolean isNew;
    private boolean imported;

    public Clothes(TypeSize typeSize, TypeClothing typeClothing, boolean isNew, boolean imported) {
        this.typeSize = typeSize;
        this.typeClothing = typeClothing;
        this.isNew = isNew;
        this.imported = imported;
    }

    public TypeSize getTypeSize() {
        return typeSize;
    }

    public void setTypeSize(TypeSize typeSize) {
        this.typeSize = typeSize;
    }

    public TypeClothing getTypeClothing() {
        return typeClothing;
    }

    public void setTypeClothing(TypeClothing typeClothing) {
        this.typeClothing = typeClothing;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "typeSize=" + typeSize +
                ", typeClothing=" + typeClothing +
                ", isNew=" + isNew +
                ", imported=" + imported +
                '}';
    }
}
