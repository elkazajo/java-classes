package planes;

import java.util.*;

public class PassengerPlane extends Plane implements List<MilitaryPlane> {

    //=================FIELDS=================
    private final int passengersCapacity;

    //=================CONSTRUCTORS=================
    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }


    //=================METHODS=================
    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", passengersCapacity=" + passengersCapacity +
                '}');
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<MilitaryPlane> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        T[] o;
        o = null;
        return o;
    }

    @Override
    public boolean add(MilitaryPlane militaryPlane) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends MilitaryPlane> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends MilitaryPlane> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }


    @Override
    public void clear() {
       // Clears all
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        if (!super.equals(o)) return false;
        PassengerPlane plane = (PassengerPlane) o;
        return passengersCapacity == plane.passengersCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }

    @Override
    public MilitaryPlane get(int index) {
        return null;
    }

    @Override
    public MilitaryPlane set(int index, MilitaryPlane element) {
        return null;
    }

    @Override
    public void add(int index, MilitaryPlane element) {
        // accepts parameters returns nothing
    }

    @Override
    public MilitaryPlane remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<MilitaryPlane> listIterator() {
        return null;
    }

    @Override
    public ListIterator<MilitaryPlane> listIterator(int index) {
        return null;
    }

    @Override
    public List<MilitaryPlane> subList(int fromIndex, int toIndex) {
        final List<MilitaryPlane> o;
        o = null;
        return o;
    }
}
