package Main.builder;


public class MacBookBuilder {
	private Computer mApplePc = new AppleComputer();

	public MacBookBuilder buildCPU(int core) {
		mApplePc.setCPU(core);
		return this;
	}

	public MacBookBuilder buildRAM(int gb) {
		mApplePc.setRAM(gb);
		return this;
	}

	public MacBookBuilder buildOs(String os) {
		mApplePc.setOs(os);
		return this;
	}

	public Computer create() {
		return mApplePc;
	}
}
