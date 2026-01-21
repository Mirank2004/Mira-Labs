package Defualt;



	public class NumberBox<T extends Number> {



	    private T item;



	    public void setItem(T item) {

	        this.item = item;

	    }



	    public T getItem() {

	        return item;

	    }



	    public double add(NumberBox<? extends Number> other) {

	        if (item == null || other == null || other.getItem() == null) return 0.0;

	        return item.doubleValue() + other.getItem().doubleValue();

	    }



	    public static double sum(NumberBox<? extends Number> a, NumberBox<? extends Number> b) {

	        if (a == null || b == null || a.getItem() == null || b.getItem() == null) return 0.0;

	        return a.getItem().doubleValue() + b.getItem().doubleValue();

	    }

	}
