package ai.jobiak.streams;


public class CreateChocolate 
{
	private String description;
	private double Weight;
	private double price;
	private String packing;
	private boolean sugarFree;
	
	public CreateChocolate() {

	}
	public CreateChocolate(String description, double weight, double price, String packing, boolean sugarFree) {
		this.description = description;
		Weight = weight;
		this.price = price;
		this.packing = packing;
		this.sugarFree = sugarFree;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPacking() {
		return packing;
	}
	public void setPacking(String packing) {
		this.packing = packing;
	}
	public boolean isSugarFree() {
		return sugarFree;
	}
	public void setSugarFree(boolean sugarFree) {
		this.sugarFree = sugarFree;
	}
	@Override
	public String toString() {
		return "CreateChocolate [description=" + description + ", Weight=" + Weight + ", price=" + price + ", packing="
				+ packing + ", sugarFree=" + sugarFree + "]";
	}


	
	
	

}