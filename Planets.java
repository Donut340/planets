// Planet class
class Planet {
    // Fields
    private int orbitTime;
    private ArrayList<Moon> moons;
    private String designation;

    // Constructors
    public Planet() {
        // Default constructor
    }

    public Planet(int orbitTime, String designation) {
        this.orbitTime = orbitTime;
        this.designation = designation;
        this.moons = new ArrayList<>();
    }

    // Getters and setters
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoon(Moon moon) {
        moons.add(moon);
    }

    public List<Moon> getMoons() {
        return moons;
    }

    // Overridden methods
    @Override
    public boolean equals(Object obj) {
        // Implementation of equals method
    }

    @Override
    public String toString() {
        // Implementation of toString method
    }
}

// GasPlanet subclass
class GasPlanet extends Planet {
    // Fields
    private boolean hasRings;
    private Color color;

    // Constructor
    public GasPlanet(int orbitTime, String designation, boolean hasRings, Color color) {
        super(orbitTime, designation);
        this.hasRings = hasRings;
        this.color = color;
    }

    // Getters and setters
    public boolean isHasRings() {
        return hasRings;
    }

    public void setHasRings(boolean hasRings) {
        this.hasRings = hasRings;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Overridden toString method
    @Override
    public String toString() {
        // Implementation of toString method specific to GasPlanet
    }
}

// RockPlanet subclass
class RockPlanet extends Planet {
    // Fields
    private boolean habitable;

    // Constructor
    public RockPlanet(int orbitTime, String designation, boolean habitable) {
        super(orbitTime, designation);
        this.habitable = habitable;
    }

    // Getters and setters
    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    // Overridden toString method
    @Override
    public String toString() {
        // Implementation of toString method specific to RockPlanet
    }
}

// Moon class
class Moon {
    // Fields
    private Planet planet;
    private int orbitTime;
    private boolean atmosphere;
    private String designation;

    // Constructor
    public Moon(Planet planet, int orbitTime, boolean atmosphere, String designation) {
        this.planet = planet;
        this.orbitTime = orbitTime;
        this.atmosphere = atmosphere;
        this.designation = designation;
    }

    // Getters and setters
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public int getOrbitTime() {
        return orbitTime;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(boolean atmosphere) {
        this.atmosphere = atmosphere;
    }

    // Overridden methods
    @Override
    public boolean equals(Object obj) {
        // Implementation of equals method
    }

    @Override
    public String toString() {
        // Implementation of toString method
    }
}
