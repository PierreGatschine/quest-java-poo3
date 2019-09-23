package quete08;

public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

	@Override
	public void takeOff() {
		if(!this.isFlying() && this.altitude==0) {
			this.flying=true;
			System.out.printf("%s takes flight %n", this.getName());
		}
	}

	@Override
	public int ascend(int meters) {
		if (this.isFlying()) {
            this.altitude += meters;
            System.out.printf("%s climbs the sky and its altitude is : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
	}

	@Override
	public int descend(int meters) {
		if (this.isFlying()) {
            this.altitude -= meters;
            System.out.printf("%s makes a descent, and his altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
	}

	@Override
	public void land() {
		if (this.isFlying() && this.altitude <= 2) {
            System.out.printf("%s is on the floor.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't landing.%n", this.getName());
        }
	}
}
