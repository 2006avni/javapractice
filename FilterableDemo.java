interface Filterable {
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying image filter: " + filter_type);
    }

    public void reset_filter() {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying data filter: " + filter_type);
    }

    public void reset_filter() {
        System.out.println("Data filter reset");
    }
}

public class FilterableDemo {
    public static void main(String[] args) {

        Filterable f1 = new ImageProcessor();
        f1.apply_filter("Blur");
        f1.reset_filter();

        Filterable f2 = new DataAnalyzer();
        f2.apply_filter("Remove Null");
        f2.reset_filter();
    }
}