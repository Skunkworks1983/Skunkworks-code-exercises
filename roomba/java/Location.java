import java.util.Objects;

class Location {
    final public int x;
    final public int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Location other = (Location) obj;
        return this.x == other.x && this.y == other.y;
    }
}