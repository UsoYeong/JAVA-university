class Product {
	public double weight;
	public double volume;
	
	public Product(double weight, double volume) {
        this.weight = weight;
        this.volume = volume;
    }
	
	public double calculateShipping() { 
		return weight * 1000 + volume * 500;
		
	}
}

class BookProduct extends Product {
	public BookProduct(double weight, double volume) {
        super(weight, volume);
	}
        @Override
        public double calculateShipping() {
            return weight * 800;
        }
}

class FrozenFoodProduct extends Product {
	public static double REFRIGERATION_FEE = 5000;

    public FrozenFoodProduct(double weight, double volume) {
        super(weight, volume);
    }

    @Override
    public double calculateShipping() {
        return super.calculateShipping() + REFRIGERATION_FEE;
    }
	
}

	
	
public class TestProduct {
	public static void main(String[] args) {

	}

}
