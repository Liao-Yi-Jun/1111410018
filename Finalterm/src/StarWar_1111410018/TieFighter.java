package StarWar_1111410018;

public class TieFighter {
	private String Manufacturer;
	
	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public TieFighter() {}
	public TieFighter(String Manufacturer) {
		this.setManufacturer(Manufacturer);
	}

	@Override
	public String toString() {
		return "TieFighter [Manufacturer=" + Manufacturer + "]";
	}
	
	
}
