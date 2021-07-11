package otherpatterns.unitofwork;

import java.util.Objects;

public class StudentEntity {

    /* class fields */
    private final Integer id;
    private final String name;
    private String address;

    /* constructor */
    public StudentEntity(Integer id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    /* getters and setters */
    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    /* object methods */
    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
