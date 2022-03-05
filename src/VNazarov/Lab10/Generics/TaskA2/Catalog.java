package VNazarov.Lab10.Generics.TaskA2;

public class Catalog<T> {
    private T[] catalog;

    public Catalog(T[] catalog){
        this.catalog = catalog;
    }

    public String[] getFive(){
        String[] fiveElementsCatalog = new String[5];
        if (catalog.length >= 5) {
            for (int index = 0; index < 5; index++) {
                fiveElementsCatalog[index] = String.valueOf(catalog[index]);
            }
        } else {
            for (int index = 0; index < catalog.length; index++) {
                fiveElementsCatalog[index] = String.valueOf(catalog[index]);
            }
            for (int index = catalog.length; index < 5; index++) {
                fiveElementsCatalog[index] = "null";
            }
        }
        return fiveElementsCatalog;
    }
}
