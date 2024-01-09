package StarWar_1111410018;

public class Xwing {
	private String HyperSpaceEngine;
	private String Shield;
	private double ShiedPower;
	
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public String getShield() {
		return Shield;
	}
	public void setShield(String shield) {
		Shield = shield;
	}
	public double getShiedPower() {
		return ShiedPower;
	}
	public void setShiedPower(double shiedPower) {
		ShiedPower = shiedPower;
	}
	public Xwing() {}
	public Xwing(String HyperSpaceEngine,String Shield,double ShiedPower) {
		this.setHyperSpaceEngine(HyperSpaceEngine);
		this.setShiedPower(ShiedPower);
		this.setShield(Shield);
	}
	@Override
	public String toString() {
		return "Xwing [HyperSpaceEngine=" + HyperSpaceEngine + ", Shield=" + Shield + ", ShiedPower=" + ShiedPower
				+ "]";
	}
	
}
